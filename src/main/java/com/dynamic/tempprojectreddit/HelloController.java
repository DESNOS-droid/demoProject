package com.dynamic.tempprojectreddit;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Rectangle ImageBlurREC;

    @FXML
    private Rectangle ImageRec;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private ScrollPane btnScrollPane;

    @FXML
    private GridPane buttonGridPane;

    @FXML
    private Label description;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //usually I do not do it like this, but it is a small demo

        ImageBlurREC.setFill(new ImagePattern(new Image("data:image/png;base64,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")));
        ImageBlurREC.widthProperty().bind(rootPane.widthProperty().subtract(5));
        ImageBlurREC.heightProperty().bind(rootPane.heightProperty().multiply(4).divide(7));

        for (int i = 0; i < 60; i++) {
            if (i % 10 == 0) {
                ColumnConstraints column = new ColumnConstraints();
                column.setPrefWidth(50);
                buttonGridPane.getColumnConstraints().add(column);
            }
            Button button = new Button(""+ i);
            button.setPrefWidth(55);
            button.setPrefHeight(30);
            buttonGridPane.add(button, i%10, i/10);
        }



    }
}
