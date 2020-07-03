package hilos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Lectura l = new Lectura();
        Lectura2 l2 = new Lectura2();
        Thread hilo = new Thread(l);
        Thread hilo2 = new Thread(l2);
        hilo.start();
        hilo2.start();

    }
}
