import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah mangga yang dibeli: ");
        int mangga = Integer.parseInt(input.readLine());

        System.out.print("Masukkan jumlah jambu yang dibeli: ");
        int jambu = Integer.parseInt(input.readLine());

        System.out.print("Masukkan jumlah jambu yang diberikan ke tiap tetangga: ");
        int jambuPerTetangga = Integer.parseInt(input.readLine());

        System.out.print("Masukkan jumlah tetangga: ");
        int jumlahTetangga = Integer.parseInt(input.readLine());

        System.out.print("Masukkan jumlah mangga busuk: ");
        int manggaBusuk = Integer.parseInt(input.readLine());

        int totalJambuDiberikan = jambuPerTetangga * jumlahTetangga;
        int totalBuah = (mangga - manggaBusuk) + (jambu - totalJambuDiberikan);

        System.out.println("Total buah yang masih dimiliki: " + totalBuah + " buah");
    }
}
