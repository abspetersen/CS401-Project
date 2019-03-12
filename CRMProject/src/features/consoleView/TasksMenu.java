/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.Menu;
import consoleKit.MenuItem;
import consoleKit.MenuStack;
import consoleKit.ReturnFromMenu;

/**
 *
 * @author abbypetersen
 */
public class TasksMenu implements MenuItem{
    
    private MenuStack menus;
    
    public TasksMenu(MenuStack menus) {
        this.menus = menus;   
    }
    
     public void execute(){
        Menu taskSubMenu = new Menu("Task Submenu", menus);
        
        taskSubMenu.add(new DisplayTasks());
        taskSubMenu.add(new ReturnFromMenu("Main Menu", menus));
        //taskSubMenu.add(new AddTask());
        
        
    }
   
    // Description of this command
    @Override
    public String toString() {
        return "Tasks";
    }
}
