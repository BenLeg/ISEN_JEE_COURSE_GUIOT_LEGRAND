package yncrea.lab02.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import yncrea.lab02.gateway.QuoteGateway;

public class FXApplication extends Application {

    private QuoteGateway quoteGateway;

    @Override
    public void init() throws Exception {
        quoteGateway = new QuoteGateway();
    }


    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText(quoteGateway.getRandomQuote());
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                btn.setText(quoteGateway.getRandomQuote());
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 1000, 150));
        primaryStage.show();
    }
}
