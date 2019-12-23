
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

/**
 * Tar inn tall fra bruker2
 */

class L4J2{
    public static void main(String[] args){
        String innTxt = "";
        int sum = 0;
        int telle;
        boolean first = true;
        String utTxt = "";
        while(!innTxt.equals("exit")){
            innTxt = showInputDialog("Skriv inn et tall: \n Avslutte = exit");

            if(innTxt.equals("exit")){
                break;
            }

            int tall = parseInt(innTxt); 

            sum += tversum(tall);
            showMessageDialog(null, "Tversum er: "+ sum);
        }
    }

    public static int tversum(int tall){
        int sum = 0;
        while (tall > 0) {  
            sum += tall % 10;
            tall = tall / 10;
        }

        return sum;
    }
}