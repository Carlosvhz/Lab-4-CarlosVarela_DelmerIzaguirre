package laboratorio.pkg4;

import java.awt.Color;
import javax.swing.JOptionPane;

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

    public Pieza(int x, int y,Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setPieza(int x, int y) {
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
        return "x: "+x +" y: "+y;
    }

    //Metodos
    public abstract void Movimiento(int x, int y, byte jugador, String[][] tablero);

    public abstract void Captura();

    public abstract String getFigura();

    protected void validar(int x, int y, String[][] tablero) throws MiExcepcion {
        if (x > 9 || x < 0 || y > 9 || y < 0) {
            throw new MiExcepcion("La posicion de estar en un rango de 0-9");
        }
        boolean posible = true;
        if (this.x == x) { //Movimiento horizontal
            if (y > this.y) {
                for (int i = y-1; i > this.y; i--) {
                    if (!"  ".equals(tablero[x][i])) {
                        posible = false;
                    }
                }
            } else {
                for (int i = y+1; i < this.y; i++) {
                    if (!"  ".equals(tablero[x][i])) {
                        posible = false;
                    }
                }

            }
            if (posible) {
                tablero[y][x] = tablero[this.y][this.x];
                tablero[this.y][this.x] = "  ";
               
            } else {
                throw new MiExcepcion("No puedes mover esta pieza aqui");
            }

        } else if (this.y == y) { //Movimiento Vertical
            if (x > this.x) {
                for (int i = x; i > this.x; i--) {
                    if (!"  ".equals(tablero[i][y])) {
                        posible = false;
                    }
                }
            } else {
                for (int i = x; i < this.x; i++) {
                    if (!"  ".equals(tablero[i][y])) {
                        posible = false;
                    }
                }
            }
            if (posible) {
                tablero[y][x] = tablero[this.y][this.x];
                tablero[this.y][this.x] = "  ";
            } else {
                throw new MiExcepcion("No puedes mover esta pieza aqui");
            }

        }

    }

}
