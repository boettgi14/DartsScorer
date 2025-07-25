module io.github.boettgi14 {
    requires javafx.controls;
    requires javafx.fxml;

    opens io.github.boettgi14 to javafx.fxml;

    exports io.github.boettgi14;
}
