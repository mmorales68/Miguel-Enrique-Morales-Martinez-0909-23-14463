public class Estudiante {
     public String nombre;
     public int edad;

    public Estudiante() {}//constructor para crear un estudiante vacio
    public Estudiante(String nombre, int edad) {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
