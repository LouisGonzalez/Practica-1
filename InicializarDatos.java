package Juego;
/**
 *
 * @author luisGonzalez
 */
public class InicializarDatos {
    protected String[] nombreAuto = new String[3];
    Vehiculo1 vehiculo = new Vehiculo1();
    Vehiculo2 vehiculo2 = new Vehiculo2();
    Vehiculo3 vehiculo3 = new Vehiculo3();
        
    protected void inicializarVehiculos(){
    vehiculo.inicializarAuto();
        vehiculo.inicializarTipoAuto();
        nombreAuto[0] = vehiculo.vehiculo;
        vehiculo2.inicializarAuto();
        vehiculo2.inicializarTipoAuto();
        nombreAuto[1] = vehiculo2.vehiculo;
        vehiculo3.inicializarAuto();
        vehiculo3.inicializarTipoAuto();
        nombreAuto[2] = vehiculo3.vehiculo;
        
    }
    
}
