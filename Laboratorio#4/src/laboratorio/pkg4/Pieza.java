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

    public Pieza(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPieza(int x,int y){
        this.x = x;
        this.y = y;
        
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

    protected void validar(int x, int y) throws MiExcepcion {
        if (x > 9 || x < 0 || y > 9 || y < 0) {
            throw new MiExcepcion("La posicion de estar en un rango de 0-9");
        }

    }

}
