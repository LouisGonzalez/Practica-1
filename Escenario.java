package Juego;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author luisGonzalez
 */
public class Escenario {
    //definir todas las variables a usar en la clase que se ocupara de todos los movimientos y ataques sobre los escenarios
    protected int posicionX, posicionY, disparoX, disparoY, posicionMiaX, posicionMiaY, nuevaPosX, nuevaPosY, primerAuto, decisionColor, decisionJugar, oroAleatorio, oroTotal;
    protected int[] xpTotal = new int[3];
    protected double[] armadura = new double[3];
    protected int[] ataque = new int[3];
    protected int[] nivelTotal = new int[3];
    protected int[] xpAuto = new int[3];
    protected int[][] vidaCumbr = new int[6][6];
    protected String nombre1, nombre2, nombre3;     
    protected int[] disparoEnemigoX = new int[3];
    protected int[] disparoEnemigoY = new int[3];
    protected double[] resultado = new double[6];
    protected double[] vidaEnemigo = new double[3];
    protected double vidaAuto;
    protected int z = 0;
    protected static int[] tipoAuto = new int[3]; 
    protected static int[] posEnemigoX = new int[4];
    protected static int[] posEnemigoY = new int[4];
    protected final String numCuadros[][] = new String[6][6];
    protected final String puntero = "♠";
    protected final String puntero2 = "ᴥ";
    protected final String puntero3 = "♦";    
    protected final String enemigo = "▼";
    protected static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    protected static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    protected static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    Vehiculo1 vida1 = new Vehiculo1();
    Vehiculo2 vida2 = new Vehiculo2();
    Vehiculo3 vida3 = new Vehiculo3();
    Enemigo1 malo = new Enemigo1();
    Enemigo2 malo2 = new Enemigo2();
    Enemigo3 malo3 = new Enemigo3();
    Scanner scanner = new Scanner(System.in);
    
