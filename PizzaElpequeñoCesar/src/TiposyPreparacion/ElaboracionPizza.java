
package TiposyPreparacion;

/**
 *
 * @author jp999
 */
public class ElaboracionPizza {
    
    private String masa;
    private String[] Salsa;
    protected String[] ingredientes;
    
    public ElaboracionPizza(){
        
    }

    public ElaboracionPizza(String masa, String[] Salsa, String[] ingredientes) {
        this.masa = masa;
        this.Salsa = Salsa;
        this.ingredientes = ingredientes;
        
        
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String[] getSalsa() {
        return Salsa;
    }

    public void setSalsa(String[] Salsa) {
        this.Salsa = Salsa;
    }
    
    public void Hornear(){
        System.out.println("La pizza se tarda 15 minutos en hornear");
    }
    
    public void corte(){
        System.out.println("La pizza se corta en 12 porciones");
    }
    
    public void empacar(){
        System.out.println("La pizza se empaca en una caja circular");
    }
    
}
