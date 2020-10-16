import java.util.Scanner;

class ObtenerDatos1{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        float beca;

        System.out.println("Dime tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Tu beca es de ¿que monto?: ");
        beca = entrada.nextFloat();

        System.out.println("Tu nombre es" +nombre);
        System.out.println("Tu edad es" +edad);
        System.out.println("Tu beca es de" +beca);



    }

}