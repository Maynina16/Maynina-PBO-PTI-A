public abstract class Pegawai {
    String nama;
    String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    abstract double hitungGaji();    
}

