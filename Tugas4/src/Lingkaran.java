public class Lingkaran {
    int alas, tinggi;

    // Constructor dengan parameter int alas
    public Lingkaran(int alas) {
        this.alas = alas;
    }
    //jawaban no.2
    // Constructor dengan parameter int alas dan int tinggi
    public Lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    //jawaban no.3
    // Constructor dengan parameter String alas dan String tinggi
    public Lingkaran(String alas, String tinggi) {
        this.alas = parsing(alas);
        this.tinggi = parsing(tinggi);
    }

    // Method untuk melakukan parsing atau perubahan tipe data dari String menjadi integer
    public int parsing(String a) {
            return Integer.parseInt(a);
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas: " + hitungLuas());
    }
}
