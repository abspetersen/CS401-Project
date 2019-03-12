/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.MenuItem;
import features.model.AllTasks;


public class DisplayTasks implements MenuItem {

      public ContactList contacts;
    
    public DisplayContacts(ContactList _contacts){
        contacts = _contacts;
    }
    
    @Override
    public void execute(){
        for (Contact con: contacts.getContacts()){
            System.out.print(con.getName() + ": ");
            System.out.print(con.getPhone() + ", ");
            System.out.print(con.getEmail() + ". \n");
        }
    }
    
    // Description of this command
    @Override
    public String toString() {
        return "View All Contacts";
    } 
}
