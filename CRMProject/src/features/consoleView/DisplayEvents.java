/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.*;
import features.model.*;

public class DisplayEvents implements MenuItem {
    
    CurrentWeek thisWeek;
    
    public DisplayEvents(CurrentWeek thisWeek) {
        this.thisWeek = thisWeek;
    }
    
     public void execute(){
        // DISPLAY EVENTS WILL CYCLE THROUGH DAYS OF WEEK, CYCLE THROUGH EACH DAY'S EVENTLIST AND DISPLAY EVENT INFO 
        for (Day d : thisWeek.getCurrentWeek()) {
            for (Event e : d.getDaysEvents().getEventList()) {
                System.out.println("Event: " + e.getEventName());
                System.out.println("Event Time: " + e.getEventTime());
                System.out.println();
            }
        }
    }
    
     // Description of this command
    @Override
    public String toString() {
        return "Display Events";
    } 
}
