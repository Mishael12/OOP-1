package Tugas1;

public class SupirTravel extends Karyawan implements CetakInfoKaryawan {
    private int masaSim;
    private Jurusan jurusan;
 
    public SupirTravel(String nama, String alamat, String jenisKelamin, String noTlp, int tahunMasuk, int masaSim, Jurusan jurusan) {
        super(nama, alamat, jenisKelamin, noTlp, tahunMasuk);
        this.masaSim = masaSim;
        this.jurusan = jurusan;
    }
 
    public void setMasasim(int masaSim) {
        this.masaSim = masaSim;
    }
 
    public int getMasasim() {
        return masaSim;
    }
 
    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
 
    public Jurusan getJurusan() {
        return jurusan;
    }
 
    public void keterangan1() {
        System.out.println("Bisa Digunakan");
    }
 
    public void keterangan2() {
        System.out.println("Belum Bisa digunakan");
    }
 
    public void print() {
        System.out.println("====== Data Supir Travel ======");
        cetakTahunMasuk(getTahunMasuk());
        super.print();
        System.out.println("Masa Sim     = " + masaSim);
        System.out.println("Jurusan      = " +jurusan.getJurusan());
    }
 
    void keterangan() {
        if (masaSim > 2010) {
            keterangan1();
        } else {
            keterangan2();
        }
    }
 
    @Override
    public void cetakTahunMasuk(int x) {
        System.out.println("Tahun Masuk     = " + x);
 
    }
 
}
