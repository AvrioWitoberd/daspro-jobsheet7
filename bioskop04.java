import java.util.Scanner;

public class bioskop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000; 
        int totalTiket = 0; 
        int totalPenjualan = 0; 
        int jumlahTiket;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (negatif untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                break; 
            } else if (jumlahTiket == 0) {
                System.out.println("Jumlah tiket tidak boleh nol. Silakan coba lagi.");
                continue; 
            }

            totalTiket += jumlahTiket;

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }

            int hargaSetelahDiskon = (int) (hargaTiket * jumlahTiket * (1 - diskon));
            totalPenjualan += hargaSetelahDiskon;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket adalah: " + "RP " + hargaSetelahDiskon);
        } while (true); 

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket hari ini: " + " RP " + totalPenjualan );

        sc.close(); 

    }
}
