/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.List;
import tienda.Producto;


public class Inventario {
    private final ArrayList<Producto> productos = new ArrayList<>();

    //metodo agragar producto a la lista productos
        public boolean agregarProducto(Producto p) {
        if (p == null)
            return false; //validacon que el producto no sea nulo
            return productos.add(p); //si no es falso agregamos a la lista productos
        }

        public ArrayList<Producto> getProductos() {
        return productos;
        }
        
            // listarProductos
 
        public void listarProductos() {
        for  (Producto p : productos){
           System.out.println(p);//llamamos implicaitamente al to string de la clase producto
        }
        }
         // Busca y devuelve el Producto cuyo id coincida. Si no existe, devuelve null.
         public Producto buscarProductoPorId(String id) {
        if (id == null || productos.isEmpty()) 
            return null;

         for (Producto p : productos) {
            if (id.equals(p.getId())) {   // compara el String id con el id del producto
                return p;                 // encontrado
          }
        }
        return null; // no se encontró
    
        }

        //eliminarProducto
        public boolean eliminarProducto(String id) {
        for (int i = 0; i < productos.size(); i++) {
        // Tomamos el producto en la posición i
        Producto actual = productos.get(i);

        //  Comparamos el id buscado con el id del producto actual
        if (id.equals(actual.getId())) {
            //  Si coincide, eliminamos ese elemento por índice
            productos.remove(i);

            //  Devolvemos true: se eliminó (y salimos del método)
            return true;
        }
        }

        // terminamos el for sin encontrar coincidencias, devolvemos false
          return false;
        }
    

        // metodo actualiizarStock
     public void actualizarStock(String id, int nuevaCantidad) {
    Producto p = buscarProductoPorId(id);

    if (p != null && nuevaCantidad > 0) {
        p.getCantidad();
        System.out.println("El stock se actualizó con éxito!");
    } else if (nuevaCantidad < 0) {
        System.out.println("Debe ingresar una cantidad positiva...");
    } else if (p == null) {
        System.out.println("ID no encontrado!");
    }
}
     //filtrar por categoria
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>(); //creamos la lista de filtrados

        for (Producto p : productos) { //p en cada vuelta es el p actual
         if (p.getCategoria() == categoria) { //comparamos la categoria del producto con la ategoria recibida
            productosFiltrados.add(p); //agrega a lista 
            }
        }

           return productosFiltrados; //devuelve la lista filtrada
        }
    /**
 * Calcula y devuelve el total de stock de todos los productos.
 * return La suma total de unidades en stock.
 */
    public int obtenerTotalStock() {
        int totalStock = 0;

    for (Producto p : productos) {
        totalStock += p.getCantidad();
    }
        return totalStock;
    }
    //metodo para ver cual producto tiene mayor stock
    public Producto productoConMayorStock() {
    int maxStock = -1;
    Producto productoConMayorStock = null;
    

    for (Producto p : productos) {
        if (p.getCantidad() >= maxStock) {//Si la cantidad del producto actual es mayor o igual que el máximo guardado:
            maxStock = p.getCantidad(); //actualiza el maximo
            productoConMayorStock = p; //guarda ese producto como el “ganador” hasta ahora.
        }
    }
    return productoConMayorStock;
    }
    
        //producto filtrado por defect0
        public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();

        for (Producto p : productos) {
        if (p.getPrecio() >= min && p.getPrecio() <= max) {
            productosFiltrados.add(p);
        }
        }
        return productosFiltrados;
        }
        //metodo mostrar categorias disponibles
        public void mostrarCategoriasDisponibles() {
             System.out.println("Las categorías disponibles son: ");
             
        for (CategoriaProducto c : CategoriaProducto.values()) { // todos los enum
                System.out.println("Categoría: " + c); //c imprime el nombre de la constante del enum  ejemplo, “ALIMENTOS”).
                System.out.println("Descripción: " + c.getDescripcion()); 
    }           //llama al método del enum que devuelve el texto asociado (por ejemplo, “Productos comestibles”).
}
}






