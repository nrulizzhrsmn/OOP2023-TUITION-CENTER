import java.util.Arrays;

public class StudentBatch{
   private Student[] students= new Student[2];
   TuiCenDetails details = new TuiCenDetails();
   private int currsz = 0;

    // operation

    void add(Student s, int i) {
        students[i] = s;
        currsz++;
    }

    // method overloading
    void add(Student s) {
        students[currsz++] = s;
        details.setStudentList(s);

    }

    // find a particular student
    boolean find(String nameSearch){
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0;i<currsz;i++){
            if (students[i].name.getFname().equals(nameSearch)){
                return true;
            }
        }return false;
    }



    @Override
    public String toString() {
        return "\nStudent Batch Details: " + Arrays.toString(students) ;
    }
}
