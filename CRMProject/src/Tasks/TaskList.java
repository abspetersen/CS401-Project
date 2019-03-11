/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

import java.util.ArrayList;

/**
 *
 * @author Genevieve
 */
public class TaskList {
    
    ArrayList<Task> list;
    
    public TaskList() {
        list = new ArrayList<Task>();
    }
    
    public int getSize() {
        return list.size();
    }
    
    public void addTask(Task t) {
        list.add(t);
    }
    
    public void deleteTask(int t) {
        list.remove(t);
    }
    
    public void viewList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + ": ");
            list.get(i).viewTask();
        }
    }
}
