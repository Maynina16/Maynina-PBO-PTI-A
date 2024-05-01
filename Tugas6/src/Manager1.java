import java.time.LocalDate;

public class Manager extends Pekerja{
    private String departemen;

    // Constructor
    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk);
        this.departemen = departemen;
    }

    // Getter and Setter methods
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Method to calculate total income including bonus
    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * super.getGaji()); // 10% Tunjangan
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}
