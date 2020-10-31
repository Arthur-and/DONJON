package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;


public class Main extends Application{
    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();
        root.setPrefSize(800, 600);

        root.getChildren().addAll();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        stage.setTitle("DONJON");

        stage.setResizable(false);  // empeche que le fenetre soit redimensionable
        // stage.close();  // ferme le fenetre

        Rectangle rectangle = new Rectangle();
        rectangle.setX(20);
        rectangle.setY(50);
        rectangle.setWidth(200);
        rectangle.setHeight(150);
        rectangle.setFill(Color.BISQUE);


        root.getChildren().add(rectangle);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.Z) {
                    System.out.println("Z");
                }
                if (ke.getCode() == KeyCode.S) {
                    System.out.println("S");
                }
                if (ke.getCode() == KeyCode.D) {
                    System.out.println("D");
                }
                if (ke.getCode() == KeyCode.Q) {
                    System.out.println("Q");
                }


            }
        });

        // https://induste.com/threads/creer-une-fenetre-avec-javafx.511424/
    }
}