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
public class Tridomino {

    private ArrayList<TrifichaLogica> tridomino;

    public Tridomino(int mulaMaxima) {
        tridomino = new ArrayList();
        for (int i = 0; i <= mulaMaxima; i++) {
            for (int j = i; j <= mulaMaxima; j++) {
                for (int k = j; k <= mulaMaxima; k++) {
                    tridomino.add(new TrifichaLogica(i, j, k));
                }
            }
        }
    }

    public ArrayList<TrifichaLogica> getTridomino() {
        return tridomino;
    }

    public void setTridomino(ArrayList<TrifichaLogica> tridomino) {
        this.tridomino = tridomino;
    }

    public void imprimirFichas() {
        tridomino.forEach(
                (TrifichaLogica tridomino) -> {
                    System.out.println(tridomino);
                });
    }

    public void mezclarFichas() {
        Collections.shuffle(tridomino);
    }

    public TrifichaLogica tomarPrimeraTrificha() {
        if (!tridomino.isEmpty()) {
            return tridomino.remove(0);
        } else {
            System.out.println("La caja está vacía, no se puede enviar más fichas.");
            return null;
        }
    }
}