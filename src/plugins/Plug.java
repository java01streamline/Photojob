package plugins;

import static frames.Main.Auto_Save_image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/** autor - EVERYVERY */
public class Plug {
    
    private static File saverfile = new File("image.autosave");
    
    public static void Auto_Save() throws IOException{
       ImageIO.write(Auto_Save_image, "autosave", saverfile);
    }
    
    public static void Timered_runer() throws InterruptedException, IOException{
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