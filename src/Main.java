import java.util.Scanner;
public class Main
    {
        // application code
        public static void main(String[] args) {

            //creating objects for each class
            TuitionCenter happiness = new TuitionCenter();
            TuiCenDetails details = new TuiCenDetails();
            details.setTuitionName("happinessJB");
            Name name = new Name();
            name.setFName("Ungku");
            name.setMName("Muhammad");
            name.setLName("Andre");
            details.setHeadmaster(name);
            Address address = new Address("29","Jalan Amal","80112","Nusajaya","Johor");
            details.setAddress(address);
            StudentBatch sb2023 = new StudentBatch();
            StudentBatch sb2022 = new StudentBatch();
            happiness.setDetails(details);
            happiness.setNameOpen(details.getTuitionName());

            Scanner cin = new Scanner(System.in);

            Teacher cikguMinah= new Teacher("12345","Degree","4years","20 january 2023","2years");
            name = new Name();
            name.setFName("Aminah");
            name.setMName("Alina");
            name.setLName("Azman");
            cikguMinah.setName(name);
            address = new Address("3","Jalan Raja Udang","80223","Johor Bahru","Johor");
            cikguMinah.setAddress(address);


            Student mike = new Student("98765","SK Tebrau","6");
            name = new Name();
            name.setFName("Michael");
            name.setMName("Mickey");
            name.setLName("Mark");
            mike.setName(name);
            address = new Address("17","Jalan Seventeen","25067","Johor Bahru","Johor");
            mike.setAddress(address);
            try {  //try block....something in here can cause exception, potentially ada error,
                mike.setMark(10,0);
                mike.setMark(40,1);
                mike.setMark(87,2);
                mike.setMark(20,3);
                mike.setMark(80,4); //once the error detected, it will stop reading and go to the cath line
            }
            catch(Exception ex) {//catch block..action to be taken in case Exception //class-exception, ex-parameter
                System.out.println("Cannot continue");
                ex.printStackTrace();  //method in class exception
            }

            System.out.println("Marks for "+ mike.name+" :");
            mike.displayMarks(); //to print the marks
            // calculate and print the avg
            System.out.println("\nAvg mark= " +mike.calcAvg());
            // calculate and print the max
            System.out.println("Max mark = " + mike.calcMax());
            // calculate the min marks for mike
            System.out.println("Min mark = " + mike.calcMin()+"\n");

            //assigning mike into studentBatch and to a personal teacher
            sb2023.add(mike,0);
            cikguMinah.setStudent(mike); //1 tutor assigned to 1 student
            details.setTeacher(cikguMinah);
            details.setStudentList(mike);


            Teacher cikguMin= new Teacher("12345","Degree","4years","20 january 2023","2years");
            name = new Name();
            name.setFName("Min");
            name.setMName("Chan");
            name.setLName("Lee");
            cikguMin.setName(name);
            address = new Address("19","Taman Bahagia","804322","Besut","Terengganu");
            cikguMin.setAddress(address);


            Student adila = new Student("55783","SK Merak","4");
            name = new Name();
            name.setFName("Adila");
            name.setMName("binti");
            name.setLName("Azizi");
            adila.setName(name);
            address = new Address("127","Jalan Neo","48727","Taiping","Perak");
            adila.setAddress(address);
            try {  //try block....something in here can cause exception, potentially ada error
                for (int i = 0 ;i<5;i++){
                adila.setMark(98,0);
                adila.setMark(88,1);
                adila.setMark(92,2);
                adila.setMark(100,3);
                adila.setMark(97, 4);}
            }
            catch(Exception ex) {//catch block..action to be taken in case Exception //class exception then the parameter
                System.out.println("Cannot continue");
                ex.printStackTrace();  //method in class exception
            }

            System.out.println("Marks for "+ adila.name+" :");
            adila.displayMarks();
            System.out.println("\nAvg mark= " +adila.calcAvg());
            System.out.println("Max mark = " + adila.calcMax());
            System.out.println("Min mark = " + adila.calcMin()+"\n");

            sb2023.add(adila);
            cikguMin.setStudent(adila);
            details.setTeacher(cikguMin);
            details.setStudentList(adila);

            Teacher cikguAzlin= new Teacher("123322","Degree","7years","17 July 2023","4years");
            name = new Name();
            name.setFName("Azlin");
            name.setMName("Kalina");
            name.setLName("Leen");
            cikguAzlin.setName(name);
            address = new Address("19","Taman Beruang","74322","Larkin","Johor");
            cikguAzlin.setAddress(address);


            Student hasanatul = new Student("56784","SK Nong Chik","2");
            name = new Name();
            name.setFName("Hasanatul");
            name.setMName("binti");
            name.setLName("Azimal");
            hasanatul.setName(name);
            address = new Address("12","Jalan Bukit Indah","45355","Tebrau","Johor");
            hasanatul.setAddress(address);
            try {  //try block....something in here can cause exception, potentially ada error
                for (int i = 0 ;i<5;i++){
                    hasanatul.setMark(78,0);
                    hasanatul.setMark(62,1);
                    hasanatul.setMark(33,2);
                    hasanatul.setMark(80,3);
                    hasanatul.setMark(47, 4);}
            }
            catch(Exception ex) {//catch block..action to be taken in case Exception //class exception then the parameter
                System.out.println("Cannot continue");
                ex.printStackTrace();  //method in class exception
            }

            System.out.println("Marks for "+ hasanatul.name+" :");
            hasanatul.displayMarks();
            System.out.println("\nAvg mark= " +hasanatul.calcAvg());
            System.out.println("Max mark = " + hasanatul.calcMax());
            System.out.println("Min mark = " + hasanatul.calcMin()+"\n");

            sb2022.add(hasanatul);
            cikguAzlin.setStudent(hasanatul);
            details.setTeacher(cikguAzlin);
            details.setStudentList(hasanatul);


            //to find student in a batch
            System.out.println("Search student name (first name) in batch 2023: ");
            String nname = cin.nextLine();
            boolean isIn = sb2023.find(nname);
            System.out.println("Search Result: ");
            if (isIn == true){
              System.out.println("found!\n");}
            else{
              System.out.println("not in the batch\n");}

            //display all the details of HappinessJB tuition center (including the list of teachers, students, and student batch
            System.out.println("Tuition center details : "+happiness);

            //display details related to each student batch
            System.out.println("\ndetails of the studentBatch 2023 in the tuition center: "+sb2023); //2 students
            System.out.println("\ndetails of the studentBatch 2022 in the tuition center: "+sb2022); //1student


        }
            }