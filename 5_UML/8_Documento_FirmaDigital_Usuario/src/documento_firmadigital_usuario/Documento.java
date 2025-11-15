/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento_firmadigital_usuario;

/**
 *
 * @author agust
 */
public class Documento {
    private String titulo;
    private String contenido;

    // Composición: el Documento contiene una FirmaDigital
    private FirmaDigital firmaDigital;

    // Constructor SIN firma todavía
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    // Método para "firmar" el documento (crea la firma: COMPOSICIÓN)
    public void firmarDocumento(String codigoHash, String fecha, Usuario usuario) {
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", firmaDigital=" + firmaDigital +
                '}';
    }
}