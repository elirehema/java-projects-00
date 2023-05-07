
package javafxapplication4;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TwoScene extends Application {
    Button btnscene1, btnscene2;
    Label lblscene1, lblscene2;
    FlowPane pane1, pane2;
    Scene scene1, scene2;
    Stage thestage;
    
     @Override
    public void start(Stage primaryStage) {
      
        thestage=primaryStage;
        //can now use the stage in other methods
       
        //make things to put on panes
        btnscene1=new Button("Click to go to Other Scene");
        btnscene2=new Button("Click to go back to First Scene");
        btnscene1.setOnAction(e-> ButtonClicked(e));
        btnscene2.setOnAction(e-> ButtonClicked(e));
        lblscene1=new Label("Scene 1");
        lblscene2=new Label("Scene 2");
}

    /**
     *
     * @param e
     */
    private void ButtonClicked(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //make 2 Panes
     pane1=new FlowPane();
     pane2=new FlowPane();
     pane1.setVgap(10);
     pane2.setVgap(10);
     //set background color of each Pane
     pane1.setStyle("-fx-background-color: tan;-fx-padding: 10px;");
     pane2.setStyle("-fx-background-color: red;-fx-padding: 10px;");
        
     //add everything to panes
     pane1.getChildren().addAll(lblscene1, btnscene1);
     pane2.getChildren().addAll(lblscene2, btnscene2);
        scene1 = new Scene(pane1, 200, 100);
        scene2 = new Scene(pane2, 200, 100);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
        public void ButtonClicked(ActionEvent e)
    {
        if (e.getSource()==btnscene1)
            thestage.setScene(scene2);
        else
            thestage.setScene(scene1);
    }
        @FXML
 private void handleButtonAction(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;
     if(event.getSource()==btn1){
        //get reference to the button's stage         
        stage=(Stage) btn1.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
      }
     else{
       stage=(Stage) btn2.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
      }
     //create a new scene with root and set the stage
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }
    
    }
}