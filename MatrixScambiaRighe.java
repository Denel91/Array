package Array;
public class MatrixScambiaRighe {
  public static void main(String[] args) {
    char[][] a = {{'a','b','c','d'},
                  {'e','f','g','h'},
                  {'i','j','k','l'}};

    char [][] b = {{'m','n','o','p'},
                   {'q','r','s','t'},
                   {'u','v','x','y'}};

    int[] c = {0,2};

    stampa(a);
    stampa(b);
    scambia(a, b, c);
    stampa(a);
    stampa(b);

  }

  public static void scambia(char[][] a, char[][] b, int[] c) {
    char temp;
    for(int i = 0; i < c.length; i++){
      for(int j = 0; j < a[i].length; j++){
        temp = a[c[i]][j];
        a[c[i]][j] = b[c[i]][j];
        b[c[i]][j] = temp;
      }
    }
  }

  static void stampa(char[][] a) {
    System.out.println("----------------------------------");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }
  }
}
