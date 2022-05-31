package Tugas1;



public abstract class Mobil {
    String merkMobil;
    String warnaMobil;
    String noPlat;
    int tahunKeluaran;
 
    // Class
    public Mobil(String merkMobil, String warnaMobil, String noPlat, int tahunKeluaran) {
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.noPlat = noPlat;
        this.tahunKeluaran = tahunKeluaran;
    }
 
    public void setmerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }
 
    public String getmerkMobil() {
        return merkMobil;
    }
 
    public void setwarnaMobil(String warnaMobil) {
        this.warnaMobil = warnaMobil;
    }
 
    public String getwarnaMobil() {
        return warnaMobil;
    }
 
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
 
    public String getnoPlat() {
        return noPlat;
    }
 
    public void settahunKeluaran(int tahunKeluaran) {
        this.tahunKeluaran = tahunKeluaran;
    }
 
    public int gettahunKeluaran() {
        return tahunKeluaran;
    }
 
    public void print() {
        System.out.println("Warna Mobil      = " + getwarnaMobil());
        System.out.println("Nomer Plat       = " + getnoPlat());
        System.out.println("Tahun Keluaran   = " + gettahunKeluaran());
    }
 
    // behaviour
    void service() {
        System.out.println("Mobil sedang di service");
    }
 
    void dipakai() {
        System.out.println("Mobil sedang di pakai");
    }
 
    abstract void keterangan();
}
