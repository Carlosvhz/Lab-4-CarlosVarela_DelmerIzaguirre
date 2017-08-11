package laboratorio.pkg4;

import java.awt.Color;

/**
 *
 * @author Owner
 */
public class Caballero extends Pieza {

    public Caballero() {
        super();
    }

    @Override
    public void Movimiento(int x, int y, byte jugador) {
        try {
            validar(x, y);
            if (super.x - x == 1 || super.x - x == 1) {
                if (super.y == y) {
                    super.x = x;
                }
            }
            if (super.y - y == 1 || super.y - y == 1) {
                if (super.x == x) {
                    super.y = y;
                }
            }
        } catch (MiExcepcion e) {
        }

    }

    @Override
    public void Captura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "C";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "C⚫";
        } else {
            return "CO";
        }
    }

}
