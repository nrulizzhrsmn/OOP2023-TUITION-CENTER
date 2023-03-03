import java.util.ArrayList;
public class TuitionCenter {
    private ArrayList<String> TuitionList = new ArrayList<>();
    private ArrayList<String> closeTuition = new ArrayList<>();
    TuiCenDetails details = new TuiCenDetails();

    public void setNameOpen(String tuitionName){
       TuitionList.add(tuitionName);
    }

    public void setDetails(TuiCenDetails details){
        this.details = details;
    }

    //to remove a tuition center from the list of tuition center
    public void getNameClose(String tuitionName){
        for (int i=0 ;i<TuitionList.size();i++){
            if (TuitionList.get(i) == tuitionName){
                TuitionList.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return  "Available Tuition List=" + TuitionList +
                ", closed Tuition List=" + closeTuition +
                "\ndetails of each tuition: " + details ;
    }
}

