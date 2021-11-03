import javax.swing.JOptionPane;

public class UseAccount {

    public static void main(String[] args) {
        Acount myAccount = new Acount();
        Acount youAccount = new Acount();

        myAccount.setName("ivan");
        myAccount.setAddress("koop");
        myAccount.setBalance(34.01);

        youAccount.setName("andrey");
        youAccount.setAddress("marata");
        youAccount.setBalance(52.42);

        System.out.println(myAccount.getName() + " " + myAccount.getAddress() + " " + myAccount.getBalance());
        System.out.println(youAccount.getName() + " " + youAccount.getAddress() + " " + youAccount.getBalance());


//        myAccount.display();
//        System.out.print(" плюс $");
//        System.out.print(myAccount.getInterest(5.00));
//        System.out.println(" дохода ");

//        youAccount.display();
//        double youInterestRate = 7.00;
//        System.out.print(" плюс $");
//        double youInterestAmount = youAccount.getInterest(youInterestRate);
//        System.out.print(youInterestAmount);
//        System.out.println(" дохода");
//
//        System.out.printf("$%4.2f\n", myAccount.getInterest(5.00));
//        System.out.printf("$%4.2f\n", youInterestAmount);
    }
}
