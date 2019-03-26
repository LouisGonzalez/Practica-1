package Juego;
/**
 *
 * @author luisGonzalez
 */
public class AutoTanque extends TipoVehiculo {        //clase extendida de TipoVehiculo que se encarga de definir los parametros para los valores que tendran los aviones
    
    public AutoTanque(int vidaTotal, int puntosPoder, int nivelActual, int ataque, double armadura, int punteria, int velocidadDisparo, int experiencia){
        super(vidaTotal, puntosPoder, nivelActual, ataque, armadura, punteria, velocidadDisparo, experiencia);
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public int getPuntosPoder() {
        return puntosPoder;
    }

    public void setPuntosPoder(int puntosPoder) {
        this.puntosPoder = puntosPoder;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }

    public int getAtaque() {
        return ataque;
    }
                                
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public double getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }
    
    
        
    
}
