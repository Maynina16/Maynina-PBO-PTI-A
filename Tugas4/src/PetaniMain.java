public class PetaniMain {
    public static void main(String[] args) {
        // Objek menggunakan constructor overloading
        Petani petani1 = new Petani("Toni", 60, true);
        Petani petani2 = new Petani("Linda", 50, false);
        Petani petani3 = new Petani();

        // Memanggil method overloading dari satu objek
        petani1.mencangkul("X");
        petani1.mencangkul();
        petani1.mencangkul(2);
    }
}

