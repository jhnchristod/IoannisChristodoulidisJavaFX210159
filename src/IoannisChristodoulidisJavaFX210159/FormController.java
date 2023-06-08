/*
 * Copyright (c) 2012, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package IoannisChristodoulidisJavaFX210159;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.Node;
import javafx.util.Pair;

/**
 * Controller class of the HelloI18N sample.
 */
public class FormController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    @FXML //  fx:id="button"
    private Button button; // Value injected by FXMLLoader
    @FXML //  fx:id="mylabel"
    private Label label;
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

        State = new GameState();

        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'HelloI18N.fxml'.";
        assert label != null;
        if (button != null) {
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    String letters = RandomLetterGenerator.generateRandomLetters(ProjectSettings.CountOfLetters);
                    System.out.println(resources.getString("button.printed.message"));
                    //label.setText(resources.getString("button.printed.message").toString());
                    label.setText(letters);
                    //LetterGrid.add(label, 0, 0);
                    for (int i = 0; i < ProjectSettings.CountOfLetters; i++) {
                        char selectedchar = letters.charAt(i);
                        Button bt = getButtonFromGridPane(i, LetterGrid);
                        bt.setText(String.valueOf(letters.charAt(i)));
                    }

                    //String firstletter=String.valueOf(letters.charAt(0));
                    //System.out.println(firstletter);
                    //Bt00.setText(String.valueOf(letters.charAt(0)));
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
