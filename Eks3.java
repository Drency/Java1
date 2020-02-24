import java.util.*;
import java.io.*;
import static javax.swing.JOptionPane.*;


public class Eks3{
    public static void main(String[] args) throws Exception{
        String filnavn = showInputDialog("Skriv inn klasse navn, Eks - klasse3a: ");

        File fil = new File(filnavn + ".txt");
        Scanner leser = new Scanner(fil);

        List<Integer> liste = new ArrayList<Integer>();

        while(leser.hasNextLine()){
            while(leser.hasNext()){
                liste.add(leser.nextInt());
            }
        }

        leser.close();
        //Regner ut gjennomsnitt
        int telle = 0;
        int sum = 0;
        
        for(int i : liste){
            sum+= i;
            telle++;
        }

        int gjennomsnitt = sum/telle;

        //Finner høyeste og laveste student for og legger alle over og under gjennomsnittet i egen liste.
        List<Integer> underAvg = new ArrayList<Integer>();
        List<Integer> overAvg = new ArrayList<Integer>();
        int tempHoy = 0;
        int tempLav = 0;

        for(int i = 0; i< liste.size(); i++) {
            if(liste.get(i) < gjennomsnitt){
                underAvg.add(liste.get(i));
            } else if(liste.get(i) > gjennomsnitt){
                overAvg.add(liste.get(i));
            }
            if(i > tempHoy)
                tempHoy = i;
            else if(i < tempLav) 
                tempLav = i;
        }

        //Finner gjennomsnitt av de under gjennomsnitt
        int sumUnder = 0;
        for(int d : underAvg){
            sumUnder+= d;
        }

        int avgUnder = sumUnder/underAvg.size();


        //Finner gjennomsnitt av de som er over gjennomsnitt
        int sumOver = 0;
        
        for(int x : overAvg){
            sumOver += x;
        }

        int avgOver = sumOver/overAvg.size();
        

        PrintWriter skriver = new PrintWriter("res"+filnavn);

        String ut = tempLav + " -  Minste Høyde" + "\n"
                  + avgUnder + " -  Snitt Lave" + "\n"
                  + gjennomsnitt + " -  Klassesnitt" + "\n"
                  + avgOver + " - Snitt Høye" + "\n"
                  + tempHoy + " - Største Høyde";

        skriver.println(ut);

        skriver.close();
    }
}