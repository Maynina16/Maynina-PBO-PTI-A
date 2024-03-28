import java.util.Scanner;
public class MainPelanggan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di swalayan Tiny!");
        System.out.println("Silakan masukkan nomor pelanggan:");
        long nomorPelanggan = scanner.nextLong();
        scanner.nextLine(); // Membersihkan newline

        System.out.println("Masukkan PIN:");
        int pin = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline

        Pelanggan pelanggan = new Pelanggan(nomorPelanggan, "Pelanggan", 0, pin);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Saldo");
            System.out.println("2. Tarik Saldo");
            System.out.println("3. Beli");
            System.out.println("4. Top Up");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah saldo yang ingin ditambahkan: ");
                    double tambahSaldo = scanner.nextDouble();
                    pelanggan.tambahSaldo(tambahSaldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah saldo yang ingin ditarik: ");
                    double tarikSaldo = scanner.nextDouble();
                    pelanggan.tarikSaldo(tarikSaldo);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah pembelian: ");
                    double beli = scanner.nextDouble();
                    pelanggan.beli(beli);
                    break;
                case 4:
                    System.out.print("Masukkan jumlah top up: ");
                    double topUp = scanner.nextDouble();
                    pelanggan.topUp(topUp);
                    break;
                case 5:
                    System.out.println("Terima kasih telah berbelanja!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
