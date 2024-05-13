public class HeroMagic extends Hero {
    String type;
    String power = "Magic";

    public HeroMagic(String name, double health) {
        super(name, health);
        this.type = "Intel";
    }
    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
        System.out.println("=======================\n Output dari magic");

    }
}
