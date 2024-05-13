public class Main {
        public static void main(String[] args) {
        //casting
        //double angka = 5.4;
        //int angka_int = (int)angka;
        //System.out.println(angka_int);
        
        //Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup",100); hero1.display();
        
        //upcasting
        Hero heroUp = (Hero)hero1; heroUp.display();
        //System.out.println(heroUp.getType()); //ini error
        
        //Object dgn class Hero
        Hero heroReg = new Hero("Boy",100); heroReg.display();
        
        //downcasting
        //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
        //heroDown.display();
        
        //heroUp dikembalikan ke hero1 
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); //ini berhasil downcasting

        // HeroAgility hero3 = (HeroAgility) heroUp; 
        // hero3.display(); // no.3 error

        HeroAgility hero4 = new HeroAgility("Dio", 100);
        System.out.println(hero4.type);
        HeroIntel hero5 = new HeroIntel("Justin", 95);
        System.out.println(hero5.type);

        HeroMagic hero6 = new HeroMagic("Nathan", 98);
        hero6.display();

        Hero heroUp2 = (Hero) hero6;
        heroUp2.display();

        HeroMagic heroDown = (HeroMagic) heroUp2;
        heroDown.display();
        
        
        }
}
        
