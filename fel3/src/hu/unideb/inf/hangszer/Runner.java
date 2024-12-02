package hu.unideb.inf.hangszer;

public class Runner {
    public static void main(String[] args) {
        Gitar g1 = new Gitar("ABC123", "jo");
        Trombita t1 = new Trombita("DEF234", "megjobb", "arany");
        Zongora z1 = new Zongora("KLM123", 50);

        System.out.println(g1);
        System.out.println(t1);
        System.out.println(z1);

        System.out.println(Hangszer.getLetrehozottHangszerekSzama());

        g1.behangol();
        System.out.println(g1.daltJatszik());
        System.out.println(g1.daltJatszik());
        System.out.println(t1.daltJatszik());
        System.out.println(z1.getBillentyukSzama());
    }
}
