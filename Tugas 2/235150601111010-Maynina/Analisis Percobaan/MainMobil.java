import java.util.Scanner;

 class MainMobil {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Mobil m3 = new Mobil();
        System.out.print("Masukkan kecepatan Mobil :");
        m3.setKecepatan(userInput.nextInt());
        userInput.nextLine();
        System.out.print("masukkan manufaktur Mobil :");
        m3.setManufaktur(userInput.nextLine());
        System.out.print("Masukkan no plat mobil :");
        m3.setNoPlat(userInput.nextLine());
        System.out.print("masukkan warna mobil :");
        m3.setWarna(userInput.nextLine());
        m3.displayMessage();

        //instan objek bernama m1
        Mobil m1 = new Mobil();
        m1.setKecepatan(50);
        m1.setManufaktur("Toyota");
        m1.setNoPlat("AB 1231 UA");
        m1.setWarna("Merah");
        m1.displayMessage();
        System.out.println("================");

        // instan objek baru bernama m2
        Mobil m2 = new Mobil();
        m2.setKecepatan(100);
        m2.setManufaktur("Mitsubishi");
        m2.setNoPlat("N 1134 AG");
        m2.setWarna("Pink");
        m2.displayMessage();
        System.out.println("================");

        // merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");

        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}

