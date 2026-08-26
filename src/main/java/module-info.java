module com.maisonneuve.steamgames {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;

    requires jdk.compiler;



    opens com.maisonneuve.steamgames to javafx.fxml;
    opens com.maisonneuve.steamgames.controller to javafx.fxml;
    exports com.maisonneuve.steamgames;
    exports com.maisonneuve.steamgames.controller;
}