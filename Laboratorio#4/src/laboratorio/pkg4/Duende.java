package laboratorio.pkg4;

import java.awt.Color;

public class Duende extends Pieza {

    public Duende() {
        super();
    }

    @Override
    public void Movimiento(int x, int y, byte jugador) {
        try {
            validar(x, y);
            if (jugador == 0) {
                if (x == super.x && y - super.y == 1) {
                    super.x = x;
                }
            } else {
                if (x == super.x && y - super.y == -1) {
                    super.x = x;
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
        return "D";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "D⚫";
        } else {
            return "DO";
        }
    }

   

}
