/* 
Nama File : Kendaraan.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk class Kendaraan
Tanggal : 2 Maret 2026
*/

public class Kendaraan {

    /*  ATRIBUT  */
    private String noPlat;
    private String jenis;

    /*  KONSTRUKTOR  */
    //Konstruktor tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor untuk masing-masing atribut
    public String getNoPlat(){
        return noPlat;
    }
    
    public String getJenis(){
        return jenis;
    }

    //Muktator untuk masing-masing atribut 
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
