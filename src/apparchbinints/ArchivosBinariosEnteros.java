/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparchbinints;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class ArchivosBinariosEnteros 
{

    public void guardarEnArchivo(String nomarch)
    {
      Scanner sc = new Scanner(System.in);
      FileOutputStream fos = null;
      DataOutputStream salida = null;
      int n;
      try 
      {
         fos = new FileOutputStream(nomarch);
        
         salida = new DataOutputStream(fos);
         System.out.println("Introduce números enteros. \n para terminar: -1 ");
         n = sc.nextInt();
         while (n != -1) 
         {
             salida.writeInt(n);//se escribe el número entero en el ficher
             n = sc.nextInt();
         }
      } 
      catch (FileNotFoundException e) 
      {
          System.out.println(e.getMessage());
      } 
      catch (IOException e) 
      {
          System.out.println(e.getMessage());
      } 
      finally 
      {
         try 
         {
           if (fos != null) 
           {
              fos.close();
           }
           if (salida != null) 
           {
             salida.close();
           }
         } 
         catch (IOException e) 
         {
              System.out.println(e.getMessage());
         }
      }
    }
    
    public void guardarVecEnArchivo(String nomarch, int []vec)
    {
      FileOutputStream fos = null;
      DataOutputStream salida = null;
//      int n;
      try 
      {
         fos = new FileOutputStream(nomarch); //"datos.itl");
        
         salida = new DataOutputStream(fos);
         for(int i = 0; i < vec.length; i++) 
         {
             salida.writeInt(vec[i]);//se escribe el número entero en el ficher
         }
      } 
      catch (FileNotFoundException e) 
      {
          System.out.println(e.getMessage());
      } 
      catch (IOException e) 
      {
         System.out.println(e.getMessage());
      } 
      finally 
      {
         try 
         {
           if (fos != null) 
           {
              fos.close();
           }
           if (salida != null) 
           {
             salida.close();
           }
        } 
        catch (IOException e) 
        {
              System.out.println(e.getMessage());
        }
      }
    }
    public void leerArchivoBinarioDeEnteros(String nomarch)
    {
      
      FileInputStream fis = null;
      DataInputStream entrada = null;
      int n;
      try 
      {
        fis = new FileInputStream(nomarch);
        entrada = new DataInputStream(fis);
        while (true)
        {
           n = entrada.readInt();//se lee  un entero del fichero
           System.out.println(n);//se muestra en pantalla
        }
      } 
      catch (FileNotFoundException e) 
      {
          System.out.println(e.getMessage());
      }
      catch(EOFException e)
      {
         System.out.println("Fin del archivo ");
      } 
      catch (IOException e) 
      {
         System.out.println(e.getMessage());
      } 
      finally 
      {
         try 
         {
           if (fis != null)
           {
              fis.close();
           }
           if (entrada != null) 
           {
              entrada.close();
           }
         } 
         catch (IOException e) 
         {
            System.out.println(e.getMessage());
         }
       }
      
      }
}
    

