import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

//Summ, differans, brøkdel og produkt
class L3J2{
    public static void main(String[] args) {
        int innTall1 = parseInt(showInputDialog("Skriv inn tall 1: "));
        int innTall2 = parseInt(showInputDialog("Skriv inn tall 2: "));

        int sum = innTall1+innTall2;
        int diff = innTall1-innTall2;
        int produkt = innTall1*innTall2;

        double brokdel = (innTall1/innTall2);
        int innTxt = parseInt(showInputDialog("Skriv inn hva du vil gjøre med tallene: \n 1 for Sum, 2 for Differans, 3 for Produkt, 4 for Brokdel"));

        String utTxt = "";

        switch(innTxt){
            case 1: utTxt = "Tall1: " + innTall1 + "\n" + "Tall2 : " + innTall2 + "\n" + "Sum: " + sum; break;
            case 2: utTxt = "Tall1: " + innTall1 + "\n" + "Tall2 : " + innTall2 + "\n" + "Differans: " + diff; break;
            case 3: utTxt = "Tall1: " + innTall1 + "\n" + "Tall2 : " + innTall2 + "\n" + "Produkt: " + produkt; break;
            case 4: utTxt = "Tall1: " + innTall1 + "\n" + "Tall2 : " + innTall2 + "\n" + "Brokdel: " + brokdel; break;
        }


        showMessageDialog(null, utTxt);

    }
}