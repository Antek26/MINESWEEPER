package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;

import java.io.FileInputStream;


public class goTo20x20Scene implements goToScene{

    private Button button = new Button();
    private ImageView logoImage;
    private Scene mainScene;



    @Override
    public void goToScene(Scene selectScene, Stage stage) throws Exception {

        StackPane pane = new StackPane();
        pane.getChildren().add(logoImage);
        for (int heightPos = -130; heightPos < 270; heightPos += 20)
        {
            for (int widthPos = -200; widthPos < 200; widthPos += 20)
            {
                this.button = new Button();
                addButtons.addButtonToPane(this.button,pane,20,20,widthPos,heightPos);
            }
        }

        Button quitButton = new Button();
        quitButton.setText("Stop the game");
        addButtons.addButtonToPane(quitButton,pane,100,15,240,220);


        quitButton.setOnAction(e ->
        {
            stage.setScene(mainScene);
            stage.show();
        });

        selectScene = new Scene(pane,600,500);
        Image image = new Image(new FileInputStream("C:\\Users\\antek\\OneDrive\\Bureau\\IMPORTANT_JAVA_STUFF\\ASSIGNMENT_3_JAVA2\\MINESWEEPER\\src\\Minesweeper_Logo.png"));


        //Setting the image view
        ImageView imageView = new ImageView(image);

        stage.setScene(selectScene);
    }



    public void setLogoImage(ImageView logoImage) {
        this.logoImage = logoImage;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }
}
