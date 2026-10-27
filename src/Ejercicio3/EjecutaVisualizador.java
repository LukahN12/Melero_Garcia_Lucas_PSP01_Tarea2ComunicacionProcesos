package Ejercicio3;

import java.io.*;

public class EjecutaVisualizador {
    static void main() {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio3.Visualizador");
            pb.directory(new File(System.getProperty("user.dir") + File.separator + "out" + File.separator + "production" + File.separator + "pruebasPSP"));
            Process proceso = pb.start();

            // Para ENVIARLE datos al hijo
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
            // Para LEER lo que el hijo escribe
            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            // Para leer lo que escribe el usuario en el teclado
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            String linea;
            while (!(linea = teclado.readLine()).equals("fin"))
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
