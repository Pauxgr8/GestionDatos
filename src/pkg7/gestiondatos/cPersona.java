
package pkg7.gestiondatos;

public abstract class cPersona {
   //clase madre
    //variables
    int Identificacion;
    String Nombre;
    int AnnodeNacimiento;
    
    //constructores
    public cPersona() {
    }

    public cPersona(int Identificacion, String Nombre, int AnnodeNacimiento) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.AnnodeNacimiento = AnnodeNacimiento;
    }
    
    //métodos
   public abstract void ProcesarEstudiante();
   public abstract void ProcesarProfesor();
   public abstract void ProcesarAdministrativo();
   public abstract void VerDatos();
   
    
}
