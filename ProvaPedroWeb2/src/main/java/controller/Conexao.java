/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author flamingo_lindo
 */
public class Conexao {
    public static Connection getConexao() throws ClassNotFoundException, SQLException {
       
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://127.0.0.1:3306/provaPedro";
            String USER = "root";
            String PASSWORD = "diamante9";
            return DriverManager.getConnection(URL, USER, PASSWORD);
        
    }
}
