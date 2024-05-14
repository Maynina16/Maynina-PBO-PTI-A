public class Asprak extends Mahasiswa implements Pengajar {
    public Asprak(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin, nim, ipk, golUkt);
    }

    void ngasihKomenDiGCR() {
        System.out.println(nama + " ngasih komen di GCR");
    }
}
