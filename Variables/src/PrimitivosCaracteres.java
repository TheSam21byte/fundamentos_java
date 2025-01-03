public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char character = '\u0040'; //Basado en Unicode
        char characterDecimal = 64; //@ en decimal
        char characterSymbol = '@';
        
        System.out.println("character = " + character);
        System.out.println("characterDecimal = " + characterDecimal);
        System.out.println("characterSymbol = " + characterSymbol);
        System.out.println("character = characterDecimal " + (character == characterDecimal));
        System.out.println("character = characterSymbol " + (character == characterSymbol));

        //En caso de var

        var characterVar = 64;
        System.out.println("characterVar = " + characterVar); //Imprimirá el entero, no el @ en decimal

        var characterVar2 = '\u0040'; //Imprimirá @

        System.out.println("characterVar2 = " + characterVar2);

        System.out.println("Valor de char en bytes " + Character.BYTES);
        System.out.println("Valor de char en bits " + Character.SIZE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);

        //Caracteres especiales

        char espacio = ' '; //Puede ser \u0020 en unicode;

        System.out.println("espacio" + espacio + "= " + espacio);

        char retroceso = '\b';

        System.out.println("retroceso =" + retroceso);
        
        char tabulador = '\t';

        System.out.println("tabulador = " + tabulador + "Probando tabulador");

        char nuevaLinea = '\n';

        System.out.println("nuevaLinea = " + nuevaLinea + "Probando nueva línea");

        char retornoCarro = '\r'; //Se comportan distinto en función del sistema operativo

        System.out.println("retornoCarro = " + retornoCarro);

        System.out.println();
    }
}
