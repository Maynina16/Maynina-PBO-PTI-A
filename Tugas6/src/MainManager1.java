import java.time.LocalDate;

public class MainManager {
    public static void main(String[] args) {
        //Manager Lama Bekerja 15 Tahun, Gaji $7500
        Manager manager = new Manager("Bani", true, "1234567890", true, 7500, LocalDate.now().minusYears(15), "Teknologi Informasi");
        System.out.println("Manager Lama Bekerja 15 Tahun, Gaji $7500:");
        System.out.println(manager.toString());
    }
}
