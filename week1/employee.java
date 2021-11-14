package lab6;

public abstract class employee implements payable{

    // should be abstract when a payable method is not 
    // implemented.
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String display(){
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nSocial Security Number: " + socialSecurityNumber;
    }
}
