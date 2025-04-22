
/**
 * @author Sergio
 * @version 1.0
 */
package gestionalmacen01.modelo;
public class Producto
{
   
    private int codigo;    // Código del producto, se utiliza para buscar
    private String nombre; // Nombre un texto
    private int stock;    // existencia actuales
    private int stock_min; // Número mínimo de existencias recomedadas
    private float precio;  // Precio

    /**
     * Constructor 
     */
    public Producto()
    {
       
    }
    
    public Producto ( int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre(){
      return nombre;   
    }
    
    public void setNombre( String valor){
       nombre = valor;
    }
    
    public int getCodigo (){
        return codigo;
    }
    
    public void setCodigo ( int valor){
       codigo = valor;   
    }
    
    @Override
    public String toString(){
       //return codigo +":"+ nombre +": Existencias: "+ stock + " : Precio: "+precio;
       return String.format("| %5d | %-20.20s | %5d | min: %5d | %10.2f |",codigo,nombre,stock,stock_min,precio);
    }
    
    public int getStock(){
        return stock;
    }
    
    public void setStock( int valor ){
        stock = valor;
    }
    
    public int getStock_min(){
        return stock_min;
    }
    
    public void setStock_min( int valor ){
        stock_min = valor;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio( float valor ){
        precio = valor;
    }
}
