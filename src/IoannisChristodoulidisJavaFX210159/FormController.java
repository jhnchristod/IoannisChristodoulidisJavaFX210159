package IoannisChristodoulidisJavaFX210159;

import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.Node;
import javafx.util.Pair;


public class FormController {

    @FXML 
    private Button btNewGame; 
    @FXML
    private GridPane LetterGrid;
    @FXML
    private GridPane WordsGrid;
    @FXML
    private Button Bt0;
    @FXML
    private Button Bt1;
    @FXML
    private Button Bt2;
    @FXML
    private Button Bt3;
    @FXML
    private Button Bt4;
    @FXML
    private Button Bt5;
    @FXML
    private Button Bt6;
    @FXML
    private Button Bt7;
    @FXML
    private Button Bt8;
    @FXML
    private Button Bt9;
    @FXML
    private Button Bt10;
    @FXML
    private Button Bt11;
    @FXML
    private Button Bt12;
    @FXML
    private Button Bt13;
    @FXML
    private Button Bt14;
    @FXML
    private Button Bt15;
    @FXML
    private Button Bt16;
    @FXML
    private Button Bt17;
    @FXML
    private Button Bt18;
    @FXML
    private Button Bt19;
    @FXML
    private Button Bt20;
    @FXML
    private Button Bt21;
    @FXML
    private Button Bt22;
    @FXML
    private Button Bt23;
    @FXML
    private Button Bt24;
    @FXML
    private Button Bt25;
    @FXML
    private Button Bt26;
    @FXML
    private Button Bt27;
    @FXML
    private Button Bt28;
    @FXML
    private Button Bt29;
    @FXML
    private Button BtnEndOfWord;

    GameState State;

    /**
     * Initializes the controller class.
     */
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        LetterGrid.setVisible(false);
        BtnEndOfWord.setVisible(false);
        State = new GameState();

        btNewGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String letters = RandomLetterGenerator.generateRandomLetters(ProjectSettings.CountOfLetters);
                for (int i = 0; i < ProjectSettings.CountOfLetters; i++) {
                    Button bt = getButtonFromGridPane(i, LetterGrid);
                    bt.setText(String.valueOf(letters.charAt(i)));
                }
                LetterGrid.setVisible(true);
                BtnEndOfWord.setVisible(true);
                
            }
        });

        Object actionEvent = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ButtonClicked(event);
            }
        };

        Bt0.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt1.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt2.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt3.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt4.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt3.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt4.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt5.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt6.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt7.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt8.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt9.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt10.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt11.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt12.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt13.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt14.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt15.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt16.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt17.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt18.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt19.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt20.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt21.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt22.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt23.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt24.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt25.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt26.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt27.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt28.setOnAction((EventHandler<ActionEvent>) actionEvent);
        Bt29.setOnAction((EventHandler<ActionEvent>) actionEvent);

        BtnEndOfWord.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //telos leksis
                if (State.CheckIfWordExists()) {
                    if (State.CurrentColumnIndex != 0) {
                        State.CurrentColumnIndex = 0;
                        if (State.CurrentRowIndex < 15) {
                            State.IncreaseRowIndex();
                            State.ResetWordButton();
                            State.CurrentColumnIndex = 0;
                            State.LetterOriginCoords.clear();
                        }
                    }
                } else {
                    //h colona mexri tin opoa prepei na diabasoume
                    //State.CurrentColumnIndex
                    Integer index = 0;
                    for (Pair<Integer, Integer> p : State.LetterOriginCoords) {
                        Button bt = State.CurrentWordButtons.get(index);
                        index++;
                        LetterGrid.add(bt, p.getKey(), p.getValue());
                    }
                    State.ResetWordButton();
                    State.CurrentColumnIndex = 0;
                    State.LetterOriginCoords.clear();

                }

            }
        });

    }

    private void ButtonClicked(ActionEvent event) {
        Button bt = (Button) event.getSource();
        //bt.setText("?");
        //bt.setDisable(true);
        Integer cIdx = GridPane.getColumnIndex(bt);
        if (cIdx == null) {
            cIdx = 0;
        }
        Integer rIdx = GridPane.getRowIndex(bt);
        if (rIdx == null) {
            rIdx = 0;
        }
        State.LetterOriginCoords.add(new Pair<Integer, Integer>(cIdx, rIdx));
        WordsGrid.add(bt, State.CurrentColumnIndex, State.CurrentRowIndex);

        if (State.CurrentColumnIndex < ProjectSettings.MaxLettersPerWord) {
            State.IncreaseColumnIndex(bt);
        } else {
            //end of word forced
        }
    }

    private Button getButtonFromGridPane(int btnIndex, GridPane gridPane) {
        Button bt = null;
        String buttonPrefix = "Bt";
        ObservableList<Node> children = gridPane.getChildren();
        for (Node node : children) {
            Button btemp = (Button) node;
            String btid = btemp.getId();
            if (btid.equals(buttonPrefix + Integer.toString(btnIndex))) {
                bt = btemp;
                break;
            }
        }
        return bt;
    }

}
