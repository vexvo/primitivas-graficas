package Models;

import java.awt.Color;

/**
 *
 * @author Santi
 */
public abstract class FiguraEstandar extends FiguraGeometrica{
    private int x;
    private int y;

    public FiguraEstandar() {
    }

    public FiguraEstandar(int direction, Color colorBorde, Color colorRelleno, int x, int y) {
        super(direction, colorBorde, colorRelleno);
        this.x = x;
        this.y = y;
    }

    public void moveR(int dist) {
        this.x += dist;
    }
    
    public void moveL(int dist) {
        this.x -= dist;
    }
    
    public void moveUp(int dist) {
        this.y -= dist;
    }
    
    public void moveDown(int dist) {
        this.y += dist;
    }
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
