public class For {
    static boolean isTurnOnLamp = false;
    public static void main(String[] args) {
        turnOnOffLamp();

        int i = 1;
        for (i = 1; isTurnOnLamp && i <= 10; i++) {
            printSOS();
        }
    }

    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLamp() {
        isTurnOnLamp = (isTurnOnLamp)?false:true;
        return isTurnOnLamp;
    }
}
