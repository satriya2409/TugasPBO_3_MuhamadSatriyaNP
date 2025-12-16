import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);

        byte[] buffer = new byte[100]; // buffer untuk membaca input

        out.writeBytes("Nama: ");
        int length = in.read(buffer);
        String nama = new String(buffer, 0, length - 2, StandardCharsets.UTF_8).trim();

        out.writeBytes("Total Belanja: ");
        length = in.read(buffer);
        double totalBelanja = Double.parseDouble(new String(buffer, 0, length - 2, StandardCharsets.UTF_8).trim());

        out.writeBytes("Diskon (%): ");
        length = in.read(buffer);
        double diskon = Double.parseDouble(new String(buffer, 0, length - 2, StandardCharsets.UTF_8).trim());

        double total = totalBelanja - (totalBelanja * diskon / 100);

        out.writeBytes("Bayar: ");
        length = in.read(buffer);
        double bayar = Double.parseDouble(new String(buffer, 0, length - 2, StandardCharsets.UTF_8).trim());

        double kembalian = bayar - total;

        out.writeBytes("\n===== STRUK PEMBELANJAAN =====\n");
        out.writeBytes("Nama: " + nama + "\n");
        out.writeBytes("Total Belanja: " + totalBelanja + "\n");
        out.writeBytes("Diskon: " + diskon + "%\n");
        out.writeBytes("Total Bayar: " + total + "\n");
        out.writeBytes("Uang Dibayar: " + bayar + "\n");
        out.writeBytes("Kembalian: " + kembalian + "\n");
    }
}
