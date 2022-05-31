package Tugas1;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main{
    /*
     * instanceOf diubah karena nilai kapasitas/umurPemakaian/jenisBus
     * Tidak terbaca, pemilihan keterangan langsung berada pada class masing2
     */
    static void staff(Karyawan k){
        if (k instanceof Admin){
            Admin aD = (Admin) k;
            aD.keterangan();
        }else if(k instanceof SupirTravel){
            SupirTravel aT = (SupirTravel)k;
            aT.keterangan();
        }else if(k instanceof SupirRentCar){
            SupirRentCar sR = (SupirRentCar)k;
            sR.keterangan();
        }
    }

    static void Mobil(Mobil c) {
        if (c instanceof MobilPribadi) {
            MobilPribadi mP = (MobilPribadi) c;
            mP.keterangan();
        } else if (c instanceof MiniBus) {
            Mobil mB = (MiniBus) c;
            mB.keterangan();
        } else if (c instanceof Bus) {
            Bus B = (Bus) c;
            B.keterangan();
        }
    }
 
    public static void main(String[] args){
        //Bagian Karyawan
        Jurusan[] daftarJurusan = Jurusan.values();
        try {
            for (int i = 0; i < daftarJurusan.length + 1; i++) {
                System.out.println((i + 1) + ". " + daftarJurusan[i].getJurusan());
            }
            System.out.println("--------------------------");
 
        } catch (ArrayIndexOutOfBoundsException aException) {
            System.out.println("--------------------------");
            System.out.println("Tidak ada data tersebut!");
            System.out.println("--------------------------");
        }
        System.out.println();
        // inisiasi Hashmap
        Map<String, Integer> map = new HashMap<String, Integer>();
        System.out.println("=========================");
        System.out.println("Seluruh jadwal telah ditunjukan.");
        System.out.println("=========================");
        System.out.println("Bagian Karyawan");
        System.out.println("=========================");
        Admin admin = new Admin("Bambang", "Malang", "Laki", "0834981", 2003, 2);
        admin.print();
        staff(admin);
        map.put(admin.getNama(), admin.getTahunMasuk());
        System.out.println();
 
        Admin admin2 = new Admin("Hellen", "Sidoarjo", "Perempuan", "3920192", 2004, 3);
        admin2.print();
        staff(admin2);
        map.put(admin2.getNama(), admin2.getTahunMasuk());
        System.out.println();
 
        SupirRentCar sR = new SupirRentCar("Ubang", "Surabaya", "Perempuan", "3983902", 1997, 43,
                Jurusan.Banyuwangi_Malang);
        sR.print();
        staff(sR);
        map.put(sR.getNama(), sR.getTahunMasuk());
        System.out.println();
 
        SupirTravel sT = new SupirTravel("Mamang", "Bandung", "Laki", "3812841", 1932, 2011,
                Jurusan.Situbondo_Malang);
        sT.print();
        staff(sT);
        map.put(sT.getNama(), sT.getTahunMasuk());
        System.out.println();
 
        SupirTravel sT2 = new SupirTravel("Junaedi", "Sukabumi", "Laki", "3022232", 1977, 2020,
                Jurusan.Tulungagung_Malang);
        sT2.print();
        staff(sT2);
        map.put(sT2.getNama(), sT2.getTahunMasuk());
        System.out.println();
 
        // Pengecheckan Excemption untuk enum class
        try {
            SupirRentCar sR2 = new SupirRentCar("Ubang", "Surabaya", "Perempuan", "3983902", 1923, 23,
                    Jurusan.values()[5]);
            sR2.print();
            staff(sR2);
        } catch (ArrayIndexOutOfBoundsException aException) {
            System.out.println("--------------------------");
            System.out.println("Tidak Ada data Tersebut");
            System.out.println("Tolong Periksa Kembali !");
            System.out.println("--------------------------");
        }

        // Output Collection nya
        System.out.println("Urutan jabatan ");
        AtomicInteger counter = new AtomicInteger(1);
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(s -> {
                    if (s.getValue() < 2000) {
                        System.out.println(
                                counter.getAndIncrement() + ". " + s.getKey() + ", " + s.getValue() + " (Senior)");
                    } else {
                        System.out.println(counter.getAndIncrement() + ". " + s.getKey() + ", " + s.getValue());
                    }
                });
                System.out.println();
        
        // Pengetesan error null pointer pada sorting value
        try {
            SupirRentCar sR2 = new SupirRentCar("Ubang", "Surabaya", "Perempuan",
                    "3983902", 1932, 23,
                    Jurusan.values()[4]);
            map.put(sR2.getNama(), null);
            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(s -> {
                        if (s.getValue() < 2000) {
                            System.out.println(
                                    counter.getAndIncrement() + ". " + s.getKey() + ", " + s.getValue() + " (Senior)");
                        } else {
                            System.out.println(counter.getAndIncrement() + ". " + s.getKey() + ", " + s.getValue());
                        }
                    });
        } catch (NullPointerException e) {
            System.out.println("Error! Data tidak ditemukan");
        }
        System.out.println();
        
        //Insisasi Collection
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        //Object Mobil
        MobilPribadi car1 = new MobilPribadi("honda", "Merah", "N 2003 N", 1923, 3, Jurusan.Madura_Malang);
        car1.print();
        Mobil(car1);
        queue.add(car1.gettahunKeluaran());
        System.out.println();

        MiniBus miniBus1 = new MiniBus("Toyota", "Silver", "N 199 A", 2010, 2, Jurusan.Surabaya_Malang);
        miniBus1.print();
        Mobil(miniBus1);
        queue.add(miniBus1.gettahunKeluaran());
        System.out.println();

        Bus bus1 = new Bus("Volvo", "Hijau", "N 188 ER", 2020, 1, Jurusan.Surabaya_Malang);
        bus1.print();
        Mobil(bus1);
        queue.add(bus1.gettahunKeluaran());
        System.out.println();

        MiniBus miniBus2 = new MiniBus("Honda", "Abu-Abu", "N 3425 FA", 2013, 4, Jurusan.Madura_Malang);
        miniBus2.print();
        Mobil(miniBus2);
        queue.add(miniBus2.gettahunKeluaran());
        System.out.println();

        MiniBus miniBus3 = new MiniBus("Honda", "Abu-Abu", "N 3425 FA", 2014, 4, Jurusan.Madura_Malang);
        miniBus3.print();
        Mobil(miniBus3);
        queue.add(miniBus3.gettahunKeluaran());
        System.out.println();

        // Pengecheckan Excemption untuk class Enum
        try{
            MobilPribadi car2 = new MobilPribadi("Mercedes", "Hitam", "S 2312 BA", 2003, 3, Jurusan.values()[5]);
            car2.print();
            queue.add(car2.gettahunKeluaran());
        }catch(ArrayIndexOutOfBoundsException aException){
            System.out.println("--------------------------");
            System.out.println("Tidak Ada data Tersebut");
            System.out.println("Tolong Periksa Kembali !");
            System.out.println("--------------------------");
        }
        
        
        //Output Collection
        System.out.println("============================================");
        System.out.println("Data Tahun Keluaran Mobil Yang Akan Di Pakai : ");
        int a = 1;
        while (!queue.isEmpty()) {
            System.out.println(a+". "+queue.remove());
            a++;
        }
        System.out.println();
        
        //Pengecheckan Excemption Collection
        try{
            MiniBus Bus = new MiniBus("Mercedes", "Abu-Abu", "N 0832 FA", 0, 4, Jurusan.Madura_Malang);
            Bus.print();
            Mobil(Bus);
            queue.add(null);
            System.out.println();
            System.out.println("============================================");
            System.out.println("Data Tahun Keluaran Mobil Yang Akan Di Pakai : ");
            while (!queue.isEmpty()) {
                System.out.println(a+". "+queue.remove());
                a++;
            }
        }catch(NullPointerException e){
            System.out.println("============================================");
            System.out.println("Data Tahun Keluaran Mobil Yang Akan Di Pakai : ");
            // System.out.println("--------------------------");
            System.out.println("Error Periksa Kembali Data !");
            // System.out.println("--------------------------");
        }
    }
}