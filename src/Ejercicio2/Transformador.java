package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Transformador {
    static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto;

            while ((texto = br.readLine()) != null)
                System.out.println(texto.toUpperCase());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
