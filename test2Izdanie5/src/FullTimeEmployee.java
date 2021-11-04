public class FullTimeEmployee extends Employee{
    private double weeklySalary;
    private double benefitDeduction;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalaryIn) {
        this.weeklySalary = weeklySalaryIn;
    }

    public double getBenefitDeduction() {
        return benefitDeduction;
    }

    public void setBenefitDeduction(double benefitDeductionIn) {
        this.benefitDeduction = benefitDeductionIn;
    }

    public double findPaymentAmount () {
        return weeklySalary - benefitDeduction;
    }

}
