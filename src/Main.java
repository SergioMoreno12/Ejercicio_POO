//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota(4,"perro", "Lucas");
        mascota1.mostrarInformacion();
        mascota1.cumplirAnios();
        mascota1.esAdulta();
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println(" ");
        Mascota mascota2 = new Mascota(2, "conejo", "Blanca");
        mascota2.mostrarInformacion();
        mascota2.cumplirAnios();
        mascota2.esAdulta();
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println(" ");
        Mascota mascota3 = new Mascota();
        mascota3.setEdad(6);
        mascota3.setEspecie("gato");
        mascota3.setNombre("Nicolas");
        System.out.println("Informacion de la mascota");
        System.out.println("Nombre: " + mascota3.getNombre());
        System.out.println("Especie: " + mascota3.getEspecie());
        System.out.println("Edad: " + mascota3.getEdad() + " años");
        mascota3.cumplirAnios();
        mascota3.esAdulta();
    }
}