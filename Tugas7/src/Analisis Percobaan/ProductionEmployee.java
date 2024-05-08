import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private double wagePerItem;
    private int numberOfItemsProduced;

    public ProductionEmployee(String name, String noKTP, LocalDate tanggalLahir, double wagePerItem, int numberOfItemsProduced) {
        super(name, noKTP, tanggalLahir);
        this.wagePerItem = wagePerItem;
        this.numberOfItemsProduced = numberOfItemsProduced;
    }
    public void setWagePerItem(double wagePerItem) {
        this.wagePerItem = wagePerItem;
    }
    public double getWagePerItem() {
        return wagePerItem;
    }
    public void setNumberOfItemsProduced(int numberOfItemsProduced) {
        this.numberOfItemsProduced = numberOfItemsProduced;
    }
    public int getNumberOfItemsProduced() {
        return numberOfItemsProduced;
    }
    @Override
    public double earnings() {
        return wagePerItem * numberOfItemsProduced;
    }
}

