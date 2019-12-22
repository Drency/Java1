import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


/**
 * får tall fra bruker, finner gjennomsnitt kontinuerlig, og max og min tall
 */
class L3J6 {
    public static void main(String[] args){
        
        int min = MAX_VALUE, max = MIN_VALUE, telle = 1, sum = 0;
        String innTxt = "", utTxt = "";
        boolean first = true;

        while(!innTxt.equals("exit")){
            innTxt = showInputDialog("Skriv inn et tall:  \n Avslutte = exit");
            int tall = 0;
            if(!innTxt.equals("exit"))
                tall = parseInt(innTxt);
            else
                break;


            if(tall < min)
                min = tall;
            if(tall > max)
                max = tall;

            if(first){
                sum = tall;
                first = false;
            } else
                sum += tall;
                
            utTxt = "Minste tall: " + min + "\n" + "Max tall: " + max + "\n" + "Gjennomsnitt er: " + sum/telle;
                
            showMessageDialog(null, utTxt);
                
            telle++;    
        }

    }
}