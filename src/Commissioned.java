public class Commissioned extends Employee{
    private double grossSales;

    public Commissioned(String firstName, String lastName, double grossSales){
        super(firstName, lastName);
        this.grossSales = grossSales;
    }
    @Override
    public double calculateMonthlyPay() {
        return 2000 + (0.10 * this.grossSales);
    }
}
