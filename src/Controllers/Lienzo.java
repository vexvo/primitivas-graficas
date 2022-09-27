package Controllers;

import Models.FiguraGeometrica;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

/**
 *
 * @author Santi
 */
public class Lienzo extends javax.swing.JPanel {

    private LinkedList<FiguraGeometrica> misFiguras;
    
    /**
     * Creates new form Lienzo
     */
    public Lienzo() {
        initComponents();
        this.misFiguras = new LinkedList<>();
    }

    @Override
    public void paintComponent(Graphics lapiz) {
        super.paintComponent(lapiz);
        lapiz.drawRect(10, 10, 50, 50);
        lapiz.setColor(Color.red);
        lapiz.fillRect(10, 10, 30, 30);
        lapiz.setColor(Color.black);
        lapiz.drawOval(100, 10, 100, 100);
        
        Toolkit t = Toolkit.getDefaultToolkit();
        Image imagen = t.getImage("src/Images/bmw.png");
        lapiz.drawImage(imagen, 150, 200, 50, 50, this);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return the misFiguras
     */
    public LinkedList<FiguraGeometrica> getMisFiguras() {
        return misFiguras;
    }

    /**
     * @param misFiguras the misFiguras to set
     */
    public void setMisFiguras(LinkedList<FiguraGeometrica> misFiguras) {
        this.misFiguras = misFiguras;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}