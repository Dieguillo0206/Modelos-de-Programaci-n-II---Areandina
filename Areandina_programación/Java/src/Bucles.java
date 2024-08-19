import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        // DO
        int response;

        do {
            System.out.println("Selecciona el número de la opción deseada:");
            System.out.println("1. Peliículas");
            System.out.println("2. Series");
            System.out.println("3. Documentales");
            System.out.println("4.Salir");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Peliículas");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                case 3:
                    System.out.println("Documentales");
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (response != 0);

        System.out.println("Se terminó el programa");
    }
}