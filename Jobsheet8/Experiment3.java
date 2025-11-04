package Jobsheet8;
import java.util.Scanner;

public class Experiment3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N;

        // 1. Ambil input N dan validasi (minimal 3)
        do {
            System.out.print("Enter the value for N (minimum 3): ");
            N = scanner.nextInt();

            if (N < 3) {
                System.out.println("Invalid input. N must be 3 or greater.");
            }
        } while (N < 3); // Terus minta input jika N < 3

        System.out.println(); // Beri satu baris kosong
        System.out.println("Square Display for N = " + N + ":");

        // 2. Buat kotaknya menggunakan nested loop
        // Loop 'i' mengontrol baris (atas ke bawah)
        for (int i = 1; i <= N; i++) {
            
            // Loop 'j' mengontrol kolom (kiri ke kanan)
            for (int j = 1; j <= N; j++) {
                
                // Periksa apakah posisi (i, j) ada di Tepi
                // Tepi adalah: baris pertama (i == 1)
                // ATAU baris terakhir (i == N)
                // ATAU kolom pertama (j == 1)
                // ATAU kolom terakhir (j == N)
                if (i == 1 || i == N || j == 1 || j == N) {
                    // Jika di tepi, cetak N diikuti spasi
                    System.out.print(N + " ");
                } else {
                    // Jika di tengah, cetak dua spasi
                    // (agar lurus dengan "N " di atasnya)
                    System.out.print("  ");
                }
            }
            
            // Setelah 1 baris selesai (loop 'j' selesai),
            // pindah ke baris baru
            System.out.println();
        }

        scanner.close();
    }
}