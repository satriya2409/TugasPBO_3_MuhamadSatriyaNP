import java.util.Scanner;

public class Cahaya {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jam pertama (0-23): ");
        int jam1 = sc.nextInt();
        System.out.print("Masukkan menit pertama (0-59): ");
        int menit1 = sc.nextInt();

        System.out.print("Masukkan jam kedua (0-23): ");
        int jam2 = sc.nextInt();
        System.out.print("Masukkan menit kedua (0-59): ");
        int menit2 = sc.nextInt();

        int totalMenit1 = (jam1 * 60) + menit1;
        int totalMenit2 = (jam2 * 60) + menit2;

        int selisih = Math.abs(totalMenit2 - totalMenit1);
        int jam = selisih / 60;
        int menit = selisih % 60;

        System.out.println("Selisih waktu adalah " + jam + " jam " + menit + " menit.");
    }
}
