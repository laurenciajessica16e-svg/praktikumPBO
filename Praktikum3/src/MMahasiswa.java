public class MMahasiswa {
    public static void main(String[] args) {

        // Membuat objek MataKuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // Membuat objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");

        // Membuat objek Dosen
        Dosen D1 = new Dosen("123", "Andi", "Informatika");

        // Membuat objek Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");

        // Relasi antar objek
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);

        // Menambahkan mata kuliah
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);

        // Memanggil method sesuai soal
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}