module com.example.what2watch {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    requires java.desktop;
    requires java.net.http;


    opens com.example.what2watch to javafx.fxml;
    exports com.example.what2watch;
    exports com.example.what2watch.Database;
    opens com.example.what2watch.Controllers to javafx.fxml;
    opens com.example.what2watch.Database to javafx.fxml;

}