import java.awt.Frame;
import java.awt.Label;

public class HelloWorld extends Frame{

   public HelloWorld(){
      Label helloWorld = new Label("Hello, World! ");
      add(helloWorld);
   }

   public static void main(String[] args){
      HelloWorld hw = new HelloWorld();
      hw.setSize(300, 300);
      hw.setVisible(true);
   }
}