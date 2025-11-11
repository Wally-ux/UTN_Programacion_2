/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_excepciones;

import java.util.ArrayList;

/**
 *
 * @author agust
 */
public class Pedido implements Pagable {
    //Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el total del pedido.
    ArrayList <Producto> productos;
     private String estado;
     private Cliente cliente;

     //constructor
    public Pedido( String estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
        this.productos= new ArrayList<>();  //creamos lista vacia
    }
     
    public void agregarProducto(Producto producto){
        productos.add(producto);
        
     }
      public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;              // cambia el estado interno
        if ("EN_PROCESO".equalsIgnoreCase(nuevoEstado)) {
            cliente.notificar("En proceso.");   //l mensaje
    
        }
      }
      
    @Override
    public double calcularTotal() {
        double total=0;
          for(Producto producto: productos){ //recorremos los prodcutos
              total += producto.getPrecio(); 
          }
          return total; //devoovemos lo acumulado
    }
}
