import java.util.Scanner;
import java.util.Date;


public class Ejercicios{

    Scanner entrada = new Scanner(System.in);

    char opc, re;

    public void menu(){

        
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
                    
                    Ejercicios obj = new Ejercicios();
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
            re = entrada.next().charAt(0);

        }while(re == 'r' || re == 'R');
        
    }

    public void perdir_datos(){
        
        Scanner entrada = new Scanner(System.in);
        
        Date Fecha = new Date();

        String name;
        int dia, mes, anio;

        System.out.println(Fecha);
        System.out.println("Ingresa tu nombre");
        name = entrada.nextLine();

        System.out.println("Ingresa tu fecha de nacimiento con el siguiente formato: dd/mm/aaaa");
        System.out.println("Algo así: 06/05/2004");
        System.out.println("Primero el día");
        dia = entrada.nextInt();
        System.out.println("Ahora el mes");
        mes = entrada.nextInt();
        System.out.println("Y por ultimo el año");
        anio = entrada.nextInt();

    }

    
}