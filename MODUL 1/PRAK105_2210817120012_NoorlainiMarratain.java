package MODUL1;
import java.util.Scanner;
public class PRAK105_2210817120012_NoorlainiMarratain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Deklarasi objek Scanner
        System.out.print("Masukan Makanan Favorit: ");
        String makananFavorit = input.nextLine();
        System.out.print("Masukan Hobi: ");
        String hobi = input.nextLine();
        System.out.println("Aku Suka Makan " + makananFavorit + ", dan Hobiku " + hobi);
    }
}