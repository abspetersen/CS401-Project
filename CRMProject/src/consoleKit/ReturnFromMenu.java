package consoleKit;

/**
 * Regular exit from a program
 * @author villa
 */

//pops menu stack
public class ReturnFromMenu implements MenuItem {
    private final String msg;
    private final MenuStack menus;
    
    public ReturnFromMenu(String prevMenuName, MenuStack _menus) {
    	menus = _menus;
    	msg = prevMenuName;
    }

    @Override
    public void execute() {
    	menus.toPreviousMenu();
    }
    
    @Override
    public String toString() {
    	return msg;
    }
    
}
