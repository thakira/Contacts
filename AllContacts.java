package model;

import java.util.ArrayList;

public class AllContacts {
    public static ArrayList<Contact>getDefaultList() {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(Contact.getContact("mickey"));
        contacts.add(Contact.getContact("donald"));
        contacts.add(Contact.getContact("dagobert"));
        contacts.add(Contact.getContact("goofy"));
        contacts.add(Contact.getContact("minnie"));
        contacts.add(Contact.getContact("daisy"));
        contacts.add(Contact.getContact("pluto"));
        
        return contacts;
    }
    
//    public static void main(String[] args) {
//        ArrayList<Contact>myContacts = AllContacts.getDefaultList();
//        System.out.println(myContacts);
//    }


}
