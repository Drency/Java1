import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

class L2J2{

    public static void main(String[] args) {
        
        //Variabler
        int innTall;

        innTall = parseInt(showInputDialog("Skriv inn et tall: "));

        String utTxtPluss = String.valueOf(innTall+innTall);

        String utTxtGange = String.valueOf(innTall*innTall);

        showMessageDialog(null, innTall + " + " + innTall + " = " + utTxtPluss);

        showMessageDialog(null, innTall + " * " + innTall + " = " + utTxtGange);

    }

}