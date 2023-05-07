
package javafxapplication4;
import java.awt.Dimension;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView; 
import javafx.stage.Stage;  

public class MultipleViews extends Application {  
   @Override 
   public void start(Stage stage) throws FileNotFoundException {         
      //Creating an image 
      Image image = new Image(new FileInputStream("D:\\Project1\\Java-and-Fx\\JavaFXApplication4\\src\\javafxapplication4\\images\\avatar.jpeg"));  
      int width = (int)image.getWidth(); 
      int height = (int)image.getHeight(); 
         
      ImageView imageView1 = new ImageView(image); 
      imageView1.setX(0); 
      imageView1.setY(0); 
      
      //setting the fit height and width of the image view 
      imageView1.setFitHeight(450); 
      imageView1.setFitWidth(600);         
      imageView1.setPreserveRatio(true); 
    
      //Creating a Group object  
      Group root = new Group(imageView1);  
      
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 400);  
      
      //Setting title to the Stage 
      stage.setTitle("Multiple views of an image");  
      
      //Adding scene to the stage 
      stage.setScene(scene);  
      
      //Displaying the contents of the stage
      stage.show(); 
   }  
   public static void main(String args[]) { 
      launch(args); 
   } 
}