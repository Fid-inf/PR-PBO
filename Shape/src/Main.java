import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bentuk> daftarBentuk = new ArrayList<>();
        boolean running = true;

        // Sample initial data (Polymorphism Array/List)
        daftarBentuk.add(new BujurSangkar(4.0, "Merah"));
        daftarBentuk.add(new Lingkaran(7.0, "Biru"));
        daftarBentuk.add(new Silinder(10.0, 5.0, "Hijau"));

        while (running) {
            System.out.println("\n==============================================");
            System.out.println("  EKSPLORASI INHERITANCE & POLYMORPHISM (SHAPE)");
            System.out.println("==============================================");
            System.out.println("1. Tambah BujurSangkar");
            System.out.println("2. Tambah Lingkaran");
            System.out.println("3. Tambah Silinder");
            System.out.println("4. Tampilkan Semua Bentuk (Polymorphism Demo)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Sisi: ");
                    double sisi = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan Warna: ");
                    String warnaBujur = scanner.nextLine();
                    daftarBentuk.add(new BujurSangkar(sisi, warnaBujur));
                    System.out.println("BujurSangkar berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.print("Masukkan Radius: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan Warna: ");
                    String warnaLingkaran = scanner.nextLine();
                    daftarBentuk.add(new Lingkaran(radius, warnaLingkaran));
                    System.out.println("Lingkaran berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.print("Masukkan Radius Base: ");
                    double rSilinder = scanner.nextDouble();
                    System.out.print("Masukkan Tinggi: ");
                    double tSilinder = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan Warna: ");
                    String warnaSilinder = scanner.nextLine();
                    daftarBentuk.add(new Silinder(tSilinder, rSilinder, warnaSilinder));
                    System.out.println("Silinder berhasil ditambahkan!");
                    break;

                case 4:
                    System.out.println("\n--- DAFTAR BENTUK (DYNAMIC BINDING DEMO) ---");
                    for (Bentuk b : daftarBentuk) {
                        // Polimorfisme: method printInfo() yang dipanggil sesuai tipe objek asli
                        b.printInfo();
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}