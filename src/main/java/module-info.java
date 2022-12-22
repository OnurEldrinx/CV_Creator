module com.teamfive.cvcreator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires MaterialFX;


    opens com.teamfive.cvcreator to javafx.fxml;
    opens com.teamfive.cvcreator.Controller to javafx.fxml;
    exports com.teamfive.cvcreator;
}