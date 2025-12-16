
import java.util.Scanner;

public class GajiBersih {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Masukan nomer induk karyawan : ");
        String nik = input.nextLine();
        System.out.print("Masukan nama karyawan : ");
        String nama = input.nextLine();
        System.out.print("Masukan alamat : ");
        String alamat = input.nextLine();
        System.out.print("Jabatan : ");
        String jabatan = input.nextLine();
        
        System.out.print("Masukan Gaji pokok : ");
        double P1 = input.nextDouble();
        System.out.print("Tunjangan jabatan : ");
        double P2 = input.nextDouble();
        System.out.print("Tunjangan istri : ");
        double P3 = input.nextDouble();
        System.out.print("Tunjangan Anak : ");
        double P4 = input.nextDouble();
        
        double Totalgaji = P1 + P2 + P3 + P4;
        double PajakPenghasilan = 0.1 * (P1 + P2 + P4);
        double GajiBersih = Totalgaji - PajakPenghasilan;
        
        
        System.out.println("Hasil Perhitungan");
        System.out.println("Total Gaji : " + Totalgaji);
        System.out.println("Pajak Penghasilan : " + PajakPenghasilan);
        System.out.println("Gaji Bersih : " + GajiBersih);
    }
    
}
