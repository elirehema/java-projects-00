
package SceneSwitching;


import java.util.Stack;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

/**
 *
 * @author javila
 */
public class MyApp extends Application {

    private Config config = new Config() {};
    private Stack<Scene> scenes = new Stack<Scene>();
    private int windowWidth, windowHeight;
    private Stage primaryStage;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("My App");
        windowWidth = config.getWindowWidth();
        windowHeight = config.getWindowHeight();
        Scene scene = getScene("SPLASH");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Scene getScene(String choice) {

        Scene scene = null;
        
        if (choice.equals("SPLASH")) {
            Module splashScreenModule = new SplashScreenModule(config, this);
            scene = createNewScene(splashScreenModule.getContent());
            scenes.push(scene);
        }
        
        if (choice.equals("BROWSE")) {
            Module browseModule = new BrowseModule(config, this);
            scene = createNewScene(browseModule.getContent());
            scenes.push(scene);
        }
                
        if (choice.equals("SEARCH")) {
            searchModule = new SearchModule(config, this);
            scene = createNewScene(searchModule.getContent());
            scenes.push(scene);
        }
        
        if (choice.equals("DISPLAY")) {
            Module displayModule = new DisplayModule(config, this);
            scene = createNewScene(displayModule.getContent());
            scenes.push(scene);
        }

        return scene;
    }
    
    private Scene createNewScene(Group sceneContent) {
        Scene newScene = new Scene(sceneContent, windowWidth, windowHeight);
        newScene.getStylesheets().add(MyApp.class.getResource(
                config.getCssFileName()).toExternalForm());
        newScene.setFill(Color.LINEN);
        return newScene;
    }
    
    public void setScene(String choice) {
        primaryStage.setScene(getScene(choice));
        primaryStage.show();
    }
    
    public void returnToPreviousScene() {
        //--First remove the scene from which we come.
        scenes.pop();
        //--Then push the scene where we are going and go there.
        //--But this is equivalent to just using peek().
        primaryStage.setScene(scenes.peek());
    }
    
    public void returnToSplashScreen() {
        //--Clear the scene stack.
        scenes.clear();
        //--Bring up the splash screen
        setScene("SPLASH");
    }
    
}