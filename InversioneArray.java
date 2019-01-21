package Array;

public class InversioneArray {
    public static void main(String[] args){
        int[] vector = {1,2,3,4,5,6};

        inversioneArray(vector);
        print(vector);

    }

    public static void print(int[] m){
        for (int i = 0; i < m.length; i++){
            System.out.print(m[i] + " ");
        }
    }

    public static void inversioneArray(int[] m){
        int temp;
        for (int i = 0; i <= (m.length -1) / 2; i++){
            temp = m[i];
            m[i] = m[m.length - 1 - i];
            m[m.length - 1 - i] = temp;
        }
    }
}
