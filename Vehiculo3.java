package Juego;
import java.util.Scanner;
/**
 *
 * @author luisGonzalez
 */
public class Vehiculo3 extends Vehiculo {
    Scanner scanner = new Scanner(System.in);
    AutoTanque tipoAuto = new AutoTanque(50, 5, 1, 10, 0.06, 60, 1, 0);
    AutoAvion tipoAuto2 = new AutoAvion(50, 5, 1, 7, 0.03, 70, 1, 0);
    

    @Override
    protected String inicializarAuto(){
        System.out.println("Ingrese el nombre que desea darle a Vehiculo 3");
        vehiculo = scanner.nextLine();
        return vehiculo;
    }
    
    @Override
    protected void inicializarTipoAuto(){
        System.out.println("Momento de definir el tipo de auto que desea para "+vehiculo);
        System.out.println("1. Tanque");
        System.out.println("2. Avion");
        definirAuto = scanner.nextInt();
        switch (definirAuto) {
            case 1:
                //metodod tanque
                System.out.println("Has elegido un auto tipo TANQUE");
                System.out.println("");
                System.out.println("VALORES INICIALES DE TU VEHICULO");
                System.out.println("");
                vidaAuto = tipoAuto.getVidaTotal();
                System.out.println("Vida: "+vidaAuto);
                puntosAuto = tipoAuto.getPuntosPoder();
                System.out.println("Puntos de poder: "+puntosAuto);                
                nivelAuto = tipoAuto.getNivelActual();
                System.out.println("Nivel: "+nivelAuto);                
                ataqueAuto = tipoAuto.getAtaque();
                System.out.println("Daño base: "+ataqueAuto);
                defensaAuto = tipoAuto.getArmadura();
                System.out.println("Armadura: "+defensaAuto);
                punteriaAuto = tipoAuto.getPunteria();
                System.out.println("Punteria: "+punteriaAuto);
                experienciaAuto = tipoAuto.getExperiencia();
                System.out.println("Experiencia: "+experienciaAuto);
                System.out.println("");
                break;
            case 2:
                //metodo avion
                System.out.println("Has elegido un auto tipo AVION");
                System.out.println("");
                vidaAuto = tipoAuto2.getVidaTotal();
                System.out.println("Vida: "+vidaAuto);
                puntosAuto = tipoAuto2.getPuntosPoder();
                System.out.println("Puntos de poder: "+puntosAuto);                
                nivelAuto = tipoAuto2.getNivelActual();
                System.out.println("Nivel: "+nivelAuto);                
                ataqueAuto = tipoAuto2.getAtaque();
                System.out.println("Daño base: "+ataqueAuto);
                defensaAuto = tipoAuto2.getArmadura();
                System.out.println("Armadura: "+defensaAuto);
                punteriaAuto = tipoAuto2.getPunteria();
                System.out.println("Punteria: "+punteriaAuto);
                velocidadDisparos = tipoAuto2.getVelocidadDisparo(); 
                System.out.println("Velocidad de disparo: "+velocidadDisparos);
                experienciaAuto = tipoAuto2.getExperiencia();
                System.out.println("Experiencia: "+experienciaAuto);
                System.out.println("");
                break;
                
        }
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDefinirAuto() {
        return definirAuto;
    }

    public void setDefinirAuto(int definirAuto) {
        this.definirAuto = definirAuto;
    }

    public static int getAutoTanque() {
        return autoTanque;
    }

    public static void setAutoTanque(int autoTanque) {
        Vehiculo.autoTanque = autoTanque;
    }

    public static int getAutoAvion() {
        return autoAvion;
    }

    public static void setAutoAvion(int autoAvion) {
        Vehiculo.autoAvion = autoAvion;
    }

    public int getVidaAuto() {
        return vidaAuto;
    }

    public void setVidaAuto(int vidaAuto) {
        this.vidaAuto = vidaAuto;
    }

    public int getPuntosAuto() {
        return puntosAuto;
    }

    public void setPuntosAuto(int puntosAuto) {
        this.puntosAuto = puntosAuto;
    }

    public int getNivelAuto() {
        return nivelAuto;
    }

    public void setNivelAuto(int nivelAuto) {
        this.nivelAuto = nivelAuto;
    }

    public int getAtaqueAuto() {
        return ataqueAuto;
    }

    public void setAtaqueAuto(int ataqueAuto) {
        this.ataqueAuto = ataqueAuto;
    }

    public double getDefensaAuto() {
        return defensaAuto;
    }

    public void setDefensaAuto(int defensaAuto) {
        this.defensaAuto = defensaAuto;
    }

    public int getPunteriaAuto() {
        return punteriaAuto;
    }

    public void setPunteriaAuto(int punteriaAuto) {
        this.punteriaAuto = punteriaAuto;
    }

    public int getVelocidadDisparos() {
        return velocidadDisparos;
    }

    public void setVelocidadDisparos(int velocidadDisparos) {
        this.velocidadDisparos = velocidadDisparos;
    }

    public int getExperienciaAuto() {
        return experienciaAuto;
    }

    public void setExperienciaAuto(int experienciaAuto) {
        this.experienciaAuto = experienciaAuto;
    }
 
    
    
    
    
    
    
}
