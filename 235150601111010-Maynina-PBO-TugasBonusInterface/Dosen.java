public class Dosen extends Civitas implements Pengajar {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }
    public String getNip() {
        return nip;
    }
    public double getGaji(){
        return gaji;
    }

    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk kelas");
    }

    public void ikutPenelitian() {
        System.out.println(nip + " ikut penelitian");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(nip + " mengajar mata kuliah " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(nip + " mengasih tugas");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(nip + " menilai tugas");
    }

    @Override
    void naikLift() {
        System.out.println(nip + " naik lift");
    }
}
