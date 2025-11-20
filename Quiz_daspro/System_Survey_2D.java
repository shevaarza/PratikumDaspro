import java.util.Scanner;

public class System_Survey_2D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Program
        String[] program = {"Infrastruktur", "Kesehatan", "Pendidikan"};

        int jumlahProgram = 3;
        int jumlahResponden = 3;

        // Ubah name menjadi daerah (MAKSUD USER)
        String[][] daerah = new String[jumlahProgram][jumlahResponden];
        int[][] nilai = new int[jumlahProgram][jumlahResponden];

        System.out.println("===== SURVEY SISTEM PEMERINTAH =====\n");
        // Input menggunakan array 2D
        for (int i = 0; i < jumlahProgram; i++) {
            System.out.println("== Program " + program[i] + " == ");

            for (int j = 0; j < jumlahResponden; j++) {

                System.out.print("Daerah responden ke-" + (j + 1) + ": ");
                daerah[i][j] = input.nextLine();

                while (true) {
                    System.out.print("Nilai kepuasan (1-5): ");
                    int n = input.nextInt();
                    input.nextLine(); // clear newlinMERINTAH =====\n");


                    if (n >= 1 && n <= 5) {
                        nilai[i][j] = n;
                        break;
                    } else {
                        System.out.println(">> Nilai harus 1–5, ulangi!");
                    }
                }
            }
            System.out.println();
        }

        // Output Tabel
        System.out.println("\n========= HASIL SURVEY =========");

        double[] rataProgram = new double[jumlahProgram];  // Simpan rata-rata tiap program

        for (int i = 0; i < jumlahProgram; i++) {

            System.out.println("\n--- Program " + program[i] + " ---");
            System.out.println("+----------------------+--------+");
            System.out.println("| Daerah               | Nilai  |");
            System.out.println("+----------------------+--------+");

            int total = 0;
            int maxNilai = Integer.MIN_VALUE;
            String daerahMax = "";

            for (int j = 0; j < jumlahResponden; j++) {
                System.out.printf("| %-20s |   %d    |\n", daerah[i][j], nilai[i][j]);
                total += nilai[i][j];

                // Tentukan nilai tertinggi di program ini
                if (nilai[i][j] > maxNilai) {
                    maxNilai = nilai[i][j];
                    daerahMax = daerah[i][j];
                }
            }

            System.out.println("+----------------------+--------+");

            double rata = (double) total / jumlahResponden;
            rataProgram[i] = rata;

            System.out.printf("Rata-rata nilai: %.2f\n", rata);
            System.out.println("Nilai tertinggi: " + maxNilai + " (Daerah: " + daerahMax + ")");
        }

        // Menentukan program favorit (rata-rata tertinggi)
        double maxRata = rataProgram[0];
        String favorit = program[0];

        for (int i = 1; i < jumlahProgram; i++) {
            if (rataProgram[i] > maxRata) {
                maxRata = rataProgram[i];
                favorit = program[i];
            }
        }

        System.out.println("\n===== PROGRAM FAVORIT =====");
        System.out.println("Program dengan kepuasan tertinggi adalah: " + favorit);
        System.out.printf("Dengan rata-rata nilai: %.2f\n", maxRata);
    }
}

