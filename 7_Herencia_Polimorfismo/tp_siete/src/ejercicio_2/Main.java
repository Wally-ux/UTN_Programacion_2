/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author agust
 */
public class Main {
     public static void main(String[] args) {
         // Creamos la lista de las figuras de las otras clases
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Creamos las instancias
        Rectangulo radio1 = new Rectangulo(6.0,  8.0, "Rectangulo 1");
        Circulo circu1 = new Circulo(25, "Circulo 1");
        
        figuras.add(radio1);
        figuras.add(circu1);
        
        // Recorremos laa lista
        for(Figura f : figuras){
            f.calcularArea();
        }
     }
}
        

