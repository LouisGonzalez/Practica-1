/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author luisGonzalez
 */
public abstract class TipoVehiculo {
    protected int vidaTotal;
    protected int puntosPoder; 
    protected int nivelActual; 
    protected int experiencia;
    protected int ataque;
    protected double armadura;
    protected int punteria;
    protected int velocidadDisparo;
    
    public TipoVehiculo(int vidaTotal, int puntosPoder, int nivelActual, int ataque, double armadura, int punteria, int velocidadDisparo, int experiencia){
        this.nivelActual = nivelActual;
        this.puntosPoder = puntosPoder;
        this.vidaTotal = vidaTotal;
        this.ataque = ataque;
        this.armadura = armadura;
        this.punteria = punteria;
        this.velocidadDisparo = velocidadDisparo;
        this.experiencia = experiencia;
        
    }
    
      
    
   
    
}
