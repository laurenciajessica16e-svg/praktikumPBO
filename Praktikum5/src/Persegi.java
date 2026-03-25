/* 
Nama File : Persegi.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk class Persegi
Tanggal : 16 Maret 2026
*/


public class Persegi extends BangunDatar implements IResize {
    /*ATRIBUT*/
    private double sisi;
    private String warna;
    private String border;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4,"Hitam","Kuning");
        this.sisi = sisi;
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

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna" + getWarna());
        System.out.println("Border" + getBorder());
        System.out.println("Sisi: " + sisi);
    }

    @Override 
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override 
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override 
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}
