package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label title = new Label("Tính BMI");
        title.setFont(new Font("Arial", 24));

        Label weightLabel = new Label("Cân nặng (kg):");
        TextField weightField = new TextField();

        Label heightLabel = new Label("Chiều cao (m):");
        TextField heightField = new TextField();

        Button calculateBtn = new Button("Tính BMI");

        Label resultLabel = new Label();
        Label categoryLabel = new Label();

        calculateBtn.setOnAction(e -> {

            try {

                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());

                double bmi = weight / (height * height);

                resultLabel.setText(String.format("BMI: %.2f", bmi));

                if (bmi < 18.5) {
                    categoryLabel.setText("Bạn bị thiếu cân");
                }
                else if (bmi < 25) {
                    categoryLabel.setText("Bạn bình thường");
                }
                else if (bmi < 30) {
                    categoryLabel.setText("Bạn bị thừa cân");
                }
                else {
                    categoryLabel.setText("Bạn bị béo phì");
                }

            } catch (Exception ex) {
                resultLabel.setText("Vui lòng nhập số đúng!");
                categoryLabel.setText("");
            }

        });

        GridPane grid = new GridPane();

        grid.setVgap(15);
        grid.setHgap(10);
        grid.setPadding(new Insets(20));

        grid.add(weightLabel, 0, 0);
        grid.add(weightField, 1, 0);

        grid.add(heightLabel, 0, 1);
        grid.add(heightField, 1, 1);

        VBox layout = new VBox(20);

        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(
                title,
                grid,
                calculateBtn,
                resultLabel,
                categoryLabel
        );

        Scene scene = new Scene(layout, 400, 350);

        scene.getStylesheets().add(
                getClass().getResource("application.css").toExternalForm()
        );

        primaryStage.setTitle("Máy tính BMI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}