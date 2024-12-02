package hu.unideb.inf.amoba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Teszteles {
    @Test
    public void NyeroJatek(){
        Jatek j1 = new Jatek(true);
        try {
            assertTrue(j1.jatekosLep("x", 0,0).equals("A játék folytatódik..."));
        } catch (AmobaException e) {
            fail("Nem kellett volna kivételt dobnia!");
        }
        try {
            assertTrue(j1.jatekosLep("o", 1,0).equals("A játék folytatódik..."));
        } catch (AmobaException e) {
            fail("Nem kellett volna kivételt dobnia!");
        }
        try {
            assertTrue(j1.jatekosLep("x", 0,1).equals("A játék folytatódik..."));
        } catch (AmobaException e) {
            fail("Nem kellett volna kivételt dobnia!");
        }
        try {
            assertTrue(j1.jatekosLep("o", 1,1).equals("A játék folytatódik..."));
        } catch (AmobaException e) {
            fail("Nem kellett volna kivételt dobnia!");
        }
        try {
            assertTrue(j1.jatekosLep("x", 0,2).equals("Az utoljára lépett játékos nyert!"));
        } catch (AmobaException e) {
            fail("Nem kellett volna kivételt dobnia!");
        }
    }

    @Test
    public void InditasTeszt(){
        Jatek j1 = new Jatek(false);
        assertThrowsExactly(AmobaException.class, ()->j1.jatekosLep("x",0,1));
    }

    @Test
    public void vanJelTeszt(){
        Jatek j1 = new Jatek(true);
        try {
            j1.jatekosLep("x", 0,0);
        } catch (AmobaException e) {
            fail("Nem kellett volna kivételt dobnia!");
        }
        assertThrowsExactly(AmobaException.class, ()->j1.jatekosLep("o",0,0));
    }
}
