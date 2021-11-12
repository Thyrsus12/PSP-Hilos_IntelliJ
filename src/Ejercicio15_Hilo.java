public class Ejercicio15_Hilo implements Runnable{

    Thread t;

    public Ejercicio15_Hilo() {
        t = new Thread(this);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int[] array = new int[100000];

        llenar(array);

        long inicio = System.currentTimeMillis();
        ordenar(array);
        long fin = System.currentTimeMillis();
        System.out.println((fin - inicio)/1000 + " segundos en ordenar el array del hilo: " + t.getName());
        mostrar(array);
    }

    public static void llenar(int[] array) {
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random()*1000);
        }
    }

    public static void ordenar(int[] array) {
        for (int i=1; i< array.length; i++){
            int j = i-1;
            int aux = array[i];
            while (j>=0 && aux<array[j]) {
                array[j+1] = array[j];
                array[j] = aux;
                j--;
            }
        }
    }

    public static void mostrar(int[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}
