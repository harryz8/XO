module com.zs1.ox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zs1.ox to javafx.fxml;
    exports com.zs1.ox;
}