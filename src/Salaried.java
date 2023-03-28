public class Salaried extends Employee{
    private int yearsOfService;

    public Salaried(String firstName, String lastName, int yearsOfService){
        super(firstName, lastName);
        this.yearsOfService = yearsOfService;
    }
    @Override
    public double calculateMonthlyPay() {
        return (50000 + (0.01 * yearsOfService)) / 12;
    }
}
