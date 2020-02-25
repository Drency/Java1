
public class GEks1b extends EasyGraphics {

    public static void main(String[] args){
        launch(args);
    }

    public void run(){
        int size = 400;
        int side = size/3;
        makeWindow("Vindu", size, size);

        drawRectangle(0, 0, side, side);
        drawRectangle(side, side, side, side);
        drawRectangle(side*2, side*2, side, side);

        drawCircle(size/2, size/2, side/2);

    }
}