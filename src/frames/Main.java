/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import service.Service;

/**
 *
 * @author Streamline
 */
public class Main extends javax.swing.JFrame {

    private BufferedImage im;
    private Service service;

    public Main() {
        this.service = new Service();
        this.im = null;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoadInImage = new javax.swing.JButton();
        SliderVividness = new javax.swing.JSlider();
        sliderContrast = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MirrorH = new javax.swing.JButton();
        MirrorW = new javax.swing.JButton();
        SliderToBlue = new javax.swing.JSlider();
        SliderToRed = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        photoField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));

        jPanel1.setBackground(new java.awt.Color(193, 218, 223));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        LoadInImage.setBackground(new java.awt.Color(0, 102, 255));
        LoadInImage.setForeground(new java.awt.Color(255, 255, 255));
        LoadInImage.setText("Load");
        LoadInImage.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        LoadInImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadInImageActionPerformed(evt);
            }
        });

        SliderVividness.setBackground(new java.awt.Color(102, 102, 102));
        SliderVividness.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SliderVividness.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderVividnessStateChanged(evt);
            }
        });

        sliderContrast.setBackground(new java.awt.Color(102, 102, 102));
        sliderContrast.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sliderContrast.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderContrastStateChanged(evt);
            }
        });

        jLabel1.setText("Vividness");

        jLabel2.setText("Contrast");

        MirrorH.setText("Mirror height");
        MirrorH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MirrorHActionPerformed(evt);
            }
        });

        MirrorW.setText("Mirror widht ");
        MirrorW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MirrorWActionPerformed(evt);
            }
        });

        SliderToBlue.setBackground(new java.awt.Color(0, 102, 204));
        SliderToBlue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SliderToRed.setBackground(new java.awt.Color(204, 0, 0));
        SliderToRed.setForeground(new java.awt.Color(0, 0, 0));
        SliderToRed.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("BLUE");

        jLabel4.setText("RED");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoadInImage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SliderVividness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SliderToRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sliderContrast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(SliderToBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MirrorW, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(MirrorH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SliderVividness, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MirrorH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderContrast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MirrorW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SliderToBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SliderToRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoadInImage)
                .addContainerGap())
        );

        photoField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        photoField.setMaximumSize(new java.awt.Dimension(500, 500));
        photoField.setMinimumSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(photoField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadInImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadInImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        int res = chooser.showOpenDialog(jPanel1);
        if (res != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File f = chooser.getSelectedFile();
        if (!f.getName().endsWith(".jpg")) {
            return;
        }
        try {
            im = ImageIO.read(f);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        display();
    }//GEN-LAST:event_LoadInImageActionPerformed

    private void SliderVividnessStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderVividnessStateChanged
        if (im == null) {
            return;
        }
        if (photoField.getIcon() == null) {
            return;
        }
        
        for (int i = 0; i < im.getWidth(); i++) {
            for (int j = 0; j < im.getHeight(); j++) {
                Color current = new Color(im.getRGB(i, j));
                Color newColor = new Color(service.RGBUp(current.getRed()),
                        service.RGBUp(current.getGreen()),
                        service.RGBUp(current.getBlue()));
                im.setRGB(i, j, newColor.getRGB());
            }
        }
        display();
    }//GEN-LAST:event_SliderVividnessStateChanged

    private void sliderContrastStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderContrastStateChanged
        if (im == null) {
            return;
        }
        if (photoField.getIcon() == null) {
            return;
        }
        int s= SliderVividness.getWidth();
        for (int i = 0; i < im.getWidth(); i++) {
            for (int j = 0; j < im.getHeight(); j++) {
                Color current = new Color(im.getRGB(i, j));
                if ( current.getGreen() <= 125 || current.getRed() >= 125) {
                    Color newColor = new Color(service.RGBDown(current.getRed()),
                            service.RGBDown(current.getGreen()),
                            service.RGBDown(current.getBlue()));
                    im.setRGB(i, j, newColor.getRGB());
                } else {
                    Color newColor = new Color(service.RGBUp(current.getRed()),
                            service.RGBUp(current.getGreen()),
                            service.RGBUp(current.getBlue()));
                    im.setRGB(i, j, newColor.getRGB());
                }
            }
        }
        
       
        display();
    }//GEN-LAST:event_sliderContrastStateChanged

    private void MirrorHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MirrorHActionPerformed
        if (im == null) {
            return;
        }
        if (photoField.getIcon() == null) {
            return;
        }
      
        for (int i = 0; i < im.getWidth(); i++) {
            for (int j = 0; j < im.getHeight()/2; j++) {
                Color current = new Color(im.getRGB(i, j));
                
                Color current1 = new Color(im.getRGB(i, im.getHeight()-1- j));
                int red1=current1.getRed();
                int blue1=current1.getBlue();
                int green1=current1.getGreen();    
                Color newColor1 = new Color(current.getRed(),current.getGreen(),current.getBlue());
                    im.setRGB(i, im.getHeight()-1- j, newColor1.getRGB());
                Color newColor = new Color(red1,green1, blue1);
                    im.setRGB(i,j, newColor.getRGB());    
            
            }
        }
        
       
        display();
    }//GEN-LAST:event_MirrorHActionPerformed

    private void MirrorWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MirrorWActionPerformed
        if (im == null) {
            return;
        }
        if (photoField.getIcon() == null) {
            return;
        }
      
        for (int i = 0; i < im.getWidth()/2; i++) {
            for (int j = 0; j < im.getHeight(); j++) {
                Color current = new Color(im.getRGB(i, j));
                
                Color current1 = new Color(im.getRGB(im.getWidth()-1- i, j));
                int red1=current1.getRed();
                int blue1=current1.getBlue();
                int green1=current1.getGreen();    
                Color newColor1 = new Color(current.getRed(),current.getGreen(),current.getBlue());
                    im.setRGB( im.getWidth()-1-i, j, newColor1.getRGB());
                Color newColor = new Color(red1,green1, blue1);
                    im.setRGB(i,j, newColor.getRGB());    
            
            }
        }
        
       
        display();
    }//GEN-LAST:event_MirrorWActionPerformed

    private void display() {
        ImageIcon icon = new ImageIcon(im.getScaledInstance(photoField.getWidth(),
                photoField.getHeight(), Image.SCALE_SMOOTH));
        photoField.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadInImage;
    private javax.swing.JButton MirrorH;
    private javax.swing.JButton MirrorW;
    private javax.swing.JSlider SliderToBlue;
    private javax.swing.JSlider SliderToRed;
    private javax.swing.JSlider SliderVividness;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel photoField;
    private javax.swing.JSlider sliderContrast;
    // End of variables declaration//GEN-END:variables
}
