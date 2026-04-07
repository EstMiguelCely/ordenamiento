public class Ordenamiento {
    public static void main(String[] args) {
        int arr[] = {5, 2, 11, -8, 115, 56, -3};
        ordenar(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j < v.length ; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}
