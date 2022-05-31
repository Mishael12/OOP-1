package Tugas1;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class SlipGaji {
    public static void main(String[] args){
        SupirTravel sT = new SupirTravel("Mamang", "Bandung", "Laki", "3812841", 1932, 2011,
                Jurusan.Situbondo_Malang);
        // SupirTravel sT2 = new SupirTravel("Junaedi", "Sukabumi", "Laki", "3022232", 1977, 2020,
        //         Jurusan.Tulungagung_Malang);
        String a;
        Scanner in = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Jenis Armada : ");
        System.out.print(
                "1. Bus \n2. Mobil \nPilih Armada : ");
        int jenisKendaraan = in.nextInt();
        System.out.print("Jumlah Trip : ");
        int jumlahTrip = in.nextInt();
        System.out.println("===============================");
        
        // Menghitung gaji
        int gaji;
        gaji = 200000 * jumlahTrip;
        if(jenisKendaraan == 1){
            a = "Bus";
        }else{
            a = "Mobil";
        }
        
        try{
            // Alamat Menyimpan File
            String path1 = "C:\\Slip_Gaji\\";

            File file = new File(path1);
 
            // Kalau direktori tidak ada, maka akan dibuat
            if (!file.exists()) {
                file.mkdirs();
                } 
            // Calendar
            Calendar Cal = Calendar.getInstance();
            // Pembuatan File
            FileWriter fw = new FileWriter("C:\\Slip_Gaji\\" +sT.getNama()+"_"+new SimpleDateFormat("MMM").format(Cal.getTime())+Cal.get(Calendar.YEAR) +".txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(" Slip Gaji");
            bw.write("\n Bulan "+new SimpleDateFormat("MMM").format(Cal.getTime()) +" " +Cal.get(Calendar.YEAR));
            bw.write("\n\n Nama          : "+sT.getNama());
            bw.write("\n Alamat        : "+ sT.getAlamat());
            bw.write("\n No. Hp        : "+ sT.getNotlp());
            bw.write("\n Jumlah Trip   : "+jumlahTrip);
            bw.write("\n Armada        : "+a);
            bw.write("\n Gaji          : Rp "+gaji);
            bw.write("\n ----------------------------------");
            bw.close();
            try {
                BufferedWriter output = new BufferedWriter(
                        new FileWriter("C:\\Slip_Gaji\\" +new SimpleDateFormat("MMM").format(Cal.getTime())+Cal.get(Calendar.YEAR) +".txt" , true));
                BufferedReader input = new BufferedReader(
                        new FileReader("C:\\Slip_Gaji\\" +sT.getNama()+"_"+new SimpleDateFormat("MMM").format(Cal.getTime())+Cal.get(Calendar.YEAR)+".txt"));
                String str;
                while ((str = input.readLine()) != null) {
                    output.write(str);
                    output.newLine();
                }

                input.close();
                output.close();
            } catch (Exception e) {
                System.out.println("Gagal memasukan slip gaji!");
            }

            }catch (Exception e){
                System.out.println(e);
            }
                
            
        
 
    }
}


