package MODUL2;

import java.util.Scanner;

public class PRAK102_2210817120012_NoorlainiMarratain {
    public static void main(String[] args) {

        int inputUser, i = 1;

        Scanner keyboard = new Scanner(System.in);

        inputUser = keyboard.nextInt();
        int cek1 = inputUser;

        while(i <= 11){

            if(inputUser % 5 == 0) {
                System.out.print((inputUser / 5) - 1);
                inputUser += 1;

            } else {
                System.out.print(inputUser);
                inputUser += 1;
            }

            if(i < 11) {
                System.out.print(", ");
            }
            i = i + 1;
        }
        System.out.println("");
    }
}