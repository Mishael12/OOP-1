package Tugas1;


public class Karyawan {
    String nama;
    String alamat;
    String noTlp;
    String jenisKelamin;
    int tahunMasuk;// Diubah sebelumnya TanggalMasuk : String
 
    // Object
    Karyawan(String nama, String alamat, String jenisKelamin, String noTlp, int tahunMasuk) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.noTlp = noTlp;
        this.tahunMasuk = tahunMasuk;
    }
 
    void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
 
    int getTahunMasuk() {
        return tahunMasuk;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
    public String getAlamat() {
        return alamat;
    }
 
    public void setJeniskelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
 
    public String getJeniskelamin() {
        return jenisKelamin;
    }
 
    public void setNotlp(String noTlp) {
        this.noTlp = noTlp;
    }
 
    public String getNotlp() {
        return noTlp;
    }
 
    void print() {
        System.out.println("Nama Karyawan = " + nama);
        System.out.println("Alamat        = " + alamat);
        System.out.println("Jenis Kelamin = " + jenisKelamin);
        System.out.println("No Telephone  = " + noTlp);
    }
 
    void keterangan() {
 
    }
}