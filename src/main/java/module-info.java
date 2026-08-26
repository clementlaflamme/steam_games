module com.maisonneuve.steamgames {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.opencsv;
    requires jdk.compiler;


    opens com.maisonneuve.steamgames to javafx.fxml;
    exports com.maisonneuve.steamgames;
}