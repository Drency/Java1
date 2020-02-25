import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

public class TrekantTall{
    public static void main(String[] args) {
        int innTall = parseInt(showInputDialog("SKriv inn et tall mellom 2 og 9"));

        if(innTall > 1 &  innTall < 10){

        }else {
            innTall = parseInt(showInputDialog("Skriv inn et tall mellom 2 og 9!"));
        }

        for(int i = 1; i < innTall; i++){
            for(int x = innTall; x>i; x--){
                System.out.print(" ");
                
            }
            System.out.print(i);
            System.out.println("");
        }

    }
}