public class PrimitivosFloat {
    public static void main(String[] args) {

        //Por defecto es 0.0

        float numeroFloat = 10.5f;

        System.out.println("numeroFloat = " + numeroFloat);

        // Notación científica

        float realFloat = 2.12e3f; //Multiplicar por 10 ^ 3, es decir, el resultado sería: 2120.0

        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 1.5e-4f; //Multiplicar por 10 ^ -4, es decir, el resultado sería: 0.00015

        System.out.println("realFloat2 = " + realFloat2);
        
        float realFloat3 = 0.00015f;

        System.out.println("realFloat3 = " + realFloat3);

        System.out.println("float correspondiente en bytes a = " + Float.BYTES);
        System.out.println("float correspondiente en bits a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);


        // Doble precisión

        double numeroDouble = 3.4028235E307; //La literal por defecto toma el valor de double, no es necesario poner nada

        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("double correspondiente en bytes a = " + Double.BYTES);
        System.out.println("double correspondiente en bits a = " + Double.SIZE);
        System.out.println("Valor máximo para double = " + Double.MAX_VALUE);
        System.out.println("Valor mínimo para double = " + Double.MIN_VALUE);

        //Var

        var numeroVarFloat = 123;

    }
}
