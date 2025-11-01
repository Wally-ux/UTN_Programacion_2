/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad_profesor_curso_;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
   // Atributos
    private String nombre;
    private List<Profesor> profesores =new ArrayList<>();
    private List<Curso>  cursos = new ArrayList<>();

      public Universidad(){
         this.nombre = " ";
      }
      
    public Universidad(String nombre) {
        this.nombre= nombre;
        
      
    }
 
    
    //metodo agregar proefsor
    public void agregarProfesor(Profesor profesor){
        if(profesor !=null && !profesores.contains(profesor)){
            profesores.add(profesor);
        }
    }
      //metodo agregar curso
    public void agregarCurso(Curso curso){
        if(curso !=null && ! cursos.contains(curso)){
            cursos.add(curso);
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
    Profesor profesor = this.buscarProfesorPorId(idProfesor); //buscamos el profesor por su id
    Curso curso = this.buscarCursoPorCodigo(codigoCurso); //bucamos el curso

    if (profesor != null && curso != null) { //validamo que existan 
        // Mantiene la bidireccionalidad: Curso.setProfesor agrega/quita en las listas
        curso.setProfesor(profesor);
    } else {
        System.out.println("O el docente o el curso no existen en la universidad " + nombre);
    }
    
}
// Listar profesores
public void listarProfesor() {
    System.out.println("Los profesores de la universidad " + nombre
        + " cuentan con " + profesores.size() + " docentes:");
    for (Profesor profesor : profesores) {
        profesor.mostrarInfo();
        System.out.println("--------------------------");
    }
}

// Listar cursos
public void listarCursos() {
    System.out.println("La universidad " + nombre
        + " cuenta con " + cursos.size() + " cursos y son:");
    for (Curso curso : cursos) {
        curso.mostrarInfo();
    }
}
// Método para buscar un profesor por su ID
public Profesor buscarProfesorPorId(String id) {
    if (id != null) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor; // si lo encuentra, lo devuelve
            }
        }
    }
    return null; // si no lo encuentra, devuelve null
}
// Método para buscar un curso por su código
public Curso buscarCursoPorCodigo(String codigo) {
    if (codigo != null) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso; // Devuelve el curso si coincide el código
            }
        }
    }
    return null; // Si no encuentra ninguno, retorna null
}

//metodo elimir profesor 
public void eliminarProfesor(Profesor profesor) {
    if (profesor != null && profesores.contains(profesor)) {

        for (Curso curso : new ArrayList<>(profesor.getCursos())) {
            curso.setProfesor(null); // desvincula los cursos del profesor eliminado
        }

        profesores.remove(profesor); // elimina al profesor de la lista general
    }
}
 //eliminar curso
    public void eliminarCurso(Curso curso) {
    if (curso != null && cursos.contains(curso)) {
        curso.setProfesor(null); // desvincula el curso del profesor
        cursos.remove(curso);    // elimina el curso de la lista general
    }
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List <Profesor>getProfesores() {
        return profesores;
    }

    public void setProfesores(List profesores) {
        this.profesores = profesores;
    }

    public List <Curso>getCursos() {
        return cursos;
    }

    public void setCursos(List cursos) {
        this.cursos = cursos;
    }
    
}
       
    


