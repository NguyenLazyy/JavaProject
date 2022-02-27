import java.util.*;

public class Bill{
    //Thanh_toán (Mã_PV, Mã nhân viên, Tổng tiền, Giảm giá, Thời gian thanhtoán) 
    //public Service_Table service_Table;
    private String customer;
    private String drink;
    private int order_amount;
    private double price;
    private double total_price;
    private String date;
    private String employee;
    private static int amount=0;
    private static Scanner sc = new Scanner(System.in);

    public Bill(){
        System.out.println("Enter the customer of bill "+amount + ": ");
        customer = sc.nextLine();
        setCustomer(customer);
        System.out.println("Enter the drink of order " +amount + ": ");
        drink = sc.nextLine();
        setDrink(drink);
        System.out.println("Enter the amount of order " + amount +": ");
        order_amount = sc.nextInt();
        setOrder_amount(order_amount);
        System.out.println("Enter the price of order "+amount +": ");
        price = sc.nextDouble();
        setPrice(price);
        System.out.println("Enter the total price of bill "+amount + ": ");
        total_price = sc.nextDouble();
        setTotal_price(total_price);
        sc.nextLine();
        System.out.println("Enter the employee of bill "+ amount + ": ");
        employee = sc.nextLine();
        System.out.println("enter the date of bill "+amount+": ");
        date = sc.nextLine();
        setDate(date);
        amount++;

    }

    
    public Bill(String customer, String drink, int order_amount, double price, double total_price, String date,
            String employee) {
        this.customer = "My Hanh";
        this.drink = "White Coffee";
        this.order_amount = 1;
        this.price = 20.000;
        this.total_price = 20.000;
        this.date = "10/8/2021";
        this.employee = "Khanh Linh";
    }
    

    public String getDrink() {
        return drink;
    }


    public void setDrink(String drink) {
        this.drink = drink;
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


    public String getCustomer() {
        return customer;
    }


    public void setCustomer(String customer) {
        this.customer = customer;
    }


    public double getTotal_price() {
        return total_price;
    }


    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getEmployee() {
        return employee;
    }


    public void setEmployee(String employee) {
        this.employee = employee;
    }


    @Override
    public String toString() {
        return String.format("| %-20s| | %-20s| | %-5d| | %-15f| | %-15f| |%-20s| |%-20s|",getCustomer(),getDrink(),getOrder_amount(),getPrice(),getTotal_price(),getDate(),getEmployee());
    }

      


}