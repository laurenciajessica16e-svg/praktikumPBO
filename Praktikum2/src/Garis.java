class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor tanpa parameter 
    public Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        titikAwal = awal;
        titikAkhir = akhir;
        counterGaris++;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Gradien
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Titik tengah
    public Titik getTitikTengah() {
        double xt = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yt = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xt, yt);
    }

    // Cek sejajar
    public boolean isSejajar(Garis G) {
        return getGradien() == G.getGradien();
    }

    // Cek tegak lurus
    public boolean isTegakLurus(Garis G) {
        return getGradien() * G.getGradien() == -1;
    }

    // Print garis
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // Persamaan garis
    public String getPersamaanGaris() {
        double m = getGradien();
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double c = y1 - m * x1;

        return "y = " + m + "x + " + c;
    }
}