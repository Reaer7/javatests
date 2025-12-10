package com.gmail.reater.last.test.jdbctransaction;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PhantomReadExample {

    @SneakyThrows
    public static void main(String[] args) {
        final Connection connection = getConnection();
        final Statement statement = connection.createStatement();

        final ResultSet resultSet = statement.executeQuery("SELECT count(*) FROM person_balance");
        while (resultSet.next()) {
            final int count = resultSet.getInt(1);
            System.out.println("Count: " + count);
        }

        new OtherTransaction().start();
        Thread.sleep(2000);

        final ResultSet resultSetTwo = statement.executeQuery("SELECT count(*) FROM person_balance");
        while (resultSetTwo.next()) {
            final int count = resultSetTwo.getInt(1);
            System.out.println("Count: " + count);
        }
    }

    static class OtherTransaction extends Thread {

        @Override
        public void run() {
            try {
                final Connection connection = getConnection();
                final Statement statement = connection.createStatement();

                statement.executeUpdate("INSERT INTO person_balance(id, balance) values (3, 1000)");
                connection.commit();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @SneakyThrows
    private static Connection getConnection() {
        final Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5550/",
                "postgres",
                "rootroot"
        );
        ;
        connection.setAutoCommit(false);
        connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED); //That enough for PostgreSQL
//        connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE); //TODO: fix
        return connection;
    }

}