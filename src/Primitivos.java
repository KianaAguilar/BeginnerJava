import javax.swing.*;

public class Primitivos {
    public static void main(String[] args) {

        String name = "Hi there! My name is Kiana. nice to meet you!";
        System.out.println(name.toUpperCase());

        byte numberByte = 127;
        System.out.println("numberByte = " + numberByte);
        System.out.println("The type short corresponds in byte to  " + Byte.BYTES);
        System.out.println("The type byte corresponds in bytes to " + Byte.SIZE);
        System.out.println("value max of byte " + Byte.MAX_VALUE);
        System.out.println("value min of byte " + Byte.MIN_VALUE);

        short numberShort = 30000;
        System.out.println("numberShort = " + numberShort);
        System.out.println("The type short corresponds in byte to " + Short.BYTES);
        System.out.println("The type short corresponds in bytes to " + Short.SIZE);
        System.out.println("value max of short " + Short.MAX_VALUE);
        System.out.println("value min of short " + Short.MIN_VALUE);

        int numberInt = 32768;
        System.out.println("numberInt = " + numberInt);
        System.out.println("The type int corresponds in byte to " + Integer.BYTES);
        System.out.println("The type int corresponds in bytes to " + Integer.SIZE);
        System.out.println("value max of int " + Integer.MAX_VALUE);
        System.out.println("value min of int " + Integer.MIN_VALUE);

        long numberLong = 2147483648L;
        System.out.println("numberLong = " + numberLong);
        System.out.println("The type long corresponds in byte to " + Long.BYTES);
        System.out.println("The type long corresponds in bytes to " + Long.SIZE);
        System.out.println("value max of long " + Long.MAX_VALUE);
        System.out.println("value min of long " + Long.MIN_VALUE);

        var numberVar =127;
        /* This is one literal! I can using since 10 jdk
        Always that we assign a number the var  it's a Integer and if  we assign a string the var it's String etc*/

        // Constans of float
        float realFloat = 1.0f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("The type float corresponds in byte to " + Float.BYTES);
        System.out.println("The type float corresponds in bytes to " + Float.SIZE);
        System.out.println("value max of float " + Float.MAX_VALUE);
        System.out.println("value min of float " + Float.MIN_VALUE);

        double realDoble = 3.4028235E39;
        System.out.println("realDoble = " + realDoble);
        System.out.println("The type doble corresponds in byte to " + Double.BYTES);
        System.out.println("The type doble corresponds in bytes to " + Double.SIZE);
        System.out.println("value max of doble " + Double.MAX_VALUE);
        System.out.println("value min of doble " + Double.MIN_VALUE);

/*
        window input
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal ; Integer.valueOf(numeroStr);

        JOptionPane.showOptionDialog(null, " mensaje");
        String mensaje = "numero binario de " + numeroDecimal;
*/

        //termil input



    }

}
