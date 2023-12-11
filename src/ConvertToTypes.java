public class ConvertToTypes {
    public static void main(String[] args) {

        String numberStr = "50";
        int numberInt = Integer.parseInt(numberStr);
        System.out.println("numberInt = " + numberInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean );

        int otherNumberInt = 100;
        System.out.println("otherNumber  = " + otherNumberInt);

        String otherNumberStr = Integer.toString(otherNumberInt);
        otherNumberStr = String.valueOf(otherNumberInt); // es para convertir primitivos a un tipo String * tambien se conoce como sobrecarga de  metodos

        double real = 1.23456;
        String otheRealStr = Double.toString(real);

        int i = 10000;
        short s = (short) i ; // forzar la conversion!

    }


    //coments
    /*1-puedo usar la variable de tipo var lo que importa e sla literal  ejemplo var valor = "un valor" <- literal, quiere decir que var es un String
    2-Cuando queremos convertir un String a un int usamos  Integer.parseInt()
    3- Cuando queremos convertir un primitivo Integer a un tipo String objeto  usamos Integer.toString
    */

}
