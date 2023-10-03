package MODUL2;

import java.util.Scanner;

public class PRAK103_2210817120012_NoorlainiMarratain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;
        while (ulangi) {
            int N = input.nextInt();
            int bilanganAwal = input.nextInt();
            int baris = 1;
            int bilangan = bilanganAwal;
            do {
                if (bilangan % 2 != 0) {
                    System.out.print(bilangan);
                    if (baris < N) {
                        System.out.print(", ");
                    }
                    baris++;
                }
                bilangan++;
            } while (baris <= N);
            if (baris == 1) {
                System.out.println("Tidak ada bilangan ganjil dalam deret ini.");
            } else {
                System.out.println();
            }
        }
    }
}