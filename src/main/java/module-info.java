module com.dynamic.tempprojectreddit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dynamic.tempprojectreddit to javafx.fxml;
    exports com.dynamic.tempprojectreddit;
}