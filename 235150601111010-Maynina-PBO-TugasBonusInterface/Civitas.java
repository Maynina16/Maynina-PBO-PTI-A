public abstract class Civitas {
    protected String nama;
    protected int umur;
    protected boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);

    }

    public void mainGamerCorner() {
        System.out.println(nama + " bermain di game corner");
    }

    public abstract void naikLift();
}
