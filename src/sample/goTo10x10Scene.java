package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;

public class goTo10x10Scene implements goToScene {

    private Button button = new Button();
    private ImageView logoImage;
    private Scene mainScene;


    @Override
    public void goToScene(Scene selectScene, Stage stage) throws Exception {

        StackPane pane = new StackPane();
        pane.getChildren().add(logoImage);
        for (int heightPos = -100; heightPos < 200; heightPos += 30)
        {
            for (int widthPos = -150; widthPos < 150; widthPos += 30)
            {
                this.button = new Button();
                addButtons.addButtonToPane(this.button,pane,30,30,widthPos,heightPos);
            }
        }
        Button quitButton = new Button();
        quitButton.setText("Stop the game");
        addButtons.addButtonToPane(quitButton,pane,100,15,190,220);


        quitButton.setOnAction(e ->
        {
            stage.setScene(mainScene);
            stage.show();
        });

        selectScene = new Scene(pane,600,500);
        stage.setScene(selectScene);
    }



    public void setLogoImage(ImageView logoImage) {
        this.logoImage = logoImage;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }
}
