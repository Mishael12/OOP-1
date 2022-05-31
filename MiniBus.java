package Tugas1;


public class MiniBus extends Mobil implements CetakInfoMobil {
    private int umurPemakaian;
    private Jurusan jurusan;
 
    public MiniBus(String merkMobil, String warnaMobil, String noPlat, int tahunKeluaran, int umurPemakaian, Jurusan jurusan) {
        super(merkMobil, warnaMobil, noPlat, tahunKeluaran);
        this.umurPemakaian = umurPemakaian;
        this.jurusan = jurusan;
    }
 
    public void setUmurPemakaian(int umurPemakaian) {
        this.umurPemakaian = umurPemakaian;
    }
 
    public int getUmurPemakaian() {
        return umurPemakaian;
    }
 
    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
 
    public Jurusan getJurusan() {
        return jurusan;
    }
 
    public void print() {
        System.out.println("======= Data MiniBus =======");
        cetakmerkMobil(getmerkMobil());
        super.print();
        System.out.println("Umur Pemakaian   = " + getUmurPemakaian());
        System.out.println("Jurusan          = " + jurusan.getJurusan());
    }
 
    public void keterangan1() {
        System.out.println("Dengan Pemandu");
    }
 
    public void keterangan2() {
        System.out.println("Tanpa Pemandu");
    }
 
    void keterangan() {
        if (umurPemakaian > 5) {
            keterangan1();
        } else {
            keterangan2();
        }
    }
 
    @Override
    public void cetakmerkMobil(String x) {
        System.out.println("Nama Merk Mobil  = " + x);
    }
}
