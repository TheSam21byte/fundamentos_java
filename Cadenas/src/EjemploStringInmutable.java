public class EjemploStringInmutable {
    public static void main(String[] args) {
        /*String : Cadena, no es primitivo (referencia)*/

        String curso = "Programación Java"; //Crea el objeto String y lo asigna a la variable "curso"

        String me = "Sam";

        String resultado = curso.concat(me); //El método retorna un nuevo objeto, no altera a la variable curso (en este caso)

        System.out.println("curso = " + me);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado); //False

        /*Utilizando el método transform (utilizando expresiones lambda o funciones flecha)*/

        String resultado2 = curso.transform(c -> { //Recibe como parámetro (en este caso, c)
            return c + " con " + me;
        }); //Aplicamos una función de fleca

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2); //Retorna otro objeto con el cambio
        
        String resultado3 = resultado2.replace('a','A');

        System.out.println("resultado3 = " + resultado3);

    }
}
