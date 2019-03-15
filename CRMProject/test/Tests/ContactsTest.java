/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;


import features.model.AllContacts;
import features.model.Contact;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author abbypetersen
 */
public class ContactsTest {
    AllContacts contacts;

    public ContactsTest() {
        contacts = new AllContacts();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*Tests that add contact is working and returning the
    correct size*/
    @Test
    public void testContactListSize() {
        Contact contact1 = new Contact("name1", 2778756, "example1@gmail.com");
        Contact contact2 = new Contact("name2", 2345899, "example2@gmail.com");
        
        contacts.addContact(contact1);
        contacts.addContact(contact2);

        assertEquals(2, contacts.getContactListSize());
    }
    
    /*Tests that class is able to retrieve information from each contact in the contact list*/
    @Test
    public void testContactNames() {
        AllContacts contactList2 = new AllContacts();
        int index = 1;
        int index2 = 2;
        
        Contact contact1 = new Contact("name1", 2778756, "example1@gmail.com");
        Contact contact2 = new Contact("name2", 2345899, "example2@gmail.com");
        
        contacts.addContact(contact1);
        contacts.addContact(contact2);
        
         assertEquals("name1", contactList2.getContact(index).getName());
         assertEquals(27787576, contactList2.getContact(index).getPhone());
         assertEquals("example1@gmail.com", contactList2.getContact(index).getEmail());
         
         assertEquals("name2", contactList2.getContact(index2).getName());
         assertEquals(2345899, contactList2.getContact(index2).getPhone());
         assertEquals("example2@gmail.com", contactList2.getContact(index2).getEmail());
    
}
}
