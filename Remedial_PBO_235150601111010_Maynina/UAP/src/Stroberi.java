public class Stroberi extends Tanaman implements Perawatan {
    public Stroberi() {
        super(60, 150, 0.35);
    }
    
    @Override
    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
        if (getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() - getBerbuah());
        }
        System.out.println("Stroberi berkembang: " + toString());
    }

    @Override
    public String toString() {
        return "Stroberi: " + super.toString();
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + 0.05);
        System.out.println("Stroberi mendapat perawatan: " + toString());
    }
}
