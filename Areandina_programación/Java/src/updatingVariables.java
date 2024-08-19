public class updatingVariables {
    public static void main(String[] args) {
        // Variables
        String nombre = "Diego";
        int edad = 23;
        double altura = 1.82;
        boolean esEstudiante = true;

        // Imprimir variables
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + esEstudiante);

        // Actualizar variables
        nombre = "Juan";
        edad = 30;
        altura = 1.75;
        esEstudiante = false;

        // Imprimir variables actualizadas
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + esEstudiante);
    }
}
