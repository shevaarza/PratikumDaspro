package Jobsheet8;
import java.util.Scanner;


public class Experiment2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N;

        // 1. Ambil input N dan validasi (minimal 5)
        do {
            System.out.print("Enter the value for N (minimum 5): ");
            N = scanner.nextInt();

            if (N < 5) {
                System.out.println("Invalid input. N must be 5 or greater.");
            }
        } while (N < 5); // Terus minta input jika N < 5

        System.out.println(); // Beri satu baris kosong untuk kerapian
        System.out.println("Star Triangle for N = " + N + ":");

        // 2. Buat segitiga terbalik menggunakan nested loop
        // Loop 'i' mengontrol baris (rows)
        // Kita hitung MUNDUR, dari N ke 1
        for (int i = N; i >= 1; i--) {
            
            // Loop 'j' mengontrol kolom (bintang) di setiap baris
            // Loop ini akan mencetak bintang sebanyak nilai 'i' saat ini
            for (int j = 1; j <= i; j++) {
                // Gunakan print() agar bintang tetap di baris yang sama
                System.out.print("*");
            }
            
            // Setelah semua bintang untuk baris itu dicetak,
            // pindah ke baris baru
            System.out.println();
        }

        scanner.close();
    }
}