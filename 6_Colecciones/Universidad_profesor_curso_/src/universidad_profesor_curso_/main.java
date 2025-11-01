/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad_profesor_curso_;

import java.util.Arrays;

/**
 *
 * @author agust
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos la universidad
        Universidad uni = new Universidad();
        uni.setNombre("Universidad Tecnológica Nacional");

        // --- 3 Profesores ---
        Profesor prof1 = new Profesor("P01", "Julieta Acosta", "Bases de Datos");
        Profesor prof2 = new Profesor("P02", "Marco Paredes", "Programación");
        Profesor prof3 = new Profesor("P03", "Lucía Romero", "Seguridad");

        // Los agregamos a la universidad
       uni.agregarProfesor(prof3);
       uni.agregarProfesor(prof2);
       uni.agregarProfesor(prof1);

        // --- 5 Cursos ---
        Curso c1 = new Curso(); c1.setCodigo("PRG-101"); c1.setNombre("Programación I");
        Curso c2 = new Curso(); c2.setCodigo("ADO-200"); c2.setNombre("Análisis y Diseño de OO");
        Curso c3 = new Curso(); c3.setCodigo("FIN-210"); c3.setNombre("Linux I");
        Curso c4 = new Curso(); c4.setCodigo("PRG-201"); c4.setNombre("Programación II");
        Curso c5 = new Curso(); c5.setCodigo("BD-101");  c5.setNombre("Bases de Datos I");
        
        //agregamos los cursos
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
        
        //asignamos los cruso al profesor
        uni.asignarProfesorACurso("PRG-101", "P02"); // Programación I  -> Marco Paredes
        uni.asignarProfesorACurso("ADO-200", "P02"); // Análisis y Diseño de OO -> Marco Paredes
        uni.asignarProfesorACurso("FIN-210", "P03"); //
        uni.asignarProfesorACurso("PRG-201", "P02"); // Programación II -> Marco Paredes
        uni.asignarProfesorACurso("BD-101",  "P01"); // Bases de Datos I-> Julieta Acosta
        
        //listamos profesor con cursos
        uni.listarProfesor();
        
        //listamos crusos
        uni.listarCursos();
        
        // Cambiamos el profesor de un curso y verificamos bidireccionalidad
        System.out.println("\n/////////////////////////////////////////////");
        System.out.println("Reasignamos el curso Programación I (PRG-101) a la profesora Julieta Acosta (P01)");

        uni.asignarProfesorACurso("PRG-101", "P01");  // antes estaba con P02

        // Verificación: el curso debe figurar ahora con P01 y dejar de estar en la lista de P02
        uni.listarCursos();
        uni.listarProfesor();
        
        //removemos un cruso y validamos que no tiene profesore
        System.out.println("\n***************************************");
        System.out.println("Removemos el curso FIN-210 y verificamos profesores");

        // Quitamos el curso de la universidad (también lo desvincula del profesor)
        uni.eliminarCurso(c3);

        // Verificamos que el profe ya no lo tenga
        uni.listarProfesor();

        // Verificamos que la uni tiene un curso menos y ya no aparece FIN-210
        uni.listarCursos();
        
        //removemos un profesor y dejamos profesor=null
        System.out.println("\n-------------------------------------------");
        System.out.println("Removemos al profesor con id=P01 (Julieta Acosta)");
        uni.eliminarProfesor(prof1);

        // Verificamos que ya no esté y que sus cursos quedaron sin profesor
        uni.listarProfesor();
    }
    
}
