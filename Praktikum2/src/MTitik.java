/* Nama File  : MTitik.java
 * Deskripsi  : Program utama untuk menguji class Titik
 * Pembuat    : Jessica Laurencia Panjaitan
 * Tanggal    : 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik(1,2);   // Membuat objek titik T1 (0,0)

     //   T1.setAbsis(3);           // Mengubah absis menjadi 3
     //   T1.setOrdinat(4);         // Mengubah ordinat menjadi 4
    //  T1.printTitik();          // Mencetak koordinat T1 ke layar

    //  T1.geser(3, 4);           // Menggeser T1 sejauh (3,4)
    //  T1.printTitik();          // Menampilkan koordinat T1 setelah digeser

    //    Titik T2 = T1;
    //   T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
    //    T2.printTitik();

        Titik T2 = new Titik(3,5);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    //  System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik())
        System.out.println("Kuadran = " + T2.getKuadran());
        System.out.println("Jarak ke titik pusat = " + T2.getJarakPusat());
        System.out.println("Jarak = " + T2.getJarak(T1));
   
        Titik refleksiX = T2.getrefleksiX();
        Titik refleksiY = T2.getrefleksiY();
        refleksiX.printTitik();
        refleksiY.printTitik();
    }
}