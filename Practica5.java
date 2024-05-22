/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package computacion.practica5;
import java.util.*;
/**
 *
 * @author rauli
 */
public class Practica5 {

    public static void main(String[] args) {
        TrifichaLogica ficha1;
        ficha1= new TrifichaLogica(3,1,2);
   // CurlysMultiPieceMino juego;
    //juego =new CurlysMultiPieceMino();
    System.out.println("La posición de la ficha es: "+ficha1.getPosicion());
    System.out.println(ficha1.toString());
    ficha1.rotateRight();
    System.out.println("La posición de la ficha es: "+ficha1.getPosicion());
    System.out.println(ficha1.toString());
    ficha1.rotateRight();
    System.out.println("La posición de la ficha es: "+ficha1.getPosicion());
    System.out.println(ficha1.toString());
    ficha1.rotateRight();
    System.out.println("La posición de la ficha es: "+ficha1.getPosicion());
    System.out.println(ficha1.toString());
    ficha1.rotateRight();
    System.out.println("La posición de la ficha es: "+ficha1.getPosicion());
    System.out.println(ficha1.toString());
    ficha1.rotateLeft();
    System.out.println(ficha1.toString());
    
    
        //juego.jugar();
        
           }
}