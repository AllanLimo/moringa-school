public class Student {
    String name;
    String nationalId;
    String phoneNumber;
    int admNo;

    // First constructor
    public Student(int admNo) {
        this.admNo = admNo;
    }

    public static Student createStudent(){
        Student student = new Student("Allan Limo","36298163","0726832007",433);
        return student;
    }

    public Student() {

    }
    //remaining constructors

    public Student(String name, String nationalId, String phoneNumber, int admNo) {
        this.name = name;
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
        this.admNo = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }
}
