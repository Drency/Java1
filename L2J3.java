
import static java.lang.Integer.*;

/**
 * EG vindu som henter inn 2 tall fra bruker og viser arialet fra disse som en string i EG vindu.
 */
public class L2J3 extends EasyGraphics { 

    public static void main(String[] args) {
      launch(args);
    }
  
    public void run() {
      makeWindow("Firkant", 500, 500);              
      


      drawRectangle(10, 10, 250, 250);
      String hoyde = getText("Skriv inn hoyden: ");
      String bredde = getText("Skriv inn bredde: ");
      
      
      drawString("Arialet er: " + (parseInt(bredde)*parseInt(hoyde)), 250, 300);
      
    }
}