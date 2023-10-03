package MODUL1;

import java.util.Scanner;

public class PRAK105_2210817120012_NoorlainiMarratain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double phi = 3.14;
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        double volume = phi * jariJari * jariJari * tinggi;
        System.out.printf("Volume tabung dengan jari-jari %.2f cm dan tinggi %.2f cm adalah %.3f m^3\n", jariJari, tinggi, volume);
    }
}