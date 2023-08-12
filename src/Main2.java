public class Main2 {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(20));
    }
    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryBuilder = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryBuilder.insert(0, remainder); // En başa ekleyerek binary sayının düzgün sıralanmasını sağlar
            decimalNumber /= 2;
        }
        System.out.println();
        return binaryBuilder.toString();
    }
}
