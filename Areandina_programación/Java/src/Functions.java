public class Functions {
    public static void main(String[] args) {
        // Ejemplo practico hayando area de un circulo
        // area: pi * radio^2
        double radio = 5;
        double area = circleArea(radio);

        System.out.println("El area del circulo es: " + area);
    }

    public static double circleArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double sphereArea(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    /**
     *  Función que convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda
     * @return quantity Cantidad de dinero en dolares
     *
     * */
    public static double convertToDollars(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00027;
                break;
            case "EUR":
                quantity = quantity * 1.18;
                break;
            case "USD":
                break;
            default:
                quantity = 0;
                break;
        }
        System.out.println("La cantidad en dolares es: " + quantity);
        return quantity;
    }
}

