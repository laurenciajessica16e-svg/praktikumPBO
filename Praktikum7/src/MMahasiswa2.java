/* 
Nama File : MMahasiswa2.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat class Main Mahasiswa
Tanggal : 20 April 2026
*/

public class MMahasiswa2 {
    public static void main(String[] args) {
        //aplikasi konstruktor tanpa parameter 2c
        Mahasiswa2 m1 = new Mahasiswa2();
        System.out.println("m1 = ");
        m1.Tampil();

        //aplikasi konstruktor dengan parameter 2d
        Mahasiswa2 m2 = new Mahasiswa2(13084, "Jessica", "Informatika");
        System.out.println("m2 = ");
        m2.Tampil();

        //aplikasi konstruktor kloning
        Mahasiswa2 m3 = new Mahasiswa2(m2);
        System.out.println("m3 =");
        m3.Tampil();


    }
    
}
