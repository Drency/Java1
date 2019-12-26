import java.io.*;
import java.util.*;
import static java.lang.Double.*;
import java.lang.Math;


/**
 * Leser inn tall fra en fil med flere double på hver linje. Gjør double om til int, og skriver de på ny fil som heter heltall.txt
 * Det skrives 4 tall på hver linje
 */
class L6J2 {
    public static void main(String[] args) throws Exception{
        String filnavn = "desimal.txt";

        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);


        String linje = "";
        int plass = 0;
        List<Double> liste1 = new ArrayList<Double>();

        leser.useLocale(Locale.US);

        while(leser.hasNextLine()){
            while( leser.hasNext()) {
                liste1.add(leser.nextDouble());
            }
        }

        leser.close();

        List<Integer> liste = new ArrayList<Integer>();

        for(Double d : liste1){
            liste.add(rundAv(d));
        }

        PrintWriter skriver = new PrintWriter("heltall.txt");

        int telle = 0;
        
        for(int y = 0; y < liste.size(); y++){
            if(telle == 4){
                skriver.println("");
                skriver.print(liste.get(y) + ", ");
                telle = 1;
            } else {
                skriver.print(liste.get(y) + ", ");
                telle ++;
            }
        }
        skriver.close();
    }

    //Metode for å runde et tall fra double til int
    public static int rundAv(double i){
        int a = (int) Math.round(i);
        return a;
    }
}