public class Main {
    public static void main(String[] args) {
        Pegawai PegawaiTetap1 = new PegawaiTetap("Bayu", "350728490327424092342", 2000000.0, 2000000);
        Pegawai PegawaiTetap2 = new PegawaiTetap("Lino", "350728790327424092008", 3000000.0, 3000000);
        Pegawai PegawaiTetap3 = new PegawaiTetap("Aji", "350728990327424091009", 4000000.0, 4000000);
        
        Pegawai PegawaiHarian1 = new PegawaiHarian("Edo", "350728450327424092343", 8500.0, 40, 340000);
        Pegawai PegawaiHarian2 = new PegawaiHarian("Andi", "350728450327424090045", 6500.0, 40,260000);
        Pegawai PegawaiHarian3 = new PegawaiHarian("Budi", "350728450327404092359", 7500.0, 40, 300000);

        Pegawai Sales1 = new Sales("Tika", "350728490327424892344", 50.0, 50000.0,50000);
        Pegawai Sales2 = new Sales("Lisa", "350728490327424892349", 60.0, 70000.0, 70000);
        Pegawai Sales3 = new Sales("Nisa", "350728490327424892524", 80.0, 90000.0, 90000);

        //upcasting
        PegawaiHarian UpHarian = new PegawaiHarian("Alika", "350720490327924082340", 100000.0, 12, 570000);
        Pegawai UpCasHarian = (Pegawai) UpHarian;
        
        //downcasting 
        PegawaiHarian DownHarian = (PegawaiHarian) UpCasHarian;

        Sales UpSales = new Sales("Zelta", "3507204903274265792580", 60.0, 70000.0, 1400000);
        Pegawai UpCasSales = (Pegawai) UpSales;

        Sales DownSales = (Sales) UpCasSales;
        
        
        System.out.println(PegawaiTetap1.toString());
        System.out.println(PegawaiTetap2.toString());
        System.out.println(PegawaiTetap3.toString());

        System.out.println(PegawaiHarian1.toString());
        System.out.println(PegawaiHarian2.toString());
        System.out.println(PegawaiHarian3.toString());

        System.out.println(Sales1.toString());
        System.out.println(Sales2.toString());
        System.out.println(Sales3.toString());

        // Test upcasting and downcasting
        System.out.println(UpHarian.toString());
        System.out.println(DownHarian.toString());
        System.out.println(UpSales.toString());
        System.out.println(DownSales.toString());
        
    }   
}


