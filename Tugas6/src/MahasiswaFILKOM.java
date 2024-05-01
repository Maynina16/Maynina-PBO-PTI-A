public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    //constructor
    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    //getter and setter methods
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        String prodi = "";
        String angkatan = nim.substring(5,7);
        String kodeProdi = nim.substring(6, 7);

        switch (nim.charAt(6)) {
            case '2': 
            prodi = "Teknik Informatika";
            break;
            case '3':
            prodi = "Teknik Komputer";
            break;
            case '4':
            prodi = "Sistem Informasi";
            break;
            case '6':
            prodi = "Pendidikan Teknologi Informasi";
            break;
            case '7':
            prodi = "Teknologi Informasi";
            break;
            default: 
            prodi = "Prodi tidak valid";
        }
        return prodi + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.00;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            return 75.0;
        } else {
            return 0.0;
        }
    }

    //Metode toString 
    public String toString() {
        return super.toString() + "\nnim\t: " + nim + "\nipk\t: " + ipk + "\nstatus\t: " + getStatus();
    }

    } 
