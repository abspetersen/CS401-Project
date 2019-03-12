/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.Menu;
import consoleKit.MenuStack;
import consoleKit.QuitCMD;
import features.model.AllTasks;
import features.model.CurrentWeek;
import features.consoleView.*;

/**
 *
 * @author abbypetersen
 */
public class FeatureAppMain {
    public static void main(String[] args) {
        MenuStack menus = new MenuStack();
        
        //calendar stuff
        CurrentWeek thisWeek = new CurrentWeek();   // Initialize CurrentWeek list?
        //
        
        //junk for Tasks
        AllTasks tasklist = new AllTasks();
        //
        
        
        
        Menu mainMenu = new Menu("Main Menu", menus);
        mainMenu.add(new QuitCMD());
        mainMenu.add(new CalendarMenu(menus, thisWeek));    // need to pass thisWeek?
        mainMenu.add(new TasksMenu(menus, tasklist));
        mainMenu.add(new ContactsMenu(menus));
        
    
        
        
        System.out.println("Customer Relations Management");
        while (true)
            menus.run();
        
    }
    
}
