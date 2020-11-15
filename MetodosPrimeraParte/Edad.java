import java.util.Scanner;


public class Edad{

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
                    
                    Edad obj = new Edad();
                    obj.perdir_datos();
                    Edad obj1 = new Edad();
                    obj1.calcular_edad();

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
        
        int mes, anio;

        System.out.println("En que mes naciste (introducelo como numero, por favor)?");
        mes = entrada.nextInt();
        System.out.println("En que anio naciste (introducelo como numero, por favor)?");
        anio = entrada.nextInt();

    }

    public void calcular_edad(int mes, int anio){

        int mm, aa;

        mm = 12-mes;

        aa = 2020-anio;

        System.out.println("Tu edad es de"+aa+"anios y "+mm+"meses");

    }
    
}