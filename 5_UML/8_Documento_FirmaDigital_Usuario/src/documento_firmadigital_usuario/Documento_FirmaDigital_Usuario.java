/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documento_firmadigital_usuario;

/**
 *
 * @author agust
 */
public class Documento_FirmaDigital_Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  creamos usuario
        Usuario usuario1 = new Usuario("Ana López", "ana_lopez2025@gmail.com");

        // Creamos  un documento (todavía sin firma)
        Documento doc1 = new Documento(
                "Contrato de Servicios",
                "Contenido del contrato..."
        );

        // Firm el documento (composición: el doc crea la FirmaDigital)
        doc1.firmarDocumento(
                "ABC123HASH",   // código hash simulado
                "2025-11-20",   // fecha de firma
                usuario1        // usuario que firma (agregación)
        );

        // lina de print
        System.out.println("=== Documento ===");
        System.out.println("Título: " + doc1.getTitulo());
        System.out.println("Contenido: " + doc1.getContenido());

        System.out.println("\n=== Firma Digital ===");
        System.out.println("Hash: " + doc1.getFirmaDigital().getCodigoHash());
        System.out.println("Fecha: " + doc1.getFirmaDigital().getFecha());

        System.out.println("\n=== Usuario que firma ===");
        System.out.println("Nombre: " + doc1.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Email: " + doc1.getFirmaDigital().getUsuario().getEmail());

        System.out.println("\n--- toString completo ---");
        System.out.println(doc1);
    }
}
    
