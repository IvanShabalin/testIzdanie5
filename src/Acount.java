public class Acount {
    private String name;
    private String address;
    private double balance;

    public void display() {
        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") имеет на счету $");
        System.out.print(balance);
    }
    public double getInterest (double percenttageRate) {
        return balance * percenttageRate /100;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }
}
