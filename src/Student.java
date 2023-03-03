import java.util.Arrays;

public class Student {
    Name name;
    private String ic;
    private Address address;
    private String schoolname;
    private String year;
    private float marks[] = new float[5];

    private float avg;
    private float max;
    private float min;

    public Student(){
    }

    public Student(String ic, String schoolname, String year){
            this.ic = ic;
            this.schoolname = schoolname;
            this.year = year;
            }

    public void setAddress(Address address){
        this.address = address;}

    public void setName(Name theName){
        name = theName;
    }
    public float calcAvg(){
        float total= 0;
        float avg = 0;
        for (int i = 0;i<marks.length;i++){
            total +=marks[i];
        }
        avg = total/(marks.length);
        this.avg = avg;
        return avg;
    }
    public float calcMin(){
        float min = marks[0];
        for(int i = 1;i<marks.length;i++) {
            if (marks[i]<min){
                min = marks[i];
            }
        }
        this.min = min;
        return min;
    }
    public float calcMax(){
        float max = marks[0];
        for(int i = 1;i<marks.length;i++) {
            if (marks[i]>max){
                max = marks[i];
            }
        }
        this.max = max;
        return max;
    }


    public void setMark(float mark, int i) throws Exception {
        if(mark<0)
            throw new Exception("Error in mark detected"); //built in class in java

        if(i> marks.length)
            throw new Exception("Error in index detected");

        marks[i] = mark;
    }

    void displayMarks(){
        //print the marks
        for(int i = 0; i<marks.length; i++){
            System.out.println("mark #" + i + " = "+ marks[i]);
        }
    }

    @Override
    public String toString() {
        return "\n\t\tStudent details: " + name +
                ", ic='" + ic + '\'' +
                ", address=" + address +
                ", schoolname='" + schoolname + '\'' +
                ", year='" + year + '\'' +
                "\n\t\t\tmarks =" + Arrays.toString(marks) +
                ", avg=" + avg +
                ", max=" + max +
                ", min=" + min +
                "\n";
    }
}

