class MGaris {
    public static void main(String[] args) {

        Titik A = new Titik(-2,0);
        Titik B = new Titik(0, 4);

        Garis G1 = new Garis(A, B);

        G1.printGaris();

        System.out.println("Panjang = " + G1.getPanjang());
        System.out.println("Gradien = " + G1.getGradien());

        System.out.print("Titik Tengah: ");
        G1.getTitikTengah().printTitik();

        System.out.println("Persamaan: " + G1.getPersamaanGaris());
        System.out.println("Jumlah Garis = " + Garis.getCounterGaris());
    }
}