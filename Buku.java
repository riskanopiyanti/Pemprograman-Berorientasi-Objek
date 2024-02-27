import java.util.ArrayList;

public class Buku {
    private String penulis;
    private String judul;
    private double harga;
    private int nomor_penerbit;

    public Buku(String penulis, String judul, double harga, int nomor_penerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomor_penerbit = nomor_penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }

    public int getNomor_penerbit() {
        return nomor_penerbit;
    }

    public static void main(String[] args) {
        ArrayList<Buku> bukuList = new ArrayList<>();
        bukuList.add(new Buku("RH. Sianipar", "Java pemprograman", 30000, 1));
        bukuList.add(new Buku("Maria Magdalena Sumakul", "saya bisa coding", 10000, 2));
        bukuList.add(new Buku("Feri Sulianto", "It Expert", 30000, 3));

        double totalHarga = 0;
        for (Buku buku : bukuList) {
            totalHarga += buku.getHarga();
        }

        System.out.println("Total harga semua buku yang dibeli: " + totalHarga);
    }
}