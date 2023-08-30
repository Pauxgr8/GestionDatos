
package pkg7.gestiondatos;

import javax.swing.JOptionPane;

public class cProfesorado extends cPersona {
    //variables
    double Salario; 
    //constructores

    public cProfesorado() {
    }

    public cProfesorado(double Salario) {
        this.Salario = Salario;
    }

    public cProfesorado(double Salario, int Identificacion, String Nombre, int AnnodeNacimiento) {
        super(Identificacion, Nombre, AnnodeNacimiento);
        this.Salario = Salario;
    }
    
    //metodos

    @Override
    public void ProcesarProfesor() {
        Salario= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: "));   
    }

    @Override
    public void VerDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + Nombre +"\n"
                                                  + "Identificación: " + Identificacion + "\n"
                                                  + "Año de nacimiento: " + AnnodeNacimiento + "\n"
                                                  + "Salario : " + Salario + "\n"
                                                                );
    }

    @Override
    public void ProcesarEstudiante() {
    }

    @Override
    public void ProcesarAdministrativo() {
    }
    
}
