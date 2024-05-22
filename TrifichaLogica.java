/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computacion.practica5;

/**
 *
 * @author rauli
 */

public class TrifichaLogica extends FichaLogica implements Movible {

    private int ladoC;
    private boolean orientacion;
    private int posicion;

    public TrifichaLogica(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB);
        this.ladoC = ladoC;
        orientacion = true;
        posicion=0;
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
    public int getPosicion(){
        return posicion;
    }

    public void voltearFicha() {
        orientacion = !orientacion;
    }

    @Override
    public void rotateRight() {
        
        
        if(posicion==3){
            posicion=0;
        }else{
            posicion++;
            int aux = ladoA;
            ladoA = ladoB;
            ladoB = ladoC;
            ladoC = aux;
        }
    }

    @Override
    public void rotateLeft() {
        
        if(posicion>0){
            posicion--;
            int aux = ladoA;
            ladoA = ladoC;
            ladoC = ladoB;
            ladoB = aux;
        }else{
            posicion=3;
        }
}

    @Override
    public String toString() {
        if (orientacion == true) {
            if(posicion==0){
            StringBuilder cadena = new StringBuilder();
            cadena.append("     ").append(ladoA).append("\n");
            cadena.append("   " + ladoB).append("   ").append(ladoC).append("\n");
            return cadena.toString();
            }else{
            StringBuilder cadena = new StringBuilder();
            cadena.append("   " + ladoA).append("   ").append(ladoC).append("\n");
            cadena.append("     ").append(ladoB).append("\n");
            return cadena.toString();
            }
        } else {
            StringBuilder cadena = new StringBuilder();
            cadena.append("    ").append(" | | ").append("\n");
            cadena.append("  | |").append("  ").append(" | | ").append("\n");
            return cadena.toString();
        }
    }
    @Override
    public int contarPuntos(){
        int puntosDLaTrificha=ladoA+ladoB+ladoC;
        return puntosDLaTrificha;
    }
}
