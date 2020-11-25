import java.util.Scanner;

public class AyP{

    Scanner entrada = new Scanner(System.in);

    public void menu(){

        int lados, opc;

        System.out.println("Que quieres calcular?");
        System.out.println();
        System.out.println("1. Area y Perimetro de un circulo");
        System.out.println("2. Area y Perimetro de un rectangulo");
        System.out.println("3. Area y Perimetro de un cuadrado");
        System.out.println("4. Area y Perimetro de un triangulo");

        opc = entrada.nextInt();

        switch (opc) {
            case 1:
                AyP obj = new AyP();
                obj.circulo();
                break;
        
            default:

                System.out.println("Lo siento no existe tal opción O.o");
                break;
        }

    }

    public void circulo(){

        double radio;
        double cir, area;

        System.out.println("Ingresa el tamaño del radio");
        radio = entrada.nextFloat();

        cir = calcularcir(radio);
        area = calcular_area(radio);

        System.out.println("La circunferencia de tu circulo es "+cir+" y el area es"+area);

    }

    public double calcularcir(double radio){

        double cir;
        cir = 3.1416*(2*radio);

        return cir;

    }

    public double calcular_area(double radio){

        double area;
        area = 3.1416*(radio*radio);

        return area;

    }

}