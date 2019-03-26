package Juego;
/**
 *
 * @author luisGonzalez
 */ 
public class Armas {                //clase para la creacion de objetos de tipo armas 
    protected String armas;
    Armas siguiente;
    protected int ataque;
    
    public Armas(String armas, Armas siguiente, int ataque){
        this.armas = armas;
        this.siguiente = siguiente;
        this.ataque = ataque;
    }
    
   //Object almacena datos de todo tipo strig, int.
    
    
}
