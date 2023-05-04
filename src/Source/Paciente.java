package Source;

import java.util.Date;

public class Paciente {
    //Atributos
    protected String nombres;
    protected String genero;
    protected String DNI;
    protected int Telefono;
    protected int Edad;
    protected int Num_dosis;
    protected String Nom_vacuna;
    protected String Fecha_vacunacion;

    public Paciente(String DNI, String nombres, String genero,int Edad, int Telefono, int Num_dosis, String Nom_vacuna, String Fecha_vacunacion) {
        this.nombres = nombres;
        this.genero = genero;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.Num_dosis = Num_dosis;
        this.Nom_vacuna = Nom_vacuna;
        this.Fecha_vacunacion = Fecha_vacunacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNum_dosis() {
        return Num_dosis;
    }

    public void setNum_dosis(int Num_dosis) {
        this.Num_dosis = Num_dosis;
    }

    public String getNom_vacuna() {
        return Nom_vacuna;
    }

    public void setNom_vacuna(String Nom_vacuna) {
        this.Nom_vacuna = Nom_vacuna;
    }

    public String getFecha_vacunacion() {
        return Fecha_vacunacion;
    }

    public void setFecha_vacunacion(String Fecha_vacunacion) {
        this.Fecha_vacunacion = Fecha_vacunacion;
    }
 
    @Override
    public String toString(){
        return DNI + " " + nombres + " " + genero + " " + Edad + " " + Telefono + " " + Num_dosis + " " + Nom_vacuna + " " + Fecha_vacunacion;
    } 
}
