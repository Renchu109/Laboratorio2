package Cosas.ExcepcionesEjemplo09_04;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Intenta abrir un archivo que no existe
            FileReader fileReader = new FileReader("archivo_que_no_existe.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Intenta leer una línea del archivo (lo cual fallará ya que el archivo no existe)
            String linea = bufferedReader.readLine();

            // Cerramos los recursos
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // Manejo de la excepción IOException
            System.out.println("Se produjo un error de E/S: " + e.getMessage());
        }
    }
}