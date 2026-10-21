import java.util.Scanner;
public class Bioskop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket, hargaTiket = 50000, totalTiket = 0,i = 1;
        double diskon, totalBiaya = 0, jmlBiaya = 0;

        while(true) {
            System.out.print(i + ".Masukkan tiket yang dibeli (ketik 0 untuk selesai): ");
            tiket = sc.nextInt();
            if (tiket < 0){
                System.out.println ("jumlah tidak valid");
                continue;
            }
            if (tiket == 0){
                break;
            }
            if (tiket > 4 && tiket <= 10){
                diskon = 0.9;
                totalTiket += tiket;
                tiket *= hargaTiket;
                totalBiaya = diskon * tiket;
            } else if (tiket > 10) {
                diskon = 0.85;
                totalTiket += tiket;
                tiket *= hargaTiket;
                totalBiaya = diskon * tiket;
            } else {
                diskon = 1;
                totalTiket += tiket;
                tiket *= hargaTiket;
                totalBiaya = diskon * tiket;
            }
            i++;
            jmlBiaya += totalBiaya;
            System.out.println("Total yang harus dibayar : " + (int)totalBiaya);
        }

        System.out.println("Total Tiket Terjual Hari Ini : " + totalTiket);
        System.out.println("Total Pendapatan Hari Ini: Rp" + (int)jmlBiaya);

        sc.close();
    }
}
