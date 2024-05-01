public class MainManusia {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", "111", true, true);
        System.out.println(a);

        //1. Manusia Laki - laki Telah Menikah
        Manusia lakiLakiMenikah = new Manusia("Bani", "1234567890", true, true);
        System.out.println("1. Laki-laki Telah Menikah:");
        System.out.println(lakiLakiMenikah.toString());

        //2. Perempuan Telah Menikah
        Manusia perempuanMenikah = new Manusia("Atika", "0987654321", false, true);
        System.out.println("\n2. Perempuan Telah Menikah:");
        System.out.println(perempuanMenikah.toString());

        //3. Belum Menikah
        Manusia belumMenikah = new Manusia("Cantika", "2345678901", false, false);
        System.out.println("\n3. Belum Menikah:");
        System.out.println(belumMenikah.toString());
    }

}
