package Jeu_Pendu.Pendu_Jeu;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToTable() throws IOException {
        App.setRoot("table");
    }
}