
package Businesslogic;

import Program.General;
import java.io.*;
import javax.swing.JOptionPane;

public class RegistroAlumno{
    //Se crea el archivo "txt"
    String archivo = "Registro.txt";
    File f = new File(archivo);
    
    private void datosEstudiante(General atributos, String n, int c, String m, double nota){
        atributos.nombre = n;
        atributos.codigo = c;
        atributos.materia = m;
        atributos.nota = nota;
    }
    public void registroAlArchivo(General atributos, String n, int c, String m, double nota) throws FileNotFoundException{
        datosEstudiante(atributos, n, c, m, nota);
        PrintWriter guardarTxt = new PrintWriter(f);
        
        guardarTxt.println(atributos.nombre);
        guardarTxt.println(atributos.codigo);
        guardarTxt.println(atributos.materia);
        guardarTxt.println(atributos.nota);
        guardarTxt.close();
        JOptionPane.showMessageDialog(null, "Se a guardado los datos en el archivo");
    }
    
}
