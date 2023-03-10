package Entidades;

import java.util.Arrays;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasDia;
    private int cantidadDiasSemanas;
    private String turno;
    private int precioHora;
    private int alumnos;
    int cantidadAlumnos = 5;
    String alumnosArray [] = new String [cantidadAlumnos];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasDia, int cantidadDiasSemanas, String turno, int precioHora, int alumnos, String[] alumnosArray) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasDia = cantidadHorasDia;
        this.cantidadDiasSemanas = cantidadDiasSemanas;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
        this.alumnosArray = alumnosArray;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasDia() {
        return cantidadHorasDia;
    }

    public void setCantidadHorasDia(int cantidadHorasDia) {
        this.cantidadHorasDia = cantidadHorasDia;
    }

    public int getCantidadDiasSemanas() {
        return cantidadDiasSemanas;
    }

    public void setCantidadDiasSemanas(int cantidadDiasSemanas) {
        this.cantidadDiasSemanas = cantidadDiasSemanas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        if (alumnos<5)
        this.alumnos = alumnos;
    }

    public String[] getAlumnosArray() {
        return alumnosArray;
    }

    public void setAlumnosArray(String[] alumnosArray) {
        this.alumnosArray = alumnosArray;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", cantidadHorasDia=" + cantidadHorasDia +
                ", cantidadDiasSemanas=" + cantidadDiasSemanas +
                ", turno='" + turno + '\'' +
                ", precioHora=" + precioHora +
                ", alumnos=" + alumnos +
                ", cantidadAlumnos=" + cantidadAlumnos +
                ", alumnosArray=" + Arrays.toString ( alumnosArray ) +
                '}';
    }
}
