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
public class Domino {

    // Atributos de la clase
    private ArrayList<FichaLogica> cajaDeDomino;

    // Constructor de la clase que crea las fichas de forma grafica y textual
    public Domino(int mulaMaxima) {
        cajaDeDomino = new ArrayList();                            // Se instancia el ArrayList
        for (int i = 0; i <= mulaMaxima; i++) {                    // Ciclo for anidado el cual crea todas las fichas en
            for (int j = 0; j <= i; j++) {                         // base a la mula maxima ingresada en el constructor
                cajaDeDomino.add(new FichaLogica(i, j)); // Se agregan al ArrayList
            }
        }
    }

    // Metodo que imprime las fichas
    public void imprimirFichas() {
        cajaDeDomino.forEach( //
                (FichaLogica cajaDeDomino) -> {         // Imprime las fichas en forma
                    System.out.println(cajaDeDomino); // 
                });                                     // textual
    }

    // Da acceso a la caja de fichas textuales
    public ArrayList<FichaLogica> getCajaDeDomino() {
        return cajaDeDomino;
    }

    // Toma la primera ficha logica
    public FichaLogica getFichaLogicaUno() {
        FichaLogica ficha = cajaDeDomino.get(0);
        cajaDeDomino.remove(0);
        return ficha;
    }

    // Mezcla todas las fichas de la coleccion
    public void mezclarFichas() {
        Collections.shuffle(cajaDeDomino);
    }
}