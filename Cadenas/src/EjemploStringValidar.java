public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean isNull = curso == null; //Primera validación

        System.out.println("isNull = " + isNull);

        if(!isNull){ //Si isNull es diferente a true

            //Null Pointer Exception

            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido".concat(curso));
        }

        System.out.println("Bienvenido " + curso); //Evita lanzar Null Pointer Exception

        curso = "";

        boolean isVoid = curso.length() == 0; //Con el método .length obtenemos un entero con el tamaño de la cadena

        if(isVoid){
            System.out.println("Cadena vacía");
        }else{
            System.out.println("Bienvenido ".concat(curso));
        }

        //Con el método isEmpty

        boolean isVoid2 = curso.isEmpty(); //Retorna un boolean

        if(isVoid2){
            System.out.println("Cadena vacía 2");
        }

        //Con el método isBlank

        boolean isVoid3 = curso.isBlank(); //Valida que no sea nulo y que no esté vacío

        if(isVoid3){
            System.out.println("Cadena nula o vacía");
        }


    }
}
