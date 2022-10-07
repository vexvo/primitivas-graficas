package Models;

import java.awt.Color;

/**
 *
 * @author Santi
 */
public class Circulo extends FiguraEstandar {
    private int radio;

    public Circulo() {
    }

    public Circulo(int direction, Color colorBorde, Color colorRelleno, int x, int y, int radio) {
        super(direction, colorBorde, colorRelleno, x, y);
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    
}
