package com.example.demo1;
import java.sql.*;
public class connection {
    public static Connection getCon(){
        Connection con =null;
        String url  = "jdbc:mysql://localhost:3306/db_tp";
        String user = "root";
        String pwd  = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, user, pwd);}


        catch (Exception e) {
            // TODO: handle
            e.printStackTrace();
        }




        return con;

    }
}