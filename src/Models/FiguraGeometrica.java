package Models;

import java.awt.Color;

/**
 *
 * @author Santi
 */
public class FiguraGeometrica {
    private Color colorBorde;
    private Color colorRelleno;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(Color colorBorde, Color colorRelleno) {
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
    }

    /**
     * @return the colorBorde
     */
    public Color getColorBorde() {
        return colorBorde;
    }

    /**
     * @param colorBorde the colorBorde to set
     */
    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
    }

    /**
     * @return the colorRelleno
     */
    public Color getColorRelleno() {
        return colorRelleno;
    }

    /**
     * @param colorRelleno the colorRelleno to set
     */
    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
    
    
    
}
