/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4;

import java.util.ArrayList;

/**
 *
 * @author agust
 */
public class Main {
    public static void main (String [] args){
     ArrayList <Animal> animales =new ArrayList <>();
     
     //instanciamos loa animales en cuestion
     Perro p1= new Perro ();
     Gato g1=new Gato ();
     Vaca v1=new Vaca();
             
      animales.add(p1);
      animales.add(g1);
      animales.add(v1);
      animales.add(p1);
             
      for (Animal animal : animales){
            animal.hacerSonido(); //polimorfismo
            animal.describirAnimal();//opcional
}
}
}

