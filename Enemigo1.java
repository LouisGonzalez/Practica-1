package Juego;
/**
 *
 * @author luisGonzalez
 */
public class Enemigo1 extends Enemigos {        //clase hija de enemigos
    AutoBunker enemigo1 = new AutoBunker(100, 0, 1, 20, 0.10, 100, 1, 0);
    
    @Override
    protected void enemigos(){              //cada clase crea un enemigo diferente
        enemigo = "BUNKER A-777";           //crea atributos diferentes para cada enemigo, con la misma variable
        System.out.println(enemigo);
        vidaEnemigo = enemigo1.getVidaTotal();      //vida
        System.out.println("Vida: "+vidaEnemigo);
        ataqueEnemigo = enemigo1.getAtaque();       //ataque
        System.out.println("Daño: "+ataqueEnemigo);
        armaduraEnemigo = enemigo1.getArmadura();       //armadura
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
