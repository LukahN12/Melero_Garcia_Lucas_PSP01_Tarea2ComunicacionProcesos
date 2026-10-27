package Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneraAleatorios {

    static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto;

            while ((texto = br.readLine()) != null)
               if (!texto.isEmpty() && !texto.isBlank()){
                   System.out.println((int) (Math.random() * 10));
               }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
