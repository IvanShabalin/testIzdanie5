public class Employee {
    private  String name;
    private  String jobTitle;

    public String getName() {
        return name;
    }

    public void setName(String nameIn) {
        this.name = nameIn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitleIn) {
        this.jobTitle = jobTitleIn;
    }

    public void cutCheck(double amountPaid) {
        System.out.printf("Выплатить служащему %s ", name);
        System.out.printf("(%s) ***$", jobTitle);
        System.out.printf("%,.2f\n", amountPaid);
    }
}
