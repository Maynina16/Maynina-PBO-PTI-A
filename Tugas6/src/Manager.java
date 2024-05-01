public class Manager extends Employee {

        private double bonus;
        protected Manager(String name, double salary, int year, int month, int day){ 
        super(name, salary, year, month, day);
        //this.bonus = 0; //konstruktor no.2
        bonus = 0;
        }

        public void setBonus(double bonus){
        this.bonus = bonus; //no.5
        }

        public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
        }       
}   

