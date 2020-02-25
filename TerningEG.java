
public class TerningEG extends EasyGraphics {
    public static void main(String[] args){
        launch(args);
    }

    public void run(){
        int WIN = 600;
        makeWindow("Terning" , WIN, WIN);

        int radius = WIN/6;
        int pos = WIN/6;

        fillCircle(pos, pos, radius);
        fillCircle(WIN-pos, pos, radius);
        fillCircle(WIN/2, WIN/2, radius);
        fillCircle(pos, WIN-pos, radius);
        fillCircle(WIN-pos, WIN-pos, radius);
    }
}