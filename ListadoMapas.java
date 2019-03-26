package Juego;
/**
 *
 * @author luisGonzalez
 */
public class ListadoMapas { //clase encargada de la creacion de escenarios infinitos
    Mapas inicio, fin;
    
    protected ListadoMapas(){
        inicio = null;
        fin = null; 
    }
    
    protected boolean estaVacio(){  //definir si la lista de escenarios creados esta vacia
        return inicio == null;
    }
    
    protected void agregarValores(String[][] mapas){ //metodo para crear mas escenarios
        if(estaVacio()){
            inicio = new Mapas(mapas, inicio);
            fin = inicio;
        } else {
            inicio = new Mapas(mapas, inicio);
        }
        
    }
    
    protected void mostrarMapas(){          //metodo para mostrar al usuario todos los escenarios que han sido creados
        Mapas aux = inicio;
        while(aux!=null){
            System.out.println("["+aux.mapas+"]");
            aux = aux.siguiente;
        }
    }
    
}
