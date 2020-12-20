package libroserializacion;
/**
 *
 * @author jp999
 */
import java.util.ArrayList;
import java.io.*;

public class ArchivoL implements Serializable{
    
    //creamos el objeto que se va a serializar
    //En este objeto se van a almacenar los libros
    ArrayList<CLibro> listarecuperada = new ArrayList<CLibro>();
    
    
    //con este método se lee el archivo
    public ArrayList<CLibro> leer() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("libro.txt"));
            listarecuperada = (ArrayList<CLibro>)in.readObject();
            in.close();
        }catch(Exception e){
            System.out.println("Error... " + e.getMessage());
        }
        
        return listarecuperada;
    }
    
    //Método para crear el archivo
    void Serializar(ArrayList<CLibro> listaSerializada) throws FileNotFoundException, IOException{
        try{
            FileOutputStream out = new FileOutputStream("libro.txt");
            ObjectOutputStream objout = new ObjectOutputStream(out);
            
            //Escribimos la lista serializada
            objout.writeObject(listaSerializada);
            objout.close();
        }catch(Exception e){
            System.out.println("Error al serializar el archivo" + e.getMessage());
        }
    }
    
}
