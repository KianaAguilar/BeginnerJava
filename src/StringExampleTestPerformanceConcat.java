public class StringExampleTestPerformanceConcat {
    public static void main(String[] args) {

        /* Test rendimiento concatenar con operador (+) vs método concat() vs StringBuilder*/

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); //-> es mutable
        long star = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            //   c = c.concat(a).concat(b); //tardo 1 ms 1- forma de concatenar
            //c += a + b; 2- forma de concatenar
           // sb.append(a).append(b);// 3 - forma de concatenar tarda 0 ms
            //sb.append(b);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - star);
        System.out.println("c =" + c);
        System.out.println("sb " + sb.toString());


    }


}
