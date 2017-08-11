
package laboratorio.pkg4;

import java.awt.Color;

/**
 *
 * @author Owner
 */
public abstract class Pieza {
    private Color color;
    private String material;
    protected int x;
    protected int y;

    public Pieza() {
    }
    
    public Pieza(Color color, String material) {
        this.color = color;
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Pieza{" + "color=" + color + ", material=" + material + '}';
    }
    
    //Metodos
    public abstract void Movimiento(int x, int y, byte jugador);
    public abstract void Captura();
    public abstract String getFigura();
    
}
