public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "21";

        /*Convertir de cadena a tipo primitivo*/

        int numeroInt = Integer.parseInt(numeroStr);

        System.out.println("numeroInt = " + numeroInt);

        /*String a double*/

        String realStr = "9123.43e-3";

        double realDouble = Double.parseDouble(realStr);

        System.out.println("realDouble = " + realDouble);

        /*String en boolean*/

        String logicStr = "true"; //También aplica con TRUE o FALSE

        boolean logicoBoolean = Boolean.parseBoolean(logicStr);

        System.out.println("logicoBoolean = " + logicoBoolean);

        /*También puede reemplazarse por var */

        /*De Primitivo a String*/

        int segundoEntero = 21;

        String segundoEnteroStr = Integer.toString(segundoEntero);

        System.out.println("segundoEnteroStr = " + segundoEnteroStr);

        /*Otra forma*/

        segundoEnteroStr = String.valueOf(segundoEntero); //Puede realizarse operaciones con el entero y/o concatenarse en caso pasarle un String

        System.out.println("segundoEnteroStr con el método valueOf = " + segundoEnteroStr);

        /*Real a String*/

        double segundoReal = 1.23456e2;

        String segundoRealStr = Double.toString(segundoReal);

        System.out.println("segundoRealStr = " + segundoRealStr);
        
        segundoRealStr = String.valueOf(segundoReal);

        System.out.println("segundoRealStr = " + segundoRealStr);

        /*Conversión de primitivo a otro primitivo */

        int i = 100012;
        short s = (short)i; //Forzamos la conversión
        long l = i;

        System.out.println("s = " + s); //Pérdida de información

        System.out.println("l = " + l);
        
        char c = (char)i;

        System.out.println("c = " + c);

        /*Tener en cuenta la compatibilidad de los tipos y el tamaño soportado de estos*/
        
    }
}
