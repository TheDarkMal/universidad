//Mauricio Vergara
//Andres Olivero
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Universidad {

    public static void main(String[] args) {
        // TODO code application logic here
        /*Alumnos a1, a2;
        Administrativo ad1;
        Catedratico c1;
        Planta p1;*/
        Scanner leer = new Scanner(System.in);
       ArrayList<Alumnos> listaAlumnos = new ArrayList();
       boolean ciclo = true;
       int decision=1;
       while(ciclo){
           String tipoDocumento,  documento,  apellidos, nombres, 
                   codigo,  facultad,  programa; 
           int edad, semestre; 
           boolean activo;
           System.out.println("Ingrese tipo de documento");
           tipoDocumento  = leer.next();
           System.out.println("Digite el documento:");
           documento = leer.next();
           System.out.println("Digite el nombre:");
           nombres = leer.next();
           System.out.println("Digite el apellido:");
           apellidos = leer.next();
           System.out.println("Digite la edad:");
           edad = leer.nextInt();
           System.out.println("Digite la facultad");
           facultad = leer.next();
           System.out.println("Digite el programa:");
           programa = leer.next();
           System.out.println("Digite el semestre:");
           semestre = leer.nextInt();
           System.out.println("Digite el código:");
           codigo = leer.next();
           
           listaAlumnos.add(new Alumnos(tipoDocumento, documento, apellidos, nombres, edad, true, codigo, facultad, programa, semestre));
           System.out.println("¿Desea seguir ingresando alumnos? (1=sí / 2=no)");
           decision = leer.nextInt();
           if(decision == 2){
               ciclo = false;
           }
       }
       boolean cicl =true;
       ArrayList<Docente> ListaDocenta = new ArrayList();
        while(cicl){
            System.out.println("ecrbe algo");
            ciclo=leer.hasNext();
        }
       for(int i =0; i<listaAlumnos.size(); i++){
           System.out.println(listaAlumnos.get(i).mostrar());
       }
        
    }
    
}
