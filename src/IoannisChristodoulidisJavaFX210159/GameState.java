/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IoannisChristodoulidisJavaFX210159;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javafx.scene.control.Button;
import javafx.util.Pair;

/**
 *
 * @author johnn
 */
public class GameState {

    public int CurrentRowIndex;
    public int CurrentColumnIndex;
    public String[] Dictionary;
    public String CurrentWord;
    public List<Pair<Integer, Integer>> LetterOriginCoords;
    public List<Button> CurrentWordButtons;

    public GameState() {
        Dictionary = readFile("C:\\MyJavaProjects\\IoannisChristodoulidisJavaFX210159\\dic\\gr.txt");
        CurrentRowIndex = 0;
        CurrentColumnIndex = 0;
        CurrentWord = "";

        LetterOriginCoords = new ArrayList<>();
        CurrentWordButtons = new  ArrayList<>();

    }

    public Boolean CheckIfWordExists() {
        Boolean result = false;

        for (String strTemp : Dictionary) {
            if (strTemp.equals(CurrentWord)) {
                result = true;
                break;
            }
        }

        return result;
    }

    public void IncreaseRowIndex() {
        CurrentRowIndex++;
        CurrentWord = "";
        ResetWordButton();
    }
    
    public void ResetWordButton(){
        CurrentWordButtons.clear();
        CurrentWord = "";
    }

    public void IncreaseColumnIndex(Button bt) {
        CurrentWord += bt.getText();
        CurrentWordButtons.add(bt);
        CurrentColumnIndex++;
        
    }

    public static String[] readFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>(); // create an empty list to store the lines
        try (Scanner scanner = new Scanner(new File(fileName))) { // create a scanner to read the file
            while (scanner.hasNextLine()) { // loop until the end of the file
                lines.add(scanner.nextLine()); // add each line to the list
            }
        } catch (FileNotFoundException e) { // handle the exception if the file is not found
            e.printStackTrace();
        }
        return lines.toArray(new String[0]); // convert the list to an array and return it
    }


}
