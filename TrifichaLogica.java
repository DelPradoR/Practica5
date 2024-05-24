package uabc.poo.andres.le.gresley.mavenproject1;

/**
 *
 * @author Andres Le Gresley
 *
 * Clase trificha de domino en la que se crea el molde para pode rinstanciar un
 * objeto de tipo trificha, la cual e suna ficha con la diferencia de que esta
 * posee 3 lados
 *
 *
 */
public class TrifichaLogica extends FichaLogica implements Movible {

    private int ladoC;
    private boolean orientacion;

    public TrifichaLogica(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB);
        this.ladoC = ladoC;
        orientacion = true;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public boolean getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(boolean orientacion) {
        this.orientacion = orientacion;
    }

    public void voltearFicha() {
        orientacion = !orientacion;
    }

    @Override
    public void rotateLeft() {
        int aux = ladoA;
        ladoA = ladoB;
        ladoB = ladoC;
        ladoC = aux;
    }

    @Override
    public void rotateRight() {
        int aux = ladoA;
        ladoA = ladoC;
        ladoC = ladoB;
        ladoB = aux;
    }

    @Override
    public String toString() {
        if (orientacion == true) {
            StringBuilder cadena = new StringBuilder();
            cadena.append("     ").append(ladoA).append("\n");
            cadena.append("   " + ladoB).append("   ").append(ladoC).append("\n");
            return cadena.toString();
        } else {
            StringBuilder cadena = new StringBuilder();
            cadena.append("    ").append(" x ").append("\n");
            cadena.append("   x").append("  ").append(" x ").append("\n");
            return cadena.toString();
        }
    }
}