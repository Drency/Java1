import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
/**
 * skriver ut dag for et tall 1-7
 */
public class L3J3 {

    public static void main(String[] args){
        int innTall = parseInt(showInputDialog("Skriv inn et tall mellom 1 og 7"));

        String utTxt = "";
        switch (innTall) {
            case 1: utTxt = "Mandag"; break;
            case 2: utTxt = "Tirsdag"; break;
            case 3: utTxt = "Onsdag"; break;
            case 4: utTxt = "Torsdag"; break;
            case 5: utTxt = "Fredag"; break;
            case 6: utTxt = "Lørdag"; break;
            case 7: utTxt = "Søndag"; break;
            default: utTxt = "Tallet er ikke mellom 1 og 7"; break;
        }

        showMessageDialog(null, utTxt);
    }


    
}