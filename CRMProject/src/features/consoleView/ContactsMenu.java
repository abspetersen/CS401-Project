/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.consoleView;

import consoleKit.Menu;
import consoleKit.MenuItem;
import consoleKit.MenuStack;
import consoleKit.ReturnFromMenu;

/**
 *
 * @author abbypetersen
 */
public class ContactsMenu implements MenuItem{
    
    private MenuStack menus;
    
    public ContactsMenu(MenuStack menus) {
        this.menus = menus;
    }
    
    public void execute(){
        Menu contactsSubMenu = new Menu("Contacts Submenu", menus);
        
        contactsSubMenu.add(new DisplayContacts());
        contactsSubMenu.add(new AddContact());
        contactsSubMenu.add(new ReturnFromMenu("Main Menu", menus));
    }
    
     // Description of this command
    @Override
    public String toString() {
        return "Contacts";
    } 
   
}
