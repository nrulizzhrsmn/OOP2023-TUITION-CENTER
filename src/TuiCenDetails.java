import java.util.Arrays;

public class TuiCenDetails  {

    //variable and objects
    private String tuitionName;
    private Name headmaster;
    private Address address;
   Student[] studentList = new Student[3];
    Teacher[] teacherList = new Teacher[3];
    int teacherSize=0;
     int studentSize = 0;

    public TuiCenDetails() {
    } //empty constructor

    public void setTuitionName(String tuitionName) {
        this.tuitionName = tuitionName;
    }
    public void setHeadmaster(Name headmaster) {
        this.headmaster = headmaster;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTuitionName() {
        return tuitionName;
    }

    //toset the teacher in teacherlist
    public void setTeacher(Teacher teacher){
        teacherList[teacherSize++] = teacher;
    }

    public void setStudentList(Student stud){
        studentList[studentSize++] = stud;
    }


    @Override
    public String toString() {
        return "\nTuiCenDetails: " +
                "tuitionName= " + tuitionName  +
                ", headmaster " + headmaster +
                ", address= " + address +
                "\n\tstudentList= " + Arrays.toString(studentList) +
                "\n\tteacherList= " + Arrays.toString(teacherList) ;
    }
}

