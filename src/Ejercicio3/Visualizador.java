package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Visualizador {
    private static final String FILTRO = "[a-z]||[A-Z]";

    static void main(String[] args) {

        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto;

            while ((texto = br.readLine()) != null){

            }

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
