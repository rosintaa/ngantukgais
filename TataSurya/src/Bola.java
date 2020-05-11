public class Bola {
    protected static double jari_jari;

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        Bola.jari_jari = jari_jari;
    }

    public double getVolume() {
        return (float) (4 * 3.14 * Math.pow(jari_jari,3)/3);
    }

    public double getLuas_permukaan() {
        return (float) (4 * 3.14 * Math.pow(jari_jari,2));
    }

    public double getKeliling() {
        return (float) (2 * 3.14 * jari_jari);
    }
}
