public class PegawaiTetap extends Pegawai {
    double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }
    @Override
    double hitungGaji() {
        return upah;
    }
}
