/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.MenuItem;
import features.model.EventList;

/**
 *
 * @author abbypetersen
 */public class CalendarMenu implements MenuItem{
    
    private EventList week;
    
    public CalendarMenu(EventList _week){
        week = _week;
    }
    
    public void execute(){
        
        
        subMenu.add(new DisplayWeek(chosenList));
        subMenu.add(new AddEvent(chosenList));
    }
    
    
    // Description of this command
    @Override
    public String toString() {
        return "Calendar";
    } 
}
