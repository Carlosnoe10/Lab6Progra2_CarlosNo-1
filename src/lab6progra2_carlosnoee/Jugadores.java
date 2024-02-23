package lab6progra2_carlosnoee;

public class Jugadores {

    public String Nombre;
    public int Edad;
    public String Posicion;

    public Jugadores(String Nombre, int Edad, String Posicion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Posicion = Posicion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    @Override
    public String toString() {
        return "Nombre= " + Nombre + "\n"
                + "Edad= " + Edad + "\n"
                + "Posicion= " + Posicion+"\n";
    }

}
