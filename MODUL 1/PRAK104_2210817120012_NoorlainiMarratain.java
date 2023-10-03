package MODUL2;

import java.util.Scanner;

public class PRAK104_2210817120012_NoorlainiMarratain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String tanganAbu = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String tanganBagas = input.nextLine();

        String[] abuTangan = tanganAbu.split(" ");
        String[] bagasTangan = tanganBagas.split(" ");

        int abuScore = 0;
        int bagasScore = 0;

        for (int i = 0; i < abuTangan.length; i++) {
            String abu = abuTangan[i];
            String bagas = bagasTangan[i];

            if (abu.equals(bagas)) {
                continue; // Seri, lanjut ke ronde berikutnya
            } else if (abu.equals("B") && bagas.equals("G") ||
                    abu.equals("G") && bagas.equals("K") ||
                    abu.equals("K") && bagas.equals("B")) {
                abuScore++;
            } else {
                bagasScore++;
            }
        }

        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (abuScore < bagasScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}