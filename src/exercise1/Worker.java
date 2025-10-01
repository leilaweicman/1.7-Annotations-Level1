package exercise1;

public abstract class Worker {
    private String name;
    private String lastName;
    private double pricePerHour;

    public Worker(String name, String lastName, double pricePerHour) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be null or empty.");
        }
        if (pricePerHour <= 0) {
            throw new IllegalArgumentException("Price per hour must be positive.");
        }

        this.name = name;
        this.lastName = lastName;
        this.pricePerHour = pricePerHour;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * pricePerHour;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
}
