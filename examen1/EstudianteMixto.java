package examen1;

/**
 * @author NET FANELY
 */
public class EstudianteMixto extends Estudiante{
    String empresa;
    String puesto;
    int antiguedad;
    double salarioporhora;

    EstudianteMixto(String e, String p, int a, double s) {
        this.empresa = e;
        this.puesto = p;
        this.antiguedad = a;
        this.salarioporhora = s;
    }
    
    public double getSalarioporhora() {
        return salarioporhora;
    }

    public void setSalarioporhora(double salarioporhora) {
        this.salarioporhora = salarioporhora;
    }
    
    double salarioQuincena(int canth){
        double salarioq = canth*salarioporhora;
        return salarioq;
    }
    boolean promocionPuesto(){
        if(this.antiguedad>=2){
            return true;
        }else{
            return false;
        } 
    }

    @Override
    public String toString() {
        return "EstudianteMixto{" + "empresa=" + empresa + ", puesto=" + puesto + ", antiguedad=" + antiguedad + ", salarioporhora=" + salarioporhora + '}';
    }
    
}
