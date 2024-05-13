public class Sales extends Pegawai {
    double totalPenjualan;
    double komisi;

    public Sales(String nama, String noKTP, double totalPenjualan, double komisi) {
        super(nama, noKTP);
        this.totalPenjualan = totalPenjualan;
        this.komisi = komisi;
    }
    @Override
    double hitungGaji()  {
        return totalPenjualan * komisi;
    }
    
}
