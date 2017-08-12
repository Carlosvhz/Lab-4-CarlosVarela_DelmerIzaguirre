package laboratorio.pkg4;

import java.awt.Color;

public class Duende extends Pieza {

    public Duende() {
        super();
    }

    public Duende(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void Movimiento(int x, int y, byte jugador, String[][] tablero) {
        boolean valido = false;
        try {
            validar(x, y, tablero);
            if (jugador == 0) {
                if (x == super.x && y - super.y == 1) {
                    super.x = x;
                    valido = true;
                }
            } else {
                if (x == super.x && y - super.y == -1) {
                    super.x = x;
                    valido = true;
                }

            }
            if (!valido) {
                System.out.println("Movimiento no valido");
            } else {
                tablero[y][x] = tablero[this.y][this.x];
                tablero[this.y][this.x] = "  ";
            }

        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
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
            return "D•";
        } else {
            return "DO";
        }
    }

}
