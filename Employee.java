import java.util.*;

public class Employee extends Person{

    private Person person;
    private double salary;
    private static int amount = 0;
    private static Scanner sc = new Scanner(System.in);

    public Employee(){
        System.out.println("Enter the name of employee " + amount +": ");
        String name = sc.nextLine();
        setName(name);
        System.out.println("Enter the gender of employee " +amount + ": ");
        String gender = sc.nextLine();
        setGender(gender);
        System.out.println("Enter the age of employee" + amount + ": ");
        String age = sc.nextLine();
        setAge(age);
        System.out.println("Enter the address of employee " + amount + ": ");
        String address = sc.nextLine();
        setAddress(address);;
        System.out.println("Enter the email of employee " + amount + ": ");
        String email = sc.nextLine();
        setEmail(email);;
        System.out.println("Enter the phone of employee " + amount + ": ");
        String phone = sc.nextLine();
        setPhone(phone);;
        System.out.println("Enter the salary of employee " + amount + ": ");
        salary = sc.nextDouble();
        setSalary(salary);

        amount++;

    }

    public Employee(String name, String gender, String age, String address, String email, String phone,double salary) {
        name = "Thu Hoai";
        gender = "Female";
        age = "18";
        address = "Quang Binh";
        email = "hoai.nguyenthithu@gmail";
        phone = "0982110456";
        this.salary = 120.000;
    }


    public Employee(String name) {
        super(name);
    }


    public Person getPerson() {
        return person;
    }


    public void setPerson(Person person) {
        this.person = person;
    }




    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format(" | %-20s| | %-10s| | %-10s| | %-20s| | %-20s| | %-20s| | %-20s|",getName(),getGender(),getAge(),getAddress(),getEmail(),getPhone(),getSalary());
    }

    

    
}
