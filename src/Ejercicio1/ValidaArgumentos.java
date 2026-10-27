package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidaArgumentos {
    private static final String FILTRO = "[a-z]||[A-Z]";

    static void main(String[] args) {

        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String texto;

            while ((texto = br.readLine()) != null){
                if (texto.isEmpty()){
                    System.out.println(1);
                } else if (texto.matches(FILTRO)){
                    System.out.println(2);
                } else if (Integer.parseInt(texto) < 0){
                        System.out.println(3);
                } else {
                        System.out.println(4);
                }
            }

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
