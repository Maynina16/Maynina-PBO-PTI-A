public class Petani {
    private String nama;
    private int usia;
    private boolean jenisKelamin;

    // Constructor 1
    public Petani(String nama, int usia, boolean jenisKelamin) {
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }

    // Constructor 2
    public Petani(String nama) {
        this.nama = nama;
    }

    // Constructor 3
    public Petani(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Constructor 4 (Default)
    public Petani() {
        this.nama = "Petani";
        this.usia = 0;
        this.jenisKelamin = true;
    }

    // Method overload 1
    public void mencangkul(String sawah) {
        System.out.println("Petani " + nama + " sedang mencangkul di sawah " + sawah);
    }

    // Method overload 2
    public void mencangkul() {
        System.out.println("Petani " + nama + " sedang mencangkul");
    }

    // Method overload 3
    public void mencangkul(int jam) {
        System.out.println("Petani " + nama + " sedang mencangkul selama " + jam + " jam");
    }

    // Method instans yang mengembalikan tipe data class itu sendiri
    public Petani getPetaniInstance() {
        return this;
    }
}

