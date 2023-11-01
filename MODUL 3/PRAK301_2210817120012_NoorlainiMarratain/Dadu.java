package PRAK301_2210817120012_NoorlainiMarratain;

public class Dadu {
    private int jumlahdadu;
    private int total;
    public void setInput(int jumlahdadu) {
        this.jumlahdadu = jumlahdadu;
    }
    public void acakNilai() {
        for (int i = 0; i < jumlahdadu; i++) {
            int acak = 1 + (int)(Math.random() * 6);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + acak);
            total += acak;
        }
    }
    public void tampilData() {
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}