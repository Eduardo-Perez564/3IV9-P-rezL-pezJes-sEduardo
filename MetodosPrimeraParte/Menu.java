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
                    System.out.println("Holi uwu");
                    
                    Edad obj = new Edad();
                    obj.llamarEdad();

                break;
                case 'B':
                case 'b':
                    System.out.println("Holi uwu");

                    AyP obj1 = new AyP();
                    obj1.menu();

                break;
                case 'C':
                case 'c':
                    System.out.println("Holi uwu");

                    Llamada obj2 = new Llamada();
                    obj2.menullama();

                break;
                default:
                    System.out.println("OnO Esa opción no existe");
                break;
    
            }
            
            System.out.println("Si deseas repetir el menu, oprime r");
            exit = entrada.next().charAt(0);

        }while(exit == 'r' || exit == 'R');
    }
}