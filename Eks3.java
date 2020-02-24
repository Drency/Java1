import java.util.*;
import java.io.*;
import static javax.swing.JOptionPane.*;


public class Eks3{
    public static void main(String[] args) throws Exception{
        String filnavn = showInputDialog("Skriv inn klasse navn: ");

        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);

        List<Integer> liste = new ArrayList<Integer>();

        while(leser.hasNextLine()){
            while(leser.hasNext()){
                liste.add(leser.nextInt());
            }
        }

        //Regner ut gjennomsnitt
        int telle = 0;
        int sum = 0;
        
        for(int i : liste){
            sum+= i;
            telle++;
        }

        int gjennomsnitt = sum/telle;

        List<Integer> underAvg = new ArrayList<Integer>();
        List<Integer> overAvg = new ArrayList<Integer>();

        for(int i = 0; i< liste.size(); i++) {
            if(liste.get(i) < gjennomsnitt){
                underAvg.add(liste.get(i));
            } else if(liste.get(i) > gjennomsnitt){
                overAvg.add(liste.get(i));
            }
        }

    }
}