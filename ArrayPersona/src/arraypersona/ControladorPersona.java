package arraypersona;

import java.util.ArrayList;
/**
 *
 * @author jp999
 */
public class ControladorPersona {
    
    //Crearemos un CRUD
    //Consult Register Update Delate
    
    //Objeto para almacenar datos de forma dinámica dentro de una lista
    
    public static ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    
    //con este método se muestran las personas
    
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersona;
    }
    
    //con este método se registra una nueva Persona
    public void registrarPersona(Persona p){
        listaPersona.add(p);
    }
    
    //con este método buscaremos una persona mediante su ID
    public Persona buscarPersona(int id){
        //objeto para Persona
        Persona encontrada = new Persona();
        //se recorre la lista de Personas hasta hallar a la que buscamos
        for(Persona p : listaPersona){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada, registro inválido");
            }
        }
        
        return encontrada;
    }
    
    
    //Al momento de querer actualizar los datos de la persona
    
    public void actualizarPersona(Persona personaActualizada){
        //se busca el registro de la persona por el ID
        Persona personaActualizar = buscarPersona(personaActualizada.getId());
        //se borra el anterior registro
        listaPersona.remove(personaActualizar);
        //se actualiza el registro
        listaPersona.add(personaActualizada);
    }
    
    //para eliminar el registro
    public void eliminarPersona(Persona personaEliminar){
        listaPersona.remove(personaEliminar);
    }
    
}
