public class Ejercicio13_Hilo implements Runnable {
    String Nalumno;
    Thread t;
    public Ejercicio13_Hilo (String Nalumno) {
        this.Nalumno = Nalumno;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        int media = 0;
        String[] Aalumno= Nalumno.split(" ");
        System.out.print("La media del alumno " + Aalumno[0] + " es: ");
        for (int i=1; i < Aalumno.length; i++ ){
            media+=Integer.parseInt(Aalumno[i]);
        }
        System.out.println(media/(Aalumno.length-1));
    }
}
