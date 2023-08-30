
package pkg7.gestiondatos;

import javax.swing.JOptionPane;

public class cEstudiante extends cPersona {  //Clase hija
    double Promedio_Ponderado;
    
    //constructores

    public cEstudiante() {
    }

    public cEstudiante(double Promedio_Ponderado) {
        this.Promedio_Ponderado = Promedio_Ponderado;
    }

    public cEstudiante(double Promedio_Ponderado, int Identificacion, String Nombre, int AnnodeNacimiento) {
        super(Identificacion, Nombre, AnnodeNacimiento);
        this.Promedio_Ponderado = Promedio_Ponderado;
    }

    @Override
    public void ProcesarEstudiante() {
    char MasTareas ; 
    double Tarea , SumaTareas = 0 ;
    int ContadorTareas = 0; 
    
    MasTareas = 's'; 
    while ( MasTareas == 's')
        {
        Tarea = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota de Tarea: "));
        SumaTareas = SumaTareas + Tarea ;
        ContadorTareas =ContadorTareas + 1 ;
        
        MasTareas = JOptionPane.showInputDialog("¿Más tareas qué procesar? s/n ").charAt(0) ;
        }
    Promedio_Ponderado = SumaTareas / ContadorTareas ;
    }

    @Override
    public void VerDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre +"\n"
                                                  + "Identificación: " + Identificacion + "\n"
                                                  + "Año de nacimiento: " + AnnodeNacimiento + "\n"
                                                  + "Promedio Ponderado : " + Promedio_Ponderado + "\n"
                                                                );
    }

    @Override
    public void ProcesarProfesor() {
    }

    @Override
    public void ProcesarAdministrativo() {
    }

}
