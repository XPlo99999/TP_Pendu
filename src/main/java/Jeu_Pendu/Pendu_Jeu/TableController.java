package Jeu_Pendu.Pendu_Jeu;

import java.io.IOException;
import javafx.fxml.FXML;

public class TableController {

	@FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
}
