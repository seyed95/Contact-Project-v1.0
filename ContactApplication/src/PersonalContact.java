public class PersonalContact extends Contact {
    private String relationship;

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        //System.out.println(super.toString()+relationship);
        return super.toString() + relationship;
    }
}
