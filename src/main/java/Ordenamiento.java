package com.proyecto.ordenamiento;

import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Cuantos numeros deseas ingresar?: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

for (int i = 0; i < n; i++) {
   
    arr[i] = rand.nextInt(100); 
}
        
        ordenar(arr);
       System.out.println("Arreglo ordenado: " + java.util.Arrays.toString(arr));
        sc.close();
    }

    
    //metodo burbuja 
    /*
    private static void ordenar(int v[]) {
        // i llega hasta el penúltimo elemento
        for (int i = 0; i < v.length - 1; i++) {
            // j debe llegar hasta el final del arreglo (v.length)
            for (int j = i + 1; j < v.length; j++) { 
                if (v[i] > v[j]) {
                    // Intercambio de valores
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
    */
       //metodo por incersion
  private static void ordenar(int v[]) {
    for (int i = 1; i < v.length; i++) {
        int clave = v[i]; 
        int j = i - 1;
while (j >= 0 && v[j] > clave) {
            v[j + 1] = v[j];
            j--;
}
v[j + 1] = clave;
}
}
  
}
