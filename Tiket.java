package Tugas1;
 
public class Tiket {
    String nama, alamat, noHp, waktu;
    int pilihJurusan;
    Jurusan jurusan;
 
    Tiket() {
    }
 
    Tiket(String nama, String alamat, String noHp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
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
 
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
 
    public String getNoHP() {
        return noHp;
    }
 
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
 
    public String getWaktu() {
        return waktu;
    }
 
    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
 
    public Jurusan getJurusan() {
        return jurusan;
    }
 
    public void cetakTiket() {
        System.out.println("Nama : " + nama);
        System.out.println("alamat : " + alamat);
        System.out.println("No. HP : " + noHp);
        System.out.println();
    }
}