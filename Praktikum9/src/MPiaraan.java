/* 
Nama : Jessica Laurencia Panjaitan
NIM : 24060124130084
Nama file : MTeman.java
Tanggal : 4 Mei 2026
*/

import java.util.*;

class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
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
    private int bobot;

    public Kucing(String nama, int bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public int getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan kaki");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " mengeong");
    }
}

class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // i. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // ii. enqueueAnabul(anabul)
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.offer(anabul);
        nbelm++;
    }

    // iii. isMember(anabul)
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // iv. getAnabul() ambil data pertama
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // v. dequeueAnabul() ambil dan hapus elemen pertama
    public Anabul dequeueAnabul() {
        if (nbelm == 0) {
            return null;
        }
        nbelm--;
        return Lanabul.poll();
    }

    // C. showAnabul()
    public void showAnabul() {
        System.out.println("Daftar Anabul dalam antrean:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    // D. countKucing()
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // E. bobotKucing()
    public int bobotKucing() {
        int total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    // F. showJenisAnabul()
    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " (" + a.getClass().getName() + ")");
        }
    }
}

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan antrean = new Piaraan();

        Kucing k1 = new Kucing("Mimi", 5);
        Kucing k2 = new Kucing("Snowy", 4);

        // enqueue
        antrean.enqueueAnabul(k1);
        antrean.enqueueAnabul(k2);

        System.out.println("Jumlah elemen antrean: " + antrean.getNbelm());

        // show nama
        antrean.showAnabul();

        // show nama + jenis
        antrean.showJenisAnabul();

        // count kucing
        System.out.println("Jumlah kucing dalam antrean: " + antrean.countKucing());

        // total bobot kucing
        System.out.println("Total bobot kucing: " + antrean.bobotKucing());

        // get anabul pertama
        System.out.println("Anabul pertama: " + antrean.getAnabul().getNama());

        // dequeue
        System.out.println("Dequeued: " + antrean.dequeueAnabul().getNama());

        // tampilkan ulang antrean
        antrean.showAnabul();

        System.out.println("Jumlah elemen antrean sekarang: " + antrean.getNbelm());
    }
}