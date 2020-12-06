package TiposyPreparacion;

import java.util.Scanner;

/**
 *
 * @author jp999
 */
public class PizzaVegetariana extends ElaboracionPizza {

    public PizzaVegetariana() {
    }

    public PizzaVegetariana(String masa, String[] Salsa, String[] ingredientes) {
        super(masa, Salsa, ingredientes);
        
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";
        
    }
    
    public String TipoVege(){
        
        Scanner vege = new Scanner(System.in);
        String Vegetal;
        System.out.println("Elige la verdura para tu pizza");
        System.out.println("1. Champiñones");
        System.out.println("2. Piña");
        System.out.println("3. Pimiento");
        System.out.println("4. Elote");
        Vegetal = vege.next();
        
        return Vegetal;
    }
    
}
