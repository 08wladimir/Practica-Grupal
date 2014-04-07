
package Businesslogic;

import Program.*;
import java.io.*;
import javax.swing.JOptionPane;

public class RegistroAlumno{
    
    private void datosEstudiante(General atributos, String n, int c, String m, double nota){
        atributos.nombre = n;
        atributos.codigo = c;
        atributos.materia = m;
        atributos.nota = nota;
    }
    
    public void registroAlArchivo(General atributos, String n, int c, String m, double nota) throws FileNotFoundException{
        datosEstudiante(atributos, n, c, m, nota);
        PracticaGrupal p = new PracticaGrupal();
        PrintWriter guardarTxt = new PrintWriter(p.f);
        guardarTxt.println("Nombre: "+atributos.nombre);
        guardarTxt.println("Codigo: "+atributos.codigo);
        guardarTxt.println("Materia: "+atributos.materia);
        guardarTxt.println("Nota: "+atributos.nota);
        guardarTxt.close();
        JOptionPane.showMessageDialog(null, "Se a guardado los datos en el archivo");
    }
    
}
