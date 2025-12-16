import java.util.Scanner;

public class GayaSentipental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan massa benda (kg): ");
        double m = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double v = input.nextDouble();

        System.out.print("Masukkan jari-jari lintasan (m): ");
        double r = input.nextDouble();

        double Fc = (m * v * v) / r;

        System.out.println("\nGaya Sentripetal (Fc) = " + Fc + " Newton");
    }
}
