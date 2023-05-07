
package javafxapplication4;

import javafx.animation.TranslateTransition; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.util.Duration; 
         
public class TranslateTransitionExample extends Application { 
   @Override 
   public void start(Stage stage) { 
      Circle circle = new Circle(); 
      circle.setCenterX(150.0f); 
      circle.setCenterY(10.0f); 
      circle.setRadius(10.0f); 
      circle.setFill(Color.BLUE); 
      circle.setStrokeWidth(20); 
      TranslateTransition translateTransition = new TranslateTransition(); 
      translateTransition.setDuration(Duration.millis(10000)); 
      translateTransition.setNode(circle);  
      translateTransition.setByX(330); 
      translateTransition.setCycleCount(100); 
      translateTransition.setAutoReverse(false); 
      translateTransition.play(); 
         
      //Creating a Group object  
      Group root = new Group(circle); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Translate transition example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}