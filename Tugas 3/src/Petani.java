public class Petani {
    
    private String nama;
    private int usia;
    private boolean jenisKelamin;

    public Petani(String nama, int usia, boolean jenisKelamin) {
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
    public void mencangkul(String sawah) {
        System.out.println("Petani " + nama + " sedang mencangkul di sawah " + sawah);
    }
    public void menanamPadi() {
        System.out.println("Petani " + nama + " sedang menanam padi");
    }
    public void memanen() {
        System.out.println("Petani " + nama + " sedang memanen padi");
    }

    public static void main(String[] args) {
        Petani petani1 = new Petani("Toni", 60, true);
        System.out.println("Usia petani " + petani1.getNama() + ": " + petani1.getUsia() + ", jenis kelamin: " + (petani1.getJenisKelamin() ? "laki-laki" : "perempuan"));
        petani1.mencangkul("X");
        petani1.menanamPadi();
        petani1.memanen();

        Petani petani2 = new Petani("Linda", 50, false);
        System.out.println("Usia petani " + petani2.getNama() + ": " + petani2.getUsia() + ", jenis kelamin: " + (petani2.getJenisKelamin() ? "laki-laki" : "perempuan"));
        petani2.mencangkul("Z");
        petani2.menanamPadi();
        petani2.memanen();
    }
    }

