public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true; //Por defecto es false
        boolean datoLogico2 = Boolean.FALSE; //Retorna instancia de la clase Boolean (objeto de tipo Boolean)

        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoLogico2 = " + datoLogico2);

        //Operaciones booleanas

        double d = 92813129.42E-3; //92813.12942
        float f = 1.2345e2f; //123.45

        datoLogico = d < f;

        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3 - 2 == 1;

        System.out.println("esIgual = " + esIgual);

        boolean esIgual2 = 4 - 21 == 12;

        System.out.println("esIgual2 = " + esIgual2);

    }
}
