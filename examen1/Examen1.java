/*
 * LA CLASE PRINCIPAL donde se adicione la opción del Menú de agregar un
 * EstudianteMixto y la  opcion de listar los EstudiantesMixto.
 */
package examen1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author USER
 */
public class Examen1 {

    public static void main(String[] args) {
        //agregar un estudiantemixto
       
        
        EstudianteMixto est1 = new EstudianteMixto("Google","programador",3,30);
        EstudianteMixto est2 = new EstudianteMixto("Repsol","analista",2,40);
        EstudianteMixto est3 = new EstudianteMixto("PetroPeru","tester",4,20);
        EstudianteMixto est4 = new EstudianteMixto("Facebook","programador",3,30);
        EstudianteMixto est5 = new EstudianteMixto("Sony","Ingeniero",1,50);
        
        
        
        ArrayList<EstudianteMixto> array = new ArrayList<EstudianteMixto>();
        array.add(est1);
        array.add(est2);
        array.add(est3);
        array.add(est4);
        array.add(est5);
       
        //listar los estudiantesmixto
        
        Iterator<EstudianteMixto> it = array.iterator();
        
        while(it.hasNext()) {
     
            System.out.println(it.next().toString());
        }
        
    }
    
}
