package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3308/student_portal";
        String username = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            return connection;
        } catch (SQLException se) {

            return null;
        }
    }

    public static void readTable(Connection conn) {
        try {
            Statement stmnt = conn.createStatement();
            ResultSet result = stmnt.executeQuery("select * from students;");
            while (result.next()) {
                String name = result.getString("name");
                int marks = result.getInt("marks");
                System.out.println(name + " has scored " + marks);
            }
            // System.out.println(result);
        } catch (SQLException se) {
            System.out.println("Statement error");
            System.out.println(se.getMessage());
        }
    }

    public static void main(String[] args) {
        String name = "Sita Devi";
        String city = "Pune";
        String course = "Java";
        int marks = 98;

        String sql = "INSERT INTO students (name, city, course, marks) VALUES ('" + name + "', '" + city + "', '"
                + course + "', " + marks + ")";

        System.out.println(sql);

    }

    public static void main2(String[] args) throws Exception {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Connection created");

            // read table data
            readTable(conn);

            conn.close();
        } else {
            System.out.println("Sql connection error");
        }
    }
}
