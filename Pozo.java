/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computacion.practica5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rauli
 */
public class Pozo {
        private ArrayList<Movible> allFichas;
        
    public Pozo() {
        allFichas=new ArrayList();
    }
    
    
    public void llenarPozo(int mulaMaxima){
        //crear fichas domino doble seis
         for (int i = 0; i <= mulaMaxima; i++) {  // Ciclo for anidado el cual crea todas las fichas en
            for (int j = 0; j <= i; j++) { // base a la mula maxima ingresada en el constructor
                allFichas.add(new FichaLogica(i, j)); // Se agregan al ArrayList
            }
        }
         //Crear fichas tridomino
      for (int i = 0; i <= mulaMaxima; i++) {
            for (int j = i; j <= mulaMaxima; j++) {
                for (int k = j; k <= mulaMaxima; k++) {
                    allFichas.add(new TrifichaLogica(i, j, k));
                }
            }
        }
    }
    
    public void imprimirFichas(){
             allFichas.forEach(
                (Movible fichas) -> {
                    System.out.println(fichas);
                });
    }
    public void mezclarTodasLasFichas(){
        Collections.shuffle(allFichas);
    }
    
    public ArrayList<Movible> repartirMano(){
        ArrayList<Movible> manoJugador= new ArrayList();
        
        int i;
        for(i=0;i<10;i++){
            manoJugador.add(allFichas.remove(i));
            
        }
        return manoJugador;
    }
    public ArrayList getPozo(){
        return allFichas;
    }
   
}
