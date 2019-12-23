// import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

import java.util.Random;

/**
 * Klasse med metoder for tilfeldig tall, bokstav og setning. 
 * Bruker skriver inne tall og programmet lager setninger. 
 * Engelske bokstaver A-Z
 */
class L4J3 {
    public static void main(String[] args){

        int innTall = parseInt(showInputDialog("Skriv inn et tall mellom 2 og 10: "));
        String tekst = "";
        for(int i = 0; i<innTall;i++){
            tekst += lagord(rndTall());
            tekst += " ";
        }

        showMessageDialog(null, tekst);
    }

    public static char trekkBokstav(){
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'A');
        return c;
    }

    public static String lagord(int i){
        String s = "";
        for(int x = 0; x < i; x++){
            s += trekkBokstav();
        }
        return s;
    }

    public static int rndTall(){
        Random r = new Random();
        int i = r.nextInt(5)+1;
        return i;
    }
}