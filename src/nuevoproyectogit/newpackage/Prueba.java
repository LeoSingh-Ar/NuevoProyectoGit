/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoproyectogit.newpackage;

/**
 *
 * @author abate
 */
public class Prueba {
    
    private int numero;
    private String palabra;

    public Prueba(int numero, String palabra) {
        this.numero = numero;
        this.palabra = palabra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
}
