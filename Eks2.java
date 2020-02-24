import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;


/**
 * Regner ut antall flis for en flate gitt i kvadrat meter
 * 
 */

public class Eks2 {
    public static void main(String[] args){
        double areal = parseDouble(showInputDialog("Skriv inn areal i kvadrat meter: "));
        
        double diameter = parseDouble(showInputDialog("Skriv inn antall diameter for en flis: "));

        double r = diameter/2;

        //Regner ut hvor mange fliser som trengs
        double arealFlis = (3*Math.sqrt(3)/2)*(r*r);

        int antallFlis = (int) (areal*10000/arealFlis+1);

        String ut = "Arealet av gul som skal dekkes: " + areal + " m2" + "\n" 
                    + "Diametyer av flis: " + diameter + " cm" + "\n" 
                    + "Antall fliser: " + antallFlis;
                    
        showMessageDialog(null, ut);



    }
}