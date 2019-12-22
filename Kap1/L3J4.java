
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class L3J4 {
    
    
    public static void main(String[] args) {
        
        int innTall = parseInt(showInputDialog("Skriv inn et tall: "));
        
        int tall = innTall%10;
        String utTxt = "";
        
        
        
        switch(tall){
            case 0: utTxt = 0 + " -> NULL"; break;
            case 1: utTxt = 1 + " -> EN"; break;
            case 2: utTxt = 2 + " -> TO"; break;
            case 3: utTxt = 3 + " -> TRE"; break;
            case 4: utTxt = 4 + " -> FIRE"; break;
            case 5: utTxt = 5 + " -> FEM"; break;
            case 6: utTxt = 6 + " -> SEKS"; break;
            case 7: utTxt = 7 + " -> SYV"; break;
            case 8: utTxt = 8 + " -> ATTE"; break;
            case 9: utTxt = 9 + " -> NI"; break;
            default: utTxt = "NaN: "+ tall; break;
        }
        
        
        
        
        
        showMessageDialog(null,"Tallet du skrev inn var "+ innTall + ". Siste siffer er " +utTxt);
        
    }
}