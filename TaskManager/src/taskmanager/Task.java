/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;

import java.util.Calendar;

/**
 *
 * @author Genevieve
 */
public class Task {
    
    //fields
    private int task_id;
    private String taskName;
    private String taskDescription;
    private Calendar taskDueDate;
    
    //constructor
    public Task() {
        
    }
    
    //constructor with parameters
    public Task(String name, String description, Calendar date) {
        
    }

    /*------------SETTERS AND GETTERS------------*/
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Calendar getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(Calendar taskDueDate) {
        this.taskDueDate = taskDueDate;
    }
    
    
    /*------------------METHODS------------------*/
    
}
