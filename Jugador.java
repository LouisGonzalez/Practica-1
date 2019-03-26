package Juego;
import java.util.Scanner;
/**
 *
 * @author luisGonzalez
 */
public class Jugador {      //clase con el unico fin de obtener los datos del jugador al inicio del juego
    private String nombreJugador;
    Scanner scanner = new Scanner(System.in);
     
        
    protected void inicializarNombre(){ //nombre del jugador
        System.out.println("Escriba el nombre que le dara a su avatar");
        nombreJugador = scanner.nextLine();
    }
    
    protected void mostrarNombre(){  //mostrar nombre del jugador
        System.out.println("");
        System.out.println("Bienvenido "+nombreJugador);    
    }

   
}
