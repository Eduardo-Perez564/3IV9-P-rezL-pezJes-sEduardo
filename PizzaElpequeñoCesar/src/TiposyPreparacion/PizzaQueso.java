package TiposyPreparacion;

import java.util.Scanner;

/**
 *
 * @author jp999
 */
public class PizzaQueso extends ElaboracionPizza{

    public PizzaQueso() {
    }

    public PizzaQueso(String masa, String[] Salsa, String[] ingredientes) {
        super(masa, Salsa, ingredientes);
        //tipo de queso
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mozzarela";
    
    }
    
    
    public String ElegirQueso(){
        
        Scanner que = new Scanner(System.in);
        
        String Queso;
        System.out.println("Elige el tipo de queso para tu pizza");
        System.out.println("1. Parmesano");
        System.out.println("2. Mozzarela");
        Queso = que.next();
        
        return Queso;
        
    }
    
}
