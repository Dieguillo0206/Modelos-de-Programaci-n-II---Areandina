public class Operadores {
    public static void main(String[] args) {
        // Operadores de asignación
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println(c); // 30

        c += a; // c = c + a;
        System.out.println(c); // 40

        // Operadores aritméticos
        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // -10

        c = a * b;
        System.out.println(c); // 200

        c = b / a;
        System.out.println(c); // 2


        // Operadores incremento y decremento

        int lives = 5;
        lives --; // lives = lives - 1;
        System.out.println(lives); // 4

        lives ++; // lives = lives + 1;
        System.out.println(lives); // 5

        // Prefijo
        // Regalo para Mario por rescatar a Luigi

        int gift = 100 + lives++; // gift = 100 + lives; lives = lives + 1;
        System.out.println(gift); // 105

    }
}
