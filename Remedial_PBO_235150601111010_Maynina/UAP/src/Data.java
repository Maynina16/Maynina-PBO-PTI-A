import java.util.ArrayList;
import java.util.Scanner;
public class Data {
    private static ArrayList<Tanaman> tanamans = new ArrayList<>();

    public static void mulai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masa tanam (dalam bulan): ");
        int masaTanamBulan = scanner.nextInt();
        int masaTanamHari = masaTanamBulan * 30;

        // Menanam 3 tanaman di awal
        for (int i = 0; i < 3; i++) {
            menanam(scanner);
        }

        // Proses perkembangan tanaman setiap hari
        ArrayList<Integer> lokasi = new ArrayList<>();
        for (int hari = 1; hari <= masaTanamHari; hari++) {
            for (int i = 0; i < tanamans.size(); i++) {
                Tanaman tanaman = tanamans.get(i);
                if (tanaman.status().equals("Hidup")) {
                    tanaman.berkembang();
                } else {
                    if (!lokasi.contains(i)) {
                        lokasi.add(i);
                        menanam(scanner);
                    }
                }
            }

            // Perawatan setiap 90 hari
            if (hari % 90 == 0) {
                System.out.println("Perawatan dilakukan pada hari ke-" + hari);
                for (int i = 0; i < tanamans.size(); i++) {
                    if (!lokasi.contains(i)) {
                        ((Perawatan) tanamans.get(i)).treatment();
                    }
                }
            }
        }

        scanner.close();
    }

    public static void menanam(Scanner scanner) {
        System.out.println("Mau menanam apa ? ");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        int pilihan = scanner.nextInt();

        Tanaman tanamanBaru;
        switch (pilihan) {
            case 1:
                tanamanBaru = new Tomat();
                break;
            case 2:
                tanamanBaru = new Stroberi();
                break;
            case 3:
                tanamanBaru = new Persik();
                break;
            default:
                tanamanBaru = new Tomat();
                break;
        }

        tanamans.add(tanamanBaru);
        System.out.println(tanamanBaru.getClass().getSimpleName() + " berhasil ditanam " + ".");
    }

    public static void info() {
        System.out.println("Laporan Hasil Masa Tanam:");
        for (int i = 0; i < tanamans.size(); i++) {
            System.out.println("Tanaman ke-" + (i + 1) + ": " + tanamans.get(i));
        }
    }
}
    
