//Scanner lebih mudah digunakan, langsung bisa membaca tipe data seperti int, double, dll.
//BufferedReader lebih cepat untuk input besar, tapi hanya membaca String, jadi perlu konversi manual dengan parseInt() atau parseDouble().

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ScannerdanbufferReader {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== Menggunakan Scanner ===");
        System.out.print("Masukkan nama: ");
        String nama1 = sc.nextLine();
        System.out.print("Masukkan umur: ");
        int umur1 = sc.nextInt();

        System.out.println("\n=== Menggunakan BufferedReader ===");
        System.out.print("Masukkan nama: ");
        String nama2 = br.readLine();
        System.out.print("Masukkan umur: ");
        int umur2 = Integer.parseInt(br.readLine());

        System.out.println("\nHasil Input Scanner: " + nama1 + " (" + umur1 + ")");
        System.out.println("Hasil Input BufferedReader: " + nama2 + " (" + umur2 + ")");
    }
}
