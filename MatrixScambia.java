package Array;
public class MatrixScambia {
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
    for(int j = 0; j < c.length; j++){
      for(int i = 0; i < a.length; i++){
        temp = a[i][c[j]];
        a[i][c[j]] = b[i][c[j]];
        b[i][c[j]] = temp;
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
