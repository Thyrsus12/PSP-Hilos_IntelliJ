public class Ejercicio13_Hilo implements Runnable {
    String nAlumno;
    Thread t;
    public Ejercicio13_Hilo (String nAlumno) {
        this.nAlumno = nAlumno;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        int media = 0;
        String[] aAlumno= nAlumno.split(" ");
        for (int i=1; i < aAlumno.length; i++ ){
            media+=Integer.parseInt(aAlumno[i]);
        }
        System.out.println("La media del alumno " + aAlumno[0] + " es: "+ media/(aAlumno.length-1));
    }
}
