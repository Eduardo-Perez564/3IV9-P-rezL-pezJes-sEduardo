import java.util.scanner;

public class Programas{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        char opc, exit;
        
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

                    break;
                /*case 'B':
                case 'b':
                
                    break;
                case 'C':
                case 'c':
                
                    break;
                case 'D':
                case 'd':
                
                    break; */
                default:
                    break;

            }

        }while();
        
        public void Promedio(){

            int promedio [] = new int [3];
            int num;
            float promediop, promedion;
            
            System.out.println("En este programa lo que puedes hacer es insertar 10 numeros, ya sean positivos o negativos");
            System.out.println("y se te devolvera el promedio de los números positivos y el promedio de los valores negativos.");

            for (int i; i<promedio.length; i++){

                System.out.println("Introduce el número");
                promedio [i] = entrada.nextInt();
            }

            
        }           

    }

}