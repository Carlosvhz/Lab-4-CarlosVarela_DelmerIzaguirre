
package laboratorio.pkg4;

import java.awt.Color;

/**
 *
 * @author Owner
 */
public abstract class Pieza {
    private Color color;
    private String material;

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
    
    
}
