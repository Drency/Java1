import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

class L6J1B {
    public static void main(String[] args) throws Exception{
        String filnavn = "navn.txt";
        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);

        String nyttNavn = showInputDialog("Skriv inn et navn: \n Eks: Fornavn Etternavn");
        
        String linje = "";
        while( leser.hasNextLine() ) {
            leser.hasNextLine();
            linje += leser.nextLine();
            linje += ", ";
        }
        linje += nyttNavn;
        leser.close();
        System.out.println(linje);

        String[] navneListe =linje.split(",[ ]*");

        PrintWriter skriver = new PrintWriter(filnavn);

        for(int i = 0; i< navneListe.length; i++){
            skriver.println(navneListe[i]);
        }

        skriver.close();
    }
}