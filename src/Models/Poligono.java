package Models;

import java.awt.Color;

/**
 *
 * @author Santi
 */
public class Poligono extends FiguraGeometrica{
    private int x[];
    private int y[];

    public Poligono() {
    }

    public Poligono(int direction, Color colorBorde, Color colorRelleno, int[] x, int[] y) {
        super(direction, colorBorde, colorRelleno);
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int[] getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int[] x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int[] getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int[] y) {
        this.y = y;
    }
    
    
    
}
