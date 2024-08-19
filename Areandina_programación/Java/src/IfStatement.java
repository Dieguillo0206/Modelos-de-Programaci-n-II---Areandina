public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("File sended");
            System.out.println("Bluetooth is enabled");
        } else {
            System.out.println("File not sended");
            System.out.println("Bluetooth is disabled");
        }
    }
}
