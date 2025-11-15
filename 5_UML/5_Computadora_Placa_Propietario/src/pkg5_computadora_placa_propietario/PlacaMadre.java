/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_computadora_placa_propietario;

/**
 *
 * @author agust
 */
public class PlacaMadre {
        private String modelo;
    private String chipset;
//comstructor de placa madre
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
 //getteers and setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }
 //metodo public para que sea llamda de otra clase no devuelve nada
    //recibe el parametro chipset y asigna el valor al atributo interno del objeto 
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

}

