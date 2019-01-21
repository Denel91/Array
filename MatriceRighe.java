package Array;

public class MatriceRighe {
    public static void main(String[] args) {

        int[][] m = {{1,2,3,4},
                     {1,2,3,4},
                     {1,2,3,4},
                     {1,2,3,4},
                     {1,2,3,4}};

        int[] a = {0,2};

       // visualizza(m);
      //  righe(m,a);
        System.out.println("*****************");
        azzeraRighe(m, 2);
        visualizza(m);

    }

    public static void righe(int[][] m, int[] a) {
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < m[i].length; j++) {
                m[a[i]][j] = 0;
            }
        }
    }

    public static void visualizza(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void azzeraRighe(int[][] m, int k) {
        for(int j = 0; j < m[k].length; j++) {
            m[k][j] = 0;
        }
    }
}
