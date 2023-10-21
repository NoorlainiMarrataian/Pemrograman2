package praktikum2.soal3;

public class Pegawai {
    public String nama;
    public String asal;
    public String jabatan;
    public int umur = 17;

    public String getNama() {
        return nama;
    }

    public String getAsal() {  // Mengganti tipe data char ke String untuk asal
        return asal;
    }

    public void setJabatan(String j) {  // Menambahkan parameter j
        this.jabatan = j;
    }
}