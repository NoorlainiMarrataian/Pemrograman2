package Soal2;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String nama, String ras, String warnaBulu) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}