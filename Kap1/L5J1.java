import java.util.Random;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

/**
 * Legger tilfeldige tall mellom 1 og 10 inn i array
 * Regner ut gjennomsnitt og skriver ut tall under gjennomsnittet
 * Bruker bestemmer strl på arrayet.
 */
class L5J1 {
    public static void main(String[] args){
        int ant = parseInt(showInputDialog("Skriv inn antall tall: "));
        int sum = 0;
        int gjennomsnitt = 0;
        int[] tall = new int[ant];
        String utTxt = "Tall i arrayet: [";
        boolean iArrayet = false;
        for(int i = 0; i < ant; i++){
            tall[i] = rndTall();
            if(i < ant-1){
                utTxt += tall[i] + ", ";
            } else {
                utTxt += tall[i] + " ";
            }
        }

        for (int i : tall) {
            sum += i;

        }
        
        gjennomsnitt = sum/ant;
        utTxt += "] \n" + "Gjennomsnitt: " + gjennomsnitt + "\n Tall under snittet: ";
        for(int x = 0; x < ant; x++){
            if(tall[x] < gjennomsnitt){
                utTxt += " " + tall[x];
            }
        }

        for (int y : tall) {
            if(y == gjennomsnitt){
                iArrayet = true;
            }
        }
        
        if (iArrayet) {
            utTxt += "\n Gjennomsnittstall er i arrayet";
        } else {
            utTxt += "\n Gjennomsnittstall er ikke i arrayet";
        }

        showMessageDialog(null, utTxt);
    }

    public static int rndTall() {
        Random r = new Random();
        int i = r.nextInt(10) + 1;
        return i;
    }
}