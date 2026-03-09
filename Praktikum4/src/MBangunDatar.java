/* 
Nama File : MBangunDatar.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk main class Bangun Datar
Tanggal : 9 Maret 2026
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
    }
}
