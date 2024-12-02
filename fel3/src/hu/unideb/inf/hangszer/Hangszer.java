package hu.unideb.inf.hangszer;

public abstract class Hangszer {
    private static int letrehozottHangszerekSzama = 0;
    private String marka;
    protected final String HANGOLATLAN_DAL = "eeeheh";

    protected Hangszer(String marka) {
        this.marka = marka;
        letrehozottHangszerekSzama++;
    }

    protected Hangszer() {
        this("NoName");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public static int getLetrehozottHangszerekSzama() {
        return letrehozottHangszerekSzama;
    }

    public abstract String daltJatszik();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hangszer{");
        sb.append("marka='").append(marka).append('\'');
        sb.append(", HANGOLATLAN_DAL='").append(HANGOLATLAN_DAL).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
