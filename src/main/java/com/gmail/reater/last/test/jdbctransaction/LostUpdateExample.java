package com.gmail.reater.last.test.jdbctransaction;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LostUpdateExample {

    public static final String READ = "SELECT person_balance.balance FROM person_balance WHERE id = ?";
    public static final String UPDATE = "UPDATE person_balance SET balance = ? WHERE id = ?";

    @SneakyThrows
    public static void main(String[] args) {

        // Начинаем две транзакции.
        final Connection connectionOne = getConnection();
        final Connection connectionTwo = getConnection();

        // Первая и вторая транзакция запрашивают баланс пользователя.
        // balance = 100
        final long balanceOne = getBalance(connectionOne);
        final long balanceTwo = getBalance(connectionTwo);

        // Первая транзакция готовится обновить баланс пользователю.
        final PreparedStatement updateOne = connectionOne.prepareStatement(UPDATE);
        updateOne.setLong(1, balanceOne + 100);
        updateOne.setLong(2, 1);
        updateOne.execute();

        // Первая транзакция фиксирует изменения и завершается.
        // Значение balance в базе в этот момент = 200.
        connectionOne.commit();
        connectionOne.close();

        // Но вторая транзакция ничего не знает про изменения в БД.
        // Значение balanceTwo все еще равно 100, к этому значению мы добавляем 50.
        final PreparedStatement updateTwo = connectionTwo.prepareStatement(UPDATE);
        updateTwo.setLong(1, balanceTwo + 50);
        updateTwo.setLong(2, 1);
        updateTwo.execute();

        // Вторая транзакция фиксирует свои изменения и завершается.
        // В итоге в БД остается значение 150, а не 250.
        connectionTwo.commit();
        connectionTwo.close();
    }

    @SneakyThrows
    private static Connection getConnection() {
        final Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5550/",
                "postgres",
                "rootroot"
        );;
        connection.setAutoCommit(false);
        connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
//        connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ); //TODO: fix
        return connection;
    }

    @SneakyThrows
    private static long getBalance(Connection connectionOne) {
        final PreparedStatement preparedStatement = connectionOne.prepareStatement(READ);
        preparedStatement.setLong(1, 1);
        final ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getLong(1);
    }

}