public class Gaji {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Laptop", 1, 1000);
        Invoice invoice2 = new Invoice("Mouse", 3, 30);
        Invoice invoice3 = new Invoice("Keyboard", 2, 1500);
        Invoice[] invoices = {invoice1, invoice2, invoice3};

        PermanentEmployee permanentEmployee = new PermanentEmployee(12345, "Nathan", 8000, invoices, 500);
        System.out.println(permanentEmployee.toString());
        System.out.println("Bonus: " + permanentEmployee.calculateBonus());
        System.out.println("Payable Amount: " + permanentEmployee.getPayableAmount());

        InternEmployee internEmployee = new InternEmployee(78954, "Arhan", 6000, invoices, 6);
        System.out.println(internEmployee.toString());
        internEmployee.extendInternship(3);
        internEmployee.internDetails();
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
        System.out.println("Payable Amount: " + internEmployee.getPayableAmount());

        Employee.printCompanyPolicy();
    }
}
    
