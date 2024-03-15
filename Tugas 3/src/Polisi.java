public class Polisi {
    private String nama;
    private String pangkat;
    private int usia;

    public Polisi(String nama, String pangkat, int usia) {
        this.nama = nama;
        this.pangkat = pangkat;
        this.usia = usia;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getPangkat() {
        return pangkat;
    }
    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }
    public int getUsia() {
        return usia;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }
    public void menilang(String jalan) {
        System.out.println("Polisi " + nama + " sedang menilang di jalan " + jalan);
    }
    public void memeliharaKeamanan() {
        System.out.println("Polisi " + nama + " sedang memelihara keamanan");
    }
    public void mengayomiMasyarakat() {
        System.out.println("Polisi " + nama + " sedang mengayomi masyarakat");
    }

    public static void main(String[] args) {
        Polisi polisi1 = new Polisi("Tommy", "Jenderal", 50);
        System.out.println("Polisi " + polisi1.getNama() + ", pangkat: " + polisi1.getPangkat() + ", usia: " + polisi1.getUsia());
        polisi1.menilang("Jakarta");
        polisi1.memeliharaKeamanan();
        polisi1.mengayomiMasyarakat();

        Polisi polisi2 = new Polisi("Nisa", "AKP", 40);
        System.out.println("Polisi " + polisi2.getNama() + ", pangkat: " + polisi2.getPangkat() + ", usia: " + polisi2.getUsia());
        polisi2.menilang("Bandung");
        polisi2.memeliharaKeamanan();
        polisi2.mengayomiMasyarakat();
    }
    }

