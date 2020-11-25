import java.util.Scanner;

public class AyP{

    Scanner entrada = new Scanner(System.in);

    public void menu(){

        int lados, opc;
        char exit;

        do{
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

                case 2:
                    AyP obj2 = new AyP();
                    obj2.rectangulo();
                break;

                case 3:
                    AyP obj3 = new AyP();
                    obj3.cuadrado();
                break;

                case 4:
                    AyP obj4 = new AyP();
                    obj4.triangulo();
                break;
            
                default:
                    System.out.println("Lo siento no existe tal opcion O.o");
                break;
            }
                System.out.println("Si deseas repetir el menu de figuras, oprime R");
                exit = entrada.next().charAt(0);

        }while(exit == 'R' || exit == 'r');

    }

    public void circulo(){

        double radio;
        double cir, area;

        System.out.println("Ingresa el tamaño del radio");
        radio = entrada.nextFloat();

        cir = calcularcir(radio);
        area = calcular_area(radio);

        System.out.println("La circunferencia de tu circulo es "+cir+" y el area es "+area);

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

    public void rectangulo(){

        double base, altura;
        double perrec, arearec;

        System.out.println("Ingresa el tamanio de la base");
        base = entrada.nextDouble();
        System.out.println("Ingresa el tamanio de la altura");
        altura = entrada.nextDouble();

        perrec = calcular_perrec(base, altura);
        arearec = calcular_arearec(base, altura);

        System.out.println("El perimetro de tu rectangulo es "+perrec+" y el area es" +arearec);

    }

    public double calcular_perrec(double base, double altura){

        double perrec;
        perrec = (2*base)+(2*altura);

        return perrec;

    }

    public double calcular_arearec(double base, double altura){

        double arearec;
        arearec = base*altura;

        return arearec;

    }


    public void cuadrado(){

        double l1;
        double percuad, areacuad;

        System.out.println("Ingresa el tamanio del lado");
        l1 = entrada.nextDouble();

        percuad = calcular_percuad(l1);
        areacuad = calcular_areacuad(l1);

        System.out.println("El perimetro de tu cuadrado es "+percuad+" y el area es "+areacuad);

    }

    public double calcular_percuad(double l1){

        double percuad;
        percuad = l1*4;

        return percuad;

    }

    public double calcular_areacuad(double l1){

        double areacuad;
        areacuad = l1*l1;

        return areacuad;

    }
    
    public void triangulo(){

        double basetri, alturatri;
        double pertri, areatri;

        System.out.println("Ingresa el tamanio de la base");
        basetri = entrada.nextDouble();
        System.out.println("Ingresa el tamanio de la altura");
        alturatri = entrada.nextDouble();

        pertri = calcular_pertri(basetri);
        areatri = calcular_areatri(basetri, alturatri);

        System.out.println("El perimetro de tu triangulo es "+pertri+" y el area es "+areatri);

    }

    public double calcular_pertri(double basetri){

        double pertri;
        pertri = basetri*3;

        return pertri;

    }

    public double calcular_areatri(double basetri, double alturatri){

        double areatri;
        areatri = (basetri*alturatri)/2;

        return areatri;

    }

}