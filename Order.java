import java.util.Scanner;
public class Order{
    private String customer;
    private String drink;
    private char size;
    private int order_amount;
    private double price;
    private String employee;
    private static int amount=0;
    private static Scanner sc = new Scanner(System.in);

    public Order(){

        System.out.println("Enter the customer of order "+amount+": ");
        customer = sc.nextLine();
        setCustomer(customer);
        System.out.println("Enter the drink of order "+amount+": ");
        drink = sc.nextLine();
        setDrink(drink);
        System.out.println("Enter the size of drink "+amount+": ");
        size = sc.next().charAt(0);
        setSize(size);
        System.out.println("Enter the amount of order "+amount+": ");
        order_amount = sc.nextInt();
        setOrder_amount(order_amount);
        System.out.println("Enter the price of order "+amount+": ");
        price = sc.nextDouble();
        setPrice(price);
        System.out.println("Enter the employee of order "+amount+": ");
        sc.nextLine();
        employee = sc.nextLine();
        setEmployee(employee);

        amount++;
    }
    
    




    public Order(String customer, String drink, char size, int order_amount, double price, String employee) {
        this.customer = "My Linh";
        this.drink = "Milk Tea";
        this.size = 'M';
        this.order_amount = 2;
        this.price = 30.000;
        this.employee = "Khanh Linh";
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return String.format(" | %-20s| | %-20s| | %-5s| | %-10s| |%-20s |%-20s|",getCustomer(),getDrink(),getSize(),getOrder_amount(),getPrice(),getEmployee());
    }

       
}