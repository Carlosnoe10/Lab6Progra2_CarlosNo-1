package lab6progra2_carlosnoee;

import java.util.ArrayList;

public class Equipos {

    public String Nombre;
    public String Pais;
    public String Cuidad;
    public String Estadio;
    public ArrayList<Jugadores> Plantilla = new ArrayList();

    public Equipos(String Nombre, String Pais, String Cuidad, String Estadio) {
        this.Nombre = Nombre;
        this.Pais = Pais;
        this.Cuidad = Cuidad;
        this.Estadio = Estadio;
    }

    public ArrayList<Jugadores> getPlantilla() {
        return Plantilla;
    }

    public void setPlantilla(ArrayList<Jugadores> Plantilla) {
        this.Plantilla = Plantilla;
    }

    public Equipos() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCuidad() {
        return Cuidad;
    }

    public void setCuidad(String Cuidad) {
        this.Cuidad = Cuidad;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    @Override
    public String toString() {
        return "Nombre= " + Nombre + "\n"
                + "Pais= " + Pais + "\n"
                + "Cuidad= " + Cuidad + "\n"
                + "Estadio= " + Estadio + "\n";
    }

}
