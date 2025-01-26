public class EjemploString {
    public static void main(String[] args) {
        /*String : Cadena, no es primitivo (referencia)*/

        String curso = "Programación Java"; //Crea el objeto String y lo asigna a la variable "curso"

        String curso2 = new String("Programación Java"); //Creamos el objeto

        //Dos objetos son distintos (aunque compartan el mismo valor)

        boolean isTrue = curso == curso2; //Instancias distintas, retorna false

        System.out.println("curso == curso2 " + isTrue);

        //Forma correcta de comparar cadenas

        boolean isTrue2 = curso.equals(curso2); //Método de la clase String para comparar cadenas

        System.out.println("curso.equals(curso2) " + isTrue2);

        //SI EN CASO QUEREMOS IGNORAR LA MAYÚSCULA Y MINÚSCULA: Usar .equalsIgnoreCase

        String curso3 = "Programación Java";
        
        boolean isTrue3 = curso == curso3;

        System.out.println("curso3 == curso" + isTrue3);
        
    }
}
