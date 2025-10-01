package exercise2;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OnsiteWorker onsiteWorker = new OnsiteWorker("Alice", "Smith", 20.0);
        OnlineWorker onlineWorker = new OnlineWorker("Bob", "Johnson", 20.0);

        int hoursWorked = 160;

        System.out.println("Deprecated onsite salary: " + onsiteWorker.calculateOldSalary(hoursWorked));
        System.out.println("Deprecated online salary: " + onlineWorker.calculateOldSalary(hoursWorked));
    }
}
