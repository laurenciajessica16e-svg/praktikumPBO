/* 
Nama File : Lingkaran.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk class Lingkaran
Tanggal : 16 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize {
    /*ATRIBUT */
    private double jari;
    private String warna;
    private String border;

    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna("Hitam");
        setBorder("Kuning");
    }

    /*KONSTRUKTOR */
    public String getWarna(){
        return warna;
       }
    
    public void setWarna(String warna){
        this.warna = warna;
       }
    
    public String getBorder(){
        return border;
       }
    
    public void setBorder(String border){
        this.border = border;
       }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + jari);
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }
    
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }
    
    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }
}
