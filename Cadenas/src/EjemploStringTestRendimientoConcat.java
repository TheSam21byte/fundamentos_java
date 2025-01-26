public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis(); //Tomamos el tiempo en milisegundos

        StringBuilder sb = new StringBuilder(a); //Mutable

        //For para realizar la concatenación constante

        for(int i = 0; i <= 100000; i++){
//            c = c.concat(a).concat(b).concat("\n"); //500 => 1 a 2 ms, 1000 => 2 a 4ms, 10000 => 84ms, 100000 => 4403ms (4s)
//            c += a + b + "\n"; //500 => 8 a 13 ms, 1000 => 11 a 13 ms, 10000 => 47ms, 100000 => 1621ms (1.6s)
            sb.append(a)
                    .append(b)
                    .append("\n"); //500 => 0 a 1 ms, //1000 => 0 a 1 ms, 10000 => 2ms, 100000 => 10ms
        }

        long fin = System.currentTimeMillis();

        System.out.println("c = " + c);

        System.out.println("sb.toString() = " + sb.toString());

        System.out.println(fin - inicio);

        /*
        * Conclusiones
        *
        * Con StringBuilder : No importa la cantidad, es rápido
        * Con el método .concat() : Entre 500 y 1000 iteraciones fue rápido, luego se vio superado por el operador +
        * Con el operador + : Con una cantidad de datos menor de 10000 (aproximadamente) es lento
        * */


    }
}
