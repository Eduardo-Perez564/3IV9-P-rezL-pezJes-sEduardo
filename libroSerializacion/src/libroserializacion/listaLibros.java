package libroserializacion;
/**
 *
 * @author jp999
 */
import java.util.*;
import java.io.*;

public class listaLibros implements Serializable{
    
    //objetos del Array
    private ArrayList<CLibro> listalibros;
    private ArchivoL objarchivolibros = new ArchivoL();
    
    public listaLibros() throws IOException, FileNotFoundException, ClassNotFoundException{
        listalibros = new ArrayList<CLibro>();
        //Sobrecarga del objeto
        listalibros = objarchivolibros.leer();
    }
    
    //CRUD
    //Se agregan los libros
    public void agregarLibro(){
        Scanner entrada = new Scanner(System.in);
        char resp = 's';
        while(resp == 's'){
            //Objeto de libro
            CLibro objlibro = new CLibro();
            objlibro.aceptarDatos();
            listalibros.add(objlibro);
            System.out.println("¿Deseas agregar otro libro?");
            resp = entrada.next().charAt(0);
        }
    }
    
    //Consulta general de los libros
    public void consultaGral(){
        //verificamos si la lista está vacia
        if (listalibros.isEmpty()){
            System.out.println("No hay libros registrados.");
        }else{
            System.out.println("Los libros son: ");
            //recorremos el array
            for (int i=0; i<listalibros.size(); i++){
                System.out.println("*******    *******    ******* \n");
                System.out.println("Libro: " +listalibros.get(i).getNombre() + "\n"
                                    +"Autor: " +listalibros.get(i).getAutor() + "\n"
                                    +"Editorial: "+listalibros.get(i).getEditorial() + "\n"
                                    +"Precio: "+listalibros.get(i).getPrecio()+"\n");
                System.out.println("*******    *******    *******");
            }
        }
    }
    
    //Método para buscar un libro por su posición en el array
    private int traerPosicion(String nombreBuscar){
        int pos = 0;
        boolean existe = false;
        for (int i=0; i<listalibros.size(); i++) {
            //buscamos su existencia por el nombre
            if (nombreBuscar.equals(listalibros.get(i).getNombre())) {
                //En caso de que lo encuentre
                pos = i;
                existe = true;
                
            }else{
                System.out.println("Libro no encontrado");
            }
        }
        if(!existe){
            //Está afuera del arreglo
            System.out.println("No existe el registro");
            pos = -1;
        }
        return pos;
    }
    
    public int buscar(){
        int posbuscar = 0;
        String nomBuscar;
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ingresa el nombre del libro que vas a buscar");
        nomBuscar = entrada.nextLine();
        posbuscar = traerPosicion(nomBuscar);
        
        //Para visualizar los datos del libro
        
        System.out.println("----------  -----   ----------");
        System.out.println("Libro: " +listalibros.get(posbuscar).getNombre() + "\n"
                                    +"Autor: " +listalibros.get(posbuscar).getAutor() + "\n"
                                    +"Editorial: "+listalibros.get(posbuscar).getEditorial() + "\n"
                                    +"Precio: "+listalibros.get(posbuscar).getPrecio()+"\n");
        return posbuscar;
    }
    
    //Borrar registro
    public void borrar(){
        Scanner borrarL = new Scanner(System.in);
        String libroborrar;
        int posBorrar;
        
        //Conocer si la lista está vacía
        if (listalibros.isEmpty()) {
            System.out.println("No hay libros registrados");
        }else{
            System.out.println("Datos del libro que se eliminará");
            posBorrar = buscar();
            
            if(posBorrar<listalibros.size()){
                listalibros.remove(posBorrar);
                System.out.println("Libro eliminado");
            }
        }
    }
    
    //Modificación de los datos
    public void modificar(){
        int posmodificar = 0;
        int resmod = 0;
        String nomModificar;
        String opcion = "s";
        
        Scanner modificarD = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre del libro que deseas modificar");
        nomModificar = modificarD.nextLine();
        
        while("s".equals(opcion)){
            posmodificar = traerPosicion(nomModificar);
            
            if (posmodificar <= 0) {
                //preguntamos que dato quiere modificar
                System.out.println("¿Qué dato del libro desea modificar?");
                System.out.println("1. Autor \n"
                                    +"2. Editorial \n"
                                    +"3. Precio \n");
                resmod = modificarD.nextInt();
                
                switch (resmod) {
                    case 1:
                        System.out.println("El autor es: ");
                        System.out.println("Autor: " +listalibros.get(posmodificar).getAutor());
                        System.out.println("Ingresa el nuevo autor");
                        listalibros.get(posmodificar).setNombre(modificarD.next());
                        System.out.println("El dato modificado es: ");
                        System.out.println("Autor: " +listalibros.get(posmodificar).getAutor());
                        
                        break;
                    
                    case 2:
                        System.out.println("La editorial es: ");
                        System.out.println("Editorial: " +listalibros.get(posmodificar).getEditorial());
                        System.out.println("Ingresa la nueva editorial");
                        listalibros.get(posmodificar).setEditorial(modificarD.next());
                        System.out.println("El dato modificado es: ");
                        System.out.println("Editorial: " +listalibros.get(posmodificar).getEditorial());
                        
                        break;
                    
                    case 3:
                        System.out.println("El precio es: ");
                        System.out.println("Precio: $ " +listalibros.get(posmodificar).getAutor());
                        System.out.println("Ingresa el nuevo precio");
                        listalibros.get(posmodificar).setPrecio(modificarD.nextInt());
                        System.out.println("El dato modificado es: ");
                        System.out.println("Precio: $ " +listalibros.get(posmodificar).getAutor());
                        
                        break;
                }
            }
        }
    }

    public ArrayList<CLibro> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<CLibro> listalibros) {
        this.listalibros = listalibros;
    }

    public ArchivoL getObjarchivolibros() {
        return objarchivolibros;
    }

    public void setObjarchivolibros(ArchivoL objarchivolibros) {
        this.objarchivolibros = objarchivolibros;
    }
    
    //para grabar el archivo
    public void grabar() throws IOException{
        getObjarchivolibros().Serializar(listalibros);
        
    }
    
}
