/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparchbinints;

import java.util.Random;

/**
 *    DISENE UNA APP. VISUAL (GUI) PARA MANEJAR
 *    ARCHIVOS BINARIOS, DONDE MINIMO ALMACEN ENTEROS.
 * UITLICE LOS DIALOGOS QUE PROPORCIONA EL IDE (FILEDIALOG)
 */
public class AppArchBinInts {

    /**
     * @param args the command line arguments
     */
      public static void BurbujaA(int vec[])
        {
            for (int i = 0; i < vec.length - 1; i++)
                for (int j = vec.length - 1; i < j; j--)
                {
                    if (vec[j - 1] > vec[j])
                    {
                        int aux = vec[j - 1];
                        vec[j - 1] = vec[j];
                        vec[j] = aux;
                                     }
                }
          }

    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        ArchivosBinariosEnteros datos = new ArchivosBinariosEnteros();
        
        datos.guardarEnArchivo("datos1.itl");
        System.out.println("LEYENDO ARCHIVO BINARIO DE ENTEROS");
        datos.leerArchivoBinarioDeEnteros("datos1.itl");
        System.out.println("ADIOS, BYE");
  */
    //ASIGNAR DATOS ALEATORIOS A UN VECTOR
        // Y GUARDARLO EN ARCHIVO BINARIO
         // USAR QUICKSORT
        Random r = new Random();
        int []vec = new int[r.nextInt(5)+2];    //10)+10];
        System.out.println("DATOS ALEATORIOS EN EL ARREGLO ");
        for(int i = 0; i < vec.length;i++)
        {
            vec[i]=r.nextInt(90)+10;
            System.out.println(vec[i]);
        }
        ArchivosBinariosEnteros datos = new ArchivosBinariosEnteros();
        datos.guardarVecEnArchivo("Vector1.itl", vec);
        System.out.println("DATOS ALMACENADOS EN EL ARCHIVO");
        datos.leerArchivoBinarioDeEnteros("vector1.itl");
        
        //USAR EL METODO DE LA BURBUJA PARA ORDENAR LOS DATOS
        
        BurbujaA(vec);
        System.out.println("DATOS EN EL ARREGLO ORDENADO");
        
        for(int i = 0; i < vec.length;i++)
           System.out.println(vec[i]);
        
        System.out.println("GUARDANDO Y LEYENDO DATOS DESDE ARCHIVO BINARIO");
        datos.guardarVecEnArchivo("Vector1Ordenado.itl", vec);
        
        datos.leerArchivoBinarioDeEnteros("vector1Ordenado.itl");
        
    }
    
}
