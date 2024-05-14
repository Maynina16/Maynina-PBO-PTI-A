class Resepsionis extends Civitas {
    int idResepsionis;
    String jabatan;
    double gaji;

    public Resepsionis(String nama, int umur, boolean jenisKelamin, int idResepsionis, String jabatan, double gaji) {
        super(nama, umur, jenisKelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    void melayani() {
        System.out.println(nama + " melayani");
    }

    void melapor() {
        System.out.println(nama + " melapor");
    }

    @Override
    public void naikLift() {
        System.out.println(nama + " naik lift");
    }
}
