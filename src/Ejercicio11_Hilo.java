public class Ejercicio11_Hilo implements Runnable{
    String nombre;
    Thread t;

    Ejercicio11_Hilo (String nombre) {
        this.nombre = nombre;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println(nombre + ": " + i + "m");
        }
        System.out.println(nombre + " A TERMINADO!!!");
    }
}
