package com.aws.createdbaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class CreatedbawsApplication {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(CreatedbawsApplication.class, args);

        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "test", "test");
        Statement statement = c.createStatement();
        statement.executeUpdate("CREATE DATABASE sales");
    }

}
