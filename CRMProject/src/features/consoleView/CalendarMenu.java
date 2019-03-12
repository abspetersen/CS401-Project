
package features.consoleView;

import consoleKit.MenuItem;
import features.model.EventList;
import consoleKit.*;


 public class CalendarMenu implements MenuItem{
    
    private MenuStack menus;
    
    public CalendarMenu(MenuStack menus){
        this.menus = menus;
    }
    
    public void execute(){
        Menu calendarSubMenu = new Menu("Calendar Submenu", menus);
        calendarSubMenu.add(new DisplayWeek());
        calendarSubMenu.add(new AddEvent());
        calendarSubMenu.add(new ReturnFromMenu("Main Menu", menus));
    }
    
    
    // Description of this command
    @Override
    public String toString() {
        return "Calendar";
    } 
}

