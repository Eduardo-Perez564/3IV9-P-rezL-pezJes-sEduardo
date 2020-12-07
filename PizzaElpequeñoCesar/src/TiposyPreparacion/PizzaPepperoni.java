
package TiposyPreparacion;

import java.util.Scanner;


/**
 *
 * @author jp999
 */
public class PizzaPepperoni extends ElaboracionPizza {
    
    

    public PizzaPepperoni(String masa, String[] Salsa, String[] ingredientes) {
        super(masa, Salsa, ingredientes);
        //opciones
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas y Parmesano";
        this.ingredientes[2] = "Rodajas y Albahaca";
        this.ingredientes[3] = "Doble pepperoni en Rodajas";
    }

    public PizzaPepperoni() {
        
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
    
    //aqui se define el precio segun el tamaño de la pizza
    public void rebanadaPago(){
        
        int selec, costo = 0;
        int Pagof;
        
        Scanner corte = new Scanner(System.in);
        
        do{
            System.out.println("Selecciona el tamaño de tu pizza");
            System.out.println("1. Chica");
            System.out.println("2. Mediana");
            System.out.println("3. Grande");
            System.out.println("4. Familiar");
            selec = corte.nextInt();

            switch (selec){
                //si la pizza es chica
                case 1:
                    System.out.println("Tu pizza se parte en 4");
                     costo= 96;
                    break;
                //si la pizza es mediana
                case 2:
                    System.out.println("Tu pizza se parte en 8");
                    costo = 119;
                    break;
                //si la pizza es grande
                case 3:
                    System.out.println("Tu pizza se parte en 12");
                    costo = 131;
                    break;
                //si la pizza es familiar
                case 4:
                    System.out.println("Tu pizza se parte en 16");
                    costo = 167;
                    break;
            }
        }while(selec>=5 || selec<=0);
        
        System.out.println("El precio de esta pizza es: $"+costo);        
        
    }

}
