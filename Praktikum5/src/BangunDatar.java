/* 
Nama File : BangunDatar.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat atribut dan method untuk class Bangun Datar
Tanggal : 16 Maret 2026
*/

public abstract class BangunDatar{
   /*ATRIBUT */
   protected int jmlSisi;
   protected String warna;
   protected String border;
   public abstract double getLuas();
   public abstract double getKeliling();


   public BangunDatar(){
   }

   public BangunDatar(int jmlSisi, String warna, String border){
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
   }

   /*KONSTRUKTOR */
   public int getJmlSisi(){
    return jmlSisi;
   }

   public void setJmlSisi(int jmlSisi){
    this.jmlSisi = jmlSisi;
   }

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

   public boolean isEqualLuas(BangunDatar X){
      return this.getLuas() == X.getLuas();
  }

  public boolean isEqualKeliling(BangunDatar X){
      return this.getKeliling() == X.getKeliling();
  }

   public void printInfo(){
    System.out.println("Jumlah sisi" + jmlSisi);
    System.out.println("Warna" + warna);
    System.out.println("Border" + border);
   }
}
