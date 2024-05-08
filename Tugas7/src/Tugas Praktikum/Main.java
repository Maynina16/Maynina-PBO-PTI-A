package Praktikum;

public class Main {
    public static void main(String[] args) {
        // array kue terdiri 20
        Kue[] daftarKue = new Kue[20];
        
        //  jenis kue (KuePesanan atau KueJadi)
        for (int i = 0; i < 10; i++) {
            daftarKue[i] = new KuePesanan("Brownies " + (i + 1), 15.0, 0.3 + i);
        }
        for (int i = 10; i < 15; i++) {
            daftarKue[i] = new KuePesanan("Biscuit Cake " + (i - 9), 20.0, 0.4 + i);
        }
        for (int i = 15; i < 18; i++) {
            daftarKue[i] = new KueJadi("Red Velvet " + (i - 14), 25.0, 5 + i);
        }
        for (int i = 18; i < 20; i++) {
            daftarKue[i] = new KueJadi("Choco Cookies " + (i - 17), 30.0, 8 + i);
        }

        // a. Menampilkan semua kue dan jenis kue
        System.out.println("Semua Kue:");
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                System.out.println("Kue Pesanan: " + kue);
            } else if (kue instanceof KueJadi) {
                System.out.println("Kue Jadi: " + kue);
            }
        }

        // b. Menghitung total harga semua jenis kue
        double totalHargaSemuaKue = 0;
        for (Kue kue : daftarKue) {
            totalHargaSemuaKue += kue.hitungHarga();
        }
        System.out.println("Total Harga Semua Kue: " + totalHargaSemuaKue);
        System.out.println();
        
        // c. Menghitung total harga dan total berat dari KuePesanan
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);
        System.out.println();
        
        // d. Menghitung total harga dan total jumlah dari KueJadi
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);
        System.out.println();
        
        // e. Menampilkan informasi kue dengan (harga akhir) terbesar
        double maxHarga = Double.MIN_VALUE;
        Kue kueTerbesar = null;
        for (Kue kue : daftarKue) {
            if (kue.hitungHarga() > maxHarga) {
                maxHarga = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("Informasi Kue dengan Harga Terbesar:");
        System.out.println(kueTerbesar);
    }
}
