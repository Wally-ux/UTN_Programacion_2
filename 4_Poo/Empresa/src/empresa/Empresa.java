/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author agust
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("fulanito de tal", "programador");//id automatico, salario defecto
        Empleado e2 = new Empleado("juan Perrez", "QA"); //id automatico
        e2.setSalario(650000); //ajustamos su salario 

        // Instancia  manual
        Empleado e3 = new Empleado(100, "Carlos bruno", "cisco", 120000);//id manual 
        
         Empleado e4 = new Empleado("carlos bonavena", "servicio tecnico"); //automatico para probrar id 
         e4.setSalario(100000); //ajustamos su salario
        
        
        // aumentos salario porcentaje 
        e1.actualizarSalario(10.0);  // +10%   al ser doublo va ir al meotod  porcentaje
        e2.actualizarSalario(20000); //  al ser int va al meotdo salario→monto fijo
        e3.actualizarSalario(5.0);   // +5%

        //imprimimos informacion  toString()
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados creados (método estático)
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados() );
    }
  }
