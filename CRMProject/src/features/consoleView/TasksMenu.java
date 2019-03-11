/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

/**
 *
 * @author abbypetersen
 */
public class TasksMenu {
    
     public void execute(){
        
        subMenu.add(new DisplayTasks(chosenList));
        subMenu.add(new AddTask(chosenList));
    }
   
    // Description of this command
    @Override
    public String toString() {
        return "Tasks";
    }
}
