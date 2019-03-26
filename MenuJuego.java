package Juego;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author luisGonzalez
 */
public class MenuJuego {
    protected int eleccion, escenario;
    protected String mapas;
    protected static int decisionCura, decisionTienda, decisionBotiquin, decisionObjeto, opcionArmas, ataqueArma;
    protected static String arma;
    Scanner scanner = new Scanner(System.in);
    Vehiculo1 auto = new Vehiculo1();
    Vehiculo2 auto2 = new Vehiculo2();
    Vehiculo3 auto3 = new Vehiculo3();
    Escenario escenarioMain;            //objeto de la clase escenario para agarrar todos sus valores ya inicializados
    
     public MenuJuego(Escenario escenarioMain){
        this.escenarioMain = escenarioMain;          
    }
            
    protected void inicializar() throws IOException{
        escenarioMain.inicializarAutos();        
    }
    
    protected void menuJugar() throws IOException{ //menu principal del juego (usado en el main)
        System.out.println("Bienvenido al menu de Juego");
        System.out.println("Porfavor ingrese la opcion que desee");
        System.out.println("1. Jugar\n"
                + "2. Ver el estado actual de sus vehiculos\n"
                + "3. Ir a la tienda\n"
                + "4. Salir del juego\n");
        eleccion = scanner.nextInt();
        escenarioMain.limpiarPantalla();
    switch (eleccion){
        case 1:
            //clase Jugar
            
            jugar();
            
        case 2:
            //clase EstadoVehiculos
            referencias();
            break;
        case 3:
            //Tienda   
            tiendaJuego();        
    }
    }
    
    protected void jugar() throws IOException{
        
        ListadoMapas mapita = new ListadoMapas();
        do {
        System.out.println("Antes de empezar a jugar es necesario 1 escenario\n "       //eleccion de escenarios
                + "A tu disposicion tienes 3 escenarios principales pero si lo deseas puedes crear mas.\n"
                + "Elige a continuacion la opcion que desees.\n"
                + "1. Escenario 1\n"
                + "2. Escenario 2\n"
                + "3. Escenario 3\n"
                + "4. Crear un nuevo escenario\n"
                + "5. Mostrar mapas creados\n"
                + "6. Volver al menu principal\n");
        
        escenario = scanner.nextInt();
        escenarioMain.limpiarPantalla();
        switch(escenario){
            case 1:
                escenarioMain.escenario1();         //escenario 1 
                escenarioMain.cicloJuego();
                break;
            case 2:
                escenarioMain.escenario2();         //escenario 2
                escenarioMain.cicloJuego();
                break;
            case 3:
                escenarioMain.escenario3();         //escenario 3
                escenarioMain.cicloJuego();
                break;
            case 4:
                mapita.agregarValores(escenarioMain.creacionEscenario());   //escenarios infinitos
                escenarioMain.cicloJuego();
                break;
            case 5:
                mapita.mostrarMapas();
                break;
            case 6:
                menuJugar();            
        }
        } while(escenario!=6);      
    }
      
    protected void tiendaJuego() throws IOException{            //tienda oficial del juego
        System.out.println("Bienvenido a la tienda del juego\n "
                + "A continuacion vera los objetos que puede comprar\n"
                + "1. Botiquines\n"
                + "2. Objetos recuperadores\n"
                + "3. Armas para su vehiculo\n"
                + "4. Volver al menu principal\n"
                + "Ingrese cual de las opciones desea realizar");
        decisionTienda = scanner.nextInt();
        escenarioMain.limpiarPantalla();
        switch(decisionTienda){
            case 1:
                //metodo botiquines
                botiquines();         //opcion compra de botiquines
                break;           
            case 2:
                //metodo objetos recuperadores
                objetoRecuperador();    //opcion compra de objetos de recuperacion
                break;
            case 3:
                //metodo armas para el vehiculo
                armasAuto();        //armas del auto
                break;
            case 4:
                menuJugar();
        }
       
    }
    
