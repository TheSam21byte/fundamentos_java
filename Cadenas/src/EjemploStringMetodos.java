public class EjemploStringMetodos {

    public static void main(String[] args) {

        String name = "Sam 21";

        System.out.println("name.length() = " + name.length()); //Tamaño de la cadena

        System.out.println("name.toUpperCase() = " + name.toUpperCase()); //Convertir a mayúscula

        System.out.println("name.toLowerCase() = " + name.toLowerCase()); //Convertir a minúscula

        System.out.println("name.equals(\"Sam\") = " + name.equals("Sam")); //Comparar cadenas

        System.out.println("name.equalsIgnoreCase(\"sam\") = " + name.equalsIgnoreCase("sam")); //Compara cadenas ignorando mayúsculas y minúsculas

        System.out.println("name.compareTo() = " + name.compareTo("Sam")); //Comparación lexicográficamente (basado en el orden de caracteres del sistema UNICODE).

        /*compareTo
        *
        * Si el resultado es 0 ambas cadenas son iguales
        * Si el resultado es positivo la cadena que llama al método es mayor a la del parámetro
        * Si el resultado es negativo la cadena que llame al método es menor a la del parámetro
        * */

        System.out.println("name.compareToIgnoreCase(\"aaron\") = " + name.compareToIgnoreCase("aaron")); //Compara e ignora mayúsculas y minúsculas

        System.out.println("name.charAt(0) = " + name.charAt(0)); //Recibe como parámetro el índice del argumento (int) y retorna el caracter

        System.out.println("name.substring(1) = " + name.substring(1)); //Recibe como parámetro un índice, el primer argumento se incluye

        System.out.println("name.substring(1,2) = " + name.substring(1,2)); //El segundo no se incluye

        System.out.println("name.substring(name.length()-1) = " + name.substring(name.length()-1));
        
    }
}
