public class LogicOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Operadores relacionales
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Operadores lógicos
        System.out.println(a != b);
        System.out.println(a == b);

        // Agregando condicionales
        if (a > b) {
            System.out.println("a es mayor que b");
        } else if (a < b) {
            System.out.println("a es menor que b");
        } else if (a == b) {
            System.out.println("a es igual a b");
        } else if (a != b) {
            System.out.println("a es diferente de b");
        } else if (a >= b) {
            System.out.println("a es mayor o igual que b");
        } else if (a <= b) {
            System.out.println("a es menor o igual que b");
        }
    }
}
