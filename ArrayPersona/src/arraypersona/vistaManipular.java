package arraypersona;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author jp999
 */
public class vistaManipular {
    
    Scanner entrada = new Scanner(System.in);
    int opc;
    ControladorPersona crud = new ControladorPersona();
    
    //método principal
    
    public void Principal(){
        
        do {
            
            System.out.println("Bienvenido al sistema de administración del personal de la empresa Patito");
            System.out.println("Por favor, elija la opción deseada:"
                    + "\n 1. Mostrar lista del personal"
                    + "\n 2. Registrar una nueva persona"
                    + "\n 3. Editar los datos de una persona"
                    + "\n 4. Borrar el registro de una persona"
                    + "\n 5. Salir ");
            
            opc = Integer.parseInt(entrada.nextLine());
            switch (opc) {
                case 1:
                    //llamamos al método para mostrar las personas
                    //el objeto capaz de almacenar todo
                    ArrayList<Persona> listadePersonas = crud.mostrarPersonas();
                    //recorremos la lista
                    for(Persona objeto : listadePersonas){
                        //para imprimir los datos
                        System.out.println("El id: " + objeto.getId()
                                            + " El nombre: " + objeto.getNombre()
                                            + " La edad es: " + objeto.getEdad()+"\n");
                    }
                    break;
                case 2:
                    //llamamos al método para registrar a la persona
                    System.out.println("Ingrese el Id de la persona: ");
                    int idpersona = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese el nombre de la persona: ");
                    String nombrepersona = entrada.nextLine();
                    System.out.println("Ingrese la edad de la persona: ");
                    int edadpersona = Integer.parseInt(entrada.nextLine());
                    
                    //enviamos los datos al objeto
                    Persona personaNueva = new Persona(idpersona, nombrepersona, edadpersona);
                    
                    //almacenamos los datos en el objeto
                    crud.registrarPersona(personaNueva);
                    break;
                case 3:
                    //para editar algo, primero debemos de buscarlo
                    System.out.println("Ingrese el id de la persona para actualizar sus datos");
                    int id = entrada.nextInt();
                    
                    Persona personaSeleccione = crud.buscarPersona(id);
                    
                    //mostramos los datos de esa persona
                    System.out.println("La información de la persona es la siguiente: ");
                    System.out.println("El id: " + personaSeleccione.getId()
                                            + " El nombre: " + personaSeleccione.getNombre()
                                            + " La edad es: " + personaSeleccione.getEdad());
                    //los cambios a realizar
                    System.out.println("Ingrese el nuevo nombre del registro");
                    String nuevonombre = entrada.nextLine();
                    System.out.println("Ingrese la nueva edad del registro");
                    int nuevaedad = entrada.nextInt();
                    
                    //enviamos los nuevos datos
                    personaSeleccione.setNombre(nuevonombre);
                    personaSeleccione.setEdad(nuevaedad);
                    
                    //llamamos al método para la actualización de datos
                    crud.actualizarPersona(personaSeleccione);
                    
                    break;
                case 4:
                    //buscamos el id que borraremos
                    System.out.println("Ingrese el id de la persona para actualizar sus datos");
                    int ideliminar = entrada.nextInt();
                    
                    //buscamos
                    Persona personaEliminar = crud.buscarPersona(ideliminar);
                    //eliminamos
                    crud.eliminarPersona(personaEliminar);
                    System.out.println("Registro eliminado exitosamente");
                    break;
                default:
                    System.out.println("Digite una opción correcta");
            }
            
        } while (opc != 5);
    }
    
}
