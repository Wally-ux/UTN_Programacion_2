/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13_generadorqr_usuario_codigoqr;

/**
 *
 * @author agust
 */
public class CodigoQR {
    
    // Atributos
    private String valor;     // texto codificado en el QR
    private Usuario usuario;  // asociación unidireccional hacia Usuario

    // Constructor
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    // Getters y setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
  // Método para mostrar información del código QR
    @Override
    public String toString() {
        return "CodigoQR{valor='" + valor + "', usuario=" + usuario + "}";
    }
}
