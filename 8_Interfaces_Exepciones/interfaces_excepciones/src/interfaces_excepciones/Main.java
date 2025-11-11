/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_excepciones;

/**
 *
 * @author agust
 */
public class Main {
    public static void main(String[] args) {   
        //se crea 2 clientes para ver como funciona
        Cliente c1=new Cliente ("Apolo Creed");
        
        //creamos 3 prodcutos 
        Producto p1= new Producto ("Mouse Gamer" , 30000); 
        Producto p2= new Producto ("Teclado Mecanico " , 90000); 
        Producto p3= new Producto ("Monitor Led 22 Pulgadas" , 120000); 
        //creamos un pedido y agregamos 3 prodcutos al pedido 1
        Pedido pedido1 = new Pedido("NUEVO", c1);   // nuevo pedido para el cliente
        pedido1.agregarProducto(p1);                 // agregamos producto 1
        pedido1.agregarProducto(p2);                 // agregamos producto 2
        pedido1.agregarProducto(p3);                 // agregamos  producto 3
          
        pedido1.setEstado("EN_PROCESO"); 
        ;
        //Calculamos el total del pedido del cliente 1
         double total = pedido1.calcularTotal();
        //creamos un pago con pay pal
        PagoConPayPal pago1= new PagoConPayPal();
        //procedemos a el pago del cliente en cuestion 
        pago1.procesarPago(total);
        
        System.out.println(" ");
        // CLIENTE 2 
        Cliente c2=new Cliente ("Rocky Balboa");
        Pedido pedido2 = new Pedido("NUEVO", c2);      // pedido inicial para el cliente 2
        // agregamos 2 productos al pedido 2
        pedido2.agregarProducto(p2);                 
        pedido2.agregarProducto(p3);
        // Cambiamos estado → debería imprimir: "Carolina tu pedido tiene el siguiente estado: En proceso."
        pedido2.setEstado("EN_PROCESO");
        //creamos un pago con pay pal
        PagoConTarjeta pago2= new PagoConTarjeta();
        //procedemos a el pago del cliente en cuestion 
        pago2.procesarPago(total);
        



       
    }
}
