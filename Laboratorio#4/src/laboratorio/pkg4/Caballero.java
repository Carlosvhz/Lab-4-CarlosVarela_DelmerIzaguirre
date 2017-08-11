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
        if (super.x - x == 1 || super.x - x == 1) {
            if(super.y == y){
                super.x = x;
            }
        }
        if (super.y - y == 1 || super.y - y == 1) {
            if(super.x == x){
                super.y = y;
            }
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
    
    private void validar(int x, int y) throws MiExcepcion{
        if(x > 9 || x < 0 || y > 9 || y < 0){
            throw new MiExcepcion("La posicion de estar en un rango de 0-9");
        }
        
    }

}
