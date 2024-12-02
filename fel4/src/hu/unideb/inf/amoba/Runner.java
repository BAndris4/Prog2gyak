package hu.unideb.inf.amoba;

public class Runner {
    public static void main(String[] args) throws AmobaException {
        Jatek j1 = new Jatek(true);
        System.out.println(j1);
        System.out.println(j1.jatekosLep("x", 0,0));
        System.out.println(j1);
        System.out.println(j1.jatekosLep("o", 1,0));
        System.out.println(j1);
        System.out.println(j1.jatekosLep("x", 0,1));
        System.out.println(j1);
        System.out.println(j1.jatekosLep("o", 1,1));
        System.out.println(j1);
        System.out.println(j1.jatekosLep("x", 0,2));
        System.out.println(j1);
    }
}
