import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) != -1) {
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact contactOld, Contact contactNew) {
        if (findContact(contactOld) == -1) {
            return false;
        }

        int contactIndex = findContact(contactOld);
        myContacts.set(contactIndex, contactNew);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) == -1) {
            return false;
        }

        myContacts.remove(contact);
        return true;
    }

    public int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        for (int i=0; i<myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) == -1) {
            return null;
        }

        int contactIndex = findContact(name);
        return myContacts.get(contactIndex);
    }

    public void printContacts() {
        for (int i=0; i<myContacts.size(); i++) {
            String name = myContacts.get(i).getName();
            String phoneNumber = myContacts.get(i).getPhoneNumber();

            System.out.println("Contact List:");
            System.out.printf("%d. %s -> %s\n", i+1, name, phoneNumber);
        }
    }
}