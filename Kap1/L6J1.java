import java.io.*;
import java.util.*;

class L6J1{
    public static void main(String[] args) throws Exception{
        String[] navn = {"Arne Arntsen", "Jon Jakobsen", "Arne Aligator", "Nils Froden", "Andreas Bakken"};

        String filnavn = "navn.txt";
        PrintWriter skriver = new PrintWriter(filnavn);

        for(int i = 0; i < navn.length; i++){
            skriver.println(navn[i]);

        }

        skriver.close();
        
    }
}