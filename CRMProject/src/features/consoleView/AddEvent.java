/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;
import consoleKit.*;

/**
 *
 * @author abbypetersen
 */

public class AddEvent implements MenuItem {
    
    public void execute(){
        // ADDING EVENT WILL DSPLAY DAYS OF WEEK, ASK FOR CHOICE OF WHICH DAY TO ADD EVENT TO, GET THAT DAY'S INFO AND PASS INFO TO EVENT TO ADD, ADD EVENT TO THAT DAY's EVENTLIST
        // DISPLAY THE DAYS, GET THE CHOICE, ADD NEW EVENT WITH THE INFO TO THE LIST
        System.out.println("We're in the AddEvent");
    }
    
    // Description of this command
    @Override
    public String toString() {
        return "Add Event";
    } 
}
