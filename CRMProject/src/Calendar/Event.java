/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import java.util.Calendar;
import java.lang.String;

// Event will be a class
public class Event {
    String eventName;
    Calendar eventTime;
    boolean wantReminder;
    
    // Constructor.
    public Event(String name, Calendar time, boolean r) {
        this.eventName = name;
        this.eventTime = time;
        this.wantReminder = r;
    }
    
    // Getter for eventName.
    public String getEventName() {
        return eventName;
    }
    
    // Getter for eventTime.
    public Calendar getEventTime() {
        return eventTime;
    }
}
