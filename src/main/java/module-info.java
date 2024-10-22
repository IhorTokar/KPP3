module com.example.kpp3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kpp3 to javafx.fxml;
    exports com.example.kpp3;
}