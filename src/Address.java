public class Address {
    private String noUnit;
    private String street;
    private String postcode;
    private String district;
    private String state;

    public Address(String noUnit,String street, String postcode,String district,String state){
        this.noUnit = noUnit;
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }


    public String toString(){
        return noUnit+" "+street+" "+postcode+" "+district+" "+state;
    }

}
