package libroserializacion;
/*
 * @author jp999
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class LibroSerializacion {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        Scanner entrada = new Scanner(System.in);
        
        listaLibros objlista = new listaLibros();
        
        int opcion;
        
        do{
            System.out.println("Bienvenido a la biblioteca");
            System.out.println("Ingrese la opción deseada");
            System.out.println("1. Agregar nuevo libro");
            System.out.println("2. Consultar libro");
            System.out.println("3. Consultar todos los libros");
            System.out.println("4. Borrar un libro");
            System.out.println("5. Modificar los datos de un libro");
            System.out.println("6. Salir");
            
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    objlista.agregarLibro();
                    break;
                case 2:
                    objlista.buscar();
                    break;
                case 3:
                    objlista.consultaGral();
                    break;
                case 4:
                    objlista.borrar();
                    break;
                case 5:
                    objlista.modificar();
                    break;
                case 6:
                    System.out.println("Salir");
                    //se guardan los cambios realizados
                    objlista.grabar();
                    break;
                default:
                    System.out.println("Error al elegir, intente de nuevo");
            }
            
            
        }while((opcion<=0) && (opcion>=6));
        
        
    }
    
}
