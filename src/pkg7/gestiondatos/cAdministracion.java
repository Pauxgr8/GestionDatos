
package pkg7.gestiondatos;

import javax.swing.JOptionPane;

public class cAdministracion extends cPersona {
    double Salario;
    int Num_Puesto;
    
    //constructores

    public cAdministracion() {
    }

    public cAdministracion(double Salario, int Num_Puesto) {
        this.Salario = Salario;
        this.Num_Puesto = Num_Puesto;
    }

    public cAdministracion(double Salario, int Num_Puesto, int Identificacion, String Nombre, int AnnodeNacimiento) {
        super(Identificacion, Nombre, AnnodeNacimiento);
        this.Salario = Salario;
        this.Num_Puesto = Num_Puesto;
    }
    //metodos 

    public void ProcesarAdministrativo() {
        Salario= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: ")); 
        Num_Puesto= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de puesto: "));
        
    }

    @Override
    public void VerDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre +"\n"
                                                  + "Identificación: " + Identificacion + "\n"
                                                  + "Año de nacimiento: " + AnnodeNacimiento + "\n"
                                                  + "Salario : " + Salario + "\n"
                                                  + "Número de puesto: " + Num_Puesto 
                                                                );
    }

    @Override
    public void ProcesarEstudiante() {
    }

    @Override
    public void ProcesarProfesor() {
    }
    
}
