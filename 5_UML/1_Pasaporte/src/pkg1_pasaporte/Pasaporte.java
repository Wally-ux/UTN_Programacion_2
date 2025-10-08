/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_pasaporte;

/**
 *
 * @author agust
 */
public class Pasaporte {
private String numero;
private String fechaEmision;
private  Foto foto;
// Asociación bi
private Titular titular;

private  Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
this.numero = numero;
this.fechaEmision = fechaEmision;
this.foto = foto; 
}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
