/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computacion.practica5;
import java.util.*;
/**
 *
 * @author rauli
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
        return " [ " + ladoA + " \n " + ladoB + " ] ";
        } else
            return " ["+"   \n"+"   ] ";
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
    @Override
    public int contarPuntos(){
        int puntosDLaFicha=ladoA+ladoB;
        return puntosDLaFicha;
    }
}