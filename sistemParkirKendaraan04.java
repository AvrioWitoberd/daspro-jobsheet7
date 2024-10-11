import java.util.Scanner;

public class sistemParkirKendaraan04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        while (true) {
            System.out.println("Masukkan nomor jenis kendaraan (1 (Mobil), 2 (Motor), 0 (Keluar)): ");
            jenis = sc.nextInt();
            if (jenis == 0) {
                break; 
            }
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();
                if (durasi > 0) {
                    if (durasi > 5) {
                        total += 12500;
                    } else {
                        if (jenis == 1) {
                            total += durasi * 3000; 
                        } else if (jenis == 2) {
                            total += durasi * 2000; 
                        }
                    }
                } else {
                    System.out.println("Durasi tidak valid. Masukkan durasi yang benar.");
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
            }
        }
        System.out.println("Total pembayaran parkir adalah: " + " RP " + total );
        sc.close(); 

    }
}
