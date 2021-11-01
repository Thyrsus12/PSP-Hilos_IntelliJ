import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio13_Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("notas.txt"));
            String a;
            do {
                a = br.readLine();
               if (a!=null) {
                   new Ejercicio13_Hilo(a);
               }
            } while (a!=null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
