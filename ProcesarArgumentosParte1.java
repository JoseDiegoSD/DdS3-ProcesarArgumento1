//P1 Tarea
public class ProcesarArgumentosParte1 {

    public static void main(String[] args) {

        int[] arreglo = new int[args.length];

        //convertir elementos del arreglo argumentos a enteros
        for (int i = 0; i < args.length; i++) {
            arreglo[i] = Integer.parseInt(args[i]);

        }

        int sumaPrefijos = 0;

        //for sumatoria
        for (int i = 0; i < args.length ; i++) {
            sumaPrefijos += arreglo[i];
            System.out.println(arreglo[i] + ", " + sumaPrefijos);
        }

    }
}//Salgueiro Duarte