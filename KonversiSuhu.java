import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data pribadi
        System.out.println("Nama: Riska Nopiyanti");
        System.out.println("Kelas: TI22E");
        System.out.println("NIM: 20220040139");

        // Program konversi suhu
        System.out.println("=== Konversi Suhu dari Reamur ===");
        System.out.print("Masukkan suhu dalam Reamur: ");
        
        // Validasi input
        double suhuReamur;
        while (true) {
            try {
                suhuReamur = Double.parseDouble(scanner.nextLine());
                break; // keluar dari loop jika input valid
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka yang valid: ");
            }
        }

        // Konversi ke Celcius
        double suhuCelcius = 5 * suhuReamur / 4;

        // Konversi ke Fahrenheit
        double suhuFahrenheit = (9 * suhuReamur / 4) + 32;

        // Konversi ke Kelvin
        double suhuKelvin = suhuCelcius + 273.15;

        System.out.println("Hasil Konversi:");
        System.out.println("Celcius: " + suhuCelcius + " °C");
        System.out.println("Fahrenheit: " + suhuFahrenheit + " °F");
        System.out.println("Kelvin: " + suhuKelvin + " K");

        scanner.close();
    }
}