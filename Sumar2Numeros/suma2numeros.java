import java.util.Scanner;

class suma2numeros{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num1;
        int resultado = 0;

        do{

            System.out.println("Ingresa el numero a sumar: ");
            num1 = entrada.nextInt();

            if(num1 > 0) {
                resultado = resultado +num1;
            }else{
                System.out.println("Escribe el nuevo numero, ya que solo se aceptan positivos");
            }
            
        }
            while(num1!=0);

        System.out.println("La suma de los numeros es : "+resultado);

    }
    
}