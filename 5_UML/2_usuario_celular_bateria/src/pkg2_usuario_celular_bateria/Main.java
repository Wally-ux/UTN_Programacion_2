/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_usuario_celular_bateria;

/**
 *
 * @author agust
 */
public class Main {


    public static void main(String[] args) {
Usuario u = new Usuario("Ana", "12345678");
Celular c = new Celular("356789012345678", "Samsung", "A34");
Bateria b = new Bateria("EB-BA346ABY", 5000);

c.setBateria(b);   // Agregación Celular -> Bateria
c.setUsuario(u);   // Asociación bidireccional (se enlazan ambos lados)
    }
    
}
