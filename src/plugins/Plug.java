package plugins;

import static frames.Main.Auto_Save_image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/** autor - EVERYVERY */
public class Plug {
    
    private static int saveNum = 0;
    
    public static void Auto_Save() throws IOException{
        
    File saverfile = new File("autosave"+saveNum+".jpg");
    
               if(saveNum==30)saveNum=0;
               
               if(!saverfile.exists())saverfile.createNewFile();
               ImageIO.write(Auto_Save_image, "jpg", saverfile);
               
               saveNum++;
    }
    
    public static void Timered_runer() throws InterruptedException, IOException{
    /* Timered_runer its timer for some plugins
     * 50000 tick's = 1 program cycle
     */
     Thread.sleep(50000);
        System.out.println("\n[Timered_runer]: timer whas out of time");
        
        if(Auto_Save_image!=null){
            Auto_Save();
            System.out.println("[Timered_runer]: image whas saved");}
        else{            
            System.out.println("[Timered_runer]: image not includet");
        }
        
        System.out.println("[Timered_runer]: timer whas start\n");
     Timered_runer();
    }
}