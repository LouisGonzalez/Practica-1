package Juego;
/**
 *
 * @author luisGonzalez
 */
public class Enemigo3 extends Enemigos{
    AutoBunker enemigo3 = new AutoBunker(100, 0, 1, 20, 0.10, 100, 1, 0);
     
    @Override
    protected void enemigos (){
        enemigo = "BUNKER C-322";
        System.out.println(enemigo);
        vidaEnemigo = enemigo3.getVidaTotal();
        System.out.println("Vida: "+vidaEnemigo);
        ataqueEnemigo = enemigo3.getAtaque();
        System.out.println("Daño: "+ataqueEnemigo);
        armaduraEnemigo = enemigo3.getArmadura();
        System.out.println("Armadura: "+armaduraEnemigo);
    }

    public String getEnemigo() {
        return enemigo;
    }

    
    public int getVidaEnemigo() {
        return vidaEnemigo;
    }

    public void setVidaEnemigo(int vidaEnemigo) {
        this.vidaEnemigo = vidaEnemigo;
    }

    public int getAtaqueEnemigo() {
        return ataqueEnemigo;
    }

    public void setAtaqueEnemigo(int ataqueEnemigo) {
        this.ataqueEnemigo = ataqueEnemigo;
    }

    public double getArmaduraEnemigo() {
        return armaduraEnemigo;
    }

    public void setArmaduraEnemigo(int armaduraEnemigo) {
        this.armaduraEnemigo = armaduraEnemigo;
    }

     
    
}
