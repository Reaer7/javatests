package com.gmail.reater.last.test.jdbctransaction;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DirtyReadExample {

    @SneakyThrows
    public static void main(String[] args) {
        final Connection connection = getConnection();
        final Statement statement = connection.createStatement();

        statement.executeUpdate("UPDATE person_balance SET balance = 200 WHERE id = 1");

        new OtherTransaction().start();
        Thread.sleep(2000);
        connection.rollback();
    }

    static class OtherTransaction extends Thread {

        @Override
        public void run() {
            try {
                final Connection connection = getConnection();
                final Statement statement = connection.createStatement();

                final ResultSet resultSet = statement.executeQuery("SELECT * FROM person_balance WHERE id = 1");
                while (resultSet.next()) {
                    System.out.println("Balance: " + resultSet.getString("balance"));
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @SneakyThrows
    private static Connection getConnection() {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5550/",
                "postgres",
                "rootroot"
        );
        connection.setAutoCommit(false);
        connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
        return connection;
    }

}