import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 21;

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("21 en binario es = " + Integer.toBinaryString(numeroDecimal));

        //Convertir el binario en entero

        int numeroBinario = 0b10101; //Para definir un binario debemos poner el 0b al inicio

        System.out.println("numeroBinario = " + numeroBinario);

        //Sistema octal

        int numeroOctal = 01232; //Anteponer el 0

        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("21 en octal es = " + Integer.toOctalString(numeroDecimal));

        //Sistema hexadecimal

        int numeroHexadecimal = 0x1f4; //Anteponer 0x (las letras pueden ser mayúsculas o minúsculas)

        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        System.out.println("21 en hexadecimal es = " + Integer.toHexString(numeroDecimal));

    }
}
