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

    public Cuadrado(Color colorBorde, Color colorRelleno, int x, int y, int lado) {
        super(colorBorde, colorRelleno, x, y);
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
