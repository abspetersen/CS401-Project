
package Tasks;

import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class TaskMenu {
    
    private TaskList list;
    
    public TaskMenu() {
        list = new TaskList();
    }
    
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
        System.out.println("3: Return to main menu");
        System.out.println("Choose an option[0-2]: ");
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        if (input == 0) {
            viewTasks();
        }
        else if (input == 1) {
            addTask();
        }
        else if (input == 2) {
            deleteTask();
        }
        else if (input == 3) {
            //currently not linked up
        }
        
        
    }
    
    public void viewTasks() {
        list.viewList();
    }
    
    public void addTask() {
        //Task newTask = new Task();
        String name;
        String description;
        
        
        System.out.println("Name your task: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        name = input;
        
        System.out.println("Describe your task: ");
        input = scan.nextLine();
        description = input;
        
        System.out.println("Would you like to add a due date? [Y/N]");
        input = scan.nextLine();
        if (input == "Y" || input == "y") {
            System.out.println("Year: " );
            int year = scan.nextInt();
            
            System.out.println("Month [0-11]: ");
            int month = scan.nextInt();
            
            System.out.println("Day: ");
            int day = scan.nextInt();
            
            GregorianCalendar newCal = new GregorianCalendar(year, month, day);
            
            
            Task newTask = new Task(name, description, newCal);
            list.addTask(newTask);
        }
        else {
            Task newTask = new Task(name, description);
            list.addTask(newTask);
        }


    }
    
    public void deleteTask() {
        
    }
    
}
