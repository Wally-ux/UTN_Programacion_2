/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author agust
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;
     //“Cada categoría (ALIMENTOS, ELECTRONICA, etc.) va a tener una descripción textual fija, privada y de solo lectura”.
    
    CategoriaProducto(String descripcion) { 
    //CONSTRUCTOR →GUARDA DENTRO UN VALOR DEFINIDO ARRIBA EN LOS ATRIBUTOS , LO GUARDA 
     this.descripcion = descripcion;
    }

    public String getDescripcion() { //NOS PERMITE LEERLO DESDE AFUERA
        return descripcion;
    }
}
