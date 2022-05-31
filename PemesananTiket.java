package Tugas1;
 
import java.util.*;
import java.io.*;
 
public class PemesananTiket {
    public static void main(String[] args) {
        // List Objek
        SupirTravel sT = new SupirTravel("Mamang", "Bandung", "Laki", "082111654897", 1932, 2011,
                Jurusan.Situbondo_Malang);
        SupirRentCar sR = new SupirRentCar("Ubang", "Surabaya", "Perempuan", "082256899858", 1923, 23,
                Jurusan.Banyuwangi_Malang);
        MobilPribadi car1 = new MobilPribadi("honda", "Merah", "N 2003 N", 1923, 3, Jurusan.Madura_Malang);
        Admin admin = new Admin("Bambang", "Malang", "Laki", "083265475412", 2003, 2);
        Bus bus1 = new Bus("Volvo", "Hijau", "N 188 ER", 2020, 1, Jurusan.Surabaya_Malang);
 
        // Input Data Tiket
        System.out.println("============================================================================");
        System.out.println("Pemesanan Tiket Travel");
        System.out.println("============================================================================");
        Scanner in = new Scanner(System.in);
        System.out.print("Nama \t: ");
        String nama = in.nextLine();
        System.out.print("Alamat \t: ");
        String alamat = in.nextLine();
        System.out.print("No. HP \t: ");
        String noHp = in.nextLine();
        System.out.println("--------------------------------------------------------");
        System.out.print(
                "1. Madura - Malang \n2. Banyuwangi - Malang \n3. Situbondo - Malang \n4. Tulungagung - Malang \n5. Surabaya - Malang \nPilih jurusan \t: ");
        int pilihJurusan = in.nextInt();
        System.out.println("--------------------------------------------------------");
        in.nextLine();
        System.out.print(
                "1. Pagi (07.00 WIB) \n2. Siang (12.00 WIB) \n3. Sore (18.00) \n4. Malam (00.00 WIB) \n Pilih waktu \t: ");
        int pilihWaktu = in.nextInt();
        System.out.println("--------------------------------------------------------");
        in.nextLine();
        System.out.print("1. Bus \n2. Mobil \nJenis Kendaraan : ");
        int jenisKendaraan = in.nextInt();
        System.out.println("--------------------------------------------------------");
 
        // Konstruktor untuk Tiket
        Tiket tiket = new Tiket(nama, alamat, noHp);
 
        // Pemilihan Jenis, Jurusan, Waktu dan Tiket Kendaraan
        // Pencetakan Output menjadi File
        switch (jenisKendaraan) {
            case 1:
                switch (pilihJurusan) {
                    case 1:
                        tiket.setJurusan(Jurusan.Madura_Malang);
                        break;
                    case 2:
                        tiket.setJurusan(Jurusan.Banyuwangi_Malang);
                        break;
                    case 3:
                        tiket.setJurusan(Jurusan.Situbondo_Malang);
                        break;
                    case 4:
                        tiket.setJurusan(Jurusan.Tulungagung_Malang);
                        break;
                    case 5:
                        tiket.setJurusan(Jurusan.Surabaya_Malang);
                        break;
                    default:
                        System.out.println("Tidak ada jurusan yang dipilih!");
                        break;
                }
                switch (pilihWaktu) {
                    case 1:
                        tiket.setWaktu("06.00 WIB");
                        break;
                    case 2:
                        tiket.setWaktu("12.00 WIB");
                        break;
                    case 3:
                        tiket.setWaktu("18.00 WIB");
                        break;
                    case 4:
                        tiket.setWaktu("00.00 WIB");
                        break;
 
                    default:
                        System.out.println("Tidak ada waktu yang dipilih");
                        break;
                }
 
                try {
                    // Alamat menyimpan file
                    String path = "C:\\Daftar_Tiket\\Bus\\";
                    File file = new File(path);
 
                    StringBuffer sb = new StringBuffer("B");
 
                    // Kalau direktori tidak ada, maka akan dibuat
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    // Mencari jumlah tiket
                    int jumlahtiket = file.list().length;
                    jumlahtiket++;
                    if (jumlahtiket < 10) {
                        sb.append("000" + jumlahtiket);
                    } else if (jumlahtiket < 100) {
                        sb.append("00" + jumlahtiket);
                    } else if (jumlahtiket < 1000) {
                        sb.append("0" + jumlahtiket);
                    } else if (jumlahtiket < 10000) {
                        sb.append(jumlahtiket);
                    } else {
                        System.out.println("Tiket sudah habis !");
                    }
                    FileWriter fw = new FileWriter("C:\\Daftar_Tiket\\Bus\\" + sb + "_" + nama + ".txt");
                    BufferedWriter bw = new BufferedWriter(fw);
 
                    // Menulis kedalam file
 
                    bw.write("Tiket " + sb);
                    bw.write("\nPemesan");
                    bw.write("\nNama \t\t: " + tiket.getNama());
                    bw.write("\nNo. telepon \t: " + tiket.getNoHP());
                    bw.write("\nAlamat \t\t: " + tiket.getAlamat());
                    bw.write("\nJurusan \t: " + tiket.jurusan.getJurusan().toString());
                    bw.write("\nWaktu \t\t: " + tiket.getWaktu());
                    bw.write("\n\nSupir");
                    bw.write("\nNama \t\t: " + sT.nama);
                    bw.write("\nNo. Telp \t: " + sT.noTlp);
                    bw.write("\nNo. plat Mobil \t: " + bus1.noPlat);
                    bw.write("\n\nPetugas \t: " + admin.getNama());
                    bw.write("\n-----------------------------------------------------------------------");
                    bw.close();
                    // Menutup file
                    try {
                        BufferedWriter output = new BufferedWriter(
                                new FileWriter("C:\\Daftar_Tiket\\kumpulanTiket.txt", true));
                        BufferedReader input = new BufferedReader(
                                new FileReader("C:\\Daftar_Tiket\\Bus\\" + sb + "_" + nama + ".txt"));
                        String str;
                        while ((str = input.readLine()) != null) {
                            output.write(str);
                            output.newLine();
                        }
                        input.close();
                        output.close();
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Gagal Membuat tiket!");
                    }
 
                } catch (Exception e) {
                    System.out.println("Gagal Membuat tiket!");
                }
                break;
            case 2:
                // Tiket tiketMobil = new Tiket(nama, alamat, noHp);
                switch (pilihJurusan) {
                    case 1:
                        tiket.setJurusan(Jurusan.Madura_Malang);
                        break;
                    case 2:
                        tiket.setJurusan(Jurusan.Banyuwangi_Malang);
                        break;
                    case 3:
                        tiket.setJurusan(Jurusan.Situbondo_Malang);
                        break;
                    case 4:
                        tiket.setJurusan(Jurusan.Tulungagung_Malang);
                        break;
                    case 5:
                        tiket.setJurusan(Jurusan.Surabaya_Malang);
                        break;
                    default:
                        System.out.println("Tidak ada jurusan yang dipilih!");
                        break;
                }
                switch (pilihWaktu) {
                    case 1:
                        tiket.setWaktu("06.00 WIB");
                        break;
                    case 2:
                        tiket.setWaktu("12.00 WIB");
                        break;
                    case 3:
                        tiket.setWaktu("18.00 WIB");
                        break;
                    case 4:
                        tiket.setWaktu("00.00 WIB");
                        break;
 
                    default:
                        System.out.println("Tidak ada waktu yang dipilih");
                        break;
                }
 
                try {
                    // Alamat menyimpan file
                    String path2 = "C:\\Daftar_Tiket\\Mobil\\";
 
                    File file = new File(path2);
                    StringBuffer sb1 = new StringBuffer("F");
 
                    // Kalau direktori tidak ada, maka akan dibuat
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    // Mencari jumlah tiket
                    int jumlahtiket = file.list().length;
                    jumlahtiket++;
                    if (jumlahtiket < 10) {
                        sb1.append("000" + jumlahtiket);
                    } else if (jumlahtiket < 100) {
                        sb1.append("00" + jumlahtiket);
                    } else if (jumlahtiket < 1000) {
                        sb1.append("0" + jumlahtiket);
                    } else if (jumlahtiket < 10000) {
                        sb1.append(jumlahtiket);
                    } else {
                        System.out.println("Tiket sudah habis !");
                    }
                    FileWriter fw = new FileWriter("C:\\Daftar_Tiket\\Mobil\\" + sb1 + "_" + nama + ".txt");
                    BufferedWriter bw = new BufferedWriter(fw);
 
                    // Menulis pada file
 
                    bw.write("Tiket " + sb1);
                    bw.write("\nPemesan");
                    bw.write("\nNama \t\t: " + tiket.getNama());
                    bw.write("\nNo. telepon \t: " + tiket.getNoHP());
                    bw.write("\nAlamat \t\t: " + tiket.getAlamat());
                    bw.write("\nJurusan \t: " + tiket.jurusan.getJurusan().toString());
                    bw.write("\nWaktu \t\t: " + tiket.getWaktu());
                    bw.write("\n\nSupir");
                    bw.write("\nNama \t\t: " + sR.nama);
                    bw.write("\nNo. Telp \t: " + sR.noTlp);
                    bw.write("\nNo. plat Mobil \t: " + car1.noPlat);
                    bw.write("\n\nPetugas \t: " + admin.getNama());
                    bw.write("\n-----------------------------------------------------------------------");
                    // Menutup file
                    bw.close();
                    try {
                        BufferedWriter output = new BufferedWriter(
                                new FileWriter("C:\\Daftar_Tiket\\kumpulanTiket.txt", true));
                        BufferedReader input = new BufferedReader(
                                new FileReader("C:\\Daftar_Tiket\\Mobil\\" + sb1 + "_" + nama + ".txt"));
                        String str;
                        while ((str = input.readLine()) != null) {
                            output.write(str);
                            output.newLine();
                        }
 
                        input.close();
                        output.close();
                    } catch (Exception e) {
                        System.out.println("Gagal membuat tiket!");
                    }
 
                } catch (Exception e) {
                    System.out.println("Gagal membuat tiket!");
                }
                break;
            default:
                System.out.println("Tidak ada kendaraan yang dipilih");
                break;
        }
    }
}