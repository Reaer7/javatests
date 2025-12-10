package com.gmail.reater.last.test.jdbctransaction;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NonRepeatableReadExample {

    @SneakyThrows
    public static void main(String[] args) {
        final Connection connection = getConnection();
        final Statement statement = connection.createStatement();

        final ResultSet resultSetOne = statement.executeQuery("SELECT * FROM person_balance WHERE id = 1");
        while (resultSetOne.next()) {
            final String balance = resultSetOne.getString("balance");
            System.out.println("[one] Balance: " + balance);
        }

        new OtherTransaction().start();
        Thread.sleep(2000);

        final ResultSet resultSetTwo = statement.executeQuery("SELECT * FROM person_balance WHERE id = 1");
        while (resultSetTwo.next()) {
            final String balance = resultSetTwo.getString("balance");
            System.out.println("[one] Balance: " + balance);
        }
    }

    static class OtherTransaction extends Thread {

        @Override
        public void run() {
            try {
                final Connection connection = getConnection();
                final Statement statement = connection.createStatement();

                statement.executeUpdate("UPDATE person_balance SET balance = 200 WHERE id = 1");
                connection.commit();

                final ResultSet resultSetTwo = statement.executeQuery("SELECT * FROM person_balance WHERE id = 1");
                while (resultSetTwo.next()) {
                    final String balance = resultSetTwo.getString("balance");
                    System.out.println("[two] Balance: " + balance);
                }

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
        connection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
//        connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ); //TODO: fix
        return connection;
    }

}