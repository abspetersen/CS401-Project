/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;

import java.util.Scanner;

/**
 *
 * @author Genevieve
 */
public class TaskMenu {
    
    
    public void printMenu() {
        /*
        0:  View current tasks
        1:  Add a task
        2:  Delete a task
        */
        
        System.out.println("Main Menu");
        System.out.println("0: View current tasks");
        System.out.println("1: Add a task");
        System.out.println("2: Delete a task");
        System.out.println("Choose an option[0-2]: ");
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        if (input == 0) {
            
        }
        else if (input == 1) {
            
        }
        else {
            
        }
    }
    
    public void viewTasks() {
        
    }
    
    public void addTask() {
        
    }
    
    public void deleteTask() {
        
    }
    
}
