import java.util.*;

public class ContactList extends ArrayList {

    List<? super Contact> completeContactList = new ArrayList<>();
    Iterator<? super Contact> iterator;
    Scanner input = new Scanner(System.in);
    PersonalContact personalContacts = new PersonalContact();
    BusinessContact businessContacts = new BusinessContact();

    public void add(PersonalContact personalContact) {
        this.personalContacts = personalContact;
        //   System.out.println(this.personalContacts.toString());
        completeContactList.add(personalContacts);
        System.out.println("Complete Contact List" + completeContactList);

    }

    public void add(BusinessContact businessContact) {
        this.businessContacts = businessContact;
        completeContactList.add(businessContacts);
        System.out.println("Complete Contact List" + completeContactList);


    }

    public void removeContact() {
        System.out.println("Enter the Contact Name to Remove");
        String name = input.next();
        iterator = completeContactList.iterator();
        while (iterator.hasNext()) {
            Contact contact = (Contact) iterator.next();
            if (name.equalsIgnoreCase(contact.contactName)) {
                int index = completeContactList.indexOf(contact);
                completeContactList.remove(index);
                System.out.println("Contact Removed....");
            } else {
                System.out.println("No such Element Found");
            }

        }
    }


    public void display() {

        System.out.println(completeContactList);
        /*while (iterator.hasNext()) {
            iterator = completeContactList.iterator();
            // System.out.println(completeContactList);
            System.out.println(iterator.next());

        }*/
    }

    public void search() {
        System.out.println("Enter the Contact Name to Search");
        String name = input.next();
        iterator = completeContactList.iterator();

        while (iterator.hasNext()) {
            Contact contact= (Contact) iterator.next();
            if(name.equalsIgnoreCase(contact.contactName)){
                int index = completeContactList.indexOf(contact);
                System.out.println(completeContactList.get(index));
            }
        }
    }

    public void sortByName() {
        Collections.sort(completeContactList, new NameComparator());
        iterator = completeContactList.iterator();
        while (iterator.hasNext()) {
            Contact contact = (Contact) iterator.next();
            System.out.println(contact);
            }

    }
}


