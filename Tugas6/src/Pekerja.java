import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    // Constructor
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
    }

    // Getter and Setter methods
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Method to calculate bonus
    public double getBonus() {
        double bonus = 0;
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            bonus = 0.05 * gaji;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            bonus = 0.10 * gaji;
        } else if (lamaBekerja > 10) {
            bonus = 0.15 * gaji;
        }
        return bonus;
    }

    // Method to calculate total income including bonus and allowance for children
    public double getPendapatan() {
        return gaji + getBonus() + (20 * jumlahAnak);
    }

    // toString method
    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk.getYear() + "\nJumlah Anak: " + jumlahAnak + "\nGaji: $" + gaji;
    }
}
