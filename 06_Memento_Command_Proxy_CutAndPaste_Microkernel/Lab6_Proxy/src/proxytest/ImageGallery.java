package proxytest;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ImageGallery extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setWidth(900);
        primaryStage.setHeight(600);

        //Change this for yours! Should probably put NatGeo in the project folder
        String path = "/Users/reguly/Pictures/NatGeo";

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        ArrayList<Image> list = new ArrayList<Image>();
        for (final File file : listOfFiles) {
        		list.add(new Image(new FileInputStream(file)));
        }
        
        Iterator<Image> it = list.listIterator();
        
        BorderPane borderPane = new BorderPane();
        ImageView imageView = new ImageView();
        imageView.setImage(it.next());
        imageView.setStyle("-fx-background-color: BLACK");
        imageView.setFitHeight(stage.getHeight() - 10);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);
        borderPane.setCenter(imageView);
        borderPane.setStyle("-fx-background-color: BLACK");

        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){

                    if(mouseEvent.getClickCount() == 2){
                            imageView.setImage(it.next());
                    }
                }
            }
        });

        Scene scene = new Scene(borderPane,Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}