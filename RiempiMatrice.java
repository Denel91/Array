package Array;

public class RiempiMatrice {
    public static void main(String[] args) {
        double[][] matrice = {{1,2,3},
                              {4,5,6}};

        double[] vettore = {7,8} ;

        riempi(matrice,vettore,0);
        visualizza(matrice);
    }

    public static void riempi(double[][] m, double[] a, int k) {
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = a[(k % a.length)];
                k++;
            }
        }
    }

    public static void visualizza(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }
}
