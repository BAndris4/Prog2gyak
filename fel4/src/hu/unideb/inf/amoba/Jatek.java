package hu.unideb.inf.amoba;

public class Jatek {
    private String[][] tabla;
    private int xNum = 0;
    private int oNum = 0;

    public Jatek(boolean start) {
        if (start) {
            this.tabla = new String[][]{{"0", "0", "0"}, {"0", "0", "0"}, {"0", "0", "0"}};
        } else {
            this.tabla = null;
        }
    }

    public String jatekosLep(String jatekos, int x, int y) throws AmobaException {
        if (tabla == null) {
            throw new AmobaException("A játék nincs elindítva!");
        }
        if (xNum>oNum && jatekos.equals("x") || oNum>xNum && jatekos.equals("o")) {
            throw new AmobaException("Rossz következő játékos!");
        }
        if (!tabla[x][y].equals("0")){
            throw new AmobaException("Ezen a mezőn már van jel!");
        }
        try {
            tabla[x][y] = jatekos;
        } catch (Exception e) {
            throw new AmobaException("Rossz mező!");
        }

        if (jatekos.equals("x")){
            xNum++;
        } else if (jatekos.equals("o")) {
            oNum++;
        }

        if ((tabla[0][0].equals(tabla[0][1]) && tabla[0][1].equals(tabla[0][2]) && !tabla[0][0].equals("0")) ||
                (tabla[1][0].equals(tabla[1][1]) && tabla[1][1].equals(tabla[1][2]) && !tabla[1][0].equals("0")) ||
                (tabla[2][0].equals(tabla[2][1]) && tabla[2][1].equals(tabla[2][2]) && !tabla[2][0].equals("0")) ||
                (tabla[0][0].equals(tabla[1][0]) && tabla[1][0].equals(tabla[2][0]) && !tabla[0][0].equals("0")) ||
                (tabla[0][1].equals(tabla[1][1]) && tabla[1][1].equals(tabla[2][1]) && !tabla[0][1].equals("0")) ||
                (tabla[0][2].equals(tabla[1][2]) && tabla[1][2].equals(tabla[2][2]) && !tabla[0][2].equals("0")) ||
                (tabla[0][0].equals(tabla[1][1]) && tabla[1][1].equals(tabla[2][2]) && !tabla[0][0].equals("0")) ||
                (tabla[0][2].equals(tabla[1][1]) && tabla[1][1].equals(tabla[2][0]) && !tabla[0][2].equals("0")))
            return "Az utoljára lépett játékos nyert!";
        return "A játék folytatódik...";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jatek{");
        sb.append("tabla=\n[");
        for (String[] sor : tabla) {
            sb.append("[");
            for (String s : sor) {
                sb.append(s + " ");
            }
            sb.append("]\n");
        }
        sb.append("]}");
        return sb.toString();
    }
}
