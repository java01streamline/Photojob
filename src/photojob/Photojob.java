package photojob;

import frames.Authorization;
import java.io.IOException;
import static plugins.Plug.Timered_runer;

public class Photojob {

    public static void main(String[] args) throws InterruptedException, IOException {
        
        new Authorization().setVisible(true);  
        Timered_runer();
    }
    
    
}
