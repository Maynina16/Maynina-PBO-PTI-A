import java.util.Scanner;

public class Mahasiswa {
    private int jumlahLembarBuku;
    private int kataPerHari;

    public Mahasiswa(int jumlahLembarBuku, int kataPerHari) {
        this.jumlahLembarBuku = jumlahLembarBuku;
        this.kataPerHari = kataPerHari; 
    }
    public int LamaMenulis() {
        int jumlahKata = kataPerHari;
        int hari = jumlahKata / kataPerHari; 

    while (jumlahKata < jumlahLembarBuku * 100 * 2) {
        jumlahKata += kataPerHari;
        hari++;
    }
    return hari;
}
}

 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Jumlah Lembar Buku : ");
        int JumlahLembar = input.nextInt();
        System.out.println("Kata Perhari : ");
        int kataPerHari = input.nextInt();
        int HasilkataPerHari = kataPerHari / 2; 
        
        Mahasiswa buku = new Mahasiswa(JumlahLembar, HasilkataPerHari);
        int hariMenghabiskan = buku.LamaMenulis();
        
        System.out.println("Mahasiswa A akan menghabiskan buku tulis tersebut dalam waktu " + hariMenghabiskan + " hari");
    }
}
