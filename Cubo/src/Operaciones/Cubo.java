
package Operaciones;


public class Cubo {
    int ancho,alto,profundo;
    
    //Constructor

    public Cubo() {
    }

    public Cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int volumen(int ancho, int alto, int profundo){
        
        return ancho*alto*profundo;
    }
    
    public void mostrarVolumen() {

        System.out.println("El volumen del cubo es: " +(ancho*alto*profundo));
    }
    
    
}
