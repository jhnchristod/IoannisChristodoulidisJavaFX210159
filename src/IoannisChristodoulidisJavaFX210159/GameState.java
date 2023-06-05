/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IoannisChristodoulidisJavaFX210159;

/**
 *
 * @author johnn
 */
public class GameState {
    public int CurrentRowIndex;
    public int CurrentColumnIndex;
    
    public GameState(){
        CurrentRowIndex = 0;
        CurrentColumnIndex = 0;
    }
    
    public void IncreaseRowIndex(){
        CurrentRowIndex++;
    }
     public void IncreaseColumnIndex(){
        CurrentColumnIndex++;
    }
    
    
}
