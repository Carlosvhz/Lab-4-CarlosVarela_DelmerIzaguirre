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

    public Caballero(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void Movimiento(int x, int y, byte jugador, String[][] tablero, Jugador rival) {

        boolean valido = false;

        try {
            validar(x, y, tablero);
            if (super.x - x == 1 || super.x - x == -1) {
                if (super.y == y) {
                    super.x = x;
                    valido = true;
                }
            }
            if (super.y - y == 1 || super.y - y == -1) {
                if (super.x == x) {
                    super.y = y;
                    valido = true;
                }
            }
            if (!valido) {
                System.out.println("Movimiento no valido");
            } else {
                tablero[y][x] = tablero[this.y][this.x];
                tablero[this.y][this.x] = "  ";
                Captura(x,y,rival);
            }

        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void Captura(int x, int y , Jugador rival) {
        for (Pieza pz : rival.getPiezas()) {
            if(pz.x == x && pz.y == y){
                rival.getPiezas().remove(pz);
            }
        }
       
    }

    @Override
    public String toString() {
        return "C";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "C•";
        } else {
            return "CO";
        }
    }

}
