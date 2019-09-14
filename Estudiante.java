/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class Estudiante extends Persona {
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;
    private int promedio;

    public Estudiante() {
    }
    public Estudiante (String nombre, String apellido, int edad, int peso,double salario, String codigoLaboral, boolean esEmpleadoFijo){
    //Usamos el operador super para establecer el constructor
    //de la superclase
    super(nombre, apellido, edad, peso);

    //Definimos los atributos propios de este objeto que hereda
    this.carnet = carnet;
    this.promedioNotas = promedio;
    this.numeroMaterias = numeroMaterias;
    }

    /**
     * @return the carnet
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carnet the carnet to set
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * @return the promedioNotas
     */
    public double getPromedioNotas() {
        return promedioNotas;
    }

    /**
     * @param promedioNotas the promedioNotas to set
     */
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    /**
     * @return the numeroMaterias
     */
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    /**
     * @param numeroMaterias the numeroMaterias to set
     */
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    public Estudiante ingresarDatosEstudiante (){
    Estudiante nuevoEstudiante = new Estudiante();
    String nombre = "";
    String apellido = "";
    int edad = 0;
    String carnet = "";
    int materias = 0;
    int notas = 0;
    double promedio = 0.0;
    carnet = leerDatoTipoCadena("Ingrese el código del estudiante: ");
    nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
    apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
    edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
    materias=leerDatoTipoEntero("Ingrese cantidad de materias ");
    notas= leerDatoTipoEntero("Ingrese notas ");
    //Calculamos el salario
    promedio = calcularPromedio(materias, notas);
    //Definimos los datos para el constructor
    nuevoEstudiante.setNombre(nombre);
    nuevoEstudiante.setCarnet(carnet);
    nuevoEstudiante.setEdad(edad);
    //Retornamos el objeto
    return (nuevoEstudiante);
    }
    public double calcularPromedio(int materias, int notas){
        double promedioNotas=0.0;
        double sumaNotas = 0.0;
        sumaNotas=sumaNotas+notas;
        promedioNotas = sumaNotas/materias;
        return (promedioNotas);
    }
    public void imprimirReporteEstadoEstudiante(){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null,"El código del estudiante: " + carnet);
        imprimirPromedio(nombre,promedioNotas);
    }
    public void imprimirPromedio (String nombre, double promedioNotas){
        JOptionPane.showMessageDialog(null,"El promedio del estudiante: " + nombre+" es "+promedioNotas);
    }
}
