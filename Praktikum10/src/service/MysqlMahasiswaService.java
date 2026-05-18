package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Mahasiswa;
import utilities.MysqlUtility;

public class MysqlMahasiswaService {

    private Connection conn;

    public MysqlMahasiswaService() {
        conn = MysqlUtility.getConnection();
    }

    // CREATE
    public void addMahasiswa(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa(nama) VALUES(?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error add: " + e.getMessage());
        }
    }

    // READ
    public List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );
                list.add(m);
            }

        } catch (SQLException e) {
            System.out.println("Error getAll: " + e.getMessage());
        }

        return list;
    }

    // UPDATE
    public void updateMahasiswa(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error update: " + e.getMessage());
        }
    }

    // DELETE
    public void deleteMahasiswa(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error delete: " + e.getMessage());
        }
    }
}