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
    
    @Override
    public int getLadoA() {
        return ladoA;
    }
    
    @Override
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    
    @Override
    public int getLadoB() {
        return ladoB;
    }
    
    
    @Override
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    
    @Override
    public boolean getOrientacion() {
        return orientacion;
    }
    @Override
    public void setOrientacion(boolean orientacion) {
        this.orientacion = orientacion;
    }
    @Override
    public int getPosicion(){
        return posicion;
    }

    @Override
    public void voltearFicha() {
        orientacion = !orientacion;
    }
    @Override
    public char validarLado(int caraActual,int caso){
    char resultado= 'n';
    if(caso==1){
        if(ladoA==caraActual||ladoB==caraActual||ladoC==caraActual){
            resultado='a';
        }
    }else if(caso==2){
    if(ladoA==caraActual){
        resultado='a';
    }else if(ladoC==caraActual){
     resultado='c';   
    }
    }else if(caso==3){
        if(ladoA==caraActual&&(ladoA==ladoB||ladoA==ladoC)){
            resultado='a';
        }else if(ladoC==caraActual&&(ladoC==ladoA||ladoC==ladoB)){
            resultado='b';
        }else if(ladoB==caraActual&&(ladoB==ladoA||ladoB==ladoC)){
            resultado='c';
        }
    }
    
    return resultado;
}

    @Override
    public void rotateRight() {
        
        
        if(posicion==1){
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
            posicion=1;
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
    @Override
    public int getNumeroDLados(){
        return 3;
    }
}
