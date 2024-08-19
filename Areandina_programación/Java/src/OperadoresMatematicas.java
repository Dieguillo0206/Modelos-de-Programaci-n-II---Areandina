public class OperadoresMatematicas {
    public static void main(String[] args) {
        double a = 10.545;
        double b = 20.5;

        System.out.println(Math.ceil(a));  // devuelve entero mas cercano hacia arriba
        System.out.println(Math.floor(a)); // devuelve entero mas cercano hacia abajo
        System.out.println(Math.pow(a, b)); // devuelve a elevado a la potencia de b

        System.out.println(Math.max(a, b)); // devuelve el mayor de los dos
        System.out.println(Math.min(a, b)); // devuelve el menor de los dos
        System.out.println(Math.sqrt(a)); // devuelve la raiz cuadrada de a
    }
}
