package PRAK302_2210817120012_NoorlainiMarratain;

import java.util.*;

public class NegaraMain {
    public static void main(String[] args) {
        String namaNegara = "", jenisKepemimpinan = "", namaPresiden = "";
        int tanggalKemerdekaan = 0, bulanKemerdekaan = 0, tahunKemerdekaan = 0;

        Scanner input = new Scanner(System.in);

        LinkedList<Negara> ObjNegara = new LinkedList<Negara>();

        int inputUser = input.nextInt();

        for (int i = 0; i < inputUser; i++){
            Negara memuatNegara = new Negara(namaNegara, jenisKepemimpinan, namaPresiden, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            memuatNegara.getData();
            ObjNegara.add(memuatNegara);
        }

        for (int i = 0; i < ObjNegara.size(); i++){
            Negara Cetak = ObjNegara.get(i);
            Cetak.tampilkan();
        }
    }
}