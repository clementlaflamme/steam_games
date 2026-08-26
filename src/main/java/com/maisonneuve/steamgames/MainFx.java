package com.maisonneuve.steamgames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vues/lab.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("SteamGamesLibrary");
        stage.setScene(scene);
        stage.setMinWidth(900);
        stage.setMinHeight(600);

        stage.show();
    }
}
