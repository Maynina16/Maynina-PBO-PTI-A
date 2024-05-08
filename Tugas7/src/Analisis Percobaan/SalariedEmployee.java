import java.time.LocalDate;
public class SalariedEmployee extends Employee {

    private double weeklySalary; //gaji/minggu
    private double monthlySalary; //gaji/bulan
    
    public SalariedEmployee(String name, String noKTP, LocalDate tanggalLahir, double monthlySalary) {
    super(name, noKTP, tanggalLahir);
    this.monthlySalary = monthlySalary;
   // setWeeklySalary(salary);
    }
    public void setMonthlySalary(double monthlySalary) {
    // public void setWeeklySalary(double salary) {
    // weeklySalary = salary;
    //}
}
    public double getMonthlySalary() {
        return monthlySalary;
    }
    // public double getWeeklySalary() {
    // return weeklySalary;
    // }
    public double earnings() {
        if (isBirthday()) {
            return monthlySalary + 100000; //tambahan bonus jika ulang tahun
        } else {
            return monthlySalary;
   // return getWeeklySalary();
        }
    // public String toString() {
    // return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
}
