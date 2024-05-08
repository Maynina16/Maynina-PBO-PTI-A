import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate tanggalLahir;

    public Employee(String name, String noKTP, LocalDate tanggalLahir){
    this.name = name;
    this.noKTP = noKTP;
    this.tanggalLahir = tanggalLahir;
    }
    public String getName(){
    return name;
    }
    public String getNoKTP(){
    return noKTP;
    }
    public LocalDate getTanggalLahir() { 
        return tanggalLahir;
    }
    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public String toString(){
    return String.format(" "+getName()+"\nNo. KTP :"+getNoKTP() + "\nTanggal Lahir: " + getTanggalLahir());
    }
    public abstract double earnings();//pendapatan

    //Mengecek apakah hari ini employee ulangtahun
    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return (today.getMonth() == tanggalLahir.getMonth()) && (today.getDayOfMonth() == tanggalLahir.getDayOfMonth());
    }
   }

   
