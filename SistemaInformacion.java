/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;
//CLASE SISTEMA INFORMACION 

/**
* Clase Java para implementar un cliente
* que emplea la jerarquía de herencia de la persona,
* el empleado y el estudiante para mostrar los cálculos
* de cada uno de los respectivos procesos implementados
* por cada clase
*/
public class SistemaInformacion{
/********************************/
/********************************/
/********************************/
//Constructor de la clase
public SistemaInformacion() {
// TODO Auto-generated constructor stub
}
/**
* @param args
*/
public static void main(String[] args){
/********************************/
/********************************/
/********************************/
// TODO Auto-generated method stub
int opcion = 0;
Persona sistemaInformacion = new Persona();
try{
//Usamos la herencia de la superclase para acceder a los
//métodos de lectura de datos
do{

opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del empleado,2 para estudiante,  3 para salir: ");
if (opcion == 1){
JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
Empleado manejadorEmpleado = new Empleado();
//Leemos los datos
manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
//Mostramos el reporte de datos
manejadorEmpleado.imprimirReporteEstadoEmpleado();
}else{
    if(opcion==2){
       JOptionPane.showMessageDialog(null, "Procesando datos del estudiante ");
       Estudiante est = new Estudiante ();
       est = est.ingresarDatosEstudiante();
      est.imprimirReporteEstadoEstudiante();
    }else{
       if (opcion == 3){
            JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
            break;
        }else{
            JOptionPane.showMessageDialog(null,"Opción inválida");
        } 
    }
}
} while (opcion <= 1 || opcion >= 3);//fin del do-while
}//Fin del try
catch (Exception errorMain)
{
JOptionPane.showMessageDialog(null,"Error en la digitación: ");
errorMain.printStackTrace();
}
/********************************/
}
/********************************/
/********************************/
}
   

