package hu.unideb.inf.hangszer;

public class Trombita extends Gitar{
    private String alapanyag;

    public Trombita(String marka, String tipus, String alapanyag) {
        super(marka, tipus);
        this.alapanyag = alapanyag;
    }

    public String getAlapanyag() {
        return alapanyag;
    }

    @Override
    public String daltJatszik() {
        return "tratratrata";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trombita{");
        sb.append(super.toString());
        sb.append(", alapanyag='").append(alapanyag).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
