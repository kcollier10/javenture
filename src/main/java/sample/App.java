package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);

        Label greeting = new Label("Welcome to Javenture!");
        Button start = new Button("START");
        Font buttons = new Font("Roboto", 12);

        greeting.setTextFill(Color.GREEN);
        greeting.setFont(Font.font("Roboto", FontWeight.BOLD, 50));
        greeting.setAlignment(Pos.CENTER);

        start.setTextFill(Color.GREEN);
        start.setFont(buttons);
        start.setAlignment(Pos.BOTTOM_CENTER);

        root.getChildren().add(greeting);
        root.getChildren().add(start);

        primaryStage.setTitle("Javenture");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
