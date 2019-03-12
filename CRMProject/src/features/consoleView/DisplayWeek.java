
package features.consoleView;
import consoleKit.*;

public class DisplayWeek implements MenuItem {
    
    public void execute(){
        System.out.println("We're in the DisplayWeek");
    }
    
    // Description of this command
    @Override
    public String toString() {
        return "This Week's Events";
    } 
}
