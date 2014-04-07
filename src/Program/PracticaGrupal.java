/**/

package Program;

import Interfaz.Menu;
import java.io.*;


public class PracticaGrupal {
    public String archivo = "Registro.txt";
    public File f = new File(archivo);
    public String vector[] = new String[4];
    
    public static void main(String[] args) {
        //Se llama a la clase menu del paquete Intefaz
        Menu menu = new Menu();
        menu.setVisible(true);
    }
    
}
