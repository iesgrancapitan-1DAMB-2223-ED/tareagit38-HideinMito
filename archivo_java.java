public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30, "Calle Falsa 123");
        persona.mostrarDetalles();
    }
}
