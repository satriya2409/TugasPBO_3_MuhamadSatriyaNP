import java.util.Scanner;

public class Novel {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input jumlah novel dan tebal per novel
        System.out.print("Masukkan banyaknya novel yang akan dicetak: ");
        int jumlahNovel = sc.nextInt();

        System.out.print("Masukkan tebal lembar per novel: ");
        int tebalNovel = sc.nextInt();

        // Total lembar yang harus dicetak
        int totalLembar = jumlahNovel * tebalNovel;

        // Karena kecepatan cetak = 1 lembar/detik
        int totalDetik = totalLembar;

        // Konversi ke hari, jam, menit, detik
        int hari = totalDetik / 86400;
        totalDetik %= 86400;

        int jam = totalDetik / 3600;
        totalDetik %= 3600;

        int menit = totalDetik / 60;
        int detik = totalDetik % 60;

        // Output hasil
        System.out.println("HASIL PERHITUNGAN CETAK NOVEL");
        System.out.println("Total lembar dicetak : " + (jumlahNovel * tebalNovel));
        System.out.println("Waktu yang dibutuhkan:" +  (hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik"));
      
    }
}
