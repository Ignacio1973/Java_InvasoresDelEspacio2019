
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Ignacio Rodríguez ánchez
 */
public class Disparos {
    
        public Image imagen = null;
    public int x = 0;
    public int y =0;
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;
    
   public Disparos(){
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/disparo.png"));
        } catch (IOException ex) {
            
        }    
    } 
   public void mueve(){
       y--;
   }
}
