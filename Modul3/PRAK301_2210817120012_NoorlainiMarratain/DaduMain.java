package PRAK301_2210817120012_NoorlainiMarratain;

import java.util.Scanner;

public class DaduMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu d = new Dadu();
        int jumlahdadu = input.nextInt();
        d.setInput (jumlahdadu);
        d.acakNilai ();
        d.tampilData();
    }
}
