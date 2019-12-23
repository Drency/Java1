import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


/**
 * Leser inn et tall og lager trapper bestående av TT
 * TT
 * TTTT
 * TTTTTT
 * TTTTTTTT
 * ^4 er skrevet inn
 */
class L4J1{
    public static void main(String[] args){
        int tall = parseInt(showInputDialog("Skriv inn tall 1: "));
        
        
        String utTxt = "";
        
        
        for(int x = 0; x < tall; x++){
            for(int y = 0; y<=x; y++){
                utTxt+="TT";
            }
            utTxt += "\n";
        }
        
        
        
        showMessageDialog(null, utTxt);
    }
}