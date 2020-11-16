import java.util.Scanner;

public class Edad{
    
    public void perdir_datos(){
    
        Scanner entrada = new Scanner(System.in);

        int mes, anio;
        int aa, mm;

        System.out.println("En que mes naciste?(introducelo como numero, por favor)");
        mes = entrada.nextInt();
        System.out.println("En que anio naciste? (introducelo como numero, por favor)");
        anio = entrada.nextInt();

        aa = calcular_edada(anio);

        mm = calcular_edada(mes);

        System.out.println("Tu edad es de" +aa+ "anios y "+mm+"meses");

    }

    public int calcular_edada(int anio){

        int aa;
        aa = 2020-anio;

        return aa;
    }
    public int calcular_edadm(int mes){

        int mm;
        mm = 12-mes;
        
        return mm;
    }
}