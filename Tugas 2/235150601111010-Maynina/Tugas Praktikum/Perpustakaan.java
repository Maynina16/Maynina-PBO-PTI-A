import java.util.*;

class Buku {
    String judul;
    List<String> penulis;
    String kategori;

    Buku(String judul, List<String> penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        
    }
}

public class Perpustakaan {
    public static void main(String[] args) {
        Map<String, List<Buku>> kategoriBuku = new HashMap<>();
        kategoriBuku.put("Filsafat", Arrays.asList(
            new Buku("Dunia Sophie", Arrays.asList("Jostein Gaarder")),
            new Buku("Philosophy 101", Arrays.asList("Paul Kleinman")),
            new Buku("Filsafat Ilmu Perspektif Barat & Islam", Arrays.asList("Adian Husaini")),
            new Buku("Beyond and Evil: The Philospy Classic", Arrays.asList("Friedrich Nietzsche")),
            new Buku("The Little Prince", Arrays.asList("Antoine de Saint"))
        ));

        kategoriBuku.put("Fiksi", Arrays.asList(
            new Buku("Laut Bercerita", Arrays.asList("Leila Salikha Chudori")),
            new Buku("Kartasis", Arrays.asList("Anastasia Aemilia")),
            new Buku("Angkasa DAN 56 Hari", Arrays.asList("Destashya WDP")),
            new Buku("Berjuta Rasanya", Arrays.asList("Tere Liye")),
            new Buku("Alster Lake", Arrays.asList("Auryn Vientania"))
        ));

        kategoriBuku.put("Teknologi", Arrays.asList(
            new Buku("Life 3.0", Arrays.asList("Max Tegmark")),
            new Buku("Homo Deus: Masa Depan Umat Manusia", Arrays.asList("Yuval Noah Harari")),
            new Buku("Enlightenment Now", Arrays.asList("Steven Pinker")),
            new Buku("I Contain Multitudes ", Arrays.asList("Ed Yong")),
            new Buku("Marketing 5.0: Teknologi untuk Kemanusiaan", Arrays.asList("Philip Kotler"))
        ));
        
        kategoriBuku.put("Agama", Arrays.asList(
            new Buku("Sejarah Agama Manusia", Arrays.asList("Mohammad Zazuli")),
            new Buku("Kitab Ta'lim Muta'allim", Arrays.asList("Imam Zarnuji")),
            new Buku("Sejarah Peradaban Islam", Arrays.asList("Prof. Dr. Syamruddin Nasution, M.Ag.")),
            new Buku("Pembangunan Karakter Islam Perspektif Tasawuf ", Arrays.asList("Dr. Muhammad Iqbal Irham, M.Ag.")),
            new Buku("Modernisasi Manajemen Pendidikan Islam", Arrays.asList("Dr. Fathor Rachman, M.Pd."))
        ));    

        kategoriBuku.put("Sejarah", Arrays.asList(
            new Buku("Sejarah Dunia Yang Disembunyikan", Arrays.asList("Jonathan Black")),
            new Buku("Nusantara: sejarah Indonesia", Arrays.asList("B.h.m. Vlekke")),
            new Buku("Madilog", Arrays.asList("Tan Malaka")),
            new Buku("History of Java (The History of Java)", Arrays.asList("Thomas Stamford Raffles")),
            new Buku("Mistik Islam Kejawen ", Arrays.asList("Simuh"))
        ));    

        kategoriBuku.put("Politik", Arrays.asList(
            new Buku("Mengadvokasi Hak Sipil Politik", Arrays.asList("Hendardi")),
            new Buku("PERCAKAPAN POLITIK", Arrays.asList("A. Sudiarja")),
            new Buku("Negara dan Politik Kesejahteraan", Arrays.asList("A. Muhaimin Iskandar")),
            new Buku("Dramaturgi Politik Indonesia", Arrays.asList("Muhamad Sulhan")),
            new Buku("Keadaban Politik", Arrays.asList("Luthfi J. Kurniawan"))
        ));    

        kategoriBuku.put("Psikologi", Arrays.asList(
            new Buku("Psikologi Kepribadian", Arrays.asList("Alwisol")),
            new Buku("Psikologi Komunikasi", Arrays.asList("Jalaluddin Rakhmat")),
            new Buku("Psikologi Umum", Arrays.asList("Agus Sujanto")),
            new Buku("Psikologi Lintas Budaya", Arrays.asList("Sarlito Wirawan Sarwono")),
            new Buku("Psikologi Perkembangan", Arrays.asList("Hurlock Elizabeth"))
        ));    

        for (String kategori : kategoriBuku.keySet()) {
            System.out.println("Kategori: " + kategori);
            for (Buku buku : kategoriBuku.get(kategori)) {
                System.out.println("Judul: " + buku.judul);
                System.out.println("Penulis: " + String.join(", ", buku.penulis));
                System.out.println();
            }
            System.out.println();
        }
    }
}

