package Array;

import java.util.Scanner;

public class Matrice {
    public static void main(String[] args) {

        int[][] matrix = {{0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0}};

        int[][] matrice = {{1, 2, 3, 7, 9},
                           {4, 5, 6, 8, 2},
                           {7, 8, 9, 3, 8},
                           {5, 2, 6, 4, 5},
                           {8, 7, 9, 1, 7}};

        int[] array = new int[25];

        // print(matrix);
        // assegnaUnoInferiore(matrix);
        // diagonalePrimaria(matrix);
        // diagonaleSecondaria(matrix);
        // print(matrix);
        // visualizzaVettore(estraiDiagonaleSecondaria(matrice));
        // assegnaUnoSuperioreDiagonaleInversa(matrix);
        // assegnaUnoSuperiore(matrix);
        // assegnaRiga(matrix);
        // assegnaColonna(matrix);
        // azzeraColonna(matrice);
        // print(matrix);

        Scanner tastiera = new Scanner(System.in);
    /*
        System.out.print("Inserisci l'indice della prima riga da cambiare: ");
        int riga_1 = tastiera.nextInt();
        System.out.print("Inserisci l'indice della seconda riga da cambiare: ");
        int riga_2 = tastiera.nextInt();

        scambiaRighe(matrice,riga_1,riga_2);
        print(matrice);
    */

    /*
        System.out.print("Inserisci l'indice della colonna da cambiare: ");
        int colonna_1 = tastiera.nextInt();
        System.out.print("Inserisci l'indice della seconda colonna da cambiare: ");
        int colonna_2 = tastiera.nextInt();

        scambiaColonne(matrice,colonna_1,colonna_2);
        print(matrice);
    */

        //linearizza(matrice,array);

        //visualizzaArray(array);

        azzeraCorniceEsterna(matrice);
        print(matrice);
    }

    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void visualizzaArray(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.print("]");
    }

    public static void assegnaUnoInferiore(int[][] m) {
        for (int i = 1; i < m.length; i++) {
            m[i][i - 1] = 1;
        }
    }

    public static void assegnaUnoSuperiore(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            m[i][i + 1] = 1;
        }
    }

    public static void assegnaUnoSuperioreDiagonaleInversa(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            m[i][m.length - 1 - (i + 1)] = 1;
        }
    }

    public static void diagonalePrimaria(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            m[i][i] = 1;
        }
    }

    public static void diagonaleSecondaria(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            m[i][m.length - 1 - i] = 1;
        }
    }

    public static int[] estraiDiagonaleSecondaria(int[][] m) {
        int[] vettore = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            vettore[i] = m[i][m.length - 1 - i];
        }

        return vettore;
    }

    public static void visualizzaVettore(int[] v) {
        System.out.print("[ ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.print(" ]");
    }

    public static void assegnaRiga(int[][] m) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci r per selezionare la riga: ");
        int r = tastiera.nextInt();
        for (int j = 0; j < m[r].length; j++) {
            m[r][j] = 1;
        }
    }

    public static void assegnaColonna(int[][] m) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci c per selezionare la colonna: ");
        int c = tastiera.nextInt();
        for (int i = 0; i < m.length; i++) {
            m[i][c] = 1;
        }
    }

    public static void azzeraColonna(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            m[i][i] = 0;
        }
    }

    public static void scambiaRighe(int[][] m, int a, int b) {
        int[] temp = new int[m.length];
        temp = m[a];
        m[a] = m[b];
        m[b] = temp;
    }

    public static void scambiaColonne(int[][] m, int c1, int c2) {
        int temp;
        for (int i = 0; i < m.length; i++) {
            temp = m[i][c1];
            m[i][c1] = m[i][c2];
            m[i][c2] = temp;
        }
    }

    public static void linearizza(int[][] m, int[] v) {
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                v[k] = m[i][j];
                k++;
            }
        }
    }

    public static void reverseDiagonal(int[][] m) {
        for (int i = 0; i < m.length / 2; i++) {
            int temp = m[i][i];
            m[i][i] = m[m.length - 1 - i][m.length - 1 - i];
            m[m.length - 1 - i][m.length - 1 - i] = temp;
        }
    }

    public static void sposta(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            int temp = m[i][i];
            m[i][i] = m[(m.length - 1) / 2 - 1 + i][(m.length - 1) / 2 - 1 + i];
            m[(m.length - 1) / 2 - 1 + i][(m.length - 1) / 2 - 1 + i] = temp;
        }
    }

    public static void stampaCorniceEsterna(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                if (i == 0 || i == m.length - 1 || j == 0 || j == m[0].length - 1)
                    System.out.print(m[i][j] + " ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void azzeraCorniceEsterna(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                if (i == 0 || i == m.length - 1 || j == 0 || j == m[0].length - 1)
                    m[i][j] = 0;
        }
    }
}




