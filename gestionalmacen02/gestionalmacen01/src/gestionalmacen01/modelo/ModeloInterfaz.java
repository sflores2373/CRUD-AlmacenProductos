package gestionalmacen01.modelo;

/**
 * Interfaz de acceso a Modelo de DATOS
 * 
 * @author: Alberto Lopez
 * Date: 24/04/2018
 */
public interface  ModeloInterfaz
{
    
    public boolean insertarProducto ( Producto p);
    
    boolean borrarProducto ( int codigo );
    
    public Producto buscarProducto ( int codigo);
    
    void listarProductosTodos ();
    
    void listarProductosStockMin();
    
    boolean modificarProducto (Producto nuevo);
    
}
