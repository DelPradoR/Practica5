
package computacion.practica5;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author rauli
 */
public class CurlysMultiPieceMino {
    private ArrayList<Jugador> jugadores;
    private int turno;
    private Pozo elPozo;
    private ArrayList <Movible> fichasJugadas;
    
    public CurlysMultiPieceMino(){
        jugadores=new ArrayList();
        Jugador jugador1 = new Jugador();
        Jugador jugador2=new Jugador();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        elPozo =new Pozo();
        fichasJugadas=new ArrayList();
    }
    public int validarInicioDelJuego(Movible ficha1, Movible ficha2){
       if(ficha1.contarPuntos()>ficha2.contarPuntos())
           return 1;
       else
           return 2;
    }
    public void imprimirFichasJugadas(){
         for (Movible elemento : fichasJugadas) {
            System.out.println(elemento);
    }
    }
   
    public void cambiarTurno(){
        if(turno==0){
            turno=1;
        }else{
        if(turno==1){
            turno=0;
        }
        }
    }
    
    public int verificarManoVacia(){
        int isVacia=0;
        if(jugadores.get(0).getMano().isEmpty()){
            isVacia=1;
        }
    if(jugadores.get(1).getMano().isEmpty()){
        isVacia=2;
    }
    return isVacia;
    }
    
    public boolean verificarPozoVacio(){
        boolean isVacio=false;
        if(elPozo.getPozo().isEmpty()){
            isVacio=true;
        }
        return isVacio;
    }
    
    public void jugar(){
        Scanner scanner=new Scanner(System.in);
        elPozo.llenarPozo(6);
        elPozo.mezclarTodasLasFichas();
        elPozo.imprimirFichas();
        jugadores.get(0).recibirMano(elPozo.repartirMano());
        jugadores.get(1).recibirMano(elPozo.repartirMano());
        System.out.println("La mano del jugador 1 es:");
        jugadores.get(0).imprimirMano();
        System.out.println("Selecciona una ficha para comprobar quien inicia el juego:");
        int indiceFichaDLaMano=scanner.nextInt();
        Movible fichaSeleccionada=jugadores.get(0).tomarFicha(indiceFichaDLaMano);
        System.out.println(fichaSeleccionada.toString());
        System.out.println("La mano del jugador 2 es:");
        jugadores.get(1).imprimirMano();
        System.out.println("Selecciona una ficha para comprobar quien inicia el juego:");
        int indiceFichaDLaMano2=scanner.nextInt();
        Movible fichaSeleccionada2=jugadores.get(1).tomarFicha(indiceFichaDLaMano2);
        System.out.println(fichaSeleccionada2.toString());
        int primerJugador=validarInicioDelJuego(fichaSeleccionada,fichaSeleccionada2);
        
        if(primerJugador==1){
            System.out.println("El jugador 1 comenzara la partida");
            fichasJugadas.add(fichaSeleccionada);
            turno=1;
        }
        else{
            System.out.println("El jugador 2 comenzara la partida");
            fichasJugadas.add(fichaSeleccionada2);
            turno=0;
        }
       for (Movible elemento : fichasJugadas) {
            System.out.println(elemento);
    }
        //AQUI COMIENZA EL JUEGO//
        while(verificarManoVacia()==0&&verificarPozoVacio()==false){
            System.out.println("El jugador que sigue es el :"+(turno+1));
            jugadores.get(turno).imprimirMano();
             System.out.println("Ingresa la ficha que quieres jugar");
        int fichaAJugar=scanner.nextInt();
        fichaSeleccionada=jugadores.get(turno).tomarFicha(fichaAJugar);
        fichasJugadas.add(fichaSeleccionada);
        jugadores.get(turno).calcularPuntaje(fichaSeleccionada.contarPuntos());
            System.out.println("El puntaje del jugador es: "+jugadores.get(turno).getPuntajeJugador());
        cambiarTurno();
        imprimirFichasJugadas();
        }
        
    }
}
