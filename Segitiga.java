import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data pribadi
        System.out.println("Nama: Riska Nopiyanti");
        System.out.println("Kelas: TI22E");
        System.out.println("NIM: 20220040139");

        // Meminta pengguna memasukkan panjang sisi-sisi segitiga
        System.out.println("Masukkan panjang sisi-sisi segitiga:");
        System.out.print("Sisi pertama: ");
        double sisi1 = scanner.nextDouble();
        System.out.print("Sisi kedua: ");
        double sisi2 = scanner.nextDouble();
        System.out.print("Sisi ketiga: ");
        double sisi3 = scanner.nextDouble();

        // Menghitung keliling segitiga
        double keliling = hitungKelilingSegitiga(sisi1, sisi2, sisi3);

        // Menghitung luas segitiga
        double luas = hitungLuasSegitiga(sisi1, sisi2, sisi3);

        // Menampilkan hasil
        System.out.println("Keliling segitiga: " + keliling);
        System.out.println("Luas segitiga: " + luas);

        scanner.close();
    }

    // Metode untuk menghitung keliling segitiga
    public static double hitungKelilingSegitiga(double sisi1, double sisi2, double sisi3) {
        return sisi1 + sisi2 + sisi3;
    }

    // Metode untuk menghitung luas segitiga menggunakan rumus Heron
    public static double hitungLuasSegitiga(double sisi1, double sisi2, double sisi3) {
        double semiPerimeter = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sisi1) * (semiPerimeter - sisi2) * (semiPerimeter - sisi3));
    }
}