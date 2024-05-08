import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan tanggal lahir menggunakan LocalDate
       LocalDate tanggalLahir = LocalDate.of(1995, 5, 25);

        // Membuat objek karyawan dengan tanggal lahir
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", tanggalLahir, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", tanggalLahir, 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", tanggalLahir, 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", tanggalLahir, 5000, 0.04, 300);

        // Mendapatkan bulan saat ini
        LocalDate today = LocalDate.now();
        int bulanSekarang = today.getMonthValue();

        // Menghitung gaji secara polimorfisme dan menambahkan 100.000 jika bulan ini adalah bulan ulang tahun karyawan
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};
        for (Employee employee : employees) {
            double earnings = employee.earnings();
            System.out.println(employee.getName() + "'s earnings: $" + earnings);
            System.out.println("Total earnings: $" + earnings + "\n"); // no.5
            if (bulanSekarang == employee.getTanggalLahir().getMonthValue() && today.getDayOfMonth() == employee.getTanggalLahir().getDayOfMonth()) {
                earnings += 100000;
                System.out.println("This month is " + employee.getName() + "'s birthday month. Additional bonus: $100000");
            }
            System.out.println("Total earnings after bonus: $" + earnings + "\n");
        }
    }
}


//     Employee[] employees = new Employee[4];
//     employees[0] = salariedEmployee;
//     employees[1] = hourlyEmployee;
//     employees[2] = commissionEmployee;
//     employees[3] = basePlusCommissionEmployee;
    
    
//     System.out.println("Employees	diproses	secara polimorfisme:\n");
//     for (Employee currentEmployee : employees) { System.out.println(currentEmployee);
//     if	(currentEmployee	instanceof BasePlusCommissionEmployee) {
//     BasePlusCommissionEmployee	employee	= (BasePlusCommissionEmployee) currentEmployee;
//     employee.setBaseSalary(1.10	* employee.getBaseSalary());
//     System.out.printf("Gaji pokok setelah dinaikkan 10%% :$%,.2f\n", employee.getBaseSalary());
//     }
//     System.out.printf("pendapatan:	$%,.2f\n\n", currentEmployee.earnings());
//     }
//     for (int j = 0; j < employees.length; j++) { System.out.printf("Employee	%d	=	%s\n",	j, employees[j].getClass().getName());
    
// }
    
    
