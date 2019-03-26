package Juego;
import java.io.IOException;
/**
 *
 * @author luisGonzalez
 */
public class menuPrincipal {
    private static int espacio;
        
    public static void main(String [] args) throws IOException {
        InicializarDatos main = new InicializarDatos();
        Escenario juego = new Escenario();
        System.out.println("Bienvenido al juego");
        Jugador jugador1 = new Jugador();
        MenuJuego jugar = new MenuJuego(juego);
        
        jugador1.inicializarNombre();
        jugador1.mostrarNombre();
        limpiarPantalla();
        jugar.inicializar();
        jugar.menuJugar();        
    }
        
    protected static void limpiarPantalla(){
        for(espacio=1; espacio<=40; espacio++){
            System.out.println("");
        }        
    }
}
