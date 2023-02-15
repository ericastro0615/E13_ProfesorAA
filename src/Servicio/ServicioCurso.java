package Servicio;

import Entidades.Curso;

import java.util.Scanner;

public class ServicioCurso {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    Curso c1 = new Curso ();



    public void  altaCurso(Curso c1) {
        // Curso c1 = new Curso ();
        System.out.println ( "ingrese el nombre del curso" );
        c1.setNombreCurso ( sc.nextLine () );
        System.out.println ( "BIENVENIDOS AL CURSO " + c1.getNombreCurso () + "\n" );
        //cargar ( c1 );
    }
    public void cargarAlumnos (Curso c1 ) {
        System.out.println ("Ingrese el nombre de los " + c1.getAlumnos () + "alumnos");
        String alumnosArray [] = new String [5];
        for (int i = 0; i < alumnosArray.length; i++) {
            System.out.println ("nombre de alumno ");
            alumnosArray [i]= sc.next();
        }


    }


    public void  crearCruso (Curso c1) {
        cargarAlumnos(c1);
        System.out.println("Ingrese la cantidad de horas de dictado de clases ");
        c1.setCantidadHorasDia(sc.nextInt());
        System.out.println("ingrese cantidad de dias por semana");
        c1.setCantidadDiasSemanas(sc.nextInt());
        System.out.println("ingrese el turno (mañ/tarde) ");
        c1.setTurno(sc.next());
        System.out.println("ingrese el precio por hora");
        c1.setCantidadHorasDia(sc.nextInt());
        System.out.println("Sus alumnos son: ");
        c1.getAlumnosArray ();
        System.out.println("\n");

    }

    public void mostrarCurso (Curso c1) {
        System.out.println ("CURSO \n" +
                c1.toString ());
    }

    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
     */

    public double calcularGananciaSemanal(Curso c1){
        double calcularGananciaSemanal= (double) c1.getCantidadHorasDia ()*c1.getAlumnosArray ().length*c1.getPrecioHora ()* c1.getCantidadDiasSemanas ();
        return calcularGananciaSemanal;
    }




    public void menu () {
        altaCurso (c1);
        crearCruso (c1);

        mostrarCurso ( c1 );
        System.out.println ("Las ganancias semanales son: $" + calcularGananciaSemanal( c1));
    }


}









