import java.util.Scanner;

public class Edad{
    
    public void perdir_datos(){
    
        Scanner entrada = new Scanner(System.in);

        int mes, anio;
        int edada, edadm;

        System.out.println("En que mes naciste (introducelo como numero, por favor)?");
        mes = entrada.nextInt();
        System.out.println("En que anio naciste (introducelo como numero, por favor)?");
        anio = entrada.nextInt();

        edada = calcular_edada(anio);

        edadm = calcular_edada(mes);

        System.out.println("Tu edad es de"+edada+"anios y "+edadm+"meses");

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