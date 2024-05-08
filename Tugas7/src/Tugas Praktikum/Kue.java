package Praktikum;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public abstract double hitungHarga();
    public double getHarga() {
        return harga;
    }
    @Override
    public String toString() {
        return "Nama Kue: " + nama + ". Harga: " + hitungHarga();
    }
}
