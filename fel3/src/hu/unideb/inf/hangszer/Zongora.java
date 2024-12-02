package hu.unideb.inf.hangszer;

public class Zongora extends Hangszer implements Behangolhato{
    private boolean isBehangolt;
    private int billentyukSzama;

    public Zongora(String marka, int billentyukSzama) {
        super(marka);
        this.billentyukSzama = billentyukSzama;
        this.isBehangolt = true;
    }

    public int getBillentyukSzama() {
        return billentyukSzama;
    }

    @Override
    public void behangol() {
        this.isBehangolt = true;
    }

    @Override
    public String daltJatszik() {
        if (this.isBehangolt) {
            this.isBehangolt = false;
            return "klimpklimpklimp";
        } else {
            return HANGOLATLAN_DAL;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zongora{");
        sb.append(super.toString());
        sb.append(", isBehangolt=").append(isBehangolt);
        sb.append(", billentyukSzama=").append(billentyukSzama);
        sb.append('}');
        return sb.toString();
    }
}
