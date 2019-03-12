/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.MenuItem;

/**
 *
 * @author abbypetersen
 */
public class DisplayTasks implements MenuItem {

    public DisplayTasks() {
        
    }
    
     public void execute(){
        System.out.println("We are in display tasks execute area");
    }
    
    // Description of this command
    @Override
    public String toString() {
        return "Display Tasks";
    }
}
