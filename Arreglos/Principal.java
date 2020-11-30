import java.util.Scanner;

public class Principal{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        char opc, exit;

        Arreglitos inv = new Arreglitos();
        
        do{
            System.out.println("Bienvenido");
            System.out.println();
            System.out.println("Que programa deseas ejecutar?");
            System.out.println();
            System.out.println("A. Promedio de 10 numeros.");
            System.out.println("B. Numeros enteros.");
            System.out.println("C. Calificaciones.");
            System.out.println("D. Matrices.");

            opc = entrada.next().charAt(0);

            switch(opc){
                case 'A':
                case 'a':
                    inv.Promedio10num();
                    break;
                case 'B':
                case 'b':
                    inv.Promediopar();
                    break;
                case 'C':
                case 'c':
                    inv.Calificaciones();
                    break;
                case 'D':
                case 'd':
                    inv.SumadeMatrices();
                    break;
                default:
                    break;

            }

            System.out.println("Si deseas repetir el menú, oprime R");
            exit = entrada.next().charAt(0);

        }while(exit == 'r' || exit == 'R');       

    }

}