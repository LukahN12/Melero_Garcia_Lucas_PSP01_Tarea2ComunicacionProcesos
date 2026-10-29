package Ejercicio3;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.io.*;

public class EjecutaVisualizador {
    static void main() {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio3.Visualizador");
            pb.directory(new File(System.getProperty("user.dir") + File.separator + "out" + File.separator + "production" + File.separator + "pruebasPSP"));
            Process proceso;

            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

          String texto;

          int cantidad = Entrada.entero();
          texto = Entrada.cadena();
          pb.command().add(String.valueOf(cantidad));
          pb.command().add(texto);
          proceso = pb.start();
          proceso.waitFor();
          int salida = proceso.exitValue();
            System.out.println("valor de salida: " + salida);
            if (salida == 1){
                System.out.println("Final erroneo");
            } else {
                System.out.println("Final correcto");
            }
        }
        catch (IOException e)
        {
            System.out.println("No se pudo iniciar el proceso: " + e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
