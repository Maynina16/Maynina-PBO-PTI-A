class Mahasiswa extends Civitas implements PesertaKelas {
    String nim;
    double ipk;
    int golUkt;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    void ngerjainTugas() {
        System.out.println(getNama() + " mengerjakan tugas");
    }

    void pasrah() {
        System.out.println(getNama + " pasrah");
    }

    void mengikutiOrganisasi(String namaOrganisasi) {
        System.out.println(getNama + " mengikuti organisasi " + namaOrganisasi);
    }

    void presentasi() {
        System.out.println(getNama + " presentasi");
    }

    @Override
    public void masukKelas() {
        System.out.println(getNama + " masuk kelas");
    }

    @Override
    void naikLift() {
        System.out.println(getNama + " naik lift");
    }
}
