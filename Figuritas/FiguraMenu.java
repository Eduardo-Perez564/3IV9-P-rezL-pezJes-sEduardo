import java.util.Scanner;
/*1.- Quiero que el menu se repita hasta que yo escriba S o s de salir
        2.- completar el calculo para el perimetro
        3.- Comprobar que todos los numeros sean reales positivos
        4.- Vamos a agregar 3 figuras mas *w*
            Rectangulo, Rombo, Hexagono wiiiiii
        */
class FiguraMenu{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int altura, base;
        double area, perimetro, l1, l2;


        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones: ");
        System.out.println("1. Calcular area y perimetro de un cuadrado.");
        System.out.println("2. Calcular area y perimetro de un triangulo.");
        System.out.println("3. Calcular area y perimetro de un circulo.");
        System.out.println("4. Calcular area y perimetro de un rectangulo.");
        System.out.println("5. Calcular area y perimetro de un rombo.");
        System.out.println("6. Calcular area y perimetro de un hexagono.");
        System.out.println("7. Salir");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                
                System.out.println("Recuerda que solo aceptamos valores Reales Positivos");
                do{
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextInt();
                }while (base <=0);
                area = base*base;
                perimetro = base*4;
                System.out.println("El area de tu cuadrado es "+area+" y el perimetro "+perimetro+".");
                break;
            case 2:
                System.out.println("Recuerda que solo aceptamos valores Reales Positivos");
                do{
                    System.out.println("Ingresa el valor de la base");
                    base = entrada.nextInt();
                } while(base<=0);
                do{
                    System.out.println("Ingresa el valor del primer lado");
                    l1 = entrada.nextInt();
                } while(l1<=0);
                do{
                    System.out.println("Ingresa el valor del segundo lado");
                    l2 = entrada.nextInt();
                } while(l2<=0);
                do{
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextInt();
                } while(altura<=0);
                    area = (base*altura)/2;
                    perimetro = (base+l1+l2);
                System.out.println("El area de tu cuadrado es "+area+" y el perimetro "+perimetro+".");
                break;
            default:
                System.out.println( "Lo sentimos, no existe esa opcion. :D");

        }

        
    }


}