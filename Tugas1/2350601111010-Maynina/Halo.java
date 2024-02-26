import java.util.Scanner;

public class Halo {
    public static void main(String[] args) {
        String[] kata = {"anjing", "ayam", "kucing", "kelinci", "ikan"};
        String kataAcak = kata[getRandomIndex(kata.length)];
        int jumlahPengujian = 0;
        boolean kataDiketahui = false;

        Scanner tebak = new Scanner(System.in);
        
        while (!kataDiketahui) {
            System.out.print("Tebak Kata: ");
            String tebakan = tebak.nextLine().toLowerCase();
            jumlahPengujian++;

            if(tebakan.equals(kataAcak)) {
                kataDiketahui = true;
                System.out.println("Selamat! Kata yang ditebak adalah " + kataAcak + ".");
            } else {
                System.out.println("Salah! Coba lagi.");
            }
        }
        System.out.println("Jumlah pengujian: " + jumlahPengujian);
    }

    public static int getRandomIndex(int max) {
        return (int) (Math.random() * max);
    }
}