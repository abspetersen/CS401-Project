/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import features.consoleView.AddEvent;
import features.model.CurrentWeek;
import features.model.Day;
import features.model.Event;
import features.model.EventList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrea
 */
public class CalendarTest {
    EventList el;
    
    public CalendarTest() {
        el = new EventList("Test List");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    // Test to make sure the listSize is same value as number of Events in EventList.
    public void testListSize() {
        el.addEvent(new Event("First Event", new GregorianCalendar(), false));
        el.addEvent(new Event("2nd Event", new GregorianCalendar(), true));
        assertEquals(el.getListSize(), 2);  // Should be equal.
    }
    
    @Test
    // Test Day's Calendar field to make sure it's getting the right date.
    public void testDaysCalendar() {
        Calendar c = new GregorianCalendar(2000, 1, 19);
        Day d = new Day(c);
        Calendar c2 = d.getDay();
        assertEquals(c, c2);
    }
    
    @Test
    // Test to make sure daysDate string is working properly.
    public void testDaysDate() {
        Day d = new Day(new GregorianCalendar(1998, 3, 21));
        assertEquals(d.getDaysDate(), "April 21, 1998");
    }   
    
}
