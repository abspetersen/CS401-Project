package consoleKit;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * push addFirst()
 * pop removeFirst()
 * top getFirst()
 */

public class MenuStack {

	private ArrayDeque<Menu> menuarr;
	
    public MenuStack() {
    	menuarr = new ArrayDeque<Menu>();
    }

    public Menu getCurrent() {
    	//return top of stack
    	return menuarr.getFirst();
    }

    public void add(Menu menu) {
    	//push parameter onto menustack
    	menuarr.addFirst(menu);
    }
    
    public void toPreviousMenu() {
    	//pop top menu
    	menuarr.removeFirst();
    }
    
    public void run() {
    	//execute top menu
    	this.getCurrent().execute();
    }
    
}
