public class PrimitivosEnteros {
    public static void main(String[] args) {

        //byte de -128 a 127

        byte numeroByte = 127;

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde a bytes a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde a bits a: " + Byte.SIZE);
        System.out.println("Valor mínimo del tipo de dato primitivo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del tipo de dato primitivo byte: " + Byte.MAX_VALUE);

        //short

        short numeroShort = 32767;

        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde a bytes a: " + Short.BYTES);
        System.out.println("Tipo short corresponde a bits a: " + Short.SIZE);
        System.out.println("Valor mínimo del tipo de dato primitivo short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del tipo de dato primitivo short: " + Short.MAX_VALUE);

        //int

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde a bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde a bits a: " + Integer.SIZE);
        System.out.println("Valor mínimo del tipo de dato int byte: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del tipo de dato int byte: " + Integer.MAX_VALUE);

        //long

        long numeroLong = 9223372036854775807L; //Siempre debe llevar la L, literal por defecto en entero
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde a bytes a: " + Long.BYTES);
        System.out.println("Tipo long corresponde a bits a: " + Long.SIZE);
        System.out.println("Valor mínimo del tipo de dato long byte: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del tipo de dato long byte: " + Long.MAX_VALUE);

        //Var

        var numeroVar = 127L; //Por defecto es int, se puede cambiar con la literal (ejemplo, long con la L al final, etc)

    }
}
