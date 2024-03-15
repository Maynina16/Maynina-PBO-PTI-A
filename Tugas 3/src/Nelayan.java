public class Nelayan {
    private String nama;
    private int usia;
    private boolean jenisKelamin;

    public  Nelayan(String nama, int usia, boolean jenisKelamin) {
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUsia() {
        return usia;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public void setjenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void menangkapIkan(String laut) {
        System.out.println("Nelayan " + nama + " sedang menangkap ikan di laut " + laut);
    }
    public void mengeringkanIkan() {
        System.out.println("Nelayan " + nama + " sedang mengeringkan ikan");
    }
    public void menjualIkan() {
        System.out.println("Nelayan " + nama + " sedang menjual ikan");
    }

    public static void main(String[] args) {
        Nelayan nelayan1 = new Nelayan("Basuki", 65, true);
        System.out.println("Usia nelayan " + nelayan1.getNama() + ": " + nelayan1.getUsia() + ", jenis kelamin: " + (nelayan1.getJenisKelamin() ? "laki-laki" : "perempuan"));
        nelayan1.menangkapIkan("J");
        nelayan1.mengeringkanIkan();
        nelayan1.menjualIkan();

        Nelayan nelayan2 = new Nelayan("Siti", 45, false);
        System.out.println("Usia nelayan " + nelayan2.getNama() + ": " + nelayan2.getUsia() + ", jenis kelamin: " + (nelayan2.getJenisKelamin() ? "laki-laki" : "perempuan"));
        nelayan2.menangkapIkan("K");
        nelayan2.mengeringkanIkan();
        nelayan2.menjualIkan();
    }
    }

