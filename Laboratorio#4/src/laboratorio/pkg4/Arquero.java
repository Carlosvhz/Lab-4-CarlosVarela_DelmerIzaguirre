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
public class Arquero extends Pieza {

    public Arquero() {
        super();
    }
    
    @Override
    public void Movimiento(int x, int y, byte jugador) {

        boolean valido = false;
        
        try {
            validar(x, y);
            if (super.x == x) {
                super.y = y;
                valido = true;
            }
            if (super.y == y) {
                super.x = x;
                valido = true;
            }
            int w = super.x - x;
            int z = super.y - y;
            w = (int) Math.sqrt(Math.pow(w, 2));
            z = (int) Math.sqrt(Math.pow(z, 2));

            if (z == w) {
                super.x = x;
                super.y = y;
                valido = true;

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
        return "A";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "A⚫";
        } else {
            return "AO";
        }
    }

}