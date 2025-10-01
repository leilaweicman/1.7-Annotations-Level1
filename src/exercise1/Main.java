package exercise1;

public class Main {

    public static void main(String[] args) {
        Worker onsiteWorker = new OnsiteWorker("Alice", "Smith", 20.0);
        Worker onlineWorker = new OnlineWorker("Bob", "Johnson", 20.0);

        int hoursWorked = 160;

        System.out.println("Onsite Worker Salary: " + onsiteWorker.calculateSalary(hoursWorked));
        System.out.println("Online Worker Salary: " + onlineWorker.calculateSalary(hoursWorked));
    }
}
