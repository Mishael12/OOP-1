package Tugas1;

public enum Jurusan {
    Madura_Malang("Madura - Malang"),
    Banyuwangi_Malang("Banyuwangi - Malang"),
    Situbondo_Malang("Situbondo - Malang"),
    Tulungagung_Malang("Tulungagung - Malang"),
    Surabaya_Malang("Surabaya - Malang");
 
    private String jurusan;
 
    Jurusan(String jurusan) {
        this.jurusan = jurusan;
    }
 
    public String getJurusan() {
        return jurusan;
    }
}
