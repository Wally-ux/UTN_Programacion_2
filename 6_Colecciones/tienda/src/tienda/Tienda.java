/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author agust
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //instacniamos un inventario para el ejemplo
      Inventario inv= new Inventario();
      //creamos 5 porductos con diferentes categorias y agregarmos al inventario
      inv.agregarProducto(new Producto ("1", "queso fresco", 1500.0 , 2,CategoriaProducto.ALIMENTOS));
      inv.agregarProducto(new Producto ("2", "TV Smart 43 ", 750000.0 , 1,CategoriaProducto.ELECTRONICA));
      inv.agregarProducto(new Producto ("3", "Remera Negra talle L", 35000.0, 3,CategoriaProducto.ROPA));
      inv.agregarProducto(new Producto ("4", "mesa madera", 300000.0, 4,CategoriaProducto.HOGAR));
      inv.agregarProducto(new Producto ("5", "pata y muslo -pollo", 8000.0 , 7,CategoriaProducto.ALIMENTOS));
      
      
        //listamos los productos
         inv.listarProductos();
      
        // Buscar un producto por su ID y mostrar su información
        System.out.println("\nProducto por ID '3':");  // cambia "3" por el ID que quieras buscar
         System.out.println(inv.buscarProductoPorId("3"));

         // Filtramos productos por la categoría ROPA y los mostramos
        System.out.println("\nProductos filtrados (ROPA):");

        ArrayList<Producto> productosPorCategoria =
        inv.filtrarPorCategoria(CategoriaProducto.ROPA); // llamamos al método del inventario

        for (Producto p : productosPorCategoria) {   // recorremos los productos filtrados
        System.out.println(p);                   // imprime usando toString()
  
    
    // Eliminamos un producto por id
        System.out.println("\nEliminado producto id 5:");
        inv.eliminarProducto("5"); // Llamamos al método de Inventario para eliminar por id

        System.out.println("\nInventario actualizado:");
        inv.listarProductos(); // Mostramos el inventario actualizado
        
        
        //actualiazamos un producto existente , id=3
        // Antes: mostramos el producto con id "3"
        System.out.println("\nANTES de actualizar:");
        System.out.println(inv.buscarProductoPorId("3"));

        //  Actualizamos id=3 con  stock a 200
        inv.actualizarStock("3", 200);

        // --- Después: volvemos a mostrar el mismo producto
        System.out.println("\nDESPUÉS de actualizar:");
        System.out.println(inv.buscarProductoPorId("3"));
     
       //mostramos stock disponible
            System.out.println("\nStock total disponible: " + inv.obtenerTotalStock());
       
        // Mostramos el producto con mayor stock
        System.out.println("\nProducto con mayor Stock:");
        System.out.println(inv.productoConMayorStock());  
        
        
        //9_llamamos al metodo productosFiltradosPorPrecio  entre $1000 y $3000
        
        System.out.println("\nProductos entre $1000 y $3000:");

        ArrayList<Producto> productosFiltradosPorPrecio ;
            System.out.println(inv.filtrarProductosPorPrecio(1000.0, 3000.0));  // min y max (inclusive)7
            
            System.out.println(" ");
            
            
          //10 mostrar categorias disponibles
          inv.mostrarCategoriasDisponibles();
            
        }
    }
}
