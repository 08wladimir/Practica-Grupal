
package Businesslogic;

import Program.*;
import java.io.*;
import javax.swing.JOptionPane;

public class RegistroAlumno{
    
    private void datosEstudiante(General atributos, String n, int c, String m, double nota){
        //Se le dan los datos a los atributos del objeto
        atributos.nombre = n;
        atributos.codigo = c;
        atributos.materia = m;
        atributos.nota = nota;
    }
    
    public void registroAlArchivo(General atributos, String archivo, String n, int c, 
            String m, double nota) throws FileNotFoundException{
        //Se llama al metodo datosEstudiante
        datosEstudiante(atributos, n, c, m, nota);
        
        //Se crea el archivo y se le guarda la informacio
        File f = new File(archivo);
        PrintWriter guardarTxt = new PrintWriter(f);
        guardarTxt.println("Nombre: "+atributos.nombre);
        guardarTxt.println("Codigo: "+atributos.codigo);
        guardarTxt.println("Materia: "+atributos.materia);
        guardarTxt.println("Nota: "+atributos.nota);
        guardarTxt.close();
        
    }
    
}
