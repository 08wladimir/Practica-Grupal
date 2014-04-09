
package Businesslogic;

import java.io.File;


public class EliminarDatos {
    
    public void Eliminar(String pArchivo) throws Exception {
        
		try {
                    //Se elimina el archivo 
                    File fichero = new File(pArchivo);
                    if (!fichero.delete())
                        //Si no encuentra el archivo se muestra la excepcion
                    throw new Exception("El fichero " + pArchivo
						+ " no puede ser borrado!");
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
    
}
