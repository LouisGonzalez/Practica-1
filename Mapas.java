package Juego;
/**
 *
 * @author luisGonzalez
 */
public class Mapas {  //clase con el unico fin de crear objetos tipo mapas y asi usarse en otras clases
    protected String[][] mapas;
    Mapas siguiente;
    
    public Mapas(String[][] mapas, Mapas siguiente){
        this.mapas = mapas;
        this.siguiente = siguiente;
    }
    
}
