/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio_3;

/**
 *
 * @author agust
 */
public class EmpleadoTemporal extends Empleado {
    
    @Override 
    public double calcularSueldo() {
        return 400; }
    
    @Override 
    public String tipo() { 
        return "Temporal"; }
}
