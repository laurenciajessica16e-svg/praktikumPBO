/* 
Nama File : MBangunDatar.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk main class Bangun Datar
Tanggal : 16 Maret 2026
*/

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek persegi
        Persegi A = new Persegi(4,"Merah", "Hitam");
        //Membuat objek lingkaran
        Lingkaran B = new Lingkaran(10,"Biru","Hitam");

        //Overide
        A.printInfo();
        B.printInfo();

        /*METHOD PERSEGI*/
        System.out.println("Warna:" + A.getWarna());
        System.out.println("Luas:" + A.getLuas());
        System.out.println("Keliling:" + A.getKeliling());
        System.out.println("Diagonal:" + A.getDiagonal());


        /*METHOD LINGKARAN*/
        System.out.println("Jari-jari:" + B.getJari());
        System.out.println("Luas:" + B.getLuas());
        System.out.println("Keliling:" + B.getKeliling());

        /*METHOD PRAK 5 */
        // BangunDatar B1 = new BangunDatar();

        BangunDatar P1 = new Persegi(4,"Merah", "Hitam");
        Persegi P2 = new Persegi(10,"Biru","Hitam");

        BangunDatar L1 = new Lingkaran(10,"Biru","Hitam");
        Lingkaran L2 = new Lingkaran(20,"Biru","Hitam");

        System.out.println("Luas Persegi P1: " + P1.getLuas());
        System.out.println("Keliling Persegi P2: " + P2.getKeliling());

        System.out.println("Luas Lingkaran L1: " + L1.getLuas());
        System.out.println("Keliling Lingkaran L2: " + L2.getKeliling());

        // Perbandingan
        System.out.println("Apakah Luas P1 = P2: " + P1.isEqualLuas(P2));
        System.out.println("Apakah Keliling A1 = A2: " + L1.isEqualKeliling(L2));

        // beda bentuk
        System.out.println("Apakah Luas P1 = L1: " + P1.isEqualLuas(L1));

        //pakai interface
        Persegi P4 = new Persegi(4,"Merah", "Hitam");
        P4.zoomIn();
        P4.zoomOut();
        System.out.println("Luas Persegi: " + P1.getLuas());
        System.out.println("Luas Lingkaran: " + L1.getLuas());
    }
}
