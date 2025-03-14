public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota() {
    }

    public Mascota(int edad, String especie, String nombre) {
        this.edad = edad;
        this.especie = especie;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }

    public void mostrarInformacion() {
        System.out.println("Informacion de la mascota");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido un año más y ahora tiene " + edad + " años");
    }

    public void esAdulta() {
        if (edad >= 3) {
            System.out.println(nombre + " es una mascota adulta");
        } else {
            System.out.println(nombre + " aún es joven");
        }
    }
}
