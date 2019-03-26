package Juego;
/**
 *
 * @author luisGonzalez
 */
public abstract class Vehiculo {
    protected String vehiculo;
    protected int definirAuto; 
    public static int autoTanque = 1;
    public static int autoAvion = 2;
    protected int vidaAuto;
    protected int puntosAuto;
    protected int nivelAuto;
    protected int ataqueAuto;
    protected double defensaAuto;
    protected int punteriaAuto;
    protected int velocidadDisparos;
    protected int experienciaAuto;

    
    
    
    protected abstract String inicializarAuto();
    protected abstract void inicializarTipoAuto();  
    
 
  
    
    
    
}
