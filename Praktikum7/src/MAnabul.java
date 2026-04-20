/* 
Nama File : MAnabul.java
Pembuat : Jessica Laurencia Panjaitan
Deskripsi : Membuat class Main Anabul
Tanggal : 20 April 2026
*/

class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara");
    }
}

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}

class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}

public class MAnabul {
    public static void main(String[] args) {
        Anabul[] daftarAnabul = new Anabul[3];

        daftarAnabul[0] = new Kucing("Axy");
        daftarAnabul[1] = new Anjing("Cory");
        daftarAnabul[2] = new Burung("Riz");

        for (Anabul a : daftarAnabul) {
            System.out.println("Nama: " + a.nama);
            a.gerak();
            a.bersuara();
        }
    }
}