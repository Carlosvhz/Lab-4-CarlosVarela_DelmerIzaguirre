
package laboratorio.pkg4;

import java.util.ArrayList;


public class Jugador {
    
    private String nombre, nombre_usuario, sexo, lugar_nacimiento;
    private int puntos, edad;
    private ArrayList<Pieza> piezas = new ArrayList();
    
    public Jugador() {
    }

    public Jugador(String nombre, String nombre_usuario, String sexo, String lugar_nacimiento, int puntos, int edad) {
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.sexo = sexo;
        this.lugar_nacimiento = lugar_nacimiento;
        this.puntos = puntos;
        this.edad = edad;
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
