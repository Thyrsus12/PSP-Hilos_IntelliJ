import java.util.Scanner;

public class Ejercicio10_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tipo (1 o 2)");
		int tipo = sc.nextInt();
		sc.close();
		
		System.out.println("Comienza hilo");
		Ejercicio10_Hilo eh = new Ejercicio10_Hilo(tipo);
		Thread t1 = new Thread(eh);
		t1.start();

	}

}
