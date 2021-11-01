public class Ejercicio12_Hilo implements Runnable{

    int diferenciador;
    int cont = 0;
    int suma;
    Thread t;

    public Ejercicio12_Hilo (int diferenciador){
        this.diferenciador = diferenciador;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        if (diferenciador == 1){
            for (cont=1; cont <= 99; cont+=2) {
                suma+=cont;
            }
            System.out.println("FIN DE EJECUCION IMPARES");
            System.out.println("Suma impares: " + suma);
        } else {
            for (cont=0; cont <= 100; cont+=2) {
                suma+=cont;
            }
            System.out.println("FIN DE EJECUCION PARES");
            System.out.println("Suma pares: " + suma);
        }

    }
}
