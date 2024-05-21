public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    // @Override
    // public double getPayableAmount() {
    //     double totalInvoiceAmount = 0;
    //     for (Invoice invoice : invoices) {
    //         totalInvoiceAmount += invoice.getPayableAmount();
    //     }
    //     return salaryPerMonth - totalInvoiceAmount;
    // }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public double calculateTotalDeductions() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return totalInvoiceAmount;
    }
    public abstract double getPayableAmount();

    public static void printCompanyPolicy() {
        System.out.println("Company Policy: All employees must adhere to the company guidelines.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Employee: %s (Reg No: %d)\n", name, registrationNumber));
        sb.append(String.format("Salary per Month: %d\n", salaryPerMonth));
        sb.append("Invoices:\n");
        for (Invoice invoice : invoices) {
            sb.append(invoice.toString()).append("\n");
        }
        sb.append(String.format("Total Salary after Deductions: %.2f\n", getPayableAmount()));
        return sb.toString();
    }
}
