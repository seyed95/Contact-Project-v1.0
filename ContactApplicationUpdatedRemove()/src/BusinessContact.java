public class BusinessContact extends Contact {
    private String webAddress, organizationName;

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public String toString() {
        //System.out.print(super.toString()+webAddress+organizationName);
        return super.toString() + webAddress + organizationName;
    }
}

