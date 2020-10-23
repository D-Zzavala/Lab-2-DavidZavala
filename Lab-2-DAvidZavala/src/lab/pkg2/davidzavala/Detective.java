package lab.pkg2.davidzavala;

import java.util.ArrayList;

class Detective {

    private String nombre;
    private int edad;
    private String nacionalidad;
    private int años;
    private int nivel;
    private ArrayList<Caso> Casos = new ArrayList();

    public Detective() {
    }

    public Detective(String nombre, int edad, String nacionalidad, int años, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.años = años;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Caso> getCasos() {
        return Casos;
    }

    public void setCasos(ArrayList<Caso> Casos) {
        this.Casos = Casos;
    }

    @Override
    public String toString() {
        return "Detective{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", a\u00f1os=" + años + ", nivel=" + nivel + ", Casos=" + Casos + '}';
    }

    
}
