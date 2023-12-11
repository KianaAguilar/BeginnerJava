public class StringExampleConcatenations {
    public static void main(String[] args) {

        //Los String son immutables

        String curso = "Programacion Java";
        String professor = "Andres";

        String detalle = curso + " con el instructor " + professor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));

        String detalle2 = curso.concat(" con ".concat(professor));
        System.out.println("detalle2 " + detalle2);

        /* se recomienda usar mas el concat ya que el
         +  cada vez que lo usamos para concatenar por detras lo que
          hace es que concatena atraves de un objeto de sera una instancia
         de stringBuilder*/

    }


}
