package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Visualizador {
    private static final String FILTRO = "[a-z]||[A-Z]";

    static void main(String[] args) {
            if(args.length < 2){
                System.exit(1);
            }

            if (args[1].isEmpty()){
                System.exit(1);
            }
                int cantidad = Integer.parseInt(args[0]);
                String texto = args[1];

                for (int i = 0; i < cantidad;i++){
                    System.out.println(i+1 + ": " + texto);
                }
                System.out.println("Ejecucion terminada con exito!");
                System.exit(0);


    }
}
