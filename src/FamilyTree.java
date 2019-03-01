public class FamilyTree {

    private String familyName;

    private String fatherName;
    private String fatherSurame;
    private int fatherAge;

    private String motherName;
    private String motherSurname;
    private int motherAge;

    private String childName;
    private String childSurname;
    private int childAge;

    public FamilyTree(String familyName,
                      String fatherName,
                      String fatherSurame,
                      int fatherAge,
                      String motherName,
                      String motherSurname,
                      int motherAge,
                      String childName,
                      String childSurname,
                      int childAge) {
        this.familyName = familyName;
        this.fatherName = fatherName;
        this.fatherSurame = fatherSurame;
        this.fatherAge = fatherAge;
        this.motherName = motherName;
        this.motherSurname = motherSurname;
        this.motherAge = motherAge;
        this.childName = childName;
        this.childSurname = childSurname;
        this.childAge = childAge;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getFatherSurame() {
        return fatherSurame;
    }

    public int getFatherAge() {
        return fatherAge;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getMotherSurname() {
        return motherSurname;
    }

    public int getMotherAge() {
        return motherAge;
    }

    public String getChildName() {
        return childName;
    }

    public String getChildSurname() {
        return childSurname;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setFatherSurame(String fatherSurame) {
        this.fatherSurame = fatherSurame;
    }

    public void setFatherAge(int fatherAge) {
        this.fatherAge = fatherAge;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setMotherSurname(String motherSurname) {
        this.motherSurname = motherSurname;
    }

    public void setMotherAge(int motherAge) {
        this.motherAge = motherAge;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setChildSurname(String childSurname) {
        this.childSurname = childSurname;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public String family() {

        return getFamilyName() + " " + getFatherName() + " " + getFatherSurame() + " " + getFatherAge() + " " + getMotherName() + " " + getMotherSurname()  + " " + getMotherAge() + " " + getChildName()  + " " + getChildSurname()  + " " + getChildAge();

    }

    public int sumFamilyAge() {

        return getFatherAge() + getMotherAge() + getChildAge();
    }

    public double avgFamilyAge() {

        return (getFatherAge() + getMotherAge() + getChildAge())/3;
    }


    public static void main(String[] args) {

        FamilyTree family1 = new FamilyTree("Januszewscy", "Janusz", "Januszewski", 50, "Janina", "Januszewska", 28, "Klemens", "Januszewski", 12);
        System.out.println(family1.family());
        System.out.println(family1.sumFamilyAge());
        System.out.println(family1.avgFamilyAge());

    }
}
