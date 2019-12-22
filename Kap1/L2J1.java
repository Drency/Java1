import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


class L2J1{


    public static void main(String[] args) {
        String fornavn, etternavn;
        int arstall;
        String melding;

        fornavn = showInputDialog("Skriv inn fornavn: ");
        etternavn = showInputDialog("Skriv inn etternavn: ");
        
        melding = "Lykke til med Java";
        
        arstall = parseInt(showInputDialog("Skriv inn årstall: "));


        String utTxt = "Ditt navn: " + fornavn + " " + etternavn + "\n" + melding + "\n" + "Årsatllet er: " + arstall; 
        
        showMessageDialog(null, utTxt);

    }
}