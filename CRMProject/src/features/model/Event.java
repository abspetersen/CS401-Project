/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.model;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author abbypetersen
 */
public class Event {
    private String desc;
    private Calendar eventTime;
    
      public Event(String _desc) {
        desc = _desc;
    }

    public Event(String _desc, Calendar _eventTime) {
        desc = _desc;
        eventTime = _eventTime;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public Calendar getTime() {
        return eventTime;
    }
    
    
}
