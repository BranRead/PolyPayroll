public class Manager extends Employee{
    private double monthlyBonusAmount;

    public Manager(String firstName, String lastName, double monthlyBonusAmount){
        super(firstName, lastName);
        this.monthlyBonusAmount = monthlyBonusAmount;
    }
    @Override
    public double calculateMonthlyPay() {
        //The output in the example has the salary AND the monthly bonus amount divided by 12
        //I'm assuming this was just a typo or whatever since I'd imagine the monthly bonus
        //would be paid in full for that month.
        //return (100000.0 + monthlyBonusAmount) / 12;
        //The above would be how I'd write it if I misunderstood how a monthly bonus is paid out!
        return (100000.0 / 12) + this.monthlyBonusAmount;
    }
}
