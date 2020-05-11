import java.util.logging. Level;
import java.util.logging. Logger;


public class main {
public static void main(String[] args) {
Runnable r = new Bumi() ;
Thread bumi = new Thread(r);
bumi.start();
try {
bumi.join();
}catch (InterruptedException ex) {
Logger.getLogger (main. class.getName () ) .log (Level. SEVERE, null, ex);
}
Runnable r2 = new Mars() ;
Thread Mars = new Thread(r2) ;
Mars.start() ;
}
}