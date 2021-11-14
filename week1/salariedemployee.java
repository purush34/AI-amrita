package lab6;

public class salariedemployee extends employee{
    private double weeklysalary;
    
    public salariedemployee(String first, String last, String ssn, double salary){
        super(first, last, ssn);
        setWeeklySalary(salary);
    }
    
    public void setWeeklySalary(double salary){
        weeklysalary = salary;
    }
    
    public double getWeeklySalary(){
        return weeklysalary;
    }
    
    public double earnings(){
        return getWeeklySalary();
    }
    
    public String display(){
        return super.display() + "\nWeekly Salary: " + getWeeklySalary();
    }

    public double getPaymentAmount(){
        return getWeeklySalary();
    }
}