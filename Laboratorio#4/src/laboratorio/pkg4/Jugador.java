
package laboratorio.pkg4;

import java.awt.Color;
import java.util.ArrayList;


public class Jugador {
    
    private String nombre, nombre_usuario, sexo, lugar_nacimiento;
    private int puntos, edad;
    private ArrayList<Pieza> piezas = new ArrayList();
    private Color color;
    public Jugador() {
    }

    public Jugador (Color color){
        this.color = color;
    }
    public Jugador(String nombre, String nombre_usuario, String sexo, String lugar_nacimiento, int puntos, int edad, Color color) {
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.sexo = sexo;
        this.lugar_nacimiento = lugar_nacimiento;
        this.puntos = puntos;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(Pieza piezas) {
        this.piezas.add(piezas);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    @Override
    public String toString() {
        return "Jugador: "+ nombre + "\n"
                + "Nombre de usuario: " + nombre_usuario + "\n"
                + "Sexo: " + sexo + "\n"
                + "Lugar de nacimiento: " + lugar_nacimiento + "\n"
                + "Puntos: " + puntos + "\n"
                + "Edad: " + edad;
    }
    
    
    
}
