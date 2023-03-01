// Creo la clase Persona
public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    
    // Constructor
    public Persona(String nombre, int edad, String direccion) {
        //this.nombre
        this.nombre = nombre;
        
        //this.edad
        this.edad = edad;
        
        //this.direccion
        this.direccion = direccion;
    }
    // Aquí lo mostramos
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }
    // Ejemplo de la clase Persona
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30, "Calle Falsa 123");
        persona.mostrarDetalles();
    }
}
