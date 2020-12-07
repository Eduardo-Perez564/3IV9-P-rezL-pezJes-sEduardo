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
    public void rebanadaPago3(){
        
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
                     costo= 88;
                    break;
                //si la pizza es mediana
                case 2:
                    System.out.println("Tu pizza se parte en 8");
                    costo = 97;
                    break;
                //si la pizza es grande
                case 3:
                    System.out.println("Tu pizza se parte en 12");
                    costo = 111;
                    break;
                //si la pizza es familiar
                case 4:
                    System.out.println("Tu pizza se parte en 16");
                    costo = 157;
                    break;
            }
        }while(selec>=5 || selec<=0);
        
        System.out.println("El precio de esta pizza es: $"+costo);
    }
}
