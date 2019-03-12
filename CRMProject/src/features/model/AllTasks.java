/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.model;

import java.util.ArrayList;
import java.util.List;


public class AllTasks {
    private static final int NO_CHOICE = -1;
    private final List<Task> alltasks;
    private int chosenList;

    // Initialize contacts to empty list
    public AllTasks() {
        alltasks = new ArrayList<>();
        chosenList = NO_CHOICE;    // no list chosen
    }
    
      // set the "current" list
    public void setFocus(int index) {
        chosenList = index;
    }

    // Add a reminder to the "current" list
    public void addTask(Task task) {
        alltasks.add(task);
    }
}
