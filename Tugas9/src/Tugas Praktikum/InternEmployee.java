public class InternEmployee extends Employee implements Contract {
    private int internshipDuration;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, int internshipDuration) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.internshipDuration = internshipDuration;
    }

    public void extendInternship(int additionalMonths) {
        this.internshipDuration += additionalMonths;
    }

    public void internDetails() {
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }

    @Override
    public double getPayableAmount() {
        return getSalaryPerMonth() - calculateTotalDeductions();
    }

    @Override
    public void attendTrainingSession() {
        System.out.println(getName() + " is attending a training session.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Contract Duration: " + internshipDuration + " months");
    }
}
