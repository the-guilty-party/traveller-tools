module rpg.traveller {
    requires javafx.controls;
    requires javafx.fxml;

    opens rpg.traveller to javafx.fxml;
    exports rpg.traveller;
}
