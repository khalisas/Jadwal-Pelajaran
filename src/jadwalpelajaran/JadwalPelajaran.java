package jadwalpelajaran;

import java.util.Scanner;

public class JadwalPelajaran {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String[] senin = {"SIMDIG", "PRODUKTIF", "PKN", "TAHFIDZ", "BK"};
        String[] selasa = {"FISIKA", "KJD", "PRODUKTIF", "MATEMATIKA"};
        String[] rabu = {"KIMIA", "PRODUKTIF", "DESAIN GRAFIS", "TAHFIDZ", "SENI BUDAYA"};
        String[] kamis = {"OLAHRAGA", "PRODUKTIF", "BAHASA INGGRIS", "TAHFIDZ", "BAHASA INDONESIA"};
        String[] jumat = {"SISTEM KOMUNIKASI", "PRODUKTIF", "SEJARAH", "AGAMA"};
        String ulang;

        do{
            System.out.println("");
            System.out.println("-----------------");
            System.out.println("JADWAL PELAJARAN");
            System.out.println("Masukkan hari: ");
            String pilih = masukan.next();
            
            if (pilih.equals("senin")) {
                System.out.println("jadwal hari senin adalah");
                System.out.println(senin[0]);
                System.out.println(senin[1]);
                System.out.println(senin[2]);
                System.out.println(senin[3]);
                System.out.println(senin[4]);
            }
            else if (pilih.equals("selasa")) {
                System.out.println("jadwal hari selasa adalah");
                System.out.println(selasa[0]);
                System.out.println(selasa[1]);
                System.out.println(selasa[2]);
                System.out.println(selasa[3]);
            }
            else if (pilih.equals("rabu")) {
                System.out.println("jadwal hari rabu adalah");
                System.out.println(rabu[0]);
                System.out.println(rabu[1]);
                System.out.println(rabu[2]);
                System.out.println(rabu[3]);
                System.out.println(rabu[4]);
            }
            else if (pilih.equals("kamis")) {
                System.out.println("jadwal hari kamis adalah");
                System.out.println(kamis[0]);
                System.out.println(kamis[1]);
                System.out.println(kamis[2]);
                System.out.println(kamis[3]);
                System.out.println(kamis[4]);
            }
            else if (pilih.equals("jumat")) {
                System.out.println("jadwal hari jumat adalah");
                System.out.println(jumat[0]);
                System.out.println(jumat[1]);
                System.out.println(jumat[2]);
                System.out.println(jumat[3]);
            }
            else if (pilih.equals("seminggu")) {
                System.out.println("jadwal seminggu adalah");
                System.out.println("senin:");
                System.out.println(senin[0]);
                System.out.println(senin[1]);
                System.out.println(senin[2]);
                System.out.println(senin[3]);
                System.out.println(senin[4]);
                System.out.println("==============");
                System.out.println("selasa:");
                System.out.println(selasa[0]);
                System.out.println(selasa[1]);
                System.out.println(selasa[2]);
                System.out.println(selasa[3]);
                System.out.println("==============");
                System.out.println("rabu:");
                System.out.println(rabu[0]);
                System.out.println(rabu[1]);
                System.out.println(rabu[2]);
                System.out.println(rabu[3]);
                System.out.println(rabu[4]);
                System.out.println("==============");
                System.out.println("kamis:");
                System.out.println(kamis[0]);
                System.out.println(kamis[1]);
                System.out.println(kamis[2]);
                System.out.println(kamis[3]);
                System.out.println(kamis[4]);
                System.out.println("==============");
                System.out.println("jumat:");
                System.out.println(jumat[0]);
                System.out.println(jumat[1]);
                System.out.println(jumat[2]);
                System.out.println(jumat[3]);
            }
            System.out.println("");
            System.out.println("apakah Anda ingin melihat jadwal lagi?");
            ulang = masukan.next();
        } while (ulang.equals("iya") || ulang.equals("ya") || ulang.equals("yo"));

        System.out.println("");
        System.out.println("Terimakasih");

    }
}
