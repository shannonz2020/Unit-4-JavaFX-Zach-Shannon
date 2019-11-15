import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PushCounterAgain extends Application {
    private int count;
    private Text countText;

    @Override
    public void start(Stage stage) {
        count = 0;
        countText = new Text("Pushes: " + count);

        Button up = new Button("Increase!");
        up.setOnAction(this::processButtonPressInc);

        Button down = new Button("Decrease!");
        down.setOnAction(this::processButtonPressDec);

        Button other = new Button("Press this!");
        other.setOnAction(this::processButtonPressOther);

        FlowPane pane = new FlowPane(up, countText, down, other);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: cyan");

        Scene scene = new Scene(pane, 300, 100);

        stage.setTitle("Push Counter");
        stage.setScene(scene);
        stage.show();
    }

    private void processButtonPressInc(ActionEvent event) {
        // Counts number of button clicks and shows the result on a label
        count++;
        countText.setText("Pushes: " + count);

    }

    private void processButtonPressDec(ActionEvent event) {
        // Counts number of button clicks and shows the result on a label
        count--;
        countText.setText("Pushes: " + count);

    }
    private void processButtonPressOther(ActionEvent event) {
        // Counts number of button clicks and shows the result on a label
        count*=3;
        countText.setText("Pushes: " + count);

    }
}