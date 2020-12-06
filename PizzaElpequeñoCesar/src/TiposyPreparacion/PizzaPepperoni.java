/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposyPreparacion;

import java.util.Scanner;

/**
 *
 * @author jp999
 */
public class PizzaPepperoni extends ElaboracionPizza {

    public PizzaPepperoni() {
    }

    public PizzaPepperoni(String masa, String[] Salsa, String[] ingredientes) {
        super(masa, Salsa, ingredientes);
        //opciones
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas y Parmesano";
        this.ingredientes[2] = "Rodajas y Albahaca";
        this.ingredientes[3] = "Doble pepperoni en Rodajas";
    }
    
    public String SeleccionarPeppe(){
        
        Scanner peppe = new Scanner(System.in);
        String Pepperoni;
        
        System.out.println("Elige como quieres el Pepperoni para tu pizza");
        System.out.println("");
        System.out.println("1. En rodajas");
        System.out.println("2. En rodajas y queso parmesano");
        System.out.println("3. En rodajas y con albahaca");
        System.out.println("4. Con doble pepperoni en Rodajas");
        Pepperoni = peppe.next();
        
        return Pepperoni;
        
    }
    
}
