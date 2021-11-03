public class Ejercicio14_Main {

    public static void main(String[] args) {
        int[] array1 = new int[100000];
        int[] array2 = new int[100000];

        llenar(array1);
        llenar(array2);

        long inicio = System.currentTimeMillis();
        ordenar(array1);
        ordenar(array2);
        long fin = System.currentTimeMillis();
        System.out.println((fin - inicio)/1000 + " segundos en ordenar los arrays");

        //imprimir(array1);
    }

    public static void imprimir(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void llenar(int[] array) {
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random()*1000);
        }
    }

    public static void ordenar(int[] array) {
        /*int aux = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length-1; j++) {
                if (array[j+1] < array[j]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }*/

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

}