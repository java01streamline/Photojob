
package service;

public class Service {
    
    public int RGBUp(int rgb) {
        if(rgb+10 > 255) return rgb;
        return rgb+10;
    }
    
}
