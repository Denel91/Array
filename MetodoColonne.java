package Array;

public class MetodoColonne {
    public static void main(String[] args) {

        int[][] matrice = {{1,2,3,4},
                           {1,2,3,4}};

        int[] x = {0,2};

        colonne(matrice, x);
        print(matrice);
    }

    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void colonne(int[][] m, int[] a){
        for (int j = 0; j < m.length; j++){
            for (int i = 0; i < a.length; i++) {
                m[i][a[j]] = 0;
            }
        }
    }
}
