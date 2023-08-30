
package pkg7.gestiondatos;

import javax.swing.JOptionPane;

public class GestionDatos {

 
    public static void main(String[] args) {
        int Opcion =1;
        while (Opcion !=0)
        {
        Opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n"
                                                            + "1. Procesar Estudiante \n"
                                                            + "2. Procesar Profesorado \n"
                                                            + "3. Procesar Administración \n"
                                                            + "0. Salir"
                                                                                ));
        switch ( Opcion )
            {
            case 1: ProcesarEstudiante();
                break;
            case 2: ProcesarProfesor();
                break;
            case 3: ProcesarAdministrativo();
                break;    

            }
        }
    }

    private static void ProcesarEstudiante() {
        
       //instancia objto de clase HIJA
       cEstudiante objEstudiante= new cEstudiante();
       
       //carga o lee los datos base
       objEstudiante.Nombre = (JOptionPane.showInputDialog("Ingrese nombre del estudiante: "));
       objEstudiante.Identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Identificación: "));
       objEstudiante.AnnodeNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: "));
       
       //Ejecuta metodos del objeto hija
       objEstudiante.ProcesarEstudiante();
       objEstudiante.VerDatos();
       
    }   

    private static void ProcesarProfesor() {
        //instancia de la clase hija
        cProfesorado objProfesorado= new cProfesorado();
        //carga o lee los datos base
       objProfesorado.Nombre = (JOptionPane.showInputDialog("Ingrese nombre del profesor/a: "));
       objProfesorado.Identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Identificación: "));
       objProfesorado.AnnodeNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: "));
         //Ejecuta metodos del objeto hija
         objProfesorado.ProcesarProfesor();
         objProfesorado.VerDatos();
    }

    private static void ProcesarAdministrativo() {
        cAdministracion objAdministracion = new cAdministracion();
        
        objAdministracion.Nombre =(JOptionPane.showInputDialog("Ingrese nombre del administrativo/a: "));
        objAdministracion.Identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Identificación: "));
        objAdministracion.AnnodeNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: "));
          //Ejecuta metodos del objeto hija
        objAdministracion.ProcesarAdministrativo();
        objAdministracion.VerDatos();
         
    }
}
   