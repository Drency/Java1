import static java.lang.Math.*;

class Eks1b extends EasyGraphics{
    public static void main(String[] args) {
        launch(args);
    }

    public void run(){
        int side = 200;

        //Strl til doten over i'en
        int dotBredde = side/4;
        int dotHoyde = side/4;
        double xH = (25.0/400.0)*side;
        int dotY = (int) Math.round(xH);

        //kroppen av I
        double startY = (150.0/400.0)*side;
        int startPosY = (int) Math.round(startY);
        double skaler = (225.0/400.0)*side;

        
        int lengde =(int) Math.round(skaler);
        
        int bredde = side/4;

        //Lager vindu
        makeWindow("I", side, side);

        //Tegner sirkel
        drawCircle(side/2, side/2, side/2);

        fillRectangle((side/2)-dotBredde/2, dotY, dotBredde, dotHoyde);

        fillRectangle(side/2-bredde/2, startPosY, bredde, lengde);
        
    }
}