    //codigo del primer escenario
    protected String[][] escenario1 (){
        numCuadros[0][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[0][1] = (ANSI_GREEN_BACKGROUND+"          |");
        numCuadros[0][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[0][3] = (ANSI_GREEN_BACKGROUND+"          |");        
        numCuadros[0][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[0][5] = (ANSI_GREEN_BACKGROUND+"          |");        
        numCuadros[1][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[1][1] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[1][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[1][3] = (ANSI_GREEN_BACKGROUND+"          |");     
        numCuadros[1][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[1][5] = (ANSI_BLUE_BACKGROUND+"          |");      
        numCuadros[2][0] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[2][1] = (ANSI_GREEN_BACKGROUND+"          |");    
        numCuadros[2][2] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[2][3] = (ANSI_RED_BACKGROUND+"          |");    
        numCuadros[2][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[2][5] = (ANSI_BLUE_BACKGROUND+"          |");    
        numCuadros[3][0] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[3][1] = (ANSI_GREEN_BACKGROUND+"          |");     
        numCuadros[3][2] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[3][3] = (ANSI_RED_BACKGROUND+"          |");     
        numCuadros[3][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[3][5] = (ANSI_BLUE_BACKGROUND+"          |");     
        numCuadros[4][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[4][1] = (ANSI_GREEN_BACKGROUND+"          |");  
        numCuadros[4][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[4][3] = (ANSI_GREEN_BACKGROUND+"          |");  
        numCuadros[4][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[4][5] = (ANSI_GREEN_BACKGROUND+"          |");   
        numCuadros[5][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[5][1] = (ANSI_GREEN_BACKGROUND+"          |");    
        numCuadros[5][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[5][3] = (ANSI_GREEN_BACKGROUND+"          |");     
        numCuadros[5][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[5][5] = (ANSI_GREEN_BACKGROUND+"          |");    
        return numCuadros;          
    }
   
    protected String[][] escenario2(){   //codigo del segundo escenario
        numCuadros[0][0] = (ANSI_BLUE_BACKGROUND+"          |");   numCuadros[0][1] = (ANSI_BLUE_BACKGROUND+"          |");       
        numCuadros[0][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[0][3] = (ANSI_GREEN_BACKGROUND+"          |");       
        numCuadros[0][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[0][5] = (ANSI_GREEN_BACKGROUND+"          |");       
        numCuadros[1][0] = (ANSI_BLUE_BACKGROUND+"          |");   numCuadros[1][1] = (ANSI_BLUE_BACKGROUND+"          |");      
        numCuadros[1][2] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[1][3] = (ANSI_RED_BACKGROUND+"          |");      
        numCuadros[1][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[1][5] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[2][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[2][1] = (ANSI_RED_BACKGROUND+"          |");     
        numCuadros[2][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[2][3] = (ANSI_GREEN_BACKGROUND+"          |");     
        numCuadros[2][4] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[2][5] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[3][0] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[3][1] = (ANSI_GREEN_BACKGROUND+"          |");       
        numCuadros[3][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[3][3] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[3][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[3][5] = (ANSI_GREEN_BACKGROUND+"          |");    
        numCuadros[4][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[4][1] = (ANSI_GREEN_BACKGROUND+"          |");     
        numCuadros[4][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[4][3] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[4][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[4][5] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[5][0] = (ANSI_BLUE_BACKGROUND+"          |");   numCuadros[5][1] = (ANSI_BLUE_BACKGROUND+"          |");     
        numCuadros[5][2] = (ANSI_BLUE_BACKGROUND+"          |");   numCuadros[5][3] = (ANSI_GREEN_BACKGROUND+"          |");     
        numCuadros[5][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[5][5] = (ANSI_GREEN_BACKGROUND+"          |");       
        return numCuadros;
    }  
    
    protected String[][] escenario3(){   //codigo del tercer escenario
        numCuadros[0][0] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[0][1] = (ANSI_RED_BACKGROUND+"          |");     
        numCuadros[0][2] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[0][3] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[0][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[0][5] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[1][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[1][1] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[1][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[1][3] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[1][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[1][5] = (ANSI_GREEN_BACKGROUND+"          |");     
        numCuadros[2][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[2][1] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[2][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[2][3] = (ANSI_GREEN_BACKGROUND+"          |");     
        numCuadros[2][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[2][5] = (ANSI_GREEN_BACKGROUND+"          |");       
        numCuadros[3][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[3][1] = (ANSI_GREEN_BACKGROUND+"          |");       
        numCuadros[3][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[3][3] = (ANSI_GREEN_BACKGROUND+"          |");      
        numCuadros[3][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[3][5] = (ANSI_GREEN_BACKGROUND+"          |");        
        numCuadros[4][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[4][1] = (ANSI_RED_BACKGROUND+"          |");       
        numCuadros[4][2] = (ANSI_RED_BACKGROUND+"          |");    numCuadros[4][3] = (ANSI_BLUE_BACKGROUND+"          |");       
        numCuadros[4][4] = (ANSI_BLUE_BACKGROUND+"          |");   numCuadros[4][5] = (ANSI_BLUE_BACKGROUND+"          |");       
        numCuadros[5][0] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[5][1] = (ANSI_GREEN_BACKGROUND+"          |");       
        numCuadros[5][2] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[5][3] = (ANSI_GREEN_BACKGROUND+"          |");       
        numCuadros[5][4] = (ANSI_GREEN_BACKGROUND+"          |");  numCuadros[5][5] = (ANSI_GREEN_BACKGROUND+"          |");        
        return numCuadros;
    }
    
    protected String[][] creacionEscenario(){   //escenarios infinitos
       System.out.println("Bienvenido a la creacion de escenarios\n"
                + "La mecanica de la creacion es simple\n"
                + "Cada escenario consta de 6 filas y columnas, se te ira preguntando el tipo de terreno que deseas para cada celda\n"
                + "1. Agua      2. Cumbres    3. Tierra");
        System.out.println("");
        System.out.println("");
        decisionColor=0;
        //mediante un doble for se asignan las posiciones a una matriz que a primer vista se encuentra vacia
        for(posicionX=0; posicionX<6; posicionX++){
            for(posicionY=0; posicionY<6; posicionY++){
                do {
                    System.out.print("Defina el tipo de terreno que desea para la celda ["+posicionX+"] ["+posicionY+"]  "); //definir tipo de terreno que se desea
                    decisionColor = scanner.nextInt();
                    switch (decisionColor) {
                        case 1:
                           numCuadros[posicionX][posicionY] = (ANSI_BLUE_BACKGROUND+"          |"); 
                            break;
                        case 2:
                            numCuadros[posicionX][posicionY] = (ANSI_RED_BACKGROUND+"          |");
                            break;
                        case 3:
                            numCuadros[posicionX][posicionY] = (ANSI_GREEN_BACKGROUND+"          |"); 
                            break;               
                    }
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                } while(decisionColor>3);
            }             
        }
        limpiarPantalla();
        mostrarEscenario(); 
        return numCuadros;
    }
    //inicializacion de los vehiculos del jugador
    protected void inicializarAutos() throws IOException { //esta clase inicializa todo tipo de valor que se desea volver universal
        System.out.println("Antes de iniciar a jugar tienes que crear tus 3 vehiculos\n"
                + "Cada uno de ellos te acompañara el resto del juego\n");
        vida1.inicializarAuto();
        vida1.inicializarTipoAuto();
        System.in.read();
        limpiarPantalla();
        vida2.inicializarAuto();
        vida2.inicializarTipoAuto();
        System.in.read();
        limpiarPantalla();
        vida3.inicializarAuto();
        vida3.inicializarTipoAuto();
        System.in.read();
        limpiarPantalla();
        System.out.println("Estos seran tus enemigos a vencer");
        malo.enemigos(); 
        System.out.println("");
        malo2.enemigos();
            System.out.println("");
        malo3.enemigos();
        System.in.read();
        limpiarPantalla();
        //todas las variables con las que deseamos trabajar y no se desea que al repetir el ciclo de juego vuelvan a sus valores iniciales
        tipoAuto[0] = vida1.getDefinirAuto();         tipoAuto[1] = vida2.getDefinirAuto();         tipoAuto[2] = vida3.getDefinirAuto();         
        nombre1 = vida1.getVehiculo();                nombre2 = vida2.getVehiculo();                nombre3 = vida3.getVehiculo();
        resultado[3] = vida1.getVidaAuto();           resultado[4] = vida2.getVidaAuto();           resultado[5] = vida3.getVidaAuto();
        nivelTotal[0] = vida1.getNivelAuto();         nivelTotal[1] = vida2.getNivelAuto();         nivelTotal[2] = vida3.getNivelAuto();
        xpTotal[0] = vida1.getExperienciaAuto();      xpTotal[1] = vida2.getExperienciaAuto();      xpTotal[2] = vida3.getExperienciaAuto();
        resultado[0] = malo.getVidaEnemigo();         resultado[1] = malo2.getVidaEnemigo();        resultado[2] = malo3.getVidaEnemigo(); 
        armadura[0] = vida1.getDefensaAuto();         armadura[1] = vida2.getDefensaAuto();         armadura[2] = vida3.getDefensaAuto();
        ataque[0] = vida1.getAtaqueAuto();            ataque[1] = vida2.getAtaqueAuto();            ataque[2] = vida3.getAtaqueAuto();
    }
        
    protected void mostrarEscenario(){ //el metodo que se usara para mostrar escenario actualizado cada que se necesite
        System.out.println("0         1           2          3          4          5");
        for(posicionX=0; posicionX<6; posicionX++){         //doble for para la matriz
            for(posicionY=0; posicionY<6; posicionY++){
                
                System.out.print(numCuadros[posicionX][posicionY]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");       
    }
    
    protected String primerMovimiento(){  
        System.out.println("Eliga la primera posicion donde desea colocar a su vehiculo\n"
                + "Defina la posicion en X a la que desea mover: ");
        posicionMiaX = scanner.nextInt();
        System.out.println("Defina la posicion en Y a la que desea mover");
        posicionMiaY = scanner.nextInt();
        System.out.println("");
        switch(primerAuto){ //primerAuto es la variable que define cual de los vehiculos se esta usando
            case 1:
        switch (numCuadros[posicionMiaX][posicionMiaY]) {       //si la casilla esta vacia la rellenara con el puntero del jugador y mismo fondo de color
            case ANSI_GREEN_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_GREEN_BACKGROUND+puntero+"         |";
                
                break;
            case ANSI_BLUE_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_BLUE_BACKGROUND+puntero+"         |";
                break;
            case ANSI_RED_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_RED_BACKGROUND+puntero+"          |";
                break;
            default:
                break;
        }
            case 2:
               switch (numCuadros[posicionMiaX][posicionMiaY]) {
            case ANSI_GREEN_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_GREEN_BACKGROUND+puntero2+"         |";
                
                break;
            case ANSI_BLUE_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_BLUE_BACKGROUND+puntero2+"         |";
                break;
            case ANSI_RED_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_RED_BACKGROUND+puntero2+"          |";
                break;
            default:
                break;
        }
            case 3:
                switch (numCuadros[posicionMiaX][posicionMiaY]) {
            case ANSI_GREEN_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_GREEN_BACKGROUND+puntero3+"         |";
                
                break;
            case ANSI_BLUE_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_BLUE_BACKGROUND+puntero3+"         |";
                break;
            case ANSI_RED_BACKGROUND+"          |":
                numCuadros[posicionMiaX][posicionMiaY] = ANSI_RED_BACKGROUND+puntero3+"          |";
                break;
            default:
                break;
        }
    }
        return numCuadros[posicionMiaX][posicionMiaY];    
    }
    
    protected void movimientos(){  //metodo que limpia la casilla anterior de movimiento y pasa el puntero hacia la nueva
        primerMovimiento();
        mostrarEscenario();
        switch(primerAuto){
            case 1:
            switch (numCuadros[posicionMiaX][posicionMiaY]) { //switch encargado de limpiar la casilla anterior donde estuvo el puntero
                case ANSI_GREEN_BACKGROUND+puntero+"         |":
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_GREEN_BACKGROUND+"          |";
                    break;
                case ANSI_BLUE_BACKGROUND+puntero+"         |":
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_BLUE_BACKGROUND+"          |";
                    break;
                case ANSI_RED_BACKGROUND+puntero+"          |":
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_RED_BACKGROUND+"          |";
                    break;
                default:
                    break;
            }
             case 2:
            switch (numCuadros[posicionMiaX][posicionMiaY]) { 
                case ANSI_GREEN_BACKGROUND+puntero2+"         |":  //dependiendo el tipo de color se rellenara
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_GREEN_BACKGROUND+"          |";
                    break;
                case ANSI_BLUE_BACKGROUND+puntero2+"         |":
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_BLUE_BACKGROUND+"          |";
                    break;
                case ANSI_RED_BACKGROUND+puntero2+"          |":
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_RED_BACKGROUND+"          |";
                    break;
                default:
                    break;
            }
             case 3:
            switch (numCuadros[posicionMiaX][posicionMiaY]) {
                case ANSI_GREEN_BACKGROUND+puntero3+"         |":
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_GREEN_BACKGROUND+"          |";
                    break;
                case ANSI_BLUE_BACKGROUND+puntero3+"         |":
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_BLUE_BACKGROUND+"          |";
                    break;
                case ANSI_RED_BACKGROUND+puntero3+"          |":
                    numCuadros[posicionMiaX][posicionMiaY] = ANSI_RED_BACKGROUND+"          |";
                    break;
                default:
                    break;
            }
    }  
            
    }
    
    protected void ataque() throws IOException { //metodo encargado de definir los parametros de disparo de los aliados
        System.out.println("Has elegido Atacar\n");
        System.out.println("Defina la posicion en X a la que desea disparar");
        disparoX = scanner.nextInt();
        System.out.println("Defina la posicion en Y a la que desea disparar");
        disparoY = scanner.nextInt();        
    }
    
    protected double disparo(){    //metodo encargado de ver especificamente cada que alguno de los vehiculos lastime al enemigo 1
         vidaEnemigo[0] = 0;      
         if(disparoX == posEnemigoX[0] && disparoY == posEnemigoY[0]){
        switch(primerAuto){
                case 1:
                        System.out.println("Le has atinado al enemigo 1 :00");
                        vidaEnemigo[0] = vidaEnemigo[0] - vida1.getAtaqueAuto() + (vida1.getAtaqueAuto() * malo.getArmaduraEnemigo());
                        break;                        
                  
                case 2:
                        System.out.println("Le has atinado al enemigo 1 :00");
                        vidaEnemigo[0] = vidaEnemigo[0] - vida2.getAtaqueAuto() + (vida2.getAtaqueAuto() * malo.getArmaduraEnemigo());
                        break;                        
                  
                case 3:
                        System.out.println("Le has atinado al enemigo 1 :00");
                        vidaEnemigo[0] = vidaEnemigo[0] - vida3.getAtaqueAuto() + (vida3.getAtaqueAuto() * malo.getArmaduraEnemigo());
                        break;                                          
            }
        }
        return vidaEnemigo[0];
    }
    
    protected double disparo2(){    //metodo encargado de ver especificamente cada que alguno de los vehiculos lastime al enemigo 2
        vidaEnemigo[1] = 0;         
         if(disparoX == posEnemigoX[1] && disparoY == posEnemigoY[1]){
           switch(primerAuto){
                case 1:
                        System.out.println("Le has atinado al enemigo 2 :00");
                        vidaEnemigo[1] = vidaEnemigo[1] - vida1.getAtaqueAuto() + (vida1.getAtaqueAuto() * malo2.getArmaduraEnemigo());
                        break;                        
                  
                case 2:
                        System.out.println("Le has atinado al enemigo 2 :00");
                        vidaEnemigo[1] = vidaEnemigo[1] - vida2.getAtaqueAuto() + (vida2.getAtaqueAuto() * malo2.getArmaduraEnemigo());
                        break;                        
                  
                case 3:
                        System.out.println("Le has atinado al enemigo 2 :00");
                        vidaEnemigo[1] = vidaEnemigo[1] - vida3.getAtaqueAuto() + (vida3.getAtaqueAuto() * malo2.getArmaduraEnemigo());
                        break;                                          
            }
        }
        return vidaEnemigo[1];
    }
            
    protected double disparo3(){   //metodo encargado de ver especificamente cada que alguno de los vehiculos lastime al enemigo 3
         vidaEnemigo[2] = 0;    
          if(disparoX == posEnemigoX[2] && disparoY == posEnemigoY[2]){
                 
            switch(primerAuto){
                case 1:
                        System.out.println("Le has atinado al enemigo 3 :00");
                        vidaEnemigo[2] = vidaEnemigo[2] - vida1.getAtaqueAuto() + (vida1.getAtaqueAuto() * malo3.getArmaduraEnemigo());
                        break;                        
                  
                case 2:
                        System.out.println("Le has atinado al enemigo 3 :00");
                        vidaEnemigo[2] = vidaEnemigo[2] - vida2.getAtaqueAuto() + (vida2.getAtaqueAuto() * malo3.getArmaduraEnemigo());
                        break;                        
                  
                case 3:
                        System.out.println("Le has atinado al enemigo 3 :00");
                        vidaEnemigo[2] = vidaEnemigo[2] - vida3.getAtaqueAuto() + (vida3.getAtaqueAuto() * malo3.getArmaduraEnemigo());
                        break;                                          
            }
           
         }      
         return vidaEnemigo[2];
    }
    
    protected void vidaCumbre(){     //metodo encargado de darle vida al tipo de terreno CUMBRES                          
        if(numCuadros[disparoX][disparoY].equals(ANSI_RED_BACKGROUND+"          |")){    //el color rojo denota las cumbres            
                System.out.println("LE HAS DISPARADO A UNA CUMBRE");
                switch(primerAuto){
                    case 1:
                        vidaCumbr[disparoX][disparoY] = vidaCumbr[disparoX][disparoY] + 10;  //se le da a las cumbres un rango de 5 tiros, si sobrepasan eso el terreno se volvera tierra
                        System.out.println("Lleva "+(vidaCumbr[disparoX][disparoY]/10)+" disparo hacia la motaña, 5 intentos bastaran para destruirla");                       
                        break;
                    case 2:
                        vidaCumbr[disparoX][disparoY] = vidaCumbr[disparoX][disparoY] + 10;
                        System.out.println("Lleva "+(vidaCumbr[disparoX][disparoY]/10)+" disparo hacia la motaña, 5 intentos bastaran para destruirla");
                        break;
                    case 3:
                        vidaCumbr[disparoX][disparoY] = vidaCumbr[disparoX][disparoY] + 10;
                        System.out.println("Lleva "+(vidaCumbr[disparoX][disparoY]/10)+" disparo hacia la motaña, 5 intentos bastaran para destruirla");
                        break;
                }
                if(vidaCumbr[disparoX][disparoY]==50){
                    System.out.println("La motaña a sido totalmente destruida");
                    numCuadros[disparoX][disparoY] = ANSI_GREEN_BACKGROUND+"          |";
                    mostrarEscenario();
                }
            }       
    }
    
    protected void posicionEnemigo(){ //metodo que denota la posicion de los enemigos, posicion que se denota desde el principio ya que es estatica
        int y = 0;
        System.out.println("Es momento de posicionar a los enemigos\n"
                + "Ten en cuenta de que los enemigos se quedaran en una posicion fija entonces permaneceran ahi hasta el final del juego\n");
        for(int x=0; x<3;x++){
            
            System.out.println("Defina la posicion en X para el enemigo ["+x+"]");
            posEnemigoX[y] = scanner.nextInt();
            System.out.println("Defina la posicion en Y para el enemigo ["+x+"]");
            posEnemigoY[y] = scanner.nextInt();
            System.out.println("");
              switch (numCuadros[posEnemigoX[y]][posEnemigoY[y]]) {
            case ANSI_GREEN_BACKGROUND+"          |":
                numCuadros[posEnemigoX[y]][posEnemigoY[y]] = ANSI_GREEN_BACKGROUND+enemigo+"         |";
                break;
            case ANSI_BLUE_BACKGROUND+"          |":
                numCuadros[posEnemigoX[y]][posEnemigoY[y]] = ANSI_BLUE_BACKGROUND+enemigo+"         |";
                break;
            case ANSI_RED_BACKGROUND+"          |":
                numCuadros[posEnemigoX[y]][posEnemigoY[y]] = ANSI_RED_BACKGROUND+enemigo+"          |"; //si en ese terreno habia una casilla vacia se le rellena con el puntero del enemigo
                break;
            default:
                break;
        }
            y++;
        }
        System.out.println(posEnemigoX[0]);
        System.out.println(posEnemigoX[1]);
    }
    
    protected double ataqueEnemigo() {           //ataque en forma aleatoria de los enemigos a vencer
        vidaAuto = 0;
        System.out.println("Es el turno de ataque del enemigo\n"
                + "El disparo al igual que el tuyo se realizara de forma aleatoria\n");
        disparoEnemigoX[0] = (int)(Math.random()*6);
        disparoEnemigoY[0] = (int)(Math.random()*6);
        disparoEnemigoX[1] = (int)(Math.random()*6);
        disparoEnemigoY[1] = (int)(Math.random()*6);
        disparoEnemigoX[2] = (int)(Math.random()*6);
        disparoEnemigoY[2] = (int)(Math.random()*6);
        System.out.println("El enemigo 1 a disparado a la posicion ["+disparoEnemigoX[0]+"] ["+disparoEnemigoY[0]+"]");
        System.out.println("El enemigo 2 a disparado a la posicion ["+disparoEnemigoX[1]+"] ["+disparoEnemigoY[1]+"]");
        System.out.println("El enemigo 3 a disparado a la posicion ["+disparoEnemigoX[2]+"] ["+disparoEnemigoY[2]+"]");                 
        return vidaAuto;
    }
        
    protected int primerAuto() {                    //metodo encargado de definir que vehiculo usaremos en la batalla ya que solo uno puede usarse
        System.out.println("Es momento de elegir el vehiculo que desea posicionare en esta batalla: ");
        System.out.println("1. "+nombre1);
        System.out.println("2. "+nombre2);
        System.out.println("3. "+nombre3);
        primerAuto = scanner.nextInt();
        switch(primerAuto){
            case 1:
                System.out.println("La vida actual de tu vehiculo es "+resultado[3]);
                System.out.println("El nivel de experiencia actual de tu vehiculo es "+vida1.getNivelAuto());
                System.out.println("Los puntos de poder que posee tu vehiculo son "+vida1.getPuntosAuto());
                break;
            case 2:
                System.out.println("La vida actual de tu vehiculo es "+resultado[4]);
                System.out.println("El nivel de experiencia actual de tu vehiculo es "+vida2.getNivelAuto());
                System.out.println("Los puntos de poder que posee tu vehiculo son "+vida2.getPuntosAuto());
                break;
            case 3:
                System.out.println("La vida actual de tu vehiculo es "+resultado[5]);
                System.out.println("El nivel de experiencia actual de tu vehiculo es "+vida3.getNivelAuto());
                System.out.println("Los puntos de poder que posee tu vehiculo son "+vida3.getPuntosAuto());
                break;
        }
        return primerAuto;
    }
    
    protected void restriccionAvion() throws IOException{                   //metodo que se encarga de que los aviones no puedan pasar sobre las cumbres
        System.out.println("Un vehiculo tipo avion no puede ir sobre cumbres");
        numCuadros[posicionMiaX][posicionMiaY] = ANSI_RED_BACKGROUND+"          |";
        mostrarEscenario();
        System.out.println("Presione enter para intentarlo de nuevo");
        System.in.read();
        movimientos();
    }
    
    protected void restriccionTanque() throws IOException{     //metodo que se encarga de verificar que los tanques no puedan pasar sobre agua
        System.out.println("Un vehiculo tipo tanque no puede caminar sobre el agua");
        numCuadros[posicionMiaX][posicionMiaY] = ANSI_BLUE_BACKGROUND+"          |";
        mostrarEscenario();
        System.out.println("Presione enter para intentarlo de nuevo");
        System.in.read();
        movimientos();
    }
    
    protected void restricciones() throws IOException{   //en este metodo se implementan las restricciones de avion y tanque  
        movimientos();
        switch(primerAuto){
            case 1:
                switch(tipoAuto[0]){
                    case 1:
                        while(numCuadros[posicionMiaX][posicionMiaY].equals(ANSI_BLUE_BACKGROUND+"          |")){ //mientras se quiera mover a un terreno prohibido se repetira la instruccion
                            restriccionTanque();                         
                        }break;
                    case 2:
                          while(numCuadros[posicionMiaX][posicionMiaY].equals(ANSI_RED_BACKGROUND+"          |")){
                            restriccionAvion();                          
                        }break;                    
                }break;
            case 2:
                switch(tipoAuto[1]){
                    case 1:
                          while(numCuadros[posicionMiaX][posicionMiaY].equals(ANSI_BLUE_BACKGROUND+"          |")){
                            restriccionTanque();                         
                        }break;
                    case 2:
                          while(numCuadros[posicionMiaX][posicionMiaY].equals(ANSI_RED_BACKGROUND+"          |")){
                            restriccionAvion();                          
                        }break;
                }        break;
            case 3:
                switch(tipoAuto[2]){
                    case 1: 
                          while(numCuadros[posicionMiaX][posicionMiaY].equals(ANSI_BLUE_BACKGROUND+"          |")){
                            restriccionTanque();                         
                        }break;
                    case 2:
                          while(numCuadros[posicionMiaX][posicionMiaY].equals(ANSI_RED_BACKGROUND+"          |")){
                            restriccionAvion();
                        }break;
                }break;                 
        }                   
    }
    
    protected void ataques(){  //metodo encargado de verificar si los enemigos aciertan un golpe a los aliados
         switch (primerAuto){
                case 1:
                    System.out.println("El enemigo a atacado a "+vida1.getVehiculo());
                    vidaAuto = vidaAuto - malo.getAtaqueEnemigo() + (malo.getAtaqueEnemigo() * vida1.getDefensaAuto());
                    resultado[3] = resultado[3] + vidaAuto;  //reduccion de vida dependiendo a que aliado se golpee
                    break;
                case 2:
                    System.out.println("El enemigo a atacado a "+vida2.getVehiculo());
                    vidaAuto = vidaAuto - malo.getAtaqueEnemigo() + (malo.getAtaqueEnemigo() * vida2.getDefensaAuto());
                    resultado[4] = resultado[4] + vidaAuto;
                    break;
                case 3:
                    System.out.println("El enemigo a atacado a "+vida3.getVehiculo());
                    vidaAuto = vidaAuto - malo.getAtaqueEnemigo() + (malo.getAtaqueEnemigo() * vida3.getDefensaAuto());
                    resultado[5] = resultado[5] + vidaAuto;
                    break;
            }
    }
         
    protected void cicloJuego() throws IOException{
        int a = 1;  //variable que se usara para rendicion
        mostrarEscenario();
        primerAuto();
        limpiarPantalla();  //cada metodo antes visto implementado para el ciclo de juego
        restricciones();
        posicionEnemigo();
        mostrarEscenario();
        vidaCumbr[disparoX][disparoY] = 0; 
        resultado[0] = malo.getVidaEnemigo();         resultado[1] = malo2.getVidaEnemigo();        resultado[2] = malo3.getVidaEnemigo();    //variables que se definen aca ya que se desea que al terminar el juego vuelvan a su forma original                 
        int cant=0; // contador de veces que se juegue
        do{ 
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("Es momento de jugar\n"
                    + "Se le presentara un menu de opciones despues de cada ronda de juega hasta que derrote a todos los enemigos o pierda"); //menu de juego, despues de ejecutar una accion se ira de inmediato a los ataques del enemigo
            System.out.println("1. Atacar");
            System.out.println("2. Cambiar de Vehiculo");
            System.out.println("3. Mover Vehiculo");
            System.out.println("4. Rendirse");
            decisionJugar = scanner.nextInt();
            limpiarPantalla();
            switch (decisionJugar){
                case 1:
                    ataque(); //se usa para detectar si se golpea a un enemigo
                    vidaCumbre(); //si no se golpea a un enemigo detectar si se golpea a una cumbre
                    resultado[0] = resultado[0] + disparo();
                    System.out.println("Le quedan "+resultado[0]+" puntos de vida a "+malo.getEnemigo()); //se empieza con el contador de vida de los enemigos dependiendo de a cual se golpee
                    if(resultado[0]<=0){ // si el contador llega a 0 o menos que eso se dan las instrucciones para que se quede en 0
                        resultado[0] = 0;
                        System.out.println("El enemigo 1 ha sido destruido en su totalidad");
                        System.out.println(resultado[0]);
                        switch (numCuadros[posEnemigoX[0]][posEnemigoY[0]]) {
                            case ANSI_GREEN_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[0]][posEnemigoY[0]] = ANSI_GREEN_BACKGROUND+"         |"; //si el enemigo a muerto borrarlo del mapa y rellenar con una casilla sin el puntero
                                mostrarEscenario();
                                break;
                            case ANSI_BLUE_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[0]][posEnemigoY[0]] = ANSI_BLUE_BACKGROUND+"         |";
                                mostrarEscenario();
                                break;
                            case ANSI_RED_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[0]][posEnemigoY[0]] = ANSI_RED_BACKGROUND+"          |";
                                mostrarEscenario();
                                break;
                            default:
                            break;
                        }     
                    }
                    resultado[1] = resultado[1] + disparo2();
                    System.out.println("Le quedan "+resultado[1]+" puntos de vida a "+malo2.getEnemigo()); //instrucciones por si el enemigo 2 se queda sin vida 
                    if(resultado[1]<=0){
                        resultado[1] = 0;
                        System.out.println("El enemigo 2 ha sido destruido en su totalidad");
                        System.out.println(resultado[1]);
                        switch (numCuadros[posEnemigoX[1]][posEnemigoY[1]]) {
                            case ANSI_GREEN_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[1]][posEnemigoY[1]] = ANSI_GREEN_BACKGROUND+"         |";
                                mostrarEscenario();
                                break;
                            case ANSI_BLUE_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[1]][posEnemigoY[1]] = ANSI_BLUE_BACKGROUND+"         |";
                                mostrarEscenario();
                                break;
                            case ANSI_RED_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[1]][posEnemigoY[1]] = ANSI_RED_BACKGROUND+"          |";
                                mostrarEscenario();
                                break;
                            default:
                            break;
                        }
                    }
                    resultado[2] = resultado[2] + disparo3();
                    System.out.println("Le quedan "+resultado[2]+" puntos de vida a "+malo3.getEnemigo()); //instrucciones por si el enemigo 3 se queda sin vida
                    if(resultado[2]<=0){
                        resultado[2] = 0;
                        System.out.println("El enemigo 3 ha sido destruido en su totalidad");
                        System.out.println(resultado[2]);
                        switch (numCuadros[posEnemigoX[2]][posEnemigoY[2]]) {
                            case ANSI_GREEN_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[2]][posEnemigoY[2]] = ANSI_GREEN_BACKGROUND+"         |";
                                mostrarEscenario();
                                break;
                            case ANSI_BLUE_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[2]][posEnemigoY[2]] = ANSI_BLUE_BACKGROUND+"         |";
                                mostrarEscenario();
                                break;
                            case ANSI_RED_BACKGROUND+enemigo+"          |":
                                numCuadros[posEnemigoX[2]][posEnemigoY[2]] = ANSI_RED_BACKGROUND+"          |";
                                mostrarEscenario();
                                break;
                            default:
                            break;
                        }
                    }
                    break;
                case 2:
                    primerAuto();   //si lo que se desea no es atacar esta la opcion cambiar de vehiculo en el mapa
                    restricciones();
                    break;
                case 3:
                    restricciones(); //opcion mover vehiculo a otra posicion
                    break; 
                case 4:
                    System.out.println("Desea rendirse?"); //por ultimo, opcion rendirse
                    System.out.println("0. Si    / 1.No");
                    a = scanner.nextInt();              
                
            }
            System.out.println("Presiona ENTER para continuar");
            System.in.read();
            limpiarPantalla();
            ataqueEnemigo();            //una vez hecha la eleccion del jugador se procede al turno del enemigo
            while(disparoEnemigoX[0]==posicionMiaX && disparoEnemigoY[0]==posicionMiaY || disparoEnemigoX[1]==posicionMiaX && disparoEnemigoY[1]==posicionMiaY || disparoEnemigoX[2]==posicionMiaX && disparoEnemigoY[2]==posicionMiaY){
               ataques(); //turnos aleatorios 
               break;            
            }
            System.out.println("Le quedan "+resultado[3]+" puntos de vida a "+nombre1); //instrucciones por si el enemigo dispara a alguno de los vehiuclos aliados 
            if(resultado[3]<=0){
                resultado[3]= 0;
                System.out.println(nombre1+"Ha sido totalmente destruido");
            }
            System.out.println("");
            System.out.println("Le quedan "+resultado[4]+" puntos de vida a "+nombre2);
            System.out.println("");
            if(resultado[4]<=0){
                resultado[4]= 0;
                System.out.println(nombre2+"Ha sido totalmente destruido"); //si el contador de vida llega a 0 o un numero menor darle instrucciones para que se quede permanentemente en 0 hasta el fin del juego
            }
            System.out.println("Le quedan "+resultado[5]+" puntos de vida a "+nombre3);
            System.out.println("");  
            if(resultado[5]<=0){
                resultado[5]= 0;
                System.out.println(nombre3+"Ha sido totalmente destruido");
            }
            if(resultado[0]<=0 && resultado[1]<=0 && resultado[2]<=0){  // se empiezan con las instrucciones por si se gana el juego
                System.out.println("Has ganado el juego!!");
                oroAleatorio = (int)(Math.random()*100)+1;
                oroTotal = oroTotal + oroAleatorio;
                xpAuto[0] = (int)(Math.random()*100)+2;     xpAuto[1] = (int)(Math.random()*100)+2;     xpAuto[2] = (int)(Math.random()*100)+2; //se otorga un numero de experiencia aleatoria         
                xpTotal[0] = xpTotal[0] + xpAuto[0];        xpTotal[1] = xpTotal[1] + xpAuto[1];        xpTotal[2] = xpTotal[2] + xpAuto[2];  //esa experiencia aleatoria se adhiere a otra variable y asi formar un contador
                System.out.println(nombre1+" lleva "+xpTotal[0]+" puntos de experiencia\n");
                System.out.println(nombre2+" lleva "+xpTotal[1]+" puntos de experiencia\n");
                System.out.println(nombre3+" lleva "+xpTotal[2]+" puntos de experiencia\n");
                System.out.println("En esta partida has logrado ganar "+oroAleatorio+" monedas de oro!!\n"); //se le otorga una cantidad aleatoria de oro
                System.out.println("El oro total que llevas acumulado es de "+oroTotal+" monedas de oro\n"); //se adhiere a un contador y asi se ira guardando partida tras partida
                if(xpTotal[0]>=(100*nivelTotal[0])){
                   nivelTotal[0] = nivelTotal[0]+1;
                   System.out.println("Tu vehiculo 1 ahora es nivel "+nivelTotal[0]); //si se aumenta de nivel se le sube niveles tanto de ataque como de defensa
                   armadura[0] = armadura[0] + 0.02;
                    System.out.println("Tu nuevo nivel de armadura es de "+armadura[0]);
                   ataque[0] = ataque[0] + 2;
                    System.out.println("Tu nuevo nivel de ataque es de "+ataque[0]);
                } else if (xpTotal[1]>=(100*nivelTotal[1])){
                   System.out.println("Tu vehiculo 2 ahora es nivel "+nivelTotal[1]);
                   armadura[1] = armadura[1] + 0.02;
                    System.out.println("Tu nuevo nivel de armadura es de "+armadura[1]);
                   ataque[1] = ataque[1] + 2;
                    System.out.println("Tu nuevo nivel de ataque es de "+ataque[1]);
                } else if (xpTotal[2]>=(100*nivelTotal[2])){
                   System.out.println("Tu vehiculo 3 ahora es nivel "+nivelTotal[2]);
                   armadura[2] = armadura[2] + 0.02;
                    System.out.println("Tu nuevo nivel de armadura es de "+armadura[2]);
                   ataque[2] = ataque[2] + 2;
                    System.out.println("Tu nuevo nivel de ataque es de "+ataque[2]);
                }
                break;              
            }            
            if(resultado[3]<=0 || resultado[4]<=0 || resultado[5]<=0){  //instrucciones por si ganan los enemigos
                System.out.println("Has perdido, te han destruido los enemigos\n");  //no se le otorga ninguna cantidad de oro
                System.out.println("Por haber perdido no ganas experiencia ni oro");
                 break;
            }
        } while(a==1);
        cant++;
    }

    public double[] getResultado() {
        return resultado;
    }
    
    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public int getOroTotal() {
        return oroTotal;
    }

    
    protected static void limpiarPantalla(){ //metodo para limpiar pantalla por si se necesita
        for(int espacio=1; espacio<=40; espacio++){
            System.out.println("");
        }
        
    }  
}
