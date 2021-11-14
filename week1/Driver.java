package lab6;

public class Driver {
    public static void main(String[] args) throws Exception {
        payable p[] = new payable[2];
        p[0] = new invoice("275","test",2,100);
        p[1] = new salariedemployee("Harshini", "Vemuri", "275", 100);

        System.out.println("Invoices");
        System.out.println(p[0].display());
        System.out.println("\n\nSalaried Employees");
        System.out.println(p[1].display());


    }
}