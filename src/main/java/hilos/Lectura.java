package hilos;

import java.io.BufferedReader;
import java.io.FileReader;

public class Lectura implements Runnable{

    @Override
    public void run() {
        FileReader entrada = null;
        try {
            String linea = "";
            entrada = new FileReader("src/main/java/resources/1.txt");
            BufferedReader br = new BufferedReader(entrada);
            while ((linea = br.readLine()) != null) {
                System.out.print(linea);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
