import javafx.scene.Scene;
import sun.security.util.PermissionFactory;

import java.util.Scanner;

public class ContactSetter {
    String contactName, mailId, mobileNumber, relationship, webAddress, organizationName;
    PersonalContact personalContact = new PersonalContact();
    BusinessContact businessContact = new BusinessContact();
    ContactValidator validator = new ContactValidator();
    Scanner input = new Scanner(System.in);

    public PersonalContact setPersonalContact() {

        System.out.println("Enter Contact First Name:");

        while (true) {
            contactName = input.next();
            if (validator.validateName(contactName)) {
                this.personalContact.setContactName(contactName);
                break;
            } else {
                System.out.println("Please enter a valid name");
            }
        }
        System.out.println("Enter Contact Mail ID:");
        while (true) {
            this.mailId = input.next();
            if (validator.validateMail(mailId)) {
                personalContact.setMailId(mailId);
                break;
            } else
                System.out.println("Please enter a valid mail-id");
        }

        System.out.println("Enter Contact Mobile Number:");
        while (true) {
            this.mobileNumber = input.next();
            if (validator.validateMobile(mobileNumber)) {
                personalContact.setMobileNumber(mobileNumber);
                break;
            } else {
                System.out.println("Please enter a valid Mobile Number");
            }
        }
        input.nextLine();

        System.out.println("Enter Contact Relationship:");
        while (true) {
            this.relationship = input.next();
            if (validator.validateRelation(relationship)) {
                personalContact.setRelationship(relationship);
                break;
            } else {
                System.out.println("Please enter a Valid Input");
            }
        }

        return personalContact;
    }

    public BusinessContact setBusinessContact() {

        System.out.println("Enter Contact First Name:");
        while (true) {
            this.contactName = input.next();
            if (validator.validateName(contactName)) {
                businessContact.setContactName(contactName);
                break;
            } else {
                System.out.println("Please enter a valid name");
            }
        }

        System.out.println("Enter Contact Mail ID:");
        while (true) {
            this.mailId = input.next();
            if (validator.validateMail(mailId)) {
                businessContact.setMailId(mailId);
                break;
            } else {
                System.out.println("Please enter a valid mail-id");
            }
        }

        System.out.println("Enter Contact Mobile Number:");
        while (true) {
            this.mobileNumber = input.next();
            if (validator.validateMobile(mobileNumber)) {
                businessContact.setMobileNumber(mobileNumber);
                break;
            } else {
                System.out.println("Please enter a valid Mobile Number");
            }
        }
        input.nextLine();

        System.out.println("Enter Contact Web Address:");
        while (true) {
            this.webAddress = input.next();
            if (validator.validatewebAddress(webAddress)) {
                businessContact.setWebAddress(webAddress);
                break;
            } else {
                System.out.println("Please enter a valid Web-Address");
            }
        }

        System.out.println("Enter Organization Name");
        while (true) {
            this.organizationName = input.next();
            if (validator.validateOrganizationName(organizationName)) {
                businessContact.setOrganizationName(organizationName);
                break;
            } else
                System.out.println("Please enter valid Organization Name");
        }
        return businessContact;

    }


}
