package exercise2;

public class OnlineWorker extends Worker {

    private static final double INTERNET = 30.0;

    public OnlineWorker(String name, String lastName, double pricePerHour) {
        super(name, lastName, pricePerHour);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * super.getPricePerHour() + INTERNET;
    }

    @Deprecated
    public double calculateOldSalary(int hoursWorked) {
        return hoursWorked * super.getPricePerHour();
    }
}
