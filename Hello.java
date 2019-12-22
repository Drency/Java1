public class Hello extends EasyGraphics { 

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
    makeWindow("Sirkel", 500, 500);              
    
    fillCircle(250, 250, 250);                   
  }

  
  // CTRL + ALT + N = RUN
}