     protected void botiquines() throws IOException {       //metodo para la compra de botiquines
        System.out.println("A elegido botiquines\n"
                + "Existen dos tipos de botiquines por favor eliga cual es el que desea comprar\n"
                + "1. Botiquin 1 (Cura 25 HP)\n"
                + "2. Botiquin 2 (Cura 50 HP)\n"
                + "3. Volver a la tienda");
        decisionCura = scanner.nextInt();
        escenarioMain.limpiarPantalla();
        switch(decisionCura){
            case 1:
                System.out.println("Eliga a cual de sus vehiculos aplicarle el botiquin:\n"     //se elige entre los vehiculos y se ve cual es el que se quiere usar
                        + "1. "+escenarioMain.getNombre1());
                System.out.println("Actualmente posee "+escenarioMain.getResultado()[3]+" puntos de vida         Costo: 50 monedas de oro");
                System.out.println("2. "+escenarioMain.getNombre2());
                System.out.println("Actualmente posee "+escenarioMain.getResultado()[4]+" puntos de vida         Costo: 50 monedas de oro");
                System.out.println("3. "+escenarioMain.getNombre3());
                System.out.println("Actualmente posee "+escenarioMain.getResultado()[5]+" puntos de vida         Costo: 50 monedas de oro");
                decisionBotiquin = scanner.nextInt();
                escenarioMain.limpiarPantalla();
                if(escenarioMain.getOroTotal()>=50){        //si el usuario llega a la cantidad de oro establecida puede comprar
                    switch(decisionBotiquin){
                        case 1:
                            if(escenarioMain.getResultado()[3]<=0){
                                System.out.println("El auto a sido totalmente destruido, solo un objeto recuperador podra devolverlo a la vida\n\n");                        
                            } else if(escenarioMain.getResultado()[3]<=75){
                                escenarioMain.getResultado()[3] = escenarioMain.getResultado()[3] + 25;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[3]+" puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } else {
                               escenarioMain.getResultado()[3] = 100;
                               System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[3]+"puntos de vida");
                               escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } botiquines(); 
                            break;
                        case 2:
                            if(escenarioMain.getResultado()[4]<=0){
                               System.out.println("El auto a sido totalmente destruido, solo un objeto recuperador podra devolverlo a la vida\n\n");                        
                            } else if (escenarioMain.getResultado()[4]<=75){
                                escenarioMain.getResultado()[4] = escenarioMain.getResultado()[4] + 25;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[4]+" puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } else {
                                escenarioMain.getResultado()[4] = 100;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[4]+"puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } botiquines();
                            break;
                        case 3:
                            if(escenarioMain.getResultado()[5]<=0){
                                System.out.println("El auto a sido totalmente destruido, solo un objeto recuperador podra devolverlo a la vida\n\n");                        
                            } else if (escenarioMain.getResultado()[5]<=75){
                                escenarioMain.getResultado()[5] = escenarioMain.getResultado()[5] + 25;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[5]+" puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } else {
                                escenarioMain.getResultado()[5] = 100;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[5]+"puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } botiquines(); 
                            break;     
                    }
                } System.out.println("No tienes dinero suficiente para comprar uno de estos articulos\n\n");
                botiquines();
                break;
            case 2:
                System.out.println("Eliga a cual de sus vehiculos aplicarle el botiquin:\n"         //compra de botiquines nivel 2 
                        + "1. "+escenarioMain.getNombre1());
                System.out.println("Actualmente posee "+escenarioMain.getResultado()[3]+" puntos de vida        Costo: 50 Monedas de oro");
                System.out.println("2. "+escenarioMain.getNombre2());
                System.out.println("Actualmente posee "+escenarioMain.getResultado()[4]+" puntos de vida        Costo: 50 Monedas de oro");
                System.out.println("3. "+escenarioMain.getNombre3());
                System.out.println("Actualmente posee "+escenarioMain.getResultado()[5]+" puntos de vida        Costo: 50 Monedas de oro");
                decisionBotiquin = scanner.nextInt();
                escenarioMain.limpiarPantalla();
                if(escenarioMain.oroTotal>=50){
                    switch(decisionBotiquin){
                        case 1:
                            if(escenarioMain.getResultado()[3]<=0){
                                System.out.println("El auto a sido totalmente destruido, solo un objeto recuperador podra devolverlo a la vida\n\n");   //si el auto a sido totalmente destruido tendra que comprar un objeto recuperador                    
                            } else if(escenarioMain.getResultado()[3]<=50){
                                escenarioMain.getResultado()[3] = escenarioMain.getResultado()[3] + 50;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[3]+" puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } else {
                                escenarioMain.getResultado()[3] = 100;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[3]+"puntos de vida"); //curacion del vehiculo
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } botiquines();
                            break;
                        case 2:
                            if(escenarioMain.getResultado()[4]<=0){
                                System.out.println("El auto a sido totalmente destruido, solo un objeto recuperador podra devolverlo a la vida\n\n");                        
                            } else if (escenarioMain.getResultado()[4]<=55){
                                escenarioMain.getResultado()[4] = escenarioMain.getResultado()[4] + 50;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[4]+" puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } else {
                                escenarioMain.getResultado()[4] = 100;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[4]+"puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } botiquines();
                            break;
                        case 3:
                            if(escenarioMain.getResultado()[5]<=0){
                                System.out.println("El auto a sido totalmente destruido, solo un objeto recuperador podra devolverlo a la vida\n\n");                        
                            } else if (escenarioMain.getResultado()[5]<=50){
                                escenarioMain.getResultado()[5] = escenarioMain.getResultado()[5] + 50;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[5]+" puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } else {
                                escenarioMain.getResultado()[5] = 100;
                                System.out.println("Su vida a sido restaurada a "+escenarioMain.getResultado()[5]+"puntos de vida");
                                escenarioMain.oroTotal = escenarioMain.oroTotal - 50;
                            } botiquines();
                            break;
                    }      
                } System.out.println("No tienes suficiente dinero para comprar uno de estos articulos\n\n");
                botiquines();
                break;
            case 3:
                tiendaJuego();
        }               
    }
    

    protected void objetoRecuperador() throws IOException{ //compra de los objetos de recuperacion
        System.out.println("Ha elegido OBJETOS RECUPERADORES\n"
                + "Cada uno de estos recupera al vehiculo en su totalidad\n"
                + "Eliga a cual de sus vehiculos aplicarle el objeto recuperador");
        System.out.println("1. "+escenarioMain.getNombre1()+"            Costo: 100 Monedas de oro");
        System.out.println("2. "+escenarioMain.getNombre2()+"            Costo: 100 Monedas de oro");
        System.out.println("3. "+escenarioMain.getNombre3()+"            Costo: 100 Monedas de oro");
        System.out.println("4. Volver al menu");
        decisionObjeto = scanner.nextInt();
        escenarioMain.limpiarPantalla();
        if(escenarioMain.oroTotal>=100){        //si se llega al dinero el menu se podra abrir de lo contrario permanecera cerrado
            switch(decisionObjeto){
                case 1:
                    if(escenarioMain.getResultado()[3]<=0){
                        escenarioMain.getResultado()[3] = 0;
                        escenarioMain.getResultado()[3] = escenarioMain.getResultado()[3] + 50;
                        System.out.println("Su vehiculo a sido restaurado con exito");
                        System.out.println("Ahora tiene "+escenarioMain.getResultado()[3]+" puntos de vida");
                        escenarioMain.oroTotal = escenarioMain.oroTotal - 100;
                    } else {
                        System.out.println("Los objetos de recuperacion solo pueden usarse si tu vehiculo a sido totalmente destruido\n\n");
                    }
                    objetoRecuperador();            //si el vehiculo no esta totalmente destruido no se podra comprar
                    break;
                case 2:
                    if(escenarioMain.getResultado()[4]<=0){
                        escenarioMain.getResultado()[4] = 0;
                        escenarioMain.getResultado()[4] = escenarioMain.getResultado()[4] + 50;
                        System.out.println("Su vehiculo a sido restaurado con exito");
                        System.out.println("Ahora tiene "+escenarioMain.getResultado()[4]+" puntos de vida");
                        escenarioMain.oroTotal = escenarioMain.oroTotal - 100;
                    } else {
                        System.out.println("Los objetos de recuperacion solo pueden usarse si tu vehiculo a sido totalmente destruido\n\n");
                    }
                    objetoRecuperador();
                    break;
                case 3:
                    if(escenarioMain.getResultado()[5]<=0){
                        escenarioMain.getResultado()[5] = 0;
                        escenarioMain.getResultado()[5] = escenarioMain.getResultado()[5] + 50;
                        System.out.println("Su vehiculo a sido restaurado con exito");
                        System.out.println("Ahora tiene "+escenarioMain.getResultado()[5]+" puntos de vida");
                        escenarioMain.oroTotal = escenarioMain.oroTotal - 100;
                    } else {
                        System.out.println("Los objetos de recuperacion solo pueden usarse si tu vehiculo a sido totalmente destruido\n\n");
                    }
                    objetoRecuperador(); //regreso al menu de objeto de recuperacion
                    break;
                case 4:
                    tiendaJuego();      //regreso al menu de la tienda           
            }
        } System.out.println("No tiene suficiente dinero para efectuar estas compras\n\n");
        tiendaJuego();
    }
    
    protected void armasAuto() throws IOException{  //menu de las armas infinitas 
        ListadoArmas miLista = new ListadoArmas();
        do{
            try{
                System.out.println("Bienvenido al sistema de creacion de armas\n"
                        + "Porfavor eliga una de las opciones presentes");
                System.out.println("1. Creacion de una nueva arma");
                System.out.println("2. Ver el listado de armas creadas");
                System.out.println("3. Salir del menu de armas");
                opcionArmas = scanner.nextInt();
                switch(opcionArmas){
                    case 1:
                        System.out.println("Ingrese el nombre que desea darle a su nueva arma"); //nombre con el quiere identificar a su nueva arma
                        arma = scanner.next();
                        System.out.println("Ingrese el ataque que desea para su nueva arma"); //cuanto ataque desea asignarle
                        ataqueArma = scanner.nextInt();
                        miLista.agregarValores(arma, ataqueArma); //invocaion a la clase arma para ir creando una tras otra
                        System.out.println(arma);
                        System.out.println(ataqueArma); 
                        break;
                    case 2:
                        miLista.mostrarArmas();
                        break;
                    case 3:
                        tiendaJuego();
                        break;  
                }
                
            } catch(NumberFormatException e){
                System.out.println("Porfavor ingrese un entero "+e.getMessage());
            }
        }  while(opcionArmas!=3);    
    }

    protected void referencias() throws IOException{        //metodo encargado de llevar las estadisticas de los vehiculos
        System.out.println("CANTIDAD DE ORO ACUMULADA                             "+escenarioMain.oroTotal); //oro acumulado
        System.out.println("\n\n");
        System.out.println("Datos actualizados de los vehiculos\n\n"
                + "Vehiculo 1");
        System.out.println("Nombre: "+escenarioMain.nombre1);
        System.out.println(escenarioMain.puntero);
        System.out.println("Experiencia acumulada: "+escenarioMain.xpTotal[0]);    //experiencia total
        System.out.println("Nivel total: "+escenarioMain.nivelTotal[0]);            //nivel total del auto
        System.out.println("Vida actual: "+escenarioMain.resultado[3]);             //vida actual
        System.out.println("Nivel de armadura actual: "+escenarioMain.armadura[0]); //defensa actual
        System.out.println("Nivel de daño actual: "+escenarioMain.ataque[0]);       //ataque que posee
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("Vehiculo 2");
        System.out.println(escenarioMain.puntero2);
        System.out.println("Nombre: "+escenarioMain.nombre2);
        System.out.println("Experiencia acumulada: "+escenarioMain.xpTotal[1]);
        System.out.println("Nivel total: "+escenarioMain.nivelTotal[1]);
        System.out.println("Vida actual: "+escenarioMain.resultado[4]);
        System.out.println("Nivel de armadura actual: "+escenarioMain.armadura[1]);
        System.out.println("Nivel de daño actual: "+escenarioMain.ataque[1]);
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("Vehiculo 3");                                              //dependiendo del vehiculo se muestran diferentes estadistica
        System.out.println(escenarioMain.puntero3);
        System.out.println("Nombre: "+escenarioMain.nombre1);
        System.out.println("Experiencia acumulada: "+escenarioMain.xpTotal[2]);
        System.out.println("Nivel total: "+escenarioMain.nivelTotal[2]);
        System.out.println("Vida actual: "+escenarioMain.resultado[5]);
        System.out.println("Nivel de armadura actual: "+escenarioMain.armadura[2]);
        System.out.println("Nivel de daño actual: "+escenarioMain.ataque[2]);
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Volver al menu principal");
        int menu = scanner.nextInt();
        switch(menu){
            case 1:
                menuJugar();
        }
        
        
    }
}
