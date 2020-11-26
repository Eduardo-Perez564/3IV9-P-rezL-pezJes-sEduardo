import java.util.Scanner;

public class Llamada{

    Scanner entrada = new Scanner(System.in);

    int numero_celular;
    int opc;
    int credito = 80;
    char repetir;
    
    public void menu(){

        System.out.println("Bienvenido, como eres un nuevo usuario te regalamos $80 de credito");
        
        System.out.println("Elige la accion a realizar");
        System.out.println();
        System.out.println("1. Realizar una llamada local.");
        System.out.println("2. Realizar una llamada internacional.");
        System.out.println("3. Realizar una llamada a un numero celular.");
        System.out.println("4. Consultar tu saldo.");
        
        opc = entrada.nextInt();

        Llamada obj = new Llamada();
        
        switch (opc) {
            case 1:

                System.out.println("Cada llamada local tiene un precio de $0.5");
                obj.llamalocal();

                break;
            
            case 2:

                System.out.println("Cada llamada internacional tiene un precio de $0.6");
                obj.llamainter();

                break;

            case 3:

                System.out.println("Cada llamada a un numero celular tiene un precio de $0.2");
                obj.llamacelular();

                break;
        
            default:

                System.out.println("Lo sentimos, no existe esa opcion. unu");

                break;
        }
    }

    public void llamalocal(){

        System.out.println("Ingresa el numero al que desees llamar");
        numero_celular = entrada.nextInt();

        do{
            credito -= 0.5;
            System.out.println("Listo");
            System.out.println("Si deseas realizar otra llamada, presiona R");
            repetir = entrada.next().charAt(0);

        }while(repetir == 'r' || repetir == 'R');
    }

    public void llamainter(){

        System.out.println("Ingresa el numero al que desees llamar");
        numero_celular = entrada.nextInt();

        do{
            credito -= 0.6;
            System.out.println("Listo");
            System.out.println("Si deseas realizar otra llamada, presiona R");
            repetir = entrada.next().charAt(0);

        }while(repetir == 'r' || repetir == 'R');
    }

    public void llamacelular(){

        System.out.println("Ingresa el numero al que desees llamar");
        numero_celular = entrada.nextInt();

        do{
            credito -= 0.2;
            System.out.println("Listo");
            System.out.println("Si deseas realizar otra llamada, presiona R");
            repetir = entrada.next().charAt(0);

        }while(repetir == 'r' || repetir == 'R');
    }

}