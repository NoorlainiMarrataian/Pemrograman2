package praktikum2.soal2;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;
    double pajak;

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli;
    }

    public double getPajak() {
        pajak = harga * 0.11;
        return pajak;
    }
}
