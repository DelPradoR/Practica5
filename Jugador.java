package computacion.practica5;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

public class Jugador
{
    private ArrayList<Movible> manoDelJugador;
    private int puntaje=0;
    
    public Jugador()
    {
        manoDelJugador=new ArrayList();
       
       
    }
    
    public void recibirMano(ArrayList<Movible> manoJugador){
     manoDelJugador=manoJugador;   
    }
    
    public Movible tomarFicha(int indice){
        return manoDelJugador.remove(indice);
    }
    
    public boolean fichaIsVolteada(int indice){
        return true;
    }
    
    public ArrayList<Movible> getMano(){
        return manoDelJugador;
    }
    
    public int  getPuntajeJugador(){
        return puntaje;
    }
    
    public void calcularPuntaje(int puntosFichaAcutal){
        puntaje+=puntosFichaAcutal;

    }
    
    public int calcularPuntosDMano(){
       return 0;
    }
    
    public int getNumeroDFichas(){
        return manoDelJugador.size();
    }
    
    public void imprimirMano(){
        manoDelJugador.forEach(
                (Movible fichas) -> {
                    System.out.println(fichas);
                });
        
    }
    
    
    
    public void esconderMano(){
      
    }

    public boolean verificarManoVacia(){
       // System.out.println("El numero de fichas en la mano es:" +mano.size()+ " "+ mano.isEmpty());
        return manoDelJugador.isEmpty();
    }
    
    public void recorrerFicha(){
        
    }
   
}

