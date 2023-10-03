package MODUL2;

import java.util.Scanner;

public class PRAK101_2210817120012_NoorlainiMarratain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();

        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d ", namaLengkap, tempatLahir, tanggalLahir);
        switch (bulanLahir) {
            case 1:
                System.out.print("Januari");
                break;
            case 2:
                System.out.print("Februari");
                break;
            case 3:
                System.out.print("Maret");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("Mei");
                break;
            case 6:
                System.out.print("Juni");
                break;
            case 7:
                System.out.print("Juli");
                break;
            case 8:
                System.out.print("Agustus");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("Oktober");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("Desember");
                break;
            default:
                System.out.print("Bulan tidak valid");
                break;
        }
        System.out.printf(" %d\n", tahunLahir);

        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f kilogram\n", tinggiBadan, beratBadan);

        input.close();
    }
}