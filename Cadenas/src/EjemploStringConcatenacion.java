public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        /*String : Cadena, no es primitivo (referencia)*/

        String curso = "Programación Java"; //Crea el objeto String y lo asigna a la variable "curso"

        String me = "Sam";

        String detalle = curso + " with the student" + me; //Concatenación básica

        System.out.println(detalle);
        
        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB)); //Si no hay paréntesis en la operación se asumirá que todo será una cadena, por ende, concatena tanto el valor de la variable numeroA como de numeroB

        System.out.println(numeroA + numeroB + detalle); //Realiza la suma (es importante la precedencia y el orden)

        String detalle2 = curso.concat(" with the student ".concat(me)); //Método de la clase String para realizar concatenaciones

        System.out.println("detalle2 = " + detalle2);

    }
}
