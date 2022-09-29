package Models;

import java.awt.Color;

/**
 *
 * @author Santi
 */
public class Imagen extends FiguraEstandar{
    private String url;
    private int alto;
    private int ancho;

    public Imagen() {
    }

    public Imagen(int x, int y, String url, int alto, int ancho) {
        super(null, null, x, y);
        this.url = url;
        this.alto = alto;
        this.ancho = ancho;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    
}
