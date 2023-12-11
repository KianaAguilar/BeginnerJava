public class StringValid {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo " + esNulo);

        if (esNulo) {
            curso = "Java";
        }

        boolean esVacio = curso.length() == 0;
        boolean esVacio2 = curso.isEmpty();
        boolean esBlanco = curso.isBlank(); //Valida que sea distinto a null,
                                            // empty o que tenga contenio que sea distinto a
                                            //un espacio en blanco o que tenga un caracter de espacio
                                            // se usa desde JDK 11

        if (!esVacio2) {
            System.out.println(curso.toUpperCase());
            System.out.println(" Welcome to course ".concat(curso));
        }

    }


}
