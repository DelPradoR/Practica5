package uabc.poo.andres.le.gresley.mavenproject1;

/**
 *
 * @author Andres Le Gresley
 * 
 * Clase ficha de la cual se va generar herencia
 * 
 * 
 */
public class FichaLogica implements Movible {
    
    protected int ladoA;
    protected int ladoB;
    protected boolean orientacion;

    public FichaLogica(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        orientacion = true;
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
    
    @Override
    public String toString() {
        if (orientacion == true) {
        return " [ " + ladoA + " | " + ladoB + " ] ";
        } else
            return " [ x | x ] ";
    }
    
    public void voltearFicha() {
        orientacion =! orientacion;
    }

    @Override
    public void rotateRight() {
        int aux = ladoB;
        ladoB = ladoA;
        ladoA = aux;
    }

    @Override
    public void rotateLeft() {
        int aux = ladoA;
        ladoA = ladoB;
        ladoB = aux;
    }
}