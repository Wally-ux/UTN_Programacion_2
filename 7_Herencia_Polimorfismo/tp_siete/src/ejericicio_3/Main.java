/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio_3;

import java.util.ArrayList;

/**
 *
 * @author agust
 */
public class Main {
    public static void main(String[] args) {
      ArrayList<Empleado> empleados = new ArrayList<>();
      //instanciamos los mepleados tanto lanta como temoral
        Empleado e1 = new EmpleadoPlanta();
        Empleado e2 = new EmpleadoPlanta();
        Empleado e3 = new EmpleadoTemporal();
        Empleado e4 = new EmpleadoPlanta();
        Empleado e5 = new EmpleadoTemporal();

        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);

        int i = 1; //empezamos en 1 por defecto
        for (Empleado e : empleados) {
            System.out.println(
                "Empleado " + i + " (" + e.tipo() + ") tiene un sueldo de: "+ e.calcularSueldo() + " USD." );
            i++;
        }
    }
}
    

