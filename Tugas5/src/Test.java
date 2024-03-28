public class Test {
         public static void main(String [] args) {
            Student s1 = new Student();
            //s1.setName("Enkapsulasi");
            s1.setMark(90); //menggunakan angka langsung sebagai argumen
            System.out.println("s1Name is " + s1.getName()); // jawaban no.2
            System.out.println("s1Mark is " + s1.getMark());
        }
    }

    //no3
     class Main { 
        private String name;
        private int mark;

        public void setName(String n) {
        name = n;
    }
        public String getName() {
        return name;
    }
        public void setMark(int m) {
        mark = m;
    } 
        public int getMark(){
        return mark;
    }
 }
