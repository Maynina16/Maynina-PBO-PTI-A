public class Sales extends Pegawai {
    private double totalPenjualan;
    private double komisi;
    public int pendapatan;


    public Sales(String nama, String noKTP, double totalPenjualan, double komisi, int pendapatan) {
        super(nama, noKTP);
        this.totalPenjualan = totalPenjualan;
        this.komisi = komisi;
        this.pendapatan = pendapatan;
    }

    public double getPenjualan(){
        return this.totalPenjualan;
    }
    
    public double getKomisi(){
        return this.komisi;
    }
    
    public void setPenjualan(int penjualan){
        this.totalPenjualan = penjualan;
    }
    
    public void setKomisi(double komisi){
        this.komisi = komisi;
    }

    public void setPendapatan(int pendapatan){
        this.pendapatan = pendapatan;
    }

    public double getPendapatan(){
        return this.pendapatan;
    }
    
    @Override
    public double gaji()  {
        return totalPenjualan * komisi;
    }
    @Override
    public String toString() {
        return "Sales           : " + super.getNama() + "\nNo. KTP         : " + super.getNoKTP() + "\nTotal penjualan : " + ((double)getPenjualan())+ "\nBesaran komisi  : " + ((double)getKomisi()) + "\nPendapatan      : Rp " + ((int)gaji()) + "\n";
    }
    
}

