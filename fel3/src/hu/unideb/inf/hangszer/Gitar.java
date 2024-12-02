package hu.unideb.inf.hangszer;

public class Gitar extends Hangszer implements Behangolhato {
    private boolean isBehangolt;
    private String tipus;

    public Gitar(String marka, String tipus) {
        super(marka);
        this.tipus = tipus;
        this.isBehangolt = true;
    }

    public String getTipus() {
        return tipus;
    }

    public boolean isBehangolt() {
        return isBehangolt;
    }

    @Override
    public void behangol() {
        this.isBehangolt = true;
    }

    @Override
    public String daltJatszik() {
        if (this.isBehangolt) {
            this.isBehangolt = false;
            return "damdadam";
        } else {
            return HANGOLATLAN_DAL;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gitar{");
        sb.append(super.toString());
        sb.append(", isBehangolt=").append(isBehangolt);
        sb.append(", tipus='").append(tipus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
