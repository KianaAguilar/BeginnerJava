import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericSystemScannerInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        //String numberStr = scanner.nextLine();
        int numberDecimal = 0;

        try {
            numberDecimal = scanner.nextInt();  //Integer.parseInt(numberStr);

        } catch (Exception e) {
            System.out.println("\"Error de ingresar un numero entero!\"");
            main(args);
            System.exit(0);
        }
        System.out.println("finalizado");
    }
}
