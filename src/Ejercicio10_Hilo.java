
public class Ejercicio10_Hilo implements Runnable{
	
	int tipo;
	
	public Ejercicio10_Hilo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public void run() {
		char c;
		if (tipo==1) {
			for (int i=1; i<=30; i++) {
				System.out.print(" " + i);
			}
		}else  {
			for (int i=97; i<=122; i++) {
				c = (char)i;
				System.out.print(" " + c);
			}
			/*for (char i='a'; i<='z'; i++) {
				System.out.print(" " + i);
			}*/
		}
		
	}

}
