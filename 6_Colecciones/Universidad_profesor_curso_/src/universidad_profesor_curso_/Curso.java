/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad_profesor_curso_;

/**
 *
 * @author agust
 */
public class Curso {
  
    // Atributos
    private String codigo;       // Código único
    private String nombre;       // Nombre del curso
    private Profesor profesor;   // Profesor responsable (relación bidireccional)
    
    public Curso() {} 

    public Curso(String codigo , String nombre, Profesor profesor) { 
    this.codigo=codigo;
    this.nombre=nombre;
    this.profesor=profesor;
    }
       public Curso(String codigo , String nombre) { 
    this.codigo=codigo;
    this.nombre=nombre;
       }
    
    //metodo 
      // **MANTIENE LA BIDIRECCIONALIDAD**
    public void setProfesor(Profesor nuevo) {
        if (this.profesor == nuevo) return;   // nada que cambiar

        Profesor anterior = this.profesor;
        this.profesor = nuevo;

        // quitar de la lista del profesor anterior
        if (anterior != null) {
            anterior.getCursos().remove(this);
        }

        // agregar a la lista del nuevo profesor
        if (nuevo != null && !nuevo.getCursos().contains(this)) {
            nuevo.getCursos().add(this);
        }
    }
       @Override
    public String toString() {
        String prof = (profesor == null) ? "(sin profesor)" :
                      profesor.getNombre();
        return "Curso{codigo='" + codigo + "', nombre='" + nombre +
               "', profesor=" + prof + "}";
    }
    public void mostrarInfo(){
        System.out.println("El codigo del surso es " + codigo +
                "\n el nomrbe del profesor es: " + nombre +
                "\nel profesor asignado al curso es: " + profesor.getNombre());
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

}


