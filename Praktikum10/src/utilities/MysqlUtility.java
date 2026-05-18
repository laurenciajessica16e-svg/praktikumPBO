/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs_service";
                String user = "root";
                String pass = "";

                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi berhasil!");

            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }
}
