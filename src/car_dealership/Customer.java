package car_dealership;

public class Customer {
    private String name;
    private String address;
    private double cashOnHand;

    public Customer(String name, String address, double cashOnHand) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance){
        System.out.println("The customer wants to purchase the " + vehicle.getMake()  + " " + vehicle.getModel());
        System.out.println("The customer wants to purchase it from " + employee.getName());
        if(finance){
            System.out.println("The customer would like to finance that car.");
        } else {
            System.out.println("The customer would like to pay in cash");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }
}
