/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4;

import java.awt.Color;

/**
 *
 * @author Owner
 */
public class Mago extends Pieza {

    public Mago() {
        super();
    }
   
    @Override
    public void Movimiento(int x, int y, byte jugador) {
        if (super.x == x) {
            
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
        return "M";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "M⚫";
        } else {
            return "MO";
        }
    }
}
