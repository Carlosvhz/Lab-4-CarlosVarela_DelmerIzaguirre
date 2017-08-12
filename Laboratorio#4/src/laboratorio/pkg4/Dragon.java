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
public class Dragon extends Pieza {

    public Dragon() {
        super();
    }

    public Dragon(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void Movimiento(int x, int y, byte jugador, String[][] tablero, Jugador rival) {
        boolean valido = false;
        try {
            validar(x, y, tablero);

            int w = super.x - x;
            int z = super.y - y;
            w = (int) Math.sqrt(Math.pow(w, 2));
            z = (int) Math.sqrt(Math.pow(z, 2));

            if (z == w) {
                super.x = x;
                super.y = y;
                valido = true;
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
        return "F";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "F•";
        } else {
            return "FO";
        }
    }

}
