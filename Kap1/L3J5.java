import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

import java.util.ArrayList;

class L3J5{
    public static void main(String[] args){
        String innTxt = "";

        while(!innTxt.equals("exit")){
            innTxt = showInputDialog("Skriv inn et tall: \n Om du vil avslutte: exit");
            int tall1 = parseInt(innTxt);
            int tall2 = parseInt(showInputDialog("Skriv inn tall 2: "));
            String oddeTall ="";
            String parTall = "";

            
            int t;

            if(tall1 < tall2){
                for(int i = tall1; i < tall2; i++){
                    if((t=i%2)== 0){
                        parTall+= i + " ";
                    }else if((t=i%2) == 1){
                        oddeTall += i + " ";
                    }
                    
                }

            } else if(tall1 > tall2){
                for(int i = tall2; i < tall1; i++){
                    if((t=i%2)== 0){
                        parTall+= i + " ";
                    }else if((t=i%2) == 1){
                        oddeTall += i + " ";
                    }
                    
                }
            }

            showMessageDialog(null, "Tallene er: " + tall1 + " og " + tall2 +"\n" + "Partall: " + parTall + "\n" + "Oddetall: " + oddeTall);


        }


    }
}