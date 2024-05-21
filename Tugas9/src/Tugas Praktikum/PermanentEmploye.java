public class PermanentEmployee extends Employee {
    private int bonus;
    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, int bonus) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.bonus = bonus;
    }

    public int calculateBonus() {
        return bonus;
    }

    @Override
    public double getPayableAmount() {
        return getSalaryPerMonth() - calculateTotalDeductions() + calculateBonus();
    }
}


