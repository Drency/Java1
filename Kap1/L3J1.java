import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

/**
 * Program som teller antall siffer et tall har
 */

 public class L3J1{
     public static void main(String[] args) {
        String innTall = showInputDialog("Skriv inn et tall: ");
        
        if( innTall.length() < 3){
            showMessageDialog(null, "Tallet inneholder mindre enn 3 siffer");
        } else if(innTall.length() >= 3){
            showMessageDialog(null, "Tallet har flere enn 3 siffer!");
        }
        

     }
 }