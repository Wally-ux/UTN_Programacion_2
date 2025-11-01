/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad_profesor_curso_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agust
 */
public class Profesor {

    // Atributos
    private String id;               // Identificador único
    private String nombre;           // Nombre completo
    private String especialidad;     // Área principal
    private List<Curso> cursos;      // Cursos que dicta (relación bidireccional)

    // Constructor mínimo para poder instancia
    public Profesor(String id, String nombre, String especialidad ) {
        this.id= id;
        this.nombre= nombre;
        this.especialidad=especialidad;
        this.cursos = new ArrayList<>();
    }
        //metodos 
        
        //agregar curso en la lista de cursos
        public void agregarCurso(Curso curso){ 
        if (curso != null && !cursos.contains(curso)){ //si es null no hago nada, si ya estaba en cursos (constanis verifica la lista))no lo agrego de nuevo
            cursos.add(curso);    //agrego curso a la lista
            if(curso.getProfesor() != this) { //el curso apunta a este profesor
                curso.setProfesor(this);  //si no, sincronizo el otro lado
     }
    }
   }
        //metodo elimiar curso
        public void eliminarCurso(Curso curso){
            if (curso!= null && cursos.contains(curso)){
                cursos.remove(curso);
                
                if (curso.getProfesor() == this) {
                    curso.setProfesor(null);
                }
            }
        }
        
        //listarcursos
        public void listarCursos(){
            System.out.println("Los cursos del prefesor " + nombre+ "son: ");
            for (Curso curso: cursos){
                System.out.println(" - ");
            }
        }
        //mostrasrInfo
        public void mostrarInfo(){
            System.out.println("El profesor con id: " + id + 
                    "\n nombre; " + nombre +
                    "\nespecialidad: " + especialidad +
                    "\nejerse en  " + cursos.size()+ " cursos. ");
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
        
}

   

