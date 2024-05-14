public class Main {

    public static void main(String[] args) {
        //instan dari masing - masing konkret kelas
        Dosen dosen = new Dosen("Pak Edo", 45, true, "B12367", 2000000);
        Mahasiswa mahasiswa = new Mahasiswa("Nina", 18, false, "S34561", 1.1, 2);  
        Resepsionis resepsionis = new Resepsionis("Lino", 23, true, 101, "Supervisor", 5000000);
        Asprak asprak = new Asprak("Nisa", 20, false, "W12345", 4.5, 5);
  
      //upcasting
        PesertaKelas pesertaKelasDosen = dosen;
        PesertaKelas pesertaKelasMahasiswa = mahasiswa;
        PesertaKelas pesertaKelasAsprak = asprak;
        Civitas civitasResepsionis = resepsionis; 

     //implementasi 
        dosen.ikutPenelitian();
        dosen.mengajar("Matematika Komputasi");
        dosen.mengasihTugas();
        dosen.menilaiTugas();
        dosen.masukKelas();
        dosen.naikLift();

        mahasiswa.ngerjainTugas();
        mahasiswa.pasrah();
        mahasiswa.mengikutiOrganisasi("OPTIIK");
        mahasiswa.presentasi();
        mahasiswa.masukKelas();
        mahasiswa.naikLift();

        resepsionis.melayani();
        resepsionis.melapor();
        resepsionis.naikLift();

        asprak.ngerjainTugas();
        asprak.mengikutiOrganisasi("BEM");
        asprak.presentasi();
        asprak.masukKelas();
        asprak.ngasihKomenDiGCR();
        asprak.naikLift();  

        //implemetasi method dari upcasted 
        pesertaKelasDosen.masukKelas();
        pesertaKelasMahasiswa.masukKelas();
        pesertaKelasAsprak.masukKelas();
        civitasResepsionis.makanDiKantin("Kantin GKM");
        civitasResepsionis.mainGamerCorner();
  }
}
