package Models;

import java.awt.Color;

/**
 *
 * @author Santi
 */
public class Cuadrado extends FiguraEstandar{
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int direction, Color colorBorde, Color colorRelleno, int x, int y, int lado) {
        super(direction, colorBorde, colorRelleno, x, y);
        this.lado = lado;
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
    
}
