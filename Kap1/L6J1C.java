import java.util.*;
import java.io.*;

class L6J1C {
    public static void main(String[] args) throws Exception{

        String filnavn = "navn.txt";
        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);

        String linje = "";
        // int str = 1;
        while ( leser.hasNextLine() ){
            linje += leser.nextLine();
            //str++;
            linje += ", ";
        }

        leser.close();

        String[] navneliste = linje.split(",[ ]*");
        String[] nyListe = new String[navneliste.length];

        for(int i = 0; i < navneliste.length; i++){

            String[] temp = navneliste[i].split("\\s");
            nyListe[i] = temp[1] + ", " + temp[0];
        }

        String etternavn = "etternavn.txt";

        PrintWriter skriver = new PrintWriter(etternavn);

        for(int z = 0; z < nyListe.length; z++){
            skriver.println(nyListe[z]);
        }

        skriver.close();
    }
}