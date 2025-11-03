
package Jobsheet7;
import java.util.Scanner;

class TheTriangle {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int numinput ;
    String s = "";

    System.out.println("===== The Triangle ===== ");
    System.out.print("Input some number :");
    numinput = input.nextInt();

    // while(i < numinput){
    //     s+= "*";
    //     System.out.println(s);
    //     i++;
    // }
    // Loop luar untuk mengatur baris (menghitung MUNDUR dari numinput ke 1)
    for (int i = numinput; i >= 1; i--) {
        
        // Loop dalam untuk mencetak bintang di setiap baris
        // Loop ini akan berjalan sebanyak 'i' kali
        for (int j = 1; j <= i; j++) {
            System.out.print("* "); // Cetak "* " (dgn spasi) tanpa ganti baris
        }
        // Setelah loop dalam selesai (semua bintang di 1 baris tercetak),
        // kita pindah ke baris baru.
        System.out.println(); 
    }  

    //   for (int i = 0; i < numinput * numinput; i++) {
    //         s += "* ";
            
    //         if ((i + 1) % numinput == 0) {
    //             System.out.println(s);
    //             s = "";
    //         }
    //     }

 }
}