public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String firstName, String lastName, String userName){
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    }
    public String toString(){
        return "navn: "+ getFirstName()+" " + getLastName() +"username: "+ getUserName();
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getUserName(){
        return this.userName;
    }
}
