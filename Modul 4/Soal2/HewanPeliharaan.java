package Soal2;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String  nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
    public void displayDetailKucing() {
    }
    public void displayDetailAnjing() {
    }
}
