package Ejercicio1;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.io.*;

public class EjecutaValidaArgumentos {
    static void main() {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio1.ValidaArgumentos");
            pb.directory(new File(System.getProperty("user.dir") + File.separator + "out" + File.separator + "production" + File.separator + "pruebasPSP"));
            Process proceso = pb.start();

            // Para ENVIARLE datos al hijo
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
            // Para LEER lo que el hijo escribe
            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            // Para leer lo que escribe el usuario en el teclado
            System.out.print("Ingresa un argumento: ");
            String texto = Entrada.cadena();
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            String linea;
            while (!(linea = texto).equals("fin"))
            {
                bw.write(linea);
                bw.newLine();
                bw.flush();

                System.out.println(lector.readLine());
            }

            bw.close();
            lector.close();
            teclado.close();
            proceso.destroy();
            System.out.println("Padre terminado");
        }
        catch (IOException e)
        {
            System.out.println("No se pudo iniciar el proceso: " + e.getMessage());
        }
    }
}
