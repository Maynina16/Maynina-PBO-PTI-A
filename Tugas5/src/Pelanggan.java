public class Pelanggan {
    private long nomorPelanggan;
    private String nama;
    private double saldo;
    private int PIN;
    private int kesalahanAutentikasi;
    private boolean diblokir;

    private final double SALDO_MINIMAL = 10000;

    public Pelanggan(long nomorPelanggan, String nama, double saldo, int PIN) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.PIN = PIN;
        this.kesalahanAutentikasi = 0;
        this.diblokir = false;
    }

    // Getter dan setter untuk nomor pelanggan, nama, dan saldo (Enkapsulasi)
    public long getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metode untuk menambah saldo
    public void tambahSaldo(double jumlah) {
            saldo += jumlah;
            System.out.println("Saldo berhasil ditambahkan.");
        }
        
        public void tarikSaldo(double jumlah) {
            if (saldo - jumlah >= SALDO_MINIMAL) {
                saldo -= jumlah;
                System.out.println("Penarikan saldo berhasil.");
            } else {
                System.out.println("Penarikan saldo gagal. Saldo minimal tidak terpenuhi.");
            }
        }
        
        public void beli(double jumlahPembelian) {
            if (saldo >= jumlahPembelian) {
                saldo -= jumlahPembelian;
                System.out.println("Pembelian berhasil.");
            } else {
                System.out.println("Pembelian gagal. Saldo tidak mencukupi.");
            }
        }
        
        public void topUp(double jumlahTopUp) {
            saldo += jumlahTopUp;
            System.out.println("Top up berhasil.");
        }
        
       
    }
