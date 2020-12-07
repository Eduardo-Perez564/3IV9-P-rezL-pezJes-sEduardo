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
    
    
    public void ElegirQueso(){
        
        Scanner que = new Scanner(System.in);
        int Queso;
        
        do{
        System.out.println("Elige el tipo de queso para tu pizza");
        System.out.println("1. Parmesano");
        System.out.println("2. Mozzarela");
        Queso = que.nextInt();    
        }while(Queso <= 0 || Queso >= 3);
        
        switch (Queso) {
            case 1:
                rebanadaPago1();
                break;
            case 2:
                rebanadaPago2();
                break;
        }
        
    }
    
    public void rebanadaPago1(){
        
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
                     costo= 89;
                    break;
                //si la pizza es mediana
                case 2:
                    System.out.println("Tu pizza se parte en 8");
                    costo = 115;
                    break;
                //si la pizza es grande
                case 3:
                    System.out.println("Tu pizza se parte en 12");
                    costo = 135;
                    break;
                //si la pizza es familiar
                case 4:
                    System.out.println("Tu pizza se parte en 16");
                    costo = 175;
                    break;
            }
        }while(selec>=5 || selec<=0);
        
        System.out.println("El precio de esta pizza es: $"+costo);        

    }
    
    public void rebanadaPago2(){
        
        int selec, costo = 0;
        
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
                     costo= 75;
                    break;
                //si la pizza es mediana
                case 2:
                    System.out.println("Tu pizza se parte en 8");
                    costo = 89;
                    break;
                //si la pizza es grande
                case 3:
                    System.out.println("Tu pizza se parte en 12");
                    costo = 112;
                    break;
                //si la pizza es familiar
                case 4:
                    System.out.println("Tu pizza se parte en 16");
                    costo = 135;
                    break;
            }
        }while(selec>=5 || selec<=0);
        
        System.out.println("El precio de esta pizza es: $"+costo);        
        
    }
}
