public class WhileLoop {
    static boolean isTurnOnLamp = false;
    public static void main(String[] args) {
        turnOnOffLamp();
        int i = 1;
        while (isTurnOnLamp && i <= 10) {
            printSOS();
            i++;
        }

    }
    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLamp() {
        isTurnOnLamp = (isTurnOnLamp)?true:false;
        return isTurnOnLamp;
    }
}
