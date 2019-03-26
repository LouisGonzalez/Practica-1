package Juego;
/**
 *
 * @author luisGonzalez
 */
public class ListadoArmas { //clase para la creacion de las armas infinitas 
    Armas inicio, fin;
    
    protected ListadoArmas(){
        inicio = null;
        fin = null;
    }
    
    protected boolean estaVacio(){ //si la lista esta vacia definirlo con un null
        return inicio == null;
    }
    
    protected void agregarValores (String armas, int ataque){  //metodo para agregar mas valores a la lista
        if(estaVacio()){
            inicio = new Armas(armas, inicio, ataque);
            fin = inicio;
        } else {
            inicio = new Armas(armas, inicio, ataque); 
        }
    }
    
     protected void mostrarArmas(){ //metodo para mostrar todas las armas creadas hasta este instante
        Armas aux = inicio;
        while(aux!=null){
            System.out.println("["+aux.armas+"]  ["+aux.ataque+"]");
            aux = aux.siguiente;
        }
        
    }
}
