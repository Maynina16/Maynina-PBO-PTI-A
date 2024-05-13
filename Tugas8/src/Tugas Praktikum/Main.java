public class Main2 {
    public static void main(String[] args) {
        PegawaiTetap pegawai1 = new PegawaiTetap("Bayu", "350728490327424092342", 2000000.0);
        PegawaiHarian pegawai2 = new PegawaiHarian("Edo", "350728450327424092343", 8500.0, 40);
        Pegawai pegawai3 = new Sales("Tika", "350728490327424892344", 50.0, 50000.0);

        //polimorfisme dan upcasting
        System.out.printf("%-17s: %s\n", "Pegawai Tetap" , pegawai1.nama);
        System.out.printf("%-17s: %s\n", "No. KTP" , pegawai1.noKTP);
        System.out.printf("%-17s: Rp %.1f\n", "Upah" , ((PegawaiTetap)pegawai1).upah);
        System.out.printf("%-17s: Rp %d\n\n", "Pendapatan" , (int) pegawai1.hitungGaji());

        System.out.printf("%-17s: %s\n", "Pegawai Harian", pegawai2.nama);
        System.out.printf("%-17s: %s\n", "No. KTP", pegawai2.noKTP);
        System.out.printf("%-17s: Rp %.1f\n", "Upah per Jam", ((PegawaiHarian)pegawai2).upahPerJam);
        System.out.printf("%-17s: Rp %d\n", "Total Jam Kerja", ((PegawaiHarian)pegawai2).totalJamKerja);
        System.out.printf("%-17s: Rp %d\n\n", "Pendapatan", (int) pegawai2.hitungGaji());

        System.out.printf("%-17s: %s\n", "Sales", pegawai3.nama);
        System.out.printf("%-17s: %s\n", "No. KTP", pegawai3.noKTP);
        System.out.printf("%-17s: Rp %.1f\n", "Total Penjualan", ((Sales)pegawai3).totalPenjualan);
        System.out.printf("%-17s: %.1f%%\n", "Besaran Komisi", ((Sales)pegawai3).komisi * 100);
        System.out.printf("%-17s: Rp %d\n", "Pendapatan", (int) pegawai3.hitungGaji());

        
    }   
}
