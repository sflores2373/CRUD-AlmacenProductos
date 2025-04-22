
/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package gestionalmacen01.modelo;
import java.util.HashMap;
import java.util.Map;
// Faltan incluir los metodos del interfaz 

public class ModeloHashMap implements ModeloInterfaz
{
    private HashMap <Integer,Producto> mapa;
    
    public ModeloHashMap()
    {
       mapa=new HashMap  <Integer,Producto>();
    }

	@Override
	public boolean insertarProducto(Producto p) {
		return (mapa.put(p.getCodigo(),p) == null);
	}

	@Override
	public boolean borrarProducto(int codigo) {
	   return( mapa.remove(codigo) != null);	
	}

	@Override
	public Producto buscarProducto(int codigo) {
		return mapa.get(codigo);
		
	}

	@Override
	public void listarProductosTodos() {
		for (Producto p : mapa.values()) {
			System.out.println(p);
		}
		
	}

	@Override
	public void listarProductosStockMin() {
		for (Producto p : mapa.values()) {
			if(p.getStock() < p.getStock_min()) {
				System.out.println(p);
			}
		}
		
	}

	@Override
	public boolean modificarProducto(Producto nuevo) {
		// TODO Auto-generated method stub
		return false;
	}

    
    
}
