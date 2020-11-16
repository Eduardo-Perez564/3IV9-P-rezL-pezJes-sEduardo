import java.util.Scanner;

public class Menu{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        char exit, opc;

        do{ 

            System.out.println("Bienvenido UWU");
            System.out.println("Que programa deseas ejecutar?");
            System.out.println("A. Calcular la Edad ");
            System.out.println("B. Areas y perimetros");
            System.out.println("C. Costo de Llamadas telefonicas");

            opc = entrada.next().charAt(0);

            switch (opc) {

                case 'A':
                case 'a':
                    System.out.println("Holi UwU");
                    
                    Edad obj = new Edad();
                    obj.perdir_datos();

                break;
                case 'B':
                case 'b':
                    System.out.println("Holi UwU");
                break;
                case 'C':
                case 'c':
                    System.out.println("Holi UwU");
                break;
                default:
                    System.out.println("OnO Esa opción no existe");
                break;
    
            }
            
            System.out.println("Si deseas repetir el programa, oprime r");
            exit = entrada.next().charAt(0);

        }while(exit == 'r' || exit == 'R');
        
        
    }

}