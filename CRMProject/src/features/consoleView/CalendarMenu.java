/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.Menu;
import consoleKit.MenuItem;
import consoleKit.MenuStack;
import features.model.EventList;

/**
 *
 * @author abbypetersen
 * // hello
 */public class CalendarMenu implements MenuItem{
    
    private MenuStack menus;
    
    public CalendarMenu(MenuStack menus){
        this.menus = menus;
    }
    
    public void execute(){
        Menu calendarSubMenu = new Menu("Calendar Submenu", menus);
        calendarSubMenu.add(new DisplayWeek());
        calendarSubMenu.add(new AddEvent());
      
    }
    
    
    // Description of this command
    @Override
    public String toString() {
        return "Calendar";
    } 
}
