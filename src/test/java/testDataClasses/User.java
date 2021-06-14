package testDataClasses;

public class User {
	
	private String emailAddress;

    private String id;

    private int userRole;

    private String mobileNumber;

    private String firstName;

    private String lastName;

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setUserRole(int userRole){
        this.userRole = userRole;
    }
    public int getUserRole(){
        return this.userRole;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber(){
        return this.mobileNumber;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
}
