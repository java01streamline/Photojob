
package service;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Service {
    
    public int RGBUp(int rgb) {
        if(rgb+10 > 255) return rgb;
        return rgb+10;
    }
     public int RGBDown(int rgb) {
        if(rgb-10 <1) return rgb;
        return rgb-10;
    }
    public BufferedImage load(JPanel panel,BufferedImage pim){
    JFileChooser chooser = new JFileChooser();
        int res = chooser.showOpenDialog(panel);
        BufferedImage ret = null;
        if (res != JFileChooser.APPROVE_OPTION) {
            return null;
        }
        File f = chooser.getSelectedFile();
        if (!f.getName().endsWith(".jpg")) {
            return null;
        }
        try {
            pim = ImageIO.read(f);
        } catch (IOException ex) {
            Logger.getLogger(frames.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       ret = pim;
       return ret;
    }
    
    public void save(JPanel panel, BufferedImage im){
        JFileChooser chooser = new JFileChooser();
        chooser.setApproveButtonText("Save");
        int res = chooser.showOpenDialog(panel);
        if (res != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File f = new File(chooser.getSelectedFile()+".jpg");
        if(!f.exists()) try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ImageIO.write(im, "JPG", f);
        } catch (IOException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BufferedImage slider2(BufferedImage im) {
         if (im == null) {
            return null;
        }
        
       
        for (int i = 0; i < im.getWidth(); i++) {
            for (int j = 0; j < im.getHeight(); j++) {
                Color current = new Color(im.getRGB(i, j));
                if ( current.getGreen() <= 125 || current.getRed() >= 125) {
                    Color newColor = new Color(RGBDown(current.getRed()),
                            RGBDown(current.getGreen()),
                            RGBDown(current.getBlue()));
                    im.setRGB(i, j, newColor.getRGB());
                } else {
                    Color newColor = new Color(RGBUp(current.getRed()),
                            RGBUp(current.getGreen()),
                            RGBUp(current.getBlue()));
                    im.setRGB(i, j, newColor.getRGB());
                }
            }
        }
        return im;
       
    }
    
    public BufferedImage mirHig(BufferedImage im) {
        if (im == null) {
            return null;
        }
        

        for (int i = 0; i < im.getWidth(); i++) {
            for (int j = 0; j < im.getHeight() / 2; j++) {
                Color current = new Color(im.getRGB(i, j));

                Color current1 = new Color(im.getRGB(i, im.getHeight() - 1 - j));
                int red1 = current1.getRed();
                int blue1 = current1.getBlue();
                int green1 = current1.getGreen();
                Color newColor1 = new Color(current.getRed(), current.getGreen(), current.getBlue());
                im.setRGB(i, im.getHeight() - 1 - j, newColor1.getRGB());
                Color newColor = new Color(red1, green1, blue1);
                im.setRGB(i, j, newColor.getRGB());

            }
        }
return im;
    }
    public BufferedImage mirWih(BufferedImage im) {
   
    if (im == null) {
            return null;
        }
        

        for (int i = 0; i < im.getWidth() / 2; i++) {
            for (int j = 0; j < im.getHeight(); j++) {
                Color current = new Color(im.getRGB(i, j));

                Color current1 = new Color(im.getRGB(im.getWidth() - 1 - i, j));
                int red1 = current1.getRed();
                int blue1 = current1.getBlue();
                int green1 = current1.getGreen();
                Color newColor1 = new Color(current.getRed(), current.getGreen(), current.getBlue());
                im.setRGB(im.getWidth() - 1 - i, j, newColor1.getRGB());
                Color newColor = new Color(red1, green1, blue1);
                im.setRGB(i, j, newColor.getRGB());

            }
        }

    
    return im;
}

    public BufferedImage slider1(BufferedImage im) {
        if (im == null) {
            return null;
        }
        
        
        for (int i = 0; i < im.getWidth(); i++) {
            for (int j = 0; j < im.getHeight(); j++) {
                Color current = new Color(im.getRGB(i, j));
                Color newColor = new Color(RGBUp(current.getRed()),
                        RGBUp(current.getGreen()),
                        RGBUp(current.getBlue()));
                im.setRGB(i, j, newColor.getRGB());
            }
        }
    
        return im;}
}