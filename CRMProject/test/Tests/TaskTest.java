/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import features.model.AllTasks;
import features.model.Task;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author genev
 */
public class TaskTest {
    
    AllTasks list;

    public TaskTest() {
        list = new AllTasks();
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
    
    /*Tests that adding tasks is working and returning the
    correct size*/
    @Test
    public void testListSize() {
        Task task1 = new Task("task1", "desc of task 1");
        Task task2 = new Task("task2", "desc of task 2");
        
        list.addTask(task1);
        list.addTask(task2);

        assertEquals(2, list.getListSize());
    }
    
    /*Tests that alltask class is able to retrieve tbe first
    and last of the list*/
    @Test
    public void testFirstAndLast() {
        AllTasks list2 = new AllTasks();
        
        Task task3 = new Task("First", "this is the first task");
        Task task4 = new Task("Last", "this is the last task");
        
        list2.addTask(task3);
        list2.addTask(task4);
        
        assertEquals("First", list2.getFirstTask().getName());
        assertEquals("Last", list2.getLastTask().getName());
    }

}
