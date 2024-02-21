import java.util.Calendar;
import java.util.Scanner;

public class HitungUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data pribadi
        System.out.println("Nama: Riska Nopiyanti");
        System.out.println("Kelas: TI22E");
        System.out.println("NIM: 20220040139");

        // Meminta pengguna memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = scanner.nextInt();

        // Mendapatkan tahun sekarang dari sistem
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);

        // Menghitung umur
        int umur = tahunSekarang - tahunLahir;

        // Menampilkan umur
        System.out.println("Umur Anda adalah " + umur + " tahun.");

        scanner.close();
    }
}