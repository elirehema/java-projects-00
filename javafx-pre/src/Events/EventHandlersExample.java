  
package Events;
import javafx.animation.RotateTransition; 
import javafx.application.Application; 
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler; 
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Group; 
import javafx.scene.PerspectiveCamera; 
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent; 
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color; 
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;

import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text;  
import javafx.scene.transform.Rotate; 
import javafx.scene.transform.Translate;
import javafx.stage.Stage; 
import javafx.util.Duration; 




public class EventHandlersExample extends Application { 
   
   @Override 
   public void start(Stage stage) {
       int lenght=1350; int width = 700;
  
      Text nameLabel = new Text("Full Name"); 
      
      TextField nameText = new TextField(); 
      Text dobLabel = new Text("Birthday"); 
      
      //date picker to choose date 
      DatePicker datePicker = new DatePicker(); 
       
      //Label for gender
      Text genderLabel = new Text("Gender"); 
           
      ToggleGroup groupGender = new ToggleGroup(); 
      RadioButton maleRadio = new RadioButton("male"); 
      maleRadio.setToggleGroup(groupGender); 
      RadioButton femaleRadio = new RadioButton("female"); 
      femaleRadio.setToggleGroup(groupGender); 
       
      //Label for reservation 
      Text reservationLabel = new Text("Reservation"); 
      
      //Toggle button for reservation 
      ToggleButton Reservation = new ToggleButton(); 
      ToggleButton yes = new ToggleButton("Yes"); 
      ToggleButton no = new ToggleButton("No");
      ToggleGroup groupReservation = new ToggleGroup(); 
      yes.setToggleGroup(groupReservation);   
      no.setToggleGroup(groupReservation); 
       
      //Label for technologies known 
      Text technologiesLabel = new Text("Technologies Known"); 
      
      //check box for education 
      CheckBox javaCheckBox = new CheckBox("Java"); 
      javaCheckBox.setIndeterminate(false); 
      
      CheckBox dotnetCheckBox = new CheckBox("DotNet"); 
      javaCheckBox.setIndeterminate(false); 
       
      Text educationLabel = new Text("Educational qualification"); 
      
      ObservableList<String> names = FXCollections.observableArrayList( 
         "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd"); 
      ListView<String> educationListView = new ListView<>(names);
      
      Text locationLabel = new Text("location"); 
      
      ChoiceBox locationchoiceBox = new ChoiceBox(); 
      locationchoiceBox.getItems().addAll
         ("Kigamboni ", "Chamanzi", "Mbezi", "Kigogo", "Mbagala"); 
       
      //Label for register 
      Button buttonRegister = new Button("Back");  
     buttonRegister.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: yellow;"); 
      
      //Creating a Grid Pane 
      GridPane gridPane1 = new GridPane();
      gridPane1.setMinSize(lenght, width); 
       
      gridPane1.setPadding(new Insets(10, 10, 10, 10));  
      
      gridPane1.setVgap(5); 
      gridPane1.setHgap(5);       
      
      gridPane1.setAlignment(Pos.CENTER); 
       
      gridPane1.add(nameLabel, 0, 0); 
      gridPane1.add(nameText, 1, 0); 
       
      gridPane1.add(dobLabel, 0, 1);       
      gridPane1.add(datePicker, 1, 1); 
      
      gridPane1.add(genderLabel, 0, 2); 
      gridPane1.add(maleRadio, 1, 2);       
      gridPane1.add(femaleRadio, 2, 2); 
      gridPane1.add(reservationLabel, 0, 3); 
      gridPane1.add(yes, 1, 3);       
      gridPane1.add(no, 2, 3);  
       
      gridPane1.add(technologiesLabel, 0, 4); 
      gridPane1.add(javaCheckBox, 1, 4);       
      gridPane1.add(dotnetCheckBox, 2, 4);  
       
      gridPane1.add(educationLabel, 0, 5); 
      gridPane1.add(educationListView, 1, 5);      
       
      gridPane1.add(locationLabel, 0, 6); 
      gridPane1.add(locationchoiceBox, 1, 6);    
       
      gridPane1.add(buttonRegister, 2, 8);      
      
      //Styling nodes   
      buttonRegister.setStyle("-fx-background-color: darkslateblue; -fx-textfill: white;"); 
       
      nameLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      dobLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      genderLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      reservationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      educationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      locationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
       
      //Setting the back ground color 
      gridPane1.setStyle("-fx-background-color: BEIGE;");       
       
      stage.setTitle("Registration Form"); 
         
      //Displaying the contents of the stage 
      stage.show(); 
          
        Group root1 = new Group(gridPane1);         
         final Scene scene1 = new Scene(root1, lenght, width);
  
      PhongMaterial material1 = new PhongMaterial();
      material1.setDiffuseMap(new Image ("http://www.tutorialspoint.com/images/tp-logo.gif"));
     
        Box box = new Box(); 
    
      //Setting the properties of the Box 
      box.setWidth(50.0); 
      box.setHeight(50.0);   
      box.setDepth(50.0);  
       
      //Creating the translation transformation 
      Translate translate = new Translate();       
      translate.setX(150); 
      translate.setY(150); 
      translate.setZ(150);  
       
      Rotate rxBox = new Rotate(0, 0, 0, 0, Rotate.X_AXIS); 
      Rotate ryBox = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS); 
      Rotate rzBox = new Rotate(0, 0, 0, 0, Rotate.Z_AXIS); 
      rxBox.setAngle(30); 
      ryBox.setAngle(50); 
      rzBox.setAngle(30); 
      box.getTransforms().addAll(translate,rxBox, ryBox, rzBox); 
      //Setting the text 
      Text text = new Text("Zamec Information School ");
      text.setFont(Font.font("Edwardian Script ITC", 70));
      text.setFill(Color.BROWN);
      text.setStrokeWidth(1);
      text.setStroke(Color.BLUE);
      
      Label action = new Label("Action Perfomed");
      Text setAction = new Text(" ");
      
      PhongMaterial material = new PhongMaterial();  
      material.setDiffuseColor(Color.BLUE); 
      box.setMaterial(material);       
  
      RotateTransition rotateTransition = new RotateTransition(); 
      rotateTransition.setDuration(Duration.millis(60000)); 
      rotateTransition.setNode(box);       
      rotateTransition.setAxis(Rotate.Y_AXIS); 
      rotateTransition.setByAngle(360); 
      rotateTransition.setCycleCount(50000); 
      rotateTransition.setAutoReverse(false);  
      
      Button login = new Button("Login");
      login.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: yellow;"); 
      Button register = new Button("Register");
      register.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: yellow;"); //css styles
      
      Label name = new Label("Name");
      name.setFont(Font.font(null, FontWeight.BOLD, 15));  
     //windows size
     
      
      
      Label pass = new Label("Password");
      pass.setFont(Font.font(null, FontWeight.BOLD, 15)); 
      //Creating a text filed 
      TextField textField = new TextField();  
      PasswordField textField2 = new PasswordField();  
      
      GridPane gridPane = new GridPane();        
      //Setting size for the pane  
      gridPane.setMinSize(lenght, width);    
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10));      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(15); 
      gridPane.setHgap(15);            
      //Setting the Grid alignment 
      //0784- 027019 mwana-Hamisi 
      gridPane.setAlignment(Pos.CENTER); 
      gridPane.add(text, 0,1);
      gridPane.add(box,1,4);
      gridPane.add(name, 1, 2); 
      gridPane.add(textField, 2, 2); 
      gridPane.add(pass, 1, 3);       
      gridPane.add(textField2, 2, 3); 
      gridPane.add(register, 1, 4); 
      gridPane.add(login, 2, 4); 
      gridPane.add(action, 2,5);
      gridPane.add(setAction,2,6);
      gridPane.setStyle("-fx-background-color: BEIGE;");       
       
      //Handling the key typed event 
      EventHandler<KeyEvent> eventHandlerTextField = new EventHandler<KeyEvent>() { 
         @Override 
         public void handle(KeyEvent event) { 
            //Playing the animation 
            rotateTransition.play(); 
         }           
      };              
      //Adding an event handler to the text feld 
      textField.addEventHandler(KeyEvent.KEY_TYPED, eventHandlerTextField);
      textField2.addEventHandler(KeyEvent.ANY, eventHandlerTextField);
     
       
      //Handling the mouse clicked event(on box) 
      EventHandler<javafx.scene.input.MouseEvent> eventHandlerBox = 
         new EventHandler<javafx.scene.input.MouseEvent>() { 
         
         @Override 
         public void handle(javafx.scene.input.MouseEvent e) { 
            rotateTransition.stop();  
         } 
      }; 
      //Adding the event handler to the box  
      box.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBox);
       
      //Event to the button
      DropShadow shadow = new DropShadow();
//Adding the shadow when the mouse cursor is on
 login.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
     login.setEffect(shadow);
     setAction.setText("Login");
      });
        login.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            login.setEffect(null);
      });
      login.setOnAction((ActionEvent e) -> {
          setAction.setText("Login Button Pressed!!");
      });
register.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
    register.setEffect(shadow);
    setAction.setText("Registration");
      });
        register.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            register.setEffect(null);
      });
       register.setOnAction((ActionEvent e) -> {
           setAction.setText("Registration Button Pressed!!");
           stage.setScene(scene1);
           buttonRegister.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: yellow;");
      });
    buttonRegister.addEventHandler(MouseEvent.ANY, (MouseEvent e) -> {
    buttonRegister.setEffect(shadow);
      });
      
       
      //Creating a Group object
      Group root = new Group(gridPane); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, lenght, 800);      
      
      buttonRegister.setOnAction((ActionEvent e) -> {
           setAction.setText("Registration Button Pressed!!");
           stage.setScene(scene);
             //root1.getChildren().addAll(new Label(" "), register);
      });
      
      //Setting camera 
      PerspectiveCamera camera = new PerspectiveCamera(false); 
      camera.setTranslateX(0); 
      camera.setTranslateY(0); 
      camera.setTranslateZ(0); 
      scene.setCamera(camera);  
      
     
      //stage.getIcons().add(new Image("C:/Users/nhlit/Desktop/contents/G1."));
      stage.setTitle("Login Page"); 
      stage.setScene(scene); 
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}
