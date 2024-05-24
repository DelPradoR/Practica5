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
public interface Movible {

    public void rotateRight();

    public void rotateLeft();
    
    public int contarPuntos();
    public int getNumeroDLados();
    public int getLadoA();
    public int getLadoB();
    public int getLadoC();
    public char validarLado(int caraActual,int caso);
    
    public int getPosicion();
    

}
