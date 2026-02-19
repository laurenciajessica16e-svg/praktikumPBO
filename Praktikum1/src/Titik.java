/*
 * Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Tanggal    :
 */

public class Titik {

    /*************** ATRIBUT ***************/
    private double absis;
    private double ordinat;

    /*************** METHOD ***************/
    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
