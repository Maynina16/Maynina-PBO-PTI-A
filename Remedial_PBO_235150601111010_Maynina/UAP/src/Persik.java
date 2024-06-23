public class Persik extends Tanaman implements Perawatan {
    public Persik() {
        super(180, 250, 0.15);
    }
    
    @Override
    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
        if (getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }
        System.out.println("Persik berkembang: " + toString());
    }

    @Override
    public String toString() {
        return "Persik: " + super.toString();
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + 0.05);
        System.out.println("Persik mendapat perawatan: " + toString());
    }
}
    
