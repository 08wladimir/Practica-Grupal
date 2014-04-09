
package Businesslogic;

import java.io.File;


public class EliminarDatos {
    
    public void Eliminar(String pArchivo) throws Exception {
		try {
			File fichero = new File(pArchivo);
			if (!fichero.delete())
				throw new Exception("El fichero " + pArchivo
						+ " no puede ser borrado!");
		} catch (Exception e) {
			throw new Exception(e);
		} // end try
	} // end Eliminar
    
}
