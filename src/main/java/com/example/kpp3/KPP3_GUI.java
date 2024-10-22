package com.example.kpp3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KPP3_GUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Перевірка перетину відрізків в декартовій системі координат");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Labels and text fields for a, b, c, d
        Label labelA = new Label("a:");
        GridPane.setConstraints(labelA, 0, 0);
        TextField inputA = new TextField();
        GridPane.setConstraints(inputA, 1, 0);

        Label labelB = new Label("b:");
        GridPane.setConstraints(labelB, 0, 1);
        TextField inputB = new TextField();
        GridPane.setConstraints(inputB, 1, 1);

        Label labelC = new Label("c:");
        GridPane.setConstraints(labelC, 0, 2);
        TextField inputC = new TextField();
        GridPane.setConstraints(inputC, 1, 2);

        Label labelD = new Label("d:");
        GridPane.setConstraints(labelD, 0, 3);
        TextField inputD = new TextField();
        GridPane.setConstraints(inputD, 1, 3);

        // Button to check intersection
        Button checkButton = new Button("Перевірити чи\nвони перетинаються");
        checkButton.setPrefWidth(140);
        checkButton.setPrefHeight(40);
        GridPane.setConstraints(checkButton, 1, 4);

        Label resultLabel = new Label();
        GridPane.setConstraints(resultLabel, 1, 5);

        checkButton.setOnAction(e -> {
            try {
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                int c = Integer.parseInt(inputC.getText());
                int d = Integer.parseInt(inputD.getText());

                int result = org.example.KPP3.checkIntersection(a, b, c, d);
                resultLabel.setText("Вони: " + (result == 1 ? "Перетинаються (1)" : "Не перетинаються (0)"));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Веддіть вірні дійсні числа.");
            }
        });

        grid.getChildren().addAll(labelA, inputA, labelB, inputB, labelC, inputC, labelD, inputD, checkButton, resultLabel);

        Scene scene = new Scene(grid, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}