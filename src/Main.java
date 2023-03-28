import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> polyEmployees= new ArrayList<Employee>();

        polyEmployees.add(new Commissioned("Bob", "Loblaw", 40000));
        polyEmployees.add(new Salaried("Sue", "Me", 10));
        polyEmployees.add(new PieceWorker("Tina", "Zena", 1000));
        polyEmployees.add(new Manager("Richard", "Rich", 2000));

        for (Employee emp : polyEmployees) {
            System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
            System.out.println("\tPay Type: " + emp.getClass().getSimpleName());
            System.out.println("\tMonthly Pay: $" + emp.calculateMonthlyPay() + "\n");
        }
    }
}