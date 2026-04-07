import java.util.Scanner;
import java.util.Arrays;

public class Ordenamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Seleccione el metodo de ordenamiento:");
        System.out.println("1. Burbuja");
        System.out.println("2. Insercion");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                ordenar(arr);
                break;
            case 2:
                insercion(arr);
                break;
            default:
                System.out.println("Opcion invalida");
                return;
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));

        sc.close();
    }


    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j < v.length -i -1; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
    private static void insercion(int v[]) {
        for (int i = 1; i < v.length; i++) {
            int key = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > key) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = key;
        }
    }
}
