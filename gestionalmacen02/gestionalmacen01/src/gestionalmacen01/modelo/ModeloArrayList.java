/** Implementa la parte de Modelo de Datos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package gestionalmacen01.modelo;

import java.util.ArrayList;


public class ModeloArrayList implements ModeloInterfaz
{
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
      return lista.add(p);
    }
 
    public boolean borrarProducto ( int codigo ){
//          Producto pborrado = null;
//          for ( Producto p: lista) {
//         	 if ( p.codigo == codigo) {
//         		 pborrado = p;
//         		 break;
//         	 }
//          }
//          
//		if ( pborrado != null) {
//        	  lista.remove(pborrado);
//        	  return true;
//          } else {
//        	  return false;
//          }
          
        return lista.removeIf( p -> p.getCodigo() == codigo );
		
    }
    
    public Producto buscarProducto ( int codigo) {
         Producto resu = null;
         for ( Producto p: lista) {
        	 if ( p.getCodigo() == codigo) {
        		 resu = p;
        		 break;
        	 }
         }
        
         return resu;
    }
    
    public void listarProductosTodos (){
    	
    	for(Producto p : lista){
    		System.out.println(p);
    	}
        
    }
    
    public void listarProductosStockMin(){
        
    	for  (Producto p: lista) {
    		if (p.getStock() < p.getStock_min()) {
    			System.out.println(p);
    		}
    	}
    	
    }
    
    public boolean modificarProducto (Producto nuevo){
       return false;
    }
    
    
}    
