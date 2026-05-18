package program;

import model.Mahasiswa;
import service.MysqlMahasiswaService;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        MysqlMahasiswaService service = new MysqlMahasiswaService();

        // CREATE
        service.addMahasiswa(new Mahasiswa("Jessica"));
        service.addMahasiswa(new Mahasiswa("Budi"));

        // READ
        List<Mahasiswa> list = service.getAllMahasiswa();
        System.out.println("=== DATA MAHASISWA ===");
        for (Mahasiswa m : list) {
            System.out.println(m);
        }

        // UPDATE (contoh update id=1)
        service.updateMahasiswa(new Mahasiswa(1, "Jessica Update"));

        // DELETE (contoh delete id=2)
        service.deleteMahasiswa(2);

        // READ ulang
        System.out.println("\n=== DATA SETELAH UPDATE & DELETE ===");
        list = service.getAllMahasiswa();
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
    }
}