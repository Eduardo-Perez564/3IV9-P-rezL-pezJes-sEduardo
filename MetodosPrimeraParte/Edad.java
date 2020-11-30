import java.util.Scanner;

public class Edad{
    
    Scanner entrada = new Scanner(System.in);
    
    int ano, mes, ano2, mes2, resultado, resultado2;
    char exit;

    public void llamarEdad() {
        edadPersona();
        calEdad();
        mostrarEdad();
    }
    
    public void edadPersona(){
        
        do{

            System.out.println("Inserte el año de nacimiento.");
            ano = entrada.nextInt();

            while(ano<=0){
                System.out.println("Ingrese un año positivo. Gracias.");
                ano = entrada.nextInt();
            }
            System.out.println("Inserte el mes de nacimiento. (En numeros).");
            mes = entrada.nextInt();
            
            while(mes>12 || mes<0){
                System.out.println("Ingrese un valor aceptado. Gracias.");
                mes = entrada.nextInt();
            }
            System.out.println("Inserte el año en que se encuentra.");
            ano2 = entrada.nextInt();
            
            while(ano2<=0 || ano2<ano){
                System.out.println("Ingrese un valor aceptado. Gracias.");
                ano2 = entrada.nextInt();
            }
            System.out.println("Inserte el mes en el que se encuentra. (En numeros).");
            mes2 = entrada.nextInt();
            
            while(mes2>12 || mes2<0){
                System.out.println("Ingrese un valor aceptado. Gracias.");
                mes2 = entrada.nextInt();
            }

            System.out.println("Si desea repetir el programa, oprima 'R");
            exit = entrada.next().charAt(0);
        }while(exit == 'r' || exit == 'R');
    }

        
        

    public void calEdad() {
        resultado = ano2-ano;
        resultado2 = mes2-mes;
        if(resultado2<0){
            resultado = resultado-1;
            resultado2 = resultado2+12;
            resultado2 *= 1;
        }        
    }

    public void mostrarEdad() {
        System.out.println("Su edad es de: "+resultado+" años y "+resultado2+" meses.");
    }
}
