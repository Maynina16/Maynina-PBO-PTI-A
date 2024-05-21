import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //input user no.7

        //meminta input nama dari pengguna
        System.out.println("Masukkan nama Anda: ");
        String namaManusia = scanner.nextLine();

        //meminta input umur dari pengguna 
        System.out.println("Masukkan umur Anda: ");
        int umurManusia = scanner.nextInt();
        scanner.nextLine();

        //membuat objek manusia dengan nama sendiri 
        Manusia manusia = new Manusia(namaManusia, umurManusia); //no.6

        //memanggil metode untuk menampilkan nama dan umur
        manusia.tampilkanNama();
        manusia.tampilkanUmur();

        //menampilkan aksi manusia
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();

        //meminta input nama dari pengguna untuk hewan
        System.out.println("Masukkan nama hewan: ");
        String namaHewan = scanner.nextLine();

        //meminta input umur dari pengguna untuk hewan
        System.out.println("Masukkan umur hewan: ");
        int umurHewan = scanner.nextInt();

        //membuat objek Hewan 
        Hewan hewan = new Hewan(namaHewan, umurHewan); //no.8

        //menampilkan identitas
        hewan.tampilkanNama();
        hewan.tampilkanUmur();

        //menampilkan aksi hewan
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
    }
}
