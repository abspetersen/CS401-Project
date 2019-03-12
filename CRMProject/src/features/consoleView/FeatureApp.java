/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.Menu;
import consoleKit.MenuStack;
import consoleKit.QuitCMD;

/**
 *
 * @author abbypetersen
 */
public class FeatureApp {
    public static void main(String[] args) {
        MenuStack menus = new MenuStack();
        
        Menu mainMenu = new Menu("Main Menu", menus);
        mainMenu.add(new QuitCMD());
        mainMenu.add(new CalendarMenu(menus));
        mainMenu.add(new TasksMenu(menus));
        //mainMenu.add(new ContactsMenu(menus));
        
    
        
        System.out.println("Customer Relations Management");
        while (true)
            menus.run();
        
    }
    
}
