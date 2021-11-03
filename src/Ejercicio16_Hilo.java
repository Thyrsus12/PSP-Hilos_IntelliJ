public class Ejercicio16_Hilo implements Runnable {

    //int max = 0;
    int min = 0;
    Thread t;

    public Ejercicio16_Hilo(int min) {
        //this.max = max;
        this.min = min;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        //for (int i = min; min<max; min++) {
            esPrimo(min);
        //}
    }

    public static void esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        if (primo == true)
            System.out.print(numero + " ");
    }
}
