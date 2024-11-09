
package Pertemuan9;

public class Mahasiswa {
    private final String NIM;
    private final String Nama;
    private final String Alamat;
    private final String MataKuliah;
    private double nilaiAkhir;

    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
    }


    public void hitungNilaiAkhir(double nilai10, double nilai15_1, double nilaiUTS, double nilai15_2, double nilai35) {
        this.nilaiAkhir = (nilai10 * 0.10) + (nilai15_1 * 0.15) + (nilaiUTS * 0.25) + (nilai15_2 * 0.15) + (nilai35 * 0.35);
    }

    public String getNIM() { return NIM; }
    public String getNama() { return Nama; }
    public String getAlamat() { return Alamat; }
    public String getMataKuliah() { return MataKuliah; }
    public double getNilaiAkhir() { return nilaiAkhir; }
}

