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

    public Caballero(int x, int y) {
        super(x, y);
    }
    
    

    @Override
    public void Movimiento(int x, int y, byte jugador, String[][] tablero) {
        
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
            if(!valido){
                System.out.println("Movimiento no valido");
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
