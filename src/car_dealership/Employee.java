package car_dealership;

public class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance){
        if(finance){
            double amountToFinance = (vehicle.getPrice() - customer.getCashOnHand());
            runCreditHistory(customer, amountToFinance);
        }else{
            runCashSale(customer, vehicle);
        }
    }

    public void runCashSale(Customer customer, Vehicle vehicle){
        System.out.println("The customer pays the amount of " + vehicle.getPrice() + " in cash to buy the car");
        customer.setCashOnHand(customer.getCashOnHand() - vehicle.getPrice());
    }

    public void runCreditHistory(Customer customer, double amountToFinance){
        System.out.println("The customer makes a down payment for " + customer.getCashOnHand());
        customer.setCashOnHand(0);
        System.out.println("The customer finances $" + amountToFinance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
