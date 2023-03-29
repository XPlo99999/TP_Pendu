module Jeu_Pendu.Pendu_Jeu {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;

    opens Jeu_Pendu.Pendu_Jeu to javafx.fxml;
    exports Jeu_Pendu.Pendu_Jeu;
}