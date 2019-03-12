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
public class AddTask implements MenuItem{
    
    public AddTask() {
        
    }
    
    public void execute(){
        System.out.println("We are adding a task!!!");
    }
    
    // Description of this command
    @Override
    public String toString() {
        return "Add Task";
    } 
}
