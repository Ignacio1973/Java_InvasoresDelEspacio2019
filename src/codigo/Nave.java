/*
Autor: Ignacio Rodríguez. Clase de la nave 
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class Nave {
    public Image imagen = null;
    public int x = 0;
    public int y =0;
    
    public Nave(){
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } catch (IOException ex) {
            
        }
      
        
    }
}
