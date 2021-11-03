public class Ejercicio16_Main {
    public static void main(String[] args) {

        for (int i = 1; i<1000000; i++) {
            new Ejercicio16_Hilo(i);
        }

        /*Runtime runtime = Runtime.getRuntime();
        int numCores = runtime.availableProcessors();
        System.out.println(numCores);*/
    }
}
