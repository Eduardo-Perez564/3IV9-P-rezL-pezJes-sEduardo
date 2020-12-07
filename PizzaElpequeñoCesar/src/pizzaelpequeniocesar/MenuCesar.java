package pizzaelpequeniocesar;
/**
 *
 * @author jp999
 */


import TiposyPreparacion.*;
import java.util.Scanner;

public class MenuCesar {
    
    Scanner pedido = new Scanner(System.in);
    int opc;
    
   ElaboracionPizza piza = null;
    
    public void MenuOperaciones(){
        
        do{
            System.out.println("Holi, bienvenido a la Pizzeria de Cesar el pequeñin");
            System.out.println("");
            System.out.println("¿Qué ordenará?");
            System.out.println("1. Pizza de Queso");
            System.out.println("2. Pizza de Pepperoni");
            System.out.println("3. Pizza Vegetariana");
            System.out.println("4. Dejar de pedir");

            opc = pedido.nextInt();

            switch (opc) {
                
                case 1:
                    
                    piza = new PizzaQueso();
                    PizzaQueso quesito = new PizzaQueso();
                    //Preguntamos el tipo de queso
                    quesito.ElegirQueso();
                    //llamamos a los métodos para su preparación
                    piza.Hornear();
                    piza.empacar();
                    
                    break;
                case 2:
                    
                    piza = new PizzaPepperoni();
                    PizzaPepperoni pepe = new PizzaPepperoni();
                    //preguntamos como quiere el pepperoni
                    pepe.SeleccionarPeppe();
                    pepe.rebanadaPago();
                    //llamamos a los métodos para su preparación
                    piza.Hornear();
                    piza.empacar();
                    
                    break;
                case 3:
                    
                    piza = new PizzaVegetariana();
                    PizzaVegetariana vege = new PizzaVegetariana();
                    //Preguntamos el vegetal para su pizza
                    vege.TipoVege();
                    vege.rebanadaPago3();
                    //llamamos a los métodos para su elaboración
                    piza.Hornear();
                    piza.empacar();
                    break;
            }
        }while(opc != 4);
        
    }
    
}
