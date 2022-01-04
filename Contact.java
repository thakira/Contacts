package model;

import java.util.ArrayList;

/**
 * models a contact. A contact has a first name, a last name
 * and a photo (optional)
 * <strong>GP2-EA4</strong>
 * 
 * @author Verena Kauth
 * @version 1.0 - 08 11 2018
 *
 *           
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String photo;
    private String mailAdress;
    private ArrayList<MailAdress> mailAdresses;
    
    public Contact (String firstName, String lastName, String photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.photo = photo;
        mailAdress = "";
        mailAdresses = new ArrayList<>();
    }
    
    public Contact (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.photo = "defaultPic.png";
        mailAdress = "";
        mailAdresses = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoto() {
        return photo;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public ArrayList<MailAdress> getMailAdresses() {
        return mailAdresses;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n"
                + mailAdress + "\n"
                + mailAdresses.toString();
    }
    
    public void addMailAdress(String mailAdress) {
        mailAdresses.add(new MailAdress(mailAdress));
    }
    
    public static Contact getContact(String name) {
        Contact person=null;
        if (name.equals("mickey")) {
        person = new Contact("Mickey", "Mouse", "MickeyMouse.jpg");
        person.addMailAdress("mm");
        person.addMailAdress("mickey@mouse.com");
        person.addMailAdress("mm@disney.de");
        person.addMailAdress("mmouse@usa.com");
        return person;
        }
        if (name.equals("donald")) {
            person = new Contact("Donald", "Duck", "DonaldDuck.jpg");
            person.addMailAdress("donald.duck@entenhausen.de");
            return person;
        }
        if (name.equals("dagobert")) {
            person = new Contact("Dagobert", "Duck");
            person.addMailAdress("dd@stinkreich.de");
            person.addMailAdress("dd@stinkreicher.de");
            person.addMailAdress("dd@amstinkreichsten.de");
            person.addMailAdress("dd@geizistgeil.de");
            return person;
        }
        if (name.equals("goofy")) {
            person = new Contact("Goofy", "", "Goofy.png");
            person.addMailAdress("goofy@regular.com");
            person.addMailAdress("goo@fy.de");
            person.addMailAdress("@goofy.andersrum.langedomain");
            return person;
        }
        if (name.equals("minnie")) {
            person = new Contact("Minnie", "Mouse", "MinnieMouse.png");
            person.addMailAdress("minnie@liebtmickey.de");
            person.addMailAdress("minnie@disney.com");
            person.addMailAdress("ad");
            person.addMailAdress("a@");
            person.addMailAdress("minnimouse.com@");
            return person;
        }
        if (name.equals("daisy")) {
            person = new Contact("Daisy", "Duck", "DaisyDuck.png");
            person.addMailAdress("daisy@flowerpower.com");
            person.addMailAdress("dd@supi.de");
            return person;
        }
        if (name.equals("pluto")) {
            person = new Contact("Pluto", "", "Pluto.png");
            person.addMailAdress("dogscantread@iwontanswer.com");
            return person;
        }
        return person;
    }
    
//    public static void main(String[] args) {
//        Contact mickey = null;
//        Contact donald = null;
//        Contact dagobert = null;
//        Contact person = Contact.getContact("mickey");
//        System.out.println(person);
//        donald = Contact.getContact(donald);
//        System.out.println(donald);
//        dagobert = Contact.getContact(dagobert);
//        System.out.println(dagobert);
//    }
}
