public class StringExample {
    public static void main(String[] args) {

       String  curso1 = "Programacion Java"; // -> Es de referencia y se crea  el objeto de manera implicita - por debajo -
       String  curso2 = new String("Programacion Java"); // -> Es de referencia y se crea de manera explicita

       //Estos son objetos distintos y cada uno tiene su propio identificador en memoria

        boolean esIgual = curso1 == curso2;  //Compara la referencia dle objeto.
        System.out.println(esIgual);

        esIgual = curso1.equals(curso2);  //Compara el texto, valor.
        System.out.println(esIgual);

        esIgual = curso1.equalsIgnoreCase(curso2);  //Ignora si son minusculas.
        System.out.println(esIgual);

        String curso3 = "Programacion Java";
        esIgual = curso1 == curso3; // asigna la referencia de curso1 no crea mas objetos asi qu ela respuesta seria true
        System.out.println("esIgual " + esIgual);



    }
}
