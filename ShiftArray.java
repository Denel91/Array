package Array;

public class ShiftArray {
    public static void main(String[] args){

        int[] vettore = {1,2,3,4,5,6};

        int[] array = shift(vettore, 12);

        //shiftDestro(vettore);
        //visualizzaArray(vettore);

        //shiftSinistro(vettore);
        //visualizzaArray(vettore);
        visualizzaArray(array);



    }

    public static void shiftDestro(int[] v){
        int temp = v[v.length - 1];
        for(int i = v.length - 2; i >= 0; i--) {
            v[i + 1] = v[i];
        }

        v[0] = temp;
    }

    public static int[] shiftMultiple(int[] v, int count){
        for (int i = 0; i < count; i++){
            shiftDestro(v);
        }

        return v;
    }

    public static void shiftSinistro(int[] v){
        int temp = v[0];
        for(int i = 1; i <= v.length - 1; i++) {
            v[i - 1] = v[i];
        }

        v[v.length - 1] = temp;
    }


    public static void visualizzaArray(int[] vector){
        System.out.print("[ ");
        for(int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.print("]");
    }

    public static int[] shift(int[] v, int n){
        int k = n % v.length;
        int[] temp = new int[k];
        for (int i = 0; i < temp.length; i++){
            temp[i] = v[v.length - k + i];
            //temp[0] = v[4]; --> temp[0] = 5;
            //temp[1] = v[5]; --> temp[1] = 6;
        }

        for (int i = v.length - (k + 1); i >= 0; i--){
            v[i + k] = v[i];
            //v[5] = v[3]; i = 3; --> v[5] = 4;
            //v[4] = v[2]; i = 2; --> v[4] = 3;
            //v[3] = v[1]; i = 1; --> v[3] = 2;
            //v[2] = v[0]; i = 0; --> v[2] = 1;
        }

        for (int i = 0; i < temp.length; i++){
            v[i] = temp[i];
        }

        return v;
    }
}
