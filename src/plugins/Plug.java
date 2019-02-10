package plugins;

import static frames.Main.Auto_Save_image;
import javax.imageio.ImageIO;

/** autor - EVERYVERY */
public class Plug {
    
    public static void Auto_Save(){
       /*ImageIO.write(Auto_Save_image, "autosave", ); */
    }
    
    public static void Timered_runer() throws InterruptedException{
    /* Timered_runer its timer for some plugins
     * 50000 tick's = 1 program cycle
     */
     Thread.sleep(50000);
        System.out.println("\n[Timered_runer]: timer whas out of time");
        
        Auto_Save();
        
        System.out.println("[Timered_runer]: timer whas start\n");
     Timered_runer();
    }
}