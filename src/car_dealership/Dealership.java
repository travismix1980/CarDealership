package car_dealership;

// Write a program to simulate a car dealership sales process
// We will have employees, vehicles, and customers
public class Dealership {
    public static void main(String[] args) {
        Customer customer = new Customer("Tom", "123 any street", 12_000);
        Employee employee = new Employee("Sam");
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 65_000);

        boolean mustFinance;
        mustFinance = !(vehicle.getPrice() < customer.getCashOnHand());

        customer.purchaseCar(vehicle, employee, mustFinance);
        employee.handleCustomer(customer, vehicle, mustFinance);
    }
}
