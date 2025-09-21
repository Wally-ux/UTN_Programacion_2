/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;



public class Empleado {
    private  int id;         
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; 
    private static int nextId = 1;         // lee el siguiente entero o identificador en nuestro caso
                                                        //aranca en 1, 1 empleado y se comparte entre tdos los empleado

//1 constructore sobrecargado →recibe todos los atributos como parametros
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; //equivale → ++totalEmpleados , +=1
       
        //id automatico
        //mantenemos la secuencia por encima del id asignadi manualmente en el constructor manual
        //evitamos duplicados en el futuro
        if (id >= nextId) { 
            nextId = id + 1; 
        }
    }


    public Empleado(String nombre, String puesto) {
        this.id = nextId++;      //asgina el valor atual y despues suma 1 automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 500000.00;      // salario por defecto 
        totalEmpleados++;
    }

    // 3_1 metodos sobrecargados actualizarSalario→ 
    public void actualizarSalario(double porcentaje) {
       this.salario += this.salario * (porcentaje / 100.0);   //porcentaje como argumento main.→10%aumento
    }

  //3_2 metodo sobrecargado →recibe cantidad fija a aumentar
    public void actualizarSalario(int montoFijo) { //monto fijo como argumento desde el main
      this.salario += montoFijo; 
    }
  //4_metodo toString()
        @Override
        public String toString() {
            return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
        }
  
     //5_Método estático 
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // 6_encapsulamiento

    public int getId() { 
        return id; 
    } // sin setter: inmutable

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() { 
        return salario; 
    }
    public void setSalario(double salario) {
       this.salario = salario;
}
}
