/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features.model;

/**
 *
 * @author abbypetersen
 */
public class Contact {
    
    private final String name;
    private final int phone;
    private final String email;
    
      public Contact(String _name, int _phone, String _email) {
        name = _name;
        phone = _phone;
        email = _email;
    }
    
    public String getName() {
        return name;
}
}
