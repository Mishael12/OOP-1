package Tugas1;


public class MobilPribadi extends Mobil implements CetakInfoMobil {
    private int kapasitas;
    private Jurusan jurusan;
 
    public MobilPribadi(String merkMobil, String warnaMobil, String noPlat, int tahunKeluaran, int kapasitas, Jurusan jurusan) {
        super(merkMobil, warnaMobil, noPlat, tahunKeluaran);
        this.kapasitas = kapasitas;
        this.jurusan = jurusan;
    }
 
    public void print() {
        System.out.println("====== Data Mobil Pribadi ======");
        cetakmerkMobil(getmerkMobil());
        super.print();
        System.out.println("Kapasitas        = " + getKapasitas());
        System.out.println("Jurusan          = " + jurusan.getJurusan());
    }
 
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
 
    public int getKapasitas() {
        return kapasitas;
    }
 
    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
 
    public Jurusan getJurusan() {
        return jurusan;
    }
 
    public void keterangan1() {
        System.out.println("Sewa Sopir");
    }
 
    public void keterangan2() {
        System.out.println("Bawa Sendiri");
    }
 
    void keterangan() {
        if (kapasitas > 5) {
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