import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Contact contact1 = (Contact) o1;
        Contact contact2 = (Contact) o2;

        return contact1.getContactName().compareTo(contact2.getContactName());
    }


}
