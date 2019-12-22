import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

/**
 * Parser fra tommer til cm og skriver ut meter.
 */
public class L2J4{
    public static void main(String[] args) {
        double tommerTilCm = 2.54;

        int innTall = parseInt(showInputDialog("Skriv inn antall tommer: "));

        double utTall = Math.round(innTall * tommerTilCm);

        showMessageDialog(null, utTall/100);
    }
}