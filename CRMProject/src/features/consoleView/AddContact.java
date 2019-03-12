/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.MenuItem;

/**
 *
 * @author abbypetersen
 */
public class AddContact implements MenuItem{
    
       private ContactList contacts;
    
    public AddContact(ContactList cons){
        contacts = cons;
    }
    
    public void execute(){
        System.out.print("Enter the name of the new contact: ");
        String name = STDIN.next();
        System.out.print("Enter the phone number of the new contact: ");
        int pnum = STDIN.nextInt();
        System.out.print("Enter the email of the new contact: ");
        String email = STDIN.next();
        Contact c = new Contact(name, pnum, email);
        contacts.add(c);
    }
    
    // Description of this command
    @Override
    public String toString() {
        return "Add Contact";
    } 
}
