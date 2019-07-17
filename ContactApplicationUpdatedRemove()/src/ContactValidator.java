import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactValidator {

    Pattern pat;
    Boolean validity = false;

    public boolean validateName(String name) {
        if (name != null) {
            pat = Pattern.compile("^[A-Za-z]+$");
            validity = pat.matcher(name).matches();
        }
        return validity;
    }

    public boolean validateMail(String mail) {
        if (mail != null) {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                    + "A-Z]{2,7}$";

            pat = Pattern.compile(emailRegex);
            validity = pat.matcher(mail).matches();

        }
        return validity;
    }

    public boolean validatewebAddress(String web_Address) {
        if (web_Address != null) {
            String webRegex = "^(http:\\/\\/|https:\\/\\/)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?$";
            pat = Pattern.compile(webRegex);
            validity = pat.matcher(web_Address).matches();

        }
        return validity;
    }

    public boolean validateMobile(String mobile) {
        if (mobile != null) {
            pat = Pattern.compile("(0/91)?[7-9][0-9]{9}");
            Matcher m = pat.matcher(mobile);
            validity = (m.find() && m.group().equals(mobile));
        }
        return validity;
    }

    public boolean validateLocation(String location) {
        if (location != null) {
            Pattern pat = Pattern.compile("\\w+");
            validity = pat.matcher(location).matches();

        }
        return validity;
    }

    public boolean validateRelation(String relation) {
        if (relation != null) {
            pat = Pattern.compile("\\w+");
            validity = pat.matcher(relation).matches();
        }
        return validity;
    }

    public boolean validateOrganizationName(String organizationName) {
        if (organizationName != null) {
            pat = Pattern.compile("^[A-Za-z]+$");
            validity = pat.matcher(organizationName).matches();
        }
        return validity;
    }
}
