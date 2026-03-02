/* Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Jessica Laurencia Panjaitan
 * Tanggal    : 23 Februari 2026
 */

public class Titik {

    /* ********** ATRIBUT ********** */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* ********** METHOD ********** */

    // Konstruktor untuk membuat titik (0,0)
    //Titik() {
    //    absis = 0;
    //    ordinat = 0;
    //    counterTitik++;
    //}

    // Konstruktor untuk buat dengan nilai absis dan ordinat tertentu
    //Titik(double absis, double ordinat) {
    //    this.absis = absis;
    //    this.ordinat = ordinat;
    //}

    //Konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0,0);
    }

    //Konstruktor Ovoerloading
    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }

    //Mengembalikan nilai counterTitik()
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Meng-set absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Meng-set ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Mengembalikan kuadran dari titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } 
        else if (absis > 0 && ordinat < 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis < 0 && ordinat > 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    // Mencari jarak titik ke titik pusat O(0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    //Mencari jarak antara 2 titik
    public double getJarak(Titik T) { 
        double xn = absis - T.getAbsis();
        double yn = ordinat - T.getOrdinat();
        return Math.sqrt(xn*xn + yn*yn);
    }

    public void refleksiX(){
        ordinat = ordinat * (-1);
    }

    public void refleksiY() {
        absis = absis * (-1);
    }

    public Titik getrefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getrefleksiY(){
        return new Titik(-absis, ordinat);
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

   // void printCounterTitik() {
   //     System.out.println(this.counterTitik);
   // }
   // --> eror karena atribut this digunakan untuk merujuk ke dirinya sendiri jadi karena thiscounter statis maka tidak bisa pakai itu
}
