package io.github.boettgi14;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DartsScorerController {

    private DartsScorer dartsScorer;
    private int tmpScore;
    private int tmpPoints;
    private int tmpMultiplier;
    private int tmpEnding;
    private ArrayList<Double> tmpAverage = new ArrayList<Double>();

    // Neues Spiel Bereich
    @FXML
    private Label newGameScoreLabel;
    @FXML
    private Button newGame101Button;
    @FXML
    private Button newGame301Button;
    @FXML
    private Button newGame501Button;
    @FXML
    private Button newGame701Button;
    @FXML
    private Button newGame1001Button;
    @FXML
    private Label newGameEndingLabel;
    @FXML
    private Button newGameSOButton;
    @FXML
    private Button newGameDOButton;
    @FXML
    private Button newGameMOButton;
    @FXML
    private Label newGameSetsLabel;
    @FXML
    private TextField newGameSetsTextField;
    @FXML
    private Label newGameLegsLabel;
    @FXML
    private TextField newGameLegsTextField;
    @FXML
    private Button newGameButton;
    @FXML
    private Button gameAbortButton;

    // Sets und Legs Bereich
    @FXML
    private Label setsLabel1;
    @FXML
    private Label legsLabel1;
    @FXML
    private Label setsLabel2;
    @FXML
    private Label legsLabel2;

    // Spieler 1 Bereich
    @FXML
    private Label player1Label;
    @FXML
    private Label player1ScoreLabel1;
    @FXML
    private Label player1ScoreLabel2;
    @FXML
    private Label player1SetsLabel1;
    @FXML
    private Label player1LegsLabel1;
    @FXML
    private Label player1SetsLabel2;
    @FXML
    private Label player1LegsLabel2;
    @FXML
    private Label player1ThrowsLabel1;
    @FXML
    private Label player1ThrowsLabel2;
    @FXML
    private Label player1AverageLabel1;
    @FXML
    private Label player1AverageLabel2;
    @FXML
    private Label player1CheckoutLabel1;
    @FXML
    private Label player1CheckoutLabel2;
    @FXML
    private Label player1CheckoutLabel3;
    @FXML
    private Label player1CheckoutLabel4;
    @FXML
    private Label player1CheckoutLabel5;
    @FXML
    private Label player1CheckoutLabel6;
    @FXML
    private Label player1CheckoutLabel7;
    @FXML
    private Label player1EndingLabel;
    @FXML
    private Button player1Score1Button;
    @FXML
    private Button player1Score2Button;
    @FXML
    private Button player1Score3Button;
    @FXML
    private Button player1Score4Button;
    @FXML
    private Button player1Score5Button;
    @FXML
    private Button player1Score6Button;
    @FXML
    private Button player1Score7Button;
    @FXML
    private Button player1Score8Button;
    @FXML
    private Button player1Score9Button;
    @FXML
    private Button player1Score10Button;
    @FXML
    private Button player1Score11Button;
    @FXML
    private Button player1Score12Button;
    @FXML
    private Button player1Score13Button;
    @FXML
    private Button player1Score14Button;
    @FXML
    private Button player1Score15Button;
    @FXML
    private Button player1Score16Button;
    @FXML
    private Button player1Score17Button;
    @FXML
    private Button player1Score18Button;
    @FXML
    private Button player1Score19Button;
    @FXML
    private Button player1Score20Button;
    @FXML
    private Button player1ScoreBullsEyeButton;
    @FXML
    private Button player1ScoreMissButton;
    @FXML
    private Button player1ScoreSingleButton;
    @FXML
    private Button player1ScoreDoubleButton;
    @FXML
    private Button player1ScoreTripleButton;
    @FXML
    private Button player1ScoreSubmitButton;
    @FXML
    private Button player1ScoreResetButton;

    // Spieler 2 Bereich
    @FXML
    private Label player2Label;
    @FXML
    private Label player2ScoreLabel1;
    @FXML
    private Label player2ScoreLabel2;
    @FXML
    private Label player2SetsLabel1;
    @FXML
    private Label player2SetsLabel2;
    @FXML
    private Label player2LegsLabel1;
    @FXML
    private Label player2LegsLabel2;
    @FXML
    private Label player2ThrowsLabel1;
    @FXML
    private Label player2ThrowsLabel2;
    @FXML
    private Label player2AverageLabel1;
    @FXML
    private Label player2AverageLabel2;
    @FXML
    private Label player2CheckoutLabel1;
    @FXML
    private Label player2CheckoutLabel2;
    @FXML
    private Label player2CheckoutLabel3;
    @FXML
    private Label player2CheckoutLabel4;
    @FXML
    private Label player2CheckoutLabel5;
    @FXML
    private Label player2CheckoutLabel6;
    @FXML
    private Label player2CheckoutLabel7;
    @FXML
    private Label player2EndingLabel;
    @FXML
    private Button player2Score1Button;
    @FXML
    private Button player2Score2Button;
    @FXML
    private Button player2Score3Button;
    @FXML
    private Button player2Score4Button;
    @FXML
    private Button player2Score5Button;
    @FXML
    private Button player2Score6Button;
    @FXML
    private Button player2Score7Button;
    @FXML
    private Button player2Score8Button;
    @FXML
    private Button player2Score9Button;
    @FXML
    private Button player2Score10Button;
    @FXML
    private Button player2Score11Button;
    @FXML
    private Button player2Score12Button;
    @FXML
    private Button player2Score13Button;
    @FXML
    private Button player2Score14Button;
    @FXML
    private Button player2Score15Button;
    @FXML
    private Button player2Score16Button;
    @FXML
    private Button player2Score17Button;
    @FXML
    private Button player2Score18Button;
    @FXML
    private Button player2Score19Button;
    @FXML
    private Button player2Score20Button;
    @FXML
    private Button player2ScoreBullsEyeButton;
    @FXML
    private Button player2ScoreMissButton;
    @FXML
    private Button player2ScoreSingleButton;
    @FXML
    private Button player2ScoreDoubleButton;
    @FXML
    private Button player2ScoreTripleButton;
    @FXML
    private Button player2ScoreSubmitButton;
    @FXML
    private Button player2ScoreResetButton;

    /**
     * Update aller Labelinhalte der Ansichtsbereiche beider Spieler.
     */
    public void updateScores() {
        // Labelinhalte der Spieler updaten
        player1ScoreLabel2.setText("" + dartsScorer.getPlayer1Score());
        player1SetsLabel2.setText("" + dartsScorer.getPlayer1Sets());
        player1LegsLabel2.setText("" + dartsScorer.getPlayer1Legs());
        player1ThrowsLabel2.setText("" + dartsScorer.getPlayer1ThrowsLeft());
        player1AverageLabel2.setText("" + dartsScorer.getPlayer1Average());
        player1CheckoutLabel2.setText(dartsScorer.getPlayer1Factor1());
        player1CheckoutLabel3.setText(dartsScorer.getPlayer1Points1());
        player1CheckoutLabel4.setText(dartsScorer.getPlayer1Factor2());
        player1CheckoutLabel5.setText(dartsScorer.getPlayer1Points2());
        player1CheckoutLabel6.setText(dartsScorer.getPlayer1Factor3());
        player1CheckoutLabel7.setText(dartsScorer.getPlayer1Points3());
        player2ScoreLabel2.setText("" + dartsScorer.getPlayer2Score());
        player2SetsLabel2.setText("" + dartsScorer.getPlayer2Sets());
        player2LegsLabel2.setText("" + dartsScorer.getPlayer2Legs());
        player2ThrowsLabel2.setText("" + dartsScorer.getPlayer2ThrowsLeft());
        player2AverageLabel2.setText("" + dartsScorer.getPlayer2Average());
        player2CheckoutLabel2.setText(dartsScorer.getPlayer2Factor1());
        player2CheckoutLabel3.setText(dartsScorer.getPlayer2Points1());
        player2CheckoutLabel4.setText(dartsScorer.getPlayer2Factor2());
        player2CheckoutLabel5.setText(dartsScorer.getPlayer2Points2());
        player2CheckoutLabel6.setText(dartsScorer.getPlayer2Factor3());
        player2CheckoutLabel7.setText(dartsScorer.getPlayer2Points3());
    }

    /**
     * Pruefung auf Sieg eines Spielers, indem die noetigen Sets erreicht hat.
     * Anzeigen eines Pop-Ups mit Siegerinformationen bei Spielende.
     */
    public void checkForSuccess() {
        if (dartsScorer.getPlayer1Sets() == dartsScorer.getInitialSets()) { // Spieler 1 hat noetige Sets erreicht
            resetCompleteView(); // Ansicht zuruecksetzen

            // Pop-Up
            Alert winAlert = new Alert(AlertType.INFORMATION);
            winAlert.setHeaderText("Spiel beendet!");
            winAlert.setContentText("Spieler 1 hat gewonnen.");
            winAlert.showAndWait();
        } else if (dartsScorer.getPlayer2Sets() == dartsScorer.getInitialSets()) { // Spieler 2 hat noetige Sets
                                                                                   // erreicht
            resetCompleteView(); // Ansicht zuruecksetzen

            // Pop-Up
            Alert winAlert = new Alert(AlertType.INFORMATION);
            winAlert.setHeaderText("Spiel beendet!");
            winAlert.setContentText("Spieler 2 hat gewonnen.");
            winAlert.showAndWait();
        }
    }

    /**
     * Zuruecksetzen der Ansicht des kompletten Programms auf die Anfangswerte,
     * bevor eine Spiel gestartet wird.
     */
    public void resetCompleteView() {
        // Neues Spiel Bereich
        newGameScoreLabel.setDisable(false);
        newGame101Button.setDisable(false);
        newGame301Button.setDisable(false);
        newGame501Button.setDisable(false);
        newGame701Button.setDisable(false);
        newGame1001Button.setDisable(false);
        tmpScore = 0;
        newGameEndingLabel.setDisable(false);
        newGameSOButton.setDisable(false);
        newGameDOButton.setDisable(false);
        newGameMOButton.setDisable(false);
        tmpEnding = 0;
        newGameSetsLabel.setDisable(false);
        newGameSetsTextField.setDisable(false);
        newGameLegsLabel.setDisable(false);
        newGameLegsTextField.setDisable(false);
        newGameButton.setDisable(false);
        gameAbortButton.setDisable(true);

        // Sets und Legs Bereich
        setsLabel1.setDisable(true);
        setsLabel2.setDisable(true);
        setsLabel2.setText("" + 0);
        legsLabel1.setDisable(true);
        legsLabel2.setDisable(true);
        legsLabel2.setText("" + 0);

        // Spieler 1 Bereich
        player1ResetView();
        player1Label.setDisable(true);
        player1Label.setStyle(null);
        player1ScoreLabel1.setDisable(true);
        player1ScoreLabel1.setStyle(null);
        player1ScoreLabel2.setDisable(true);
        player1ScoreLabel2.setStyle(null);
        player1ScoreLabel2.setText("" + 0);
        player1SetsLabel1.setDisable(true);
        player1SetsLabel1.setStyle(null);
        player1SetsLabel2.setDisable(true);
        player1SetsLabel2.setStyle(null);
        player1SetsLabel2.setText("" + 0);
        player1LegsLabel1.setDisable(true);
        player1LegsLabel1.setStyle(null);
        player1LegsLabel2.setDisable(true);
        player1LegsLabel2.setStyle(null);
        player1LegsLabel2.setText("" + 0);
        player1ThrowsLabel1.setDisable(true);
        player1ThrowsLabel1.setStyle(null);
        player1ThrowsLabel2.setDisable(true);
        player1ThrowsLabel2.setStyle(null);
        player1ThrowsLabel2.setText("" + 0);
        player1AverageLabel1.setDisable(true);
        player1AverageLabel1.setStyle(null);
        player1AverageLabel2.setDisable(true);
        player1AverageLabel2.setStyle(null);
        player1AverageLabel2.setText("" + 0);
        player1CheckoutLabel1.setDisable(true);
        player1CheckoutLabel1.setStyle(null);
        player1CheckoutLabel2.setDisable(true);
        player1CheckoutLabel2.setStyle(null);
        player1CheckoutLabel2.setText("X");
        player1CheckoutLabel3.setDisable(true);
        player1CheckoutLabel3.setStyle(null);
        player1CheckoutLabel3.setText("X");
        player1CheckoutLabel4.setDisable(true);
        player1CheckoutLabel4.setStyle(null);
        player1CheckoutLabel4.setText("X");
        player1CheckoutLabel5.setDisable(true);
        player1CheckoutLabel5.setStyle(null);
        player1CheckoutLabel5.setText("X");
        player1CheckoutLabel6.setDisable(true);
        player1CheckoutLabel6.setStyle(null);
        player1CheckoutLabel6.setText("X");
        player1CheckoutLabel7.setDisable(true);
        player1CheckoutLabel7.setStyle(null);
        player1CheckoutLabel7.setText("X");
        player1EndingLabel.setDisable(true);
        player1EndingLabel.setStyle(null);
        player1EndingLabel.setText("");
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreBullsEyeButton.setStyle(null);
        player1ScoreMissButton.setDisable(true);
        player1ScoreMissButton.setStyle(null);

        // Spieler 2 Bereich
        player2ResetView();
        player2Label.setDisable(true);
        player2Label.setStyle(null);
        player2ScoreLabel1.setDisable(true);
        player2ScoreLabel1.setStyle(null);
        player2ScoreLabel2.setDisable(true);
        player2ScoreLabel2.setStyle(null);
        player2ScoreLabel2.setText("" + 0);
        player2SetsLabel1.setDisable(true);
        player2SetsLabel1.setStyle(null);
        player2SetsLabel2.setDisable(true);
        player2SetsLabel2.setStyle(null);
        player2SetsLabel2.setText("" + 0);
        player2LegsLabel1.setDisable(true);
        player2LegsLabel1.setStyle(null);
        player2LegsLabel2.setDisable(true);
        player2LegsLabel2.setStyle(null);
        player2LegsLabel2.setText("" + 0);
        player2ThrowsLabel1.setDisable(true);
        player2ThrowsLabel1.setStyle(null);
        player2ThrowsLabel2.setDisable(true);
        player2ThrowsLabel2.setStyle(null);
        player2ThrowsLabel2.setText("" + 0);
        player2AverageLabel1.setDisable(true);
        player2AverageLabel1.setStyle(null);
        player2AverageLabel2.setDisable(true);
        player2AverageLabel2.setStyle(null);
        player2AverageLabel2.setText("" + 0);
        player2CheckoutLabel1.setDisable(true);
        player2CheckoutLabel1.setStyle(null);
        player2CheckoutLabel2.setDisable(true);
        player2CheckoutLabel2.setStyle(null);
        player2CheckoutLabel2.setText("X");
        player2CheckoutLabel3.setDisable(true);
        player2CheckoutLabel3.setStyle(null);
        player2CheckoutLabel3.setText("X");
        player2CheckoutLabel4.setDisable(true);
        player2CheckoutLabel4.setStyle(null);
        player2CheckoutLabel4.setText("X");
        player2CheckoutLabel5.setDisable(true);
        player2CheckoutLabel5.setStyle(null);
        player2CheckoutLabel5.setText("X");
        player2CheckoutLabel6.setDisable(true);
        player2CheckoutLabel6.setStyle(null);
        player2CheckoutLabel6.setText("X");
        player2CheckoutLabel7.setDisable(true);
        player2CheckoutLabel7.setStyle(null);
        player2CheckoutLabel7.setText("X");
        player2EndingLabel.setDisable(true);
        player2EndingLabel.setStyle(null);
        player2EndingLabel.setText("");
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
    }

    /**
     * Herstellung der Standardwerte fuer den Ansichtsbereich von Spieler 1 vor
     * Eingabe einer Punktzahl.
     */
    public void player1ResetView() {
        // Labels
        player1Label.setStyle("-fx-background-color: lightgray");
        player1SetsLabel1.setStyle("-fx-background-color: lightgray");
        player1SetsLabel2.setStyle("-fx-background-color: lightgray");
        player1LegsLabel1.setStyle("-fx-background-color: lightgray");
        player1LegsLabel2.setStyle("-fx-background-color: lightgray");
        player1ScoreLabel1.setStyle("-fx-background-color: lightgray");
        player1ScoreLabel2.setStyle("-fx-background-color: lightgray");
        player1ThrowsLabel1.setStyle("-fx-background-color: lightgray");
        player1ThrowsLabel2.setStyle("-fx-background-color: lightgray");
        player1AverageLabel1.setStyle("-fx-background-color: lightgray");
        player1AverageLabel2.setStyle("-fx-background-color: lightgray");
        player1CheckoutLabel1.setStyle("-fx-background-color: lightgray");
        player1CheckoutLabel2.setStyle("-fx-background-color: lightgray");
        player1CheckoutLabel3.setStyle("-fx-background-color: lightgray");
        player1CheckoutLabel4.setStyle("-fx-background-color: lightgray");
        player1CheckoutLabel5.setStyle("-fx-background-color: lightgray");
        player1CheckoutLabel6.setStyle("-fx-background-color: lightgray");
        player1CheckoutLabel7.setStyle("-fx-background-color: lightgray");
        player1EndingLabel.setStyle("-fx-background-color: lightgray");

        // Punkte in Score-Bereich
        player1Score1Button.setDisable(false);
        player1Score1Button.setStyle(null);
        player1Score2Button.setDisable(false);
        player1Score2Button.setStyle(null);
        player1Score3Button.setDisable(false);
        player1Score3Button.setStyle(null);
        player1Score4Button.setDisable(false);
        player1Score4Button.setStyle(null);
        player1Score5Button.setDisable(false);
        player1Score5Button.setStyle(null);
        player1Score6Button.setDisable(false);
        player1Score6Button.setStyle(null);
        player1Score7Button.setDisable(false);
        player1Score7Button.setStyle(null);
        player1Score8Button.setDisable(false);
        player1Score8Button.setStyle(null);
        player1Score9Button.setDisable(false);
        player1Score9Button.setStyle(null);
        player1Score10Button.setDisable(false);
        player1Score10Button.setStyle(null);
        player1Score11Button.setDisable(false);
        player1Score11Button.setStyle(null);
        player1Score12Button.setDisable(false);
        player1Score12Button.setStyle(null);
        player1Score13Button.setDisable(false);
        player1Score13Button.setStyle(null);
        player1Score14Button.setDisable(false);
        player1Score14Button.setStyle(null);
        player1Score15Button.setDisable(false);
        player1Score15Button.setStyle(null);
        player1Score16Button.setDisable(false);
        player1Score16Button.setStyle(null);
        player1Score17Button.setDisable(false);
        player1Score17Button.setStyle(null);
        player1Score18Button.setDisable(false);
        player1Score18Button.setStyle(null);
        player1Score19Button.setDisable(false);
        player1Score19Button.setStyle(null);
        player1Score20Button.setDisable(false);
        player1Score20Button.setStyle(null);
        player1ScoreBullsEyeButton.setDisable(false);
        player1ScoreBullsEyeButton.setStyle(null);
        player1ScoreMissButton.setDisable(false);
        player1ScoreMissButton.setStyle(null);

        // Rest in Score-Bereich
        player1ScoreSingleButton.setDisable(true);
        player1ScoreSingleButton.setStyle(null);
        player1ScoreDoubleButton.setDisable(true);
        player1ScoreDoubleButton.setStyle(null);
        player1ScoreTripleButton.setDisable(true);
        player1ScoreTripleButton.setStyle(null);
        player1ScoreSubmitButton.setDisable(true);
        player1ScoreResetButton.setDisable(true);
    }

    /**
     * Herstellung der Standardwerte fuer den Ansichtsbereich von Spieler 2 vor
     * Eingabe einer Punktzahl.
     */
    public void player2ResetView() {
        // Labels
        player2Label.setStyle("-fx-background-color: lightgray");
        player2SetsLabel1.setStyle("-fx-background-color: lightgray");
        player2SetsLabel2.setStyle("-fx-background-color: lightgray");
        player2LegsLabel1.setStyle("-fx-background-color: lightgray");
        player2LegsLabel2.setStyle("-fx-background-color: lightgray");
        player2ScoreLabel1.setStyle("-fx-background-color: lightgray");
        player2ScoreLabel2.setStyle("-fx-background-color: lightgray");
        player2ThrowsLabel1.setStyle("-fx-background-color: lightgray");
        player2ThrowsLabel2.setStyle("-fx-background-color: lightgray");
        player2AverageLabel1.setStyle("-fx-background-color: lightgray");
        player2AverageLabel2.setStyle("-fx-background-color: lightgray");
        player2CheckoutLabel1.setStyle("-fx-background-color: lightgray");
        player2CheckoutLabel2.setStyle("-fx-background-color: lightgray");
        player2CheckoutLabel3.setStyle("-fx-background-color: lightgray");
        player2CheckoutLabel4.setStyle("-fx-background-color: lightgray");
        player2CheckoutLabel5.setStyle("-fx-background-color: lightgray");
        player2CheckoutLabel6.setStyle("-fx-background-color: lightgray");
        player2CheckoutLabel7.setStyle("-fx-background-color: lightgray");
        player2EndingLabel.setStyle("-fx-background-color: lightgray");

        // Punkte in Score-Bereich
        player2Score1Button.setDisable(false);
        player2Score1Button.setStyle(null);
        player2Score2Button.setDisable(false);
        player2Score2Button.setStyle(null);
        player2Score3Button.setDisable(false);
        player2Score3Button.setStyle(null);
        player2Score4Button.setDisable(false);
        player2Score4Button.setStyle(null);
        player2Score5Button.setDisable(false);
        player2Score5Button.setStyle(null);
        player2Score6Button.setDisable(false);
        player2Score6Button.setStyle(null);
        player2Score7Button.setDisable(false);
        player2Score7Button.setStyle(null);
        player2Score8Button.setDisable(false);
        player2Score8Button.setStyle(null);
        player2Score9Button.setDisable(false);
        player2Score9Button.setStyle(null);
        player2Score10Button.setDisable(false);
        player2Score10Button.setStyle(null);
        player2Score11Button.setDisable(false);
        player2Score11Button.setStyle(null);
        player2Score12Button.setDisable(false);
        player2Score12Button.setStyle(null);
        player2Score13Button.setDisable(false);
        player2Score13Button.setStyle(null);
        player2Score14Button.setDisable(false);
        player2Score14Button.setStyle(null);
        player2Score15Button.setDisable(false);
        player2Score15Button.setStyle(null);
        player2Score16Button.setDisable(false);
        player2Score16Button.setStyle(null);
        player2Score17Button.setDisable(false);
        player2Score17Button.setStyle(null);
        player2Score18Button.setDisable(false);
        player2Score18Button.setStyle(null);
        player2Score19Button.setDisable(false);
        player2Score19Button.setStyle(null);
        player2Score20Button.setDisable(false);
        player2Score20Button.setStyle(null);
        player2ScoreBullsEyeButton.setDisable(false);
        player2ScoreBullsEyeButton.setStyle(null);
        player2ScoreMissButton.setDisable(false);
        player2ScoreMissButton.setStyle(null);

        // Rest in Score-Bereich
        player2ScoreSingleButton.setDisable(true);
        player2ScoreSingleButton.setStyle(null);
        player2ScoreDoubleButton.setDisable(true);
        player2ScoreDoubleButton.setStyle(null);
        player2ScoreTripleButton.setDisable(true);
        player2ScoreTripleButton.setStyle(null);
        player2ScoreSubmitButton.setDisable(true);
        player2ScoreResetButton.setDisable(true);
    }

    /**
     * Setzen des temporaeren Scores auf 101.
     * 
     * @param event Klicken des 101 Buttons
     */
    @FXML
    public void input101(ActionEvent event) {
        tmpScore = 101;
        newGame101Button.setStyle("-fx-background-color: gray");
        newGame301Button.setStyle(null);
        newGame501Button.setStyle(null);
        newGame701Button.setStyle(null);
        newGame1001Button.setStyle(null);
    }

    /**
     * Setzen des temporaeren Scores auf 301.
     * 
     * @param event Klicken des 301 Buttons
     */
    @FXML
    public void input301(ActionEvent event) {
        tmpScore = 301;
        newGame101Button.setStyle(null);
        newGame301Button.setStyle("-fx-background-color: gray");
        newGame501Button.setStyle(null);
        newGame701Button.setStyle(null);
        newGame1001Button.setStyle(null);
    }

    /**
     * Setzen des temporaeren Scores auf 501.
     * 
     * @param event Klicken des 501 Buttons
     */
    @FXML
    public void input501(ActionEvent event) {
        tmpScore = 501;
        newGame101Button.setStyle(null);
        newGame301Button.setStyle(null);
        newGame501Button.setStyle("-fx-background-color: gray");
        newGame701Button.setStyle(null);
        newGame1001Button.setStyle(null);
    }

    /**
     * Setzen des temporaeren Scores auf 701.
     * 
     * @param event Klicken des 701 Buttons
     */
    @FXML
    public void input701(ActionEvent event) {
        tmpScore = 701;
        newGame101Button.setStyle(null);
        newGame301Button.setStyle(null);
        newGame501Button.setStyle(null);
        newGame701Button.setStyle("-fx-background-color: gray");
        newGame1001Button.setStyle(null);
    }

    /**
     * Setzen des temporaeren Scores auf 1001.
     * 
     * @param event Klicken des 1001 Buttons
     */
    @FXML
    public void input1001(ActionEvent event) {
        tmpScore = 1001;
        newGame101Button.setStyle(null);
        newGame301Button.setStyle(null);
        newGame501Button.setStyle(null);
        newGame701Button.setStyle(null);
        newGame1001Button.setStyle("-fx-background-color: gray");
    }

    /**
     * Setzen des temporaeren Endings auf 1 (Straight-Out).
     * 
     * @param event Klicken des Straight-Out Buttons
     */
    @FXML
    public void inputStraightOut(ActionEvent event) {
        tmpEnding = 1;
        newGameSOButton.setStyle("-fx-background-color: gray");
        newGameDOButton.setStyle(null);
        newGameMOButton.setStyle(null);
    }

    /**
     * Setzen des temporaeren Endings auf 2 (Double-Out).
     * 
     * @param event Klicken des Double-Out Buttons
     */
    @FXML
    public void inputDoubleOut(ActionEvent event) {
        tmpEnding = 2;
        newGameSOButton.setStyle(null);
        newGameDOButton.setStyle("-fx-background-color: gray");
        newGameMOButton.setStyle(null);
    }

    /**
     * Setzen des temporaeren Endings auf 3 (Master-Out).
     * 
     * @param event Klicken des Master-Out Buttons
     */
    @FXML
    public void inputMasterOut(ActionEvent event) {
        tmpEnding = 3;
        newGameSOButton.setStyle(null);
        newGameDOButton.setStyle(null);
        newGameMOButton.setStyle("-fx-background-color: gray");
    }

    /**
     * Starten eines neuen Spiels mit Pruefung ob die eingegebenen Spielparameter
     * korrekt sind.
     * Bei auftretenden Fehlern werden Pop-Ups angezeigt.
     * Außerdem werden die Spieleransichten aktiviert und deren Label geupdatet und
     * der Neues Spiel Bereich wird deaktiviert und geleert.
     * 
     * @param event Klicken des Spiel starten Buttons
     */
    @FXML
    public void submitNewGame(ActionEvent event) {
        try {
            if (tmpScore == 0 || tmpEnding == 0 || Integer.parseInt(newGameSetsTextField.getText()) < 1
                    || Integer.parseInt(newGameLegsTextField.getText()) < 1) { // Eingabe ist nicht erfolgreich
                // Pop-Up
                Alert rangeAlert = new Alert(AlertType.WARNING);
                rangeAlert.setHeaderText("Eingabe ist nicht möglich!");
                rangeAlert.setContentText(
                        "Bitte wähle einen Score und ein Ending und gib für die Sets und Legs mindestens 1 an.");
                rangeAlert.showAndWait();
            } else { // Eingabe ist erfolgreich
                dartsScorer = new DartsScorer(tmpScore, tmpEnding, Integer.parseInt(newGameSetsTextField.getText()),
                        Integer.parseInt(newGameLegsTextField.getText())); // Spiel starten
                dartsScorer.checkoutCalculator(); // Checkout bei Legs bis 101 berechnen
                updateScores(); // Ansicht updaten

                // Neues Spiel Bereich deaktivieren
                newGameScoreLabel.setDisable(true);
                newGame101Button.setDisable(true);
                newGame101Button.setStyle(null);
                newGame301Button.setDisable(true);
                newGame301Button.setStyle(null);
                newGame501Button.setDisable(true);
                newGame501Button.setStyle(null);
                newGame701Button.setDisable(true);
                newGame701Button.setStyle(null);
                newGame1001Button.setDisable(true);
                newGame1001Button.setStyle(null);
                newGameEndingLabel.setDisable(true);
                newGameSOButton.setDisable(true);
                newGameSOButton.setStyle(null);
                newGameDOButton.setDisable(true);
                newGameDOButton.setStyle(null);
                newGameMOButton.setDisable(true);
                newGameMOButton.setStyle(null);
                newGameSetsLabel.setDisable(true);
                newGameSetsTextField.setDisable(true);
                newGameLegsLabel.setDisable(true);
                newGameLegsTextField.setDisable(true);
                newGameButton.setDisable(true);
                gameAbortButton.setDisable(false);

                // Sets und Legs Labels setzen
                setsLabel1.setDisable(false);
                setsLabel2.setDisable(false);
                setsLabel2.setText("" + Integer.parseInt(newGameSetsTextField.getText()));
                legsLabel1.setDisable(false);
                legsLabel2.setDisable(false);
                legsLabel2.setText("" + Integer.parseInt(newGameLegsTextField.getText()));

                // Endinglabel beider Spieler setzen
                switch (dartsScorer.getEnding()) {
                    case 1:
                        player1EndingLabel.setText("(Straight-Out)");
                        player2EndingLabel.setText("(Straight-Out)");
                        break;
                    case 2:
                        player1EndingLabel.setText("(Double-Out)");
                        player2EndingLabel.setText("(Double-Out)");
                        break;
                    case 3:
                        player1EndingLabel.setText("(Master-Out)");
                        player2EndingLabel.setText("(Master-Out)");
                        break;
                }

                // Spieler Bereich aktivieren
                player1ResetView();
                player1Label.setDisable(false);
                player1SetsLabel1.setDisable(false);
                player1SetsLabel2.setDisable(false);
                player1LegsLabel1.setDisable(false);
                player1LegsLabel2.setDisable(false);
                player1ScoreLabel1.setDisable(false);
                player1ScoreLabel2.setDisable(false);
                player1ThrowsLabel1.setDisable(false);
                player1ThrowsLabel2.setDisable(false);
                player1AverageLabel1.setDisable(false);
                player1AverageLabel2.setDisable(false);
                player1CheckoutLabel1.setDisable(false);
                player1CheckoutLabel2.setDisable(false);
                player1CheckoutLabel3.setDisable(false);
                player1CheckoutLabel4.setDisable(false);
                player1CheckoutLabel5.setDisable(false);
                player1CheckoutLabel6.setDisable(false);
                player1CheckoutLabel7.setDisable(false);
                player1EndingLabel.setDisable(false);
                player2Label.setDisable(false);
                player2SetsLabel1.setDisable(false);
                player2SetsLabel2.setDisable(false);
                player2LegsLabel1.setDisable(false);
                player2LegsLabel2.setDisable(false);
                player2ScoreLabel1.setDisable(false);
                player2ScoreLabel2.setDisable(false);
                player2ThrowsLabel1.setDisable(false);
                player2ThrowsLabel2.setDisable(false);
                player2AverageLabel1.setDisable(false);
                player2AverageLabel2.setDisable(false);
                player2CheckoutLabel1.setDisable(false);
                player2CheckoutLabel2.setDisable(false);
                player2CheckoutLabel3.setDisable(false);
                player2CheckoutLabel4.setDisable(false);
                player2CheckoutLabel5.setDisable(false);
                player2CheckoutLabel6.setDisable(false);
                player2CheckoutLabel7.setDisable(false);
                player2EndingLabel.setDisable(false);

                // TextFields leeren
                newGameSetsTextField.clear();
                newGameLegsTextField.clear();
            }
        } catch (NumberFormatException e) { // Pruefung auf Fehler bei TextField-Format
            // Pop-Up
            Alert stringAlert = new Alert(AlertType.WARNING);
            stringAlert.setHeaderText("Eingabe ist nicht möglich!");
            stringAlert.setContentText("Die Sets und Legs müssen eine Zahl sein.");
            stringAlert.showAndWait();
        }
    }

    /**
     * Zuruecksetzten der Ansicht des komplette Programms und Anzeigen eines
     * Pop-Ups.
     * 
     * @param event Klicken des Spiel abbrechen Buttons
     */
    @FXML
    public void submitGameAbort(ActionEvent event) {
        resetCompleteView();
        Alert abortAlert = new Alert(AlertType.INFORMATION);
        abortAlert.setHeaderText("Spiel abgebrochen!");
        abortAlert.setContentText(
                "Du hast das Spiel abgebrochen, bitte wähle neue Spielparameter und starte ein neues Spiel an.");
        abortAlert.showAndWait();
    }

    @FXML
    public void score1Player1(ActionEvent event) {
        tmpPoints = 1;
        player1Score1Button.setStyle("-fx-background-color: gray");
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score2Player1(ActionEvent event) {
        tmpPoints = 2;
        player1Score1Button.setDisable(true);
        player1Score2Button.setStyle("-fx-background-color: gray");
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score3Player1(ActionEvent event) {
        tmpPoints = 3;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setStyle("-fx-background-color: gray");
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score4Player1(ActionEvent event) {
        tmpPoints = 4;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setStyle("-fx-background-color: gray");
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score5Player1(ActionEvent event) {
        tmpPoints = 5;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setStyle("-fx-background-color: gray");
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score6Player1(ActionEvent event) {
        tmpPoints = 6;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setStyle("-fx-background-color: gray");
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score7Player1(ActionEvent event) {
        tmpPoints = 7;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setStyle("-fx-background-color: gray");
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score8Player1(ActionEvent event) {
        tmpPoints = 8;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setStyle("-fx-background-color: gray");
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score9Player1(ActionEvent event) {
        tmpPoints = 9;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setStyle("-fx-background-color: gray");
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score10Player1(ActionEvent event) {
        tmpPoints = 10;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setStyle("-fx-background-color: gray");
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score11Player1(ActionEvent event) {
        tmpPoints = 11;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setStyle("-fx-background-color: gray");
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score12Player1(ActionEvent event) {
        tmpPoints = 12;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setStyle("-fx-background-color: gray");
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score13Player1(ActionEvent event) {
        tmpPoints = 13;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setStyle("-fx-background-color: gray");
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score14Player1(ActionEvent event) {
        tmpPoints = 14;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setStyle("-fx-background-color: gray");
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score15Player1(ActionEvent event) {
        tmpPoints = 15;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setStyle("-fx-background-color: gray");
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score16Player1(ActionEvent event) {
        tmpPoints = 16;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setStyle("-fx-background-color: gray");
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score17Player1(ActionEvent event) {
        tmpPoints = 17;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setStyle("-fx-background-color: gray");
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score18Player1(ActionEvent event) {
        tmpPoints = 18;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setStyle("-fx-background-color: gray");
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score19Player1(ActionEvent event) {
        tmpPoints = 19;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setStyle("-fx-background-color: gray");
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score20Player1(ActionEvent event) {
        tmpPoints = 20;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setStyle("-fx-background-color: gray");
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void scoreBullsEyePlayer1(ActionEvent event) {
        tmpPoints = 25;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setStyle("-fx-background-color: gray");
        player1ScoreMissButton.setDisable(true);
        player1ScoreSingleButton.setDisable(false);
        player1ScoreDoubleButton.setDisable(false);
        player1ScoreTripleButton.setDisable(true);
        player1ScoreResetButton.setDisable(false);
    }

    @FXML
    public void scoreMissPlayer1(ActionEvent event) {
        tmpPoints = 0;
        player1Score1Button.setDisable(true);
        player1Score2Button.setDisable(true);
        player1Score3Button.setDisable(true);
        player1Score4Button.setDisable(true);
        player1Score5Button.setDisable(true);
        player1Score6Button.setDisable(true);
        player1Score7Button.setDisable(true);
        player1Score8Button.setDisable(true);
        player1Score9Button.setDisable(true);
        player1Score10Button.setDisable(true);
        player1Score11Button.setDisable(true);
        player1Score12Button.setDisable(true);
        player1Score13Button.setDisable(true);
        player1Score14Button.setDisable(true);
        player1Score15Button.setDisable(true);
        player1Score16Button.setDisable(true);
        player1Score17Button.setDisable(true);
        player1Score18Button.setDisable(true);
        player1Score19Button.setDisable(true);
        player1Score20Button.setDisable(true);
        player1ScoreBullsEyeButton.setDisable(true);
        player1ScoreMissButton.setStyle("-fx-background-color: gray");
        player1ScoreSubmitButton.setDisable(false);
        player1ScoreResetButton.setDisable(false);
    }

    /**
     * Setzen des temporaeren Faktors auf 1.
     * 
     * @param event Klicken des Single Buttons
     */
    @FXML
    public void scoreSinglePlayer1(ActionEvent event) {
        tmpMultiplier = 1;
        player1ScoreSingleButton.setStyle("-fx-background-color: gray");
        player1ScoreDoubleButton.setDisable(true);
        player1ScoreTripleButton.setDisable(true);
        player1ScoreSubmitButton.setDisable(false);
    }

    /**
     * etzen des temporaeren Faktors auf 2.
     * 
     * @param event Klicken des Double Buttons
     */
    @FXML
    public void scoreDoublePlayer1(ActionEvent event) {
        tmpMultiplier = 2;
        player1ScoreSingleButton.setDisable(true);
        player1ScoreDoubleButton.setStyle("-fx-background-color: gray");
        player1ScoreTripleButton.setDisable(true);
        player1ScoreSubmitButton.setDisable(false);
    }

    /**
     * etzen des temporaeren Faktors auf 3.
     * 
     * @param event Klicken des Triple Buttons
     */
    @FXML
    public void scoreTriplePlayer1(ActionEvent event) {
        tmpMultiplier = 3;
        player1ScoreSingleButton.setDisable(true);
        player1ScoreDoubleButton.setDisable(true);
        player1ScoreTripleButton.setStyle("-fx-background-color: gray");
        player1ScoreSubmitButton.setDisable(false);
    }

    /**
     * Registrierung eines Wurfs fuer Spieler 1 mithilfe der vorher eingegebenen
     * Punktzahl und des Faktors.
     * Dabei wird geprueft ob der Wurf zum Spielsieg gefuehrt hat und ob der Wurf
     * selbst erfolgreich war. Bei Misserfolg erscheint ein Pop-Up.
     * Außerdem werden fuer Spieler 1 die Label geupdatet und die Ansicht resetet,
     * sowie die uebrigen Wuerfe verringert.
     * Wenn der dritte Wurf erreicht wurde wird der neue Wurf-Durchschnitt ermittelt
     * und die uebrigen Wuerfe beider Spieler resetet.
     * Danach werden die Label beider Spieler geupdatet und die Ansicht von Spieler
     * 1 deaktiviert, sowie die Ansicht von Spieler 2 aktiviert.
     * 
     * @param event Klicken des Submit Buttons von Spieler 1
     */
    @FXML
    public void submitPlayer1Score(ActionEvent event) {
        boolean throwSuccess = dartsScorer.scoreThrow(1, tmpPoints, tmpMultiplier); // Wurf registrieren
        checkForSuccess(); // Pruefung auf Spielsieg
        if (!throwSuccess) { // Wurf nicht erfolgreich
            // Pop-Up
            Alert throwAlert = new Alert(AlertType.WARNING);
            throwAlert.setHeaderText("Wurf nicht gültig!");
            throwAlert.setContentText(
                    "Dein letzter Wurf muss den Score auf genau 0 setzen und den nötigen Endwurf erfüllen.");
            throwAlert.showAndWait();
        }

        // temporaere Parameter setzen
        tmpAverage.add((double) (tmpPoints * tmpMultiplier));
        tmpPoints = 0;
        tmpMultiplier = 0;

        dartsScorer.setPlayer1ThrowsLeft(dartsScorer.getPlayer1ThrowsLeft() - 1); // uebrige Wuerfe verringern

        // Ansicht updaten und reseten
        updateScores();
        player1ResetView();

        if (dartsScorer.getPlayer1ThrowsLeft() <= 0) { // Wuerfe aufgebraucht
            // Errechnen des neuen Wurf-Durchschnitts nach 3 Wuerfen
            double tmp1 = 0;
            for (int m = 0; m < tmpAverage.size(); m++) {
                tmp1 = tmp1 + tmpAverage.get(m);
            }
            dartsScorer.getPlayer1AverageAL().add(tmp1 / 3);
            tmpAverage.clear();
            double tmp2 = 0;
            for (int n = 0; n < dartsScorer.getPlayer1AverageAL().size(); n++) {
                tmp2 = tmp2 + dartsScorer.getPlayer1AverageAL().get(n);
            }
            BigDecimal bd = new BigDecimal(tmp2 / dartsScorer.getPlayer1AverageAL().size()).setScale(3,
                    RoundingMode.HALF_UP);

            dartsScorer.setPlayer1Average(bd.doubleValue()); // Setzen des neuen Wurf-Durchschnitts

            dartsScorer.checkoutCalculator(); // noetige Würfe für Setzen des Scores auf 0 berechnen

            // neue Wurfzahlen setzen
            dartsScorer.setPlayer1ThrowsLeft(0);
            dartsScorer.setPlayer2ThrowsLeft(3);

            updateScores(); // Ansicht updaten

            // Spieler 1 deaktivieren
            player1Label.setStyle(null);
            player1SetsLabel1.setStyle(null);
            player1SetsLabel2.setStyle(null);
            player1LegsLabel1.setStyle(null);
            player1LegsLabel2.setStyle(null);
            player1ScoreLabel1.setStyle(null);
            player1ScoreLabel2.setStyle(null);
            player1ThrowsLabel1.setStyle(null);
            player1ThrowsLabel2.setStyle(null);
            player1AverageLabel1.setStyle(null);
            player1AverageLabel2.setStyle(null);
            player1CheckoutLabel1.setStyle(null);
            player1CheckoutLabel2.setStyle(null);
            player1CheckoutLabel3.setStyle(null);
            player1CheckoutLabel4.setStyle(null);
            player1CheckoutLabel5.setStyle(null);
            player1CheckoutLabel6.setStyle(null);
            player1CheckoutLabel7.setStyle(null);
            player1EndingLabel.setStyle(null);
            player1Score1Button.setDisable(true);
            player1Score2Button.setDisable(true);
            player1Score3Button.setDisable(true);
            player1Score4Button.setDisable(true);
            player1Score5Button.setDisable(true);
            player1Score6Button.setDisable(true);
            player1Score7Button.setDisable(true);
            player1Score8Button.setDisable(true);
            player1Score9Button.setDisable(true);
            player1Score10Button.setDisable(true);
            player1Score11Button.setDisable(true);
            player1Score12Button.setDisable(true);
            player1Score13Button.setDisable(true);
            player1Score14Button.setDisable(true);
            player1Score15Button.setDisable(true);
            player1Score16Button.setDisable(true);
            player1Score17Button.setDisable(true);
            player1Score18Button.setDisable(true);
            player1Score19Button.setDisable(true);
            player1Score20Button.setDisable(true);
            player1ScoreBullsEyeButton.setDisable(true);
            player1ScoreMissButton.setDisable(true);

            player2ResetView(); // Spieler 2 aktivieren
        }
    }

    /**
     * Zuruecksetzen der temporaeren Punktzahl, des temporaeren Faktors und der
     * Ansicht von Spieler 1.
     * 
     * @param event Klicken des Reset Buttons von Spieler 1
     */
    @FXML
    public void submitPlayer1Reset(ActionEvent event) {
        tmpPoints = 0;
        tmpMultiplier = 0;
        player1ResetView();
    }

    @FXML
    public void score1Player2(ActionEvent event) {
        tmpPoints = 1;
        player2Score1Button.setStyle("-fx-background-color: gray");
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score2Player2(ActionEvent event) {
        tmpPoints = 2;
        player2Score1Button.setDisable(true);
        player2Score2Button.setStyle("-fx-background-color: gray");
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score3Player2(ActionEvent event) {
        tmpPoints = 3;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setStyle("-fx-background-color: gray");
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score4Player2(ActionEvent event) {
        tmpPoints = 4;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setStyle("-fx-background-color: gray");
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score5Player2(ActionEvent event) {
        tmpPoints = 5;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setStyle("-fx-background-color: gray");
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score6Player2(ActionEvent event) {
        tmpPoints = 6;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setStyle("-fx-background-color: gray");
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score7Player2(ActionEvent event) {
        tmpPoints = 7;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setStyle("-fx-background-color: gray");
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score8Player2(ActionEvent event) {
        tmpPoints = 8;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setStyle("-fx-background-color: gray");
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score9Player2(ActionEvent event) {
        tmpPoints = 9;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setStyle("-fx-background-color: gray");
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score10Player2(ActionEvent event) {
        tmpPoints = 10;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setStyle("-fx-background-color: gray");
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score11Player2(ActionEvent event) {
        tmpPoints = 11;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setStyle("-fx-background-color: gray");
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score12Player2(ActionEvent event) {
        tmpPoints = 12;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setStyle("-fx-background-color: gray");
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score13Player2(ActionEvent event) {
        tmpPoints = 13;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setStyle("-fx-background-color: gray");
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score14Player2(ActionEvent event) {
        tmpPoints = 14;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setStyle("-fx-background-color: gray");
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score15Player2(ActionEvent event) {
        tmpPoints = 15;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setStyle("-fx-background-color: gray");
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score16Player2(ActionEvent event) {
        tmpPoints = 16;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setStyle("-fx-background-color: gray");
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score17Player2(ActionEvent event) {
        tmpPoints = 17;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setStyle("-fx-background-color: gray");
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score18Player2(ActionEvent event) {
        tmpPoints = 18;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setStyle("-fx-background-color: gray");
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score19Player2(ActionEvent event) {
        tmpPoints = 19;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setStyle("-fx-background-color: gray");
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void score20Player2(ActionEvent event) {
        tmpPoints = 20;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setStyle("-fx-background-color: gray");
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void scoreBullsEyePlayer2(ActionEvent event) {
        tmpPoints = 25;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setStyle("-fx-background-color: gray");
        player2ScoreMissButton.setDisable(true);
        player2ScoreSingleButton.setDisable(false);
        player2ScoreDoubleButton.setDisable(false);
        player2ScoreTripleButton.setDisable(true);
        player2ScoreResetButton.setDisable(false);
    }

    @FXML
    public void scoreMissPlayer2(ActionEvent event) {
        tmpPoints = 0;
        player2Score1Button.setDisable(true);
        player2Score2Button.setDisable(true);
        player2Score3Button.setDisable(true);
        player2Score4Button.setDisable(true);
        player2Score5Button.setDisable(true);
        player2Score6Button.setDisable(true);
        player2Score7Button.setDisable(true);
        player2Score8Button.setDisable(true);
        player2Score9Button.setDisable(true);
        player2Score10Button.setDisable(true);
        player2Score11Button.setDisable(true);
        player2Score12Button.setDisable(true);
        player2Score13Button.setDisable(true);
        player2Score14Button.setDisable(true);
        player2Score15Button.setDisable(true);
        player2Score16Button.setDisable(true);
        player2Score17Button.setDisable(true);
        player2Score18Button.setDisable(true);
        player2Score19Button.setDisable(true);
        player2Score20Button.setDisable(true);
        player2ScoreBullsEyeButton.setDisable(true);
        player2ScoreMissButton.setStyle("-fx-background-color: gray");
        player2ScoreSubmitButton.setDisable(false);
        player2ScoreResetButton.setDisable(false);
    }

    /**
     * Setzen des temporaeren Faktors auf 1.
     * 
     * @param event Klicken des Single Buttons
     */
    @FXML
    public void scoreSinglePlayer2(ActionEvent event) {
        tmpMultiplier = 1;
        player2ScoreSingleButton.setStyle("-fx-background-color: gray");
        player2ScoreDoubleButton.setDisable(true);
        player2ScoreTripleButton.setDisable(true);
        player2ScoreSubmitButton.setDisable(false);
    }

    /**
     * Setzen des temporaeren Faktors auf 2.
     * 
     * @param event Klicken des Double Buttons
     */
    @FXML
    public void scoreDoublePlayer2(ActionEvent event) {
        tmpMultiplier = 2;
        player2ScoreSingleButton.setDisable(true);
        player2ScoreDoubleButton.setStyle("-fx-background-color: gray");
        player2ScoreTripleButton.setDisable(true);
        player2ScoreSubmitButton.setDisable(false);
    }

    /**
     * Setzen des temporaeren Faktors auf 3.
     * 
     * @param event Klicken des Triple Buttons
     */
    @FXML
    public void scoreTriplePlayer2(ActionEvent event) {
        tmpMultiplier = 3;
        player2ScoreSingleButton.setDisable(true);
        player2ScoreDoubleButton.setDisable(true);
        player2ScoreTripleButton.setStyle("-fx-background-color: gray");
        player2ScoreSubmitButton.setDisable(false);
    }

    /**
     * Registrierung eines Wurfs fuer Spieler 2 mithilfe der vorher eingegebenen
     * Punktzahl und des Faktors.
     * Dabei wird geprueft ob der Wurf zum Spielsieg gefuehrt hat und ob der Wurf
     * selbst erfolgreich war. Bei Misserfolg erscheint ein Pop-Up.
     * Außerdem werden fuer Spieler 2 die Label geupdatet und die Ansicht resetet,
     * sowie die uebrigen Wuerfe verringert.
     * Wenn der dritte Wurf erreicht wurde wird der neue Wurf-Durchschnitt ermittelt
     * und die uebrigen Wuerfe beider Spieler resetet.
     * Danach werden die Label beider Spieler geupdatet und die Ansicht von Spieler
     * 2 deaktiviert, sowie die Ansicht von Spieler 1 aktiviert.
     * 
     * @param event Klicken des Submit Buttons von Spieler 2
     */
    @FXML
    public void submitPlayer2Score(ActionEvent event) {
        boolean throwSuccess = dartsScorer.scoreThrow(2, tmpPoints, tmpMultiplier); // Wurf registrieren
        checkForSuccess(); // Pruefung auf Spielsieg
        if (!throwSuccess) { // Wurf nicht erfolgreich
            // Pop-Up
            Alert throwAlert = new Alert(AlertType.WARNING);
            throwAlert.setHeaderText("Wurf nicht gültig!");
            throwAlert.setContentText(
                    "Dein letzter Wurf muss den Score auf genau 0 setzen und den nötigen Endwurf erfüllen.");
            throwAlert.showAndWait();
        }

        // temporaere Parameter setzen
        tmpAverage.add((double) (tmpPoints * tmpMultiplier));
        tmpPoints = 0;
        tmpMultiplier = 0;

        dartsScorer.setPlayer2ThrowsLeft(dartsScorer.getPlayer2ThrowsLeft() - 1); // uebrige Wuerfe verringern

        // Ansicht updaten und reseten
        updateScores();
        player2ResetView();

        if (dartsScorer.getPlayer2ThrowsLeft() <= 0) { // Wuerfe aufgebraucht
            // Berechnen des neuen Wurf-Durchschnitt nach 3 Wuerfen
            double tmp1 = 0;
            for (int m = 0; m < tmpAverage.size(); m++) {
                tmp1 = tmp1 + tmpAverage.get(m);
            }
            dartsScorer.getPlayer2AverageAL().add(tmp1 / 3);
            tmpAverage.clear();
            double tmp2 = 0;
            for (int n = 0; n < dartsScorer.getPlayer2AverageAL().size(); n++) {
                tmp2 = tmp2 + dartsScorer.getPlayer2AverageAL().get(n);
            }
            BigDecimal bd = new BigDecimal(tmp2 / dartsScorer.getPlayer2AverageAL().size()).setScale(3,
                    RoundingMode.HALF_UP);

            dartsScorer.setPlayer2Average(bd.doubleValue()); // Setzen des neuen Wurf-Durchschnitts

            dartsScorer.checkoutCalculator(); // noetige Würfe für Setzen des Scores auf 0 berechnen

            // neue Wurfzahlen setzen
            dartsScorer.setPlayer1ThrowsLeft(3);
            dartsScorer.setPlayer2ThrowsLeft(0);

            updateScores(); // Ansicht updaten

            // Spieler 2 deaktivieren
            player2Label.setStyle(null);
            player2SetsLabel1.setStyle(null);
            player2SetsLabel2.setStyle(null);
            player2LegsLabel1.setStyle(null);
            player2LegsLabel2.setStyle(null);
            player2ScoreLabel1.setStyle(null);
            player2ScoreLabel2.setStyle(null);
            player2ThrowsLabel1.setStyle(null);
            player2ThrowsLabel2.setStyle(null);
            player2AverageLabel1.setStyle(null);
            player2AverageLabel2.setStyle(null);
            player2CheckoutLabel1.setStyle(null);
            player2CheckoutLabel2.setStyle(null);
            player2CheckoutLabel3.setStyle(null);
            player2CheckoutLabel4.setStyle(null);
            player2CheckoutLabel5.setStyle(null);
            player2CheckoutLabel6.setStyle(null);
            player2CheckoutLabel7.setStyle(null);
            player2EndingLabel.setStyle(null);
            player2Score1Button.setDisable(true);
            player2Score2Button.setDisable(true);
            player2Score3Button.setDisable(true);
            player2Score4Button.setDisable(true);
            player2Score5Button.setDisable(true);
            player2Score6Button.setDisable(true);
            player2Score7Button.setDisable(true);
            player2Score8Button.setDisable(true);
            player2Score9Button.setDisable(true);
            player2Score10Button.setDisable(true);
            player2Score11Button.setDisable(true);
            player2Score12Button.setDisable(true);
            player2Score13Button.setDisable(true);
            player2Score14Button.setDisable(true);
            player2Score15Button.setDisable(true);
            player2Score16Button.setDisable(true);
            player2Score17Button.setDisable(true);
            player2Score18Button.setDisable(true);
            player2Score19Button.setDisable(true);
            player2Score20Button.setDisable(true);
            player2ScoreBullsEyeButton.setDisable(true);
            player2ScoreMissButton.setDisable(true);

            player1ResetView(); // Spieler 1 aktivieren
        }
    }

    /**
     * Zuruecksetzen der temporaeren Punktzahl, des temporaeren Faktors und der
     * Ansicht von Spieler 2.
     * 
     * @param event Klicken des Reset Buttons von Spieler 2
     */
    @FXML
    public void submitPlayer2Reset(ActionEvent event) {
        tmpPoints = 0;
        tmpMultiplier = 0;
        player2ResetView();
    }
}
