package Array;

import java.util.Scanner;

public class IndexArray {
    public static final int NUMERO_DI_ELEMENTI = 10;

    public static void main(String args[]) {
        System.out.println("Inserire una lista di interi non negativi.");
        System.out.println("Terminare la sequenza con un numero negativo.");

        int[] lista = new int[NUMERO_DI_ELEMENTI];
        Scanner tastiera = new Scanner(System.in);
        int numero = tastiera.nextInt();
        int i = 0;
        while (numero >= 0) {
            lista[i] = numero;
            i++;
            numero = tastiera.nextInt();
        }

        print(lista);
    }

    public static void print(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }
}
