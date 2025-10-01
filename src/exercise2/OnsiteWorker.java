package exercise2;

public class OnsiteWorker extends Worker {

    private static final double GAS = 50.0;

    public OnsiteWorker(String name, String lastName, double pricePerHour) {
        super(name, lastName, pricePerHour);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * super.getPricePerHour() + GAS;
    }

    @Deprecated
    public double calculateOldSalary(int hoursWorked) {
        return hoursWorked * super.getPricePerHour();
    }
}
