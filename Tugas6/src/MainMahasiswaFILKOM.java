public class MainMahasiswaFILKOM {
    public static void main(String[] args) {
        //1. Mahasiswa FILKOM IPK < 3
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Bani", true, "1234567890" , true, "212302212", 2.5);
        System.out.println("1. Mahasiswa FILKOM IPK < 3:");
        System.out.println(mahasiswa1.toString());

        //2. Mahasiswa FILKOM IPK 3 - 3.5
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Atika", false, "0987654321", false, "212389076", 3.4);
        System.out.println("\n2. Mahasiswa FILKOM IPK 3 - 3.5");
        System.out.println(mahasiswa2.toString());

        //3. Mahasiswa FILKOM IPK 3.5 - 4
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Cantika", false, "2345678901", false, "212403278", 3.8);
        System.out.println("\n3. Mahasiswa FILKOM IPK 3.5 - 4");
        System.out.println(mahasiswa3.toString());

    }
    
}
