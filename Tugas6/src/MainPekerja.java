import java.time.LocalDate;
public class MainPekerja {
    public static void main(String[] args) {
        //1. Pekerja Lama Bekerja 2 Tahun, Anak 2
        Pekerja pekerja1 = new Pekerja("Bani", true, "1234567890", true, 3000000.0, LocalDate.now().minusYears(2));
        System.out.println("1. Pekerja Lama Bekerja 2 Tahun, Anak 2:");
        System.out.println(pekerja1.toString());

        //2. Pekerja Lama Bekerja 9 Tahun
        Pekerja pekerja2 = new Pekerja("Atika", false, "0987654321", true, 5000000.0, LocalDate.now().minusYears(9));
        System.out.println("\n2. Pekerja Lama Bekerja 9 Tahun:");
        System.out.println(pekerja2.toString());

        //3. Pekerja Lama Bekerja 20 Tahun, Anak 10
        Pekerja pekerja3 = new Pekerja("Cantika", false, "2345678901", true, 8000000.0, LocalDate.now().minusYears(20));
        System.out.println("\n3 Pekerja Lama Bekerja 20 Tahun, Anak 10:");
        System.out.println(pekerja1.toString());
    }   

}
