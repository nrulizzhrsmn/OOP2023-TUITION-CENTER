public class Teacher {

    private Name name;
    private String ic;
    private Address address;
    private String numyearexp;
    private String qualification;
    private String dateJoined;
    private String yearsCenter;
    private Student student;

    public Teacher(){}
    public void setName(Name teacherName){
        this.name = teacherName;
    }
    public Name getName(){
        return name;
    }

    public void setAddress(Address address){
        this.address = address;
    }
    public Teacher(String ic, String qualification,String numyearexp,String dateJoined, String yearsCenter){
        this.ic = ic;
        this.qualification = qualification;
        this.numyearexp = numyearexp;
        this.dateJoined = dateJoined;
        this.yearsCenter = yearsCenter;
    }

    public void setStudent(Student studentName){
        student = studentName;
    }

    @Override
    public String toString() {
        return "Teacher Details:" + name +
                ", ic='" + ic + '\'' +
                ", address='" + address + '\'' +
                ", numyearexp=" + numyearexp +
                ", qualification='" + qualification + '\'' +
                ", dateJoined='" + dateJoined + '\'' +
                ", yearsCenter=" + yearsCenter + "\n\t  student assigned=" + student+
                "\n";
    }
}


