/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import java.util.List;
import java.util.ArrayList;

// EventList will be a class that stores a list of Events.
public class EventList {
    String listDesc;        // Description of the list of Events.
    List<Event> eventList;      // Declare List of Events called eventList.
    int listSize;               // Number of Events in list.
    
    // Constructor.
    public EventList(String desc) {
        this.listDesc = desc;
        eventList = new ArrayList<>();
        listSize = 0;
    }
    
    // Getter for listDesc.
    public String getListDesc() {
        return listDesc;
    }
    
    // Getter for eventList.
    public List getEventList() {
        return eventList;
    }
    
    // Getter for listSize.
    public int getListSize() {
        return listSize;
    }
    
    // Getter for Event in list by index. This could be useful for retrieving
    // and editing/displaying an Event's information.
    public Event getEventFromList(int i) {
        return eventList.get(i);
    }
    
    // Add an Event to list.
    public void addEvent(Event e) {
        eventList.add(e);
    }
    
    //Remove an Event from list by its index.
    public void removeEvent(int i) {
        eventList.remove(i);
    }
    
}
