module com.example.lan_messenger {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lan.messenger to javafx.fxml;
    exports com.example.lan.messenger;
}