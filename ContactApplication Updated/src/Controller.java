import java.util.Scanner;

public class Controller {

    ContactList contactList = new ContactList();

    public static void main(String[] args) {


        new Controller().mainMenu();

    }


    public void mainMenu() {


        System.out.println("**********************************************Welcome to Contact Application************************************************\n\n");


        do {
            System.out.println("\n\nPress:\n\n\t\t (1)---> To Add Contact\n\t\t (2)---> To Remove Contact\n\t\t (3)---> To Display Contact\n\t\t (4)---> To Sort Contact By Name\n\t\t (5)---> To Search Contact\n\t\t (6)---> To Exit");
            short selectOperation = new Scanner(System.in).nextShort();

            switch (selectOperation) {


                case 1:
                    new Controller().contactAddSubMenu();
                    break;
                case 2:
                    contactList.removeContact();
                    break;
                case 3:
                    contactList.display();
                    break;
                case 4:
                    contactList.sortByName();
                    break;
                case 5:
                    contactList.search();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Please Select from the Options");

            }

        } while (true);


    }


    public void contactAddSubMenu() {

        do {
            System.out.println("Select Contact Type:\n Press--->(1) for Personal Contact\n Press--->(2) for Business Contact\n Press--->(3) GOTO MAIN MENU");
            Scanner input = new Scanner(System.in);
            Short option = input.nextShort();

            switch (option) {
                case 1:
                    System.out.println("You Have Selected Personal Contact");
                    ContactSetter contactSetter = new ContactSetter();
                    contactList.add(contactSetter.setPersonalContact());
                    break;

                case 2:
                    System.out.println("You Have Selected Business Contact");
                    contactSetter = new ContactSetter();
                    contactList.add(contactSetter.setBusinessContact());
                    break;

                case 3:
                    mainMenu();
                    break;

                default:
                    System.out.println("Please select from the options");
            }
        } while (true);


    }


}
