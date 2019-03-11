/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.model;


import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author abbypetersen
 */
public class EventList {
    
    private final String week;
    private final List<Event> events;
    
    
    public EventList(String _week) {
        week = _week;
        events = new ArrayList<>();
    }

    
    public void add(Event event1) {
        events.add(event1);
    }
    
    
    /*public List<Event> getThisMonthEvents(){
        List<Event> thisMonth = new ArrayList<>();
        Calendar curMonth = new GregorianCalendar();
        int thisyear = curMonth.get(Calendar.YEAR),
            month = curMonth.get(Calendar.MONTH);
            events.stream().filter((ev) -> (ev.getTime() != null
                && thisyear == ev.getTime().get(Calendar.YEAR)
                && month == ev.getTime().get(Calendar.MONTH))).forEachOrdered((ev) -> {
                    thisMonth.add(ev);
        });         
        return thisMonth;
    }*/

    
    public List<Event> getThisWeekEvents() {
        List<Event> thisWeek = new ArrayList<>();
        Calendar curWeek = new GregorianCalendar();
        int thisYear = curWeek.get(Calendar.YEAR),
          thisMonth = curWeek.get(Calendar.MONTH);
        int currentWeek = curWeek.get(Calendar.WEEK_OF_MONTH);
        events.stream().filter((ev) -> (ev.getTime() != null
                && thisYear == ev.getTime().get(Calendar.YEAR)
                && thisMonth == ev.getTime().get(Calendar.MONTH)
                && currentWeek == ev.getTime().get(Calendar.WEEK_OF_MONTH))).forEachOrdered((ev) -> {
                    thisWeek.add(ev);
        });
        return thisWeek;
    }    
}
