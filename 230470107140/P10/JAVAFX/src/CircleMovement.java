import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleMovement extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Create a circle
        Circle circle = new Circle(50, 100, 30);
        circle.setFill(Color.BLUE);

        // Add mouse hover events to change color
        circle.setOnMouseEntered(e -> circle.setFill(Color.RED));
        circle.setOnMouseExited(e -> circle.setFill(Color.BLUE));

        pane.getChildren().add(circle);

        // Create the scene and set key event handler
        Scene scene = new Scene(pane, 400, 200);
        scene.setOnKeyPressed(event -> {
            double step = 10;
            if (event.getCode() == KeyCode.RIGHT) {
                circle.setCenterX(circle.getCenterX() + step);
            } else if (event.getCode() == KeyCode.LEFT) {
                circle.setCenterX(circle.getCenterX() - step);
            }
        });

        primaryStage.setTitle("Move Circle with Keys and Change Color on Hover");
        primaryStage.setScene(scene);
        primaryStage.show();

        // To make sure the pane is focused and can receive key events
        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}