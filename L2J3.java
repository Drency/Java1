public class L2J3 extends EasyGraphics { 

    public static void main(String[] args) {
      launch(args);
    }
  
    public void run() {
      makeWindow("Firkant", 500, 500);              
      


      drawRectangle(10, 10, 250, 250);
      drawString("Hoyde", 275, 125);
      drawString("Bredde", 125, 275);                   
    }
}