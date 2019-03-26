package Juego;
/**
 *
 * @author luisGonzalez
 */
public class Enemigo2 extends Enemigos {
    AutoBunker enemigo2 = new AutoBunker(100, 0, 1, 20, 0.10, 100, 1, 0);
     
    @Override
    protected void enemigos(){
        enemigo = "BUNKER B-666";
        System.out.println(enemigo);
        vidaEnemigo = enemigo2.getVidaTotal();
        System.out.println("Vida: "+vidaEnemigo);
        ataqueEnemigo = enemigo2.getAtaque();
        System.out.println("Daño: "+ataqueEnemigo);
        armaduraEnemigo = enemigo2.getArmadura();
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
