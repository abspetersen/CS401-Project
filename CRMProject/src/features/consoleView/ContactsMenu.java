/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import static consoleKit.Console.getChoice;
import consoleKit.Menu;
import consoleKit.MenuItem;
import consoleKit.MenuStack;
import consoleKit.QuitCMD;
import consoleKit.ReturnFromMenu;
import features.model.AllContacts;
import features.model.ContactList;
import features.model.EventList;

/**
 *
 * @author abbypetersen
 */
public class ContactsMenu implements MenuItem{
    
    private final Menu menu;
    private final MenuStack menus;
    private final AllContacts contacts;
    
    public ContactsMenu(AllContacts _contacts, Menu _menu, MenuStack _menus){
        contacts = _contacts;
        menu = _menu;
        menus = _menus;
    }
    
     public void execute(){
      
         // add new menu for this list
        
        Menu subMenu = new Menu(menu.toString(), menus);
        subMenu.add(new QuitCMD());
        subMenu.add(new ReturnFromMenu(menu.toString(), menus));
        subMenu.add(new DisplayContacts(contacts));
        subMenu.add(new AddContact(contacts));
    }
    
     // Description of this command
    @Override
    public String toString() {
        return "Contacts";
    } 
   
}
