package photojob;

import frames.Authorization;
import plugins.Plug;
import static plugins.Plug.Timered_runer;

public class Photojob {

    public static void main(String[] args) throws InterruptedException {
        
        new Authorization().setVisible(true);  
        Timered_runer();
    }
    
    
}
