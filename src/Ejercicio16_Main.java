public class Ejercicio16_Main {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        int numCores = runtime.availableProcessors();
        int min = 1;
        int max = 0;

        for (int i = 1; i<=numCores; i++) {
            max = min + (1000000/numCores);
            new Ejercicio16_Hilo(min, max, String.valueOf(i));
            min = max;
        }
    }
}
