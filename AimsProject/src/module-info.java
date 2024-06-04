/**
 * 
 */
/**
 * 
 */
module AimsProject {
    requires javafx.controls;
    requires javafx.fxml;

    opens hust.soict.dsai.aims.screen.javafx to javafx.fxml;
    exports ust.soict.dsai.aims.screen.javafx;
}