package tablasmultiplicar;

public class TablasMultiplicar {

    public static void main(String[] args) {
        tabla(1, 5);
        System.out.println("");
        for (int i = 1; i <= 11; i++) {
            System.out.print("-------");
        }
        System.out.println("");
        tabla(6, 10);
    }

    /**
     * Crea la tabla de multiplicar multiplicado del 1 al 10 del primer numero
     * hasta el ultimo numero
     *
     * @param numinicio numero de la primera tabla
     * @param numfinal numero de la ultima tabla
     */
    private static void tabla(int numinicio, int numfinal) {
        for (int i = 1; i <= 10; i++) {
            for (int j = numinicio; j <= numfinal; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println("");
        }
    }
}
