package bai_tap.case_study.models.Person;

public class Employee extends Person{
    private String qualifications;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String id, String name, String dayOfBirth, boolean gender, String identityCard, String phoneNumber, String email,  String qualifications, String position, String salary) {
        super(id, name, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.qualifications = qualifications;
        this.position = position;
        this.salary = salary;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee { "+ super.toString() +
                ", qualifications = " + qualifications + 
                ", position = " + position + 
                ", salary = " + salary + 
                "} " ;
    }
}
