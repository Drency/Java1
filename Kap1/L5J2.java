import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


/**
 * snur de 2 bakerste siffrene av et tall, som bruker skriver inn
 */
class L5J2 {
    public static void main(String[] args){
        int innTall = parseInt(showInputDialog("Skriv inn et tall hvor de 2 bakerste siffrene vil bli snudd: "));

        int forsteTall;
        int andreTall;
        String utTxt ="";

        forsteTall = innTall%10;
        innTall = innTall/10;
        andreTall =  innTall%10;
        innTall = innTall/10;
        if(innTall == 0){
            utTxt = "Nytt tall: " + forsteTall + "" + andreTall;
        } else
            utTxt = "Nytt tall : " + innTall +""+ forsteTall +"" + andreTall;

        showMessageDialog(null, utTxt);
    }
}