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
// DISPLAY THE DAYS, GET THE CHOICE, ADD NEW EVENT WITH THE INFO TO THE LIST
public class AddEvent implements MenuItem {
    
    public void execute(){
        System.out.println("We're in the AddEvent");
    }
    
    // Description of this command
    @Override
    public String toString() {
        return "Add Event";
    } 
}
