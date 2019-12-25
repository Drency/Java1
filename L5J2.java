import java.util.Random;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

/**
 * Leser inn antall kast fra bruker og lager en graf av terningkast resultat med EasyGraphics
 * Egen metode for å hente inn de tilfeldige terningkast mellom 1 og 6
 */
class L5J2 extends EasyGraphics {
    public static void main(String[] args){
        launch(args);
    }

    public void run(){
        int ant = parseInt(showInputDialog("Skriv inn antall terningkast: "));

        int[] antTall = new int[6];
        makeWindow("Graf", 600, 700);
        int max = MIN_VALUE;
        int skille = 100;
        int[] terningKast = new int[ant];

        drawString("Terningkast", 500/2, 10);
        drawString("Seksere", 10, skille * 6);
        drawString("Femere", 10, skille * 5);
        drawString("Firere", 10, skille * 4);
        drawString("Treere", 10, skille * 3);
        drawString("Toere", 10, skille * 2);
        drawString("Enere", 10, skille);



        for(int i = 0; i< ant; i++){
            terningKast[i] = trekkTall();
        }

        for(int z : terningKast){
            if(z == 1)
                antTall[0] += 1;
            if(z == 2)
                antTall[1] += 1;
            if(z == 3)
                antTall[2] += 1;
            if(z == 4)
                antTall[3] += 1;
            if(z == 5)
                antTall[4] += 1;
            if(z == 6)
                antTall[5] += 1;
        }

        for(int y : antTall){
            if(y == antTall[0]){
                for(int j = 0; j <antTall[0]; j++){
                    fillRectangle(50, skille, 60*antTall[0], 50);
                }
                drawString("Enere: " + antTall[0], 10, skille -10);
            }
            if (y == antTall[1]) {
                for (int j = 0; j < antTall[1]; j++) {
                    fillRectangle(50, skille*2, 60 * antTall[1], 50);
                }
                drawString("Toere: " + antTall[1], 10, skille*2 - 10);
            }
            if (y == antTall[2]) {
                for (int j = 0; j < antTall[2]; j++) {
                    fillRectangle(50, skille*3, 60 * antTall[2], 50);
                }
                drawString("Treere: " + antTall[2], 10, skille*3 - 10);
            }
            if(y == antTall[3]){
                for(int j = 0; j <antTall[3]; j++){
                    fillRectangle(50, skille*4, 60*antTall[3], 50);
                }
                drawString("Firere: " + antTall[3], 10, skille*4 -10);
            }
            if(y == antTall[4]){
                for(int j = 0; j <antTall[4]; j++){
                    fillRectangle(50, skille*5, 60*antTall[4], 50);
                }
                drawString("Femere: " + antTall[4], 10, skille*5 -10);
            }
            if(y == antTall[5]){
                for(int j = 0; j <antTall[5]; j++){
                    fillRectangle(50, skille*6, 60*antTall[5], 50);
                }
                drawString("Seksere: " + antTall[5], 10, skille*6 -10);
            }

        }
    }

    public int trekkTall(){
        Random r = new Random();
        int i = r.nextInt(6) + 1;
        return i;
    }
}