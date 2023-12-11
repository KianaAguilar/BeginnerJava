public class StringExampleimmutable {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String professor = "Andres";

        String resultado = curso.concat(professor);
        System.out.println(resultado);
        System.out.println("curso = " + curso);
        System.out.println("resuldato = " + resultado);
        System.out.println(curso == resultado); //false

        /*)Esta es una forma de trasformar, convertir o concatenar un String es una expresion lamda (funcion
        de flecha) y es mucho mas funcional

        String resultado2 = curso.transform(c -> {
        return c + " con " + professor;
    })*/

       String resultado3 = resultado.replace("a" , "A"); // remplaza letras de un String
        System.out.println(resultado3);

}


}
