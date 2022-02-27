import java.util.Scanner;
public class Customer extends Person{
    //Khách hàng (Mã khách hàng, Tên khách hàng, Địa chỉ, Số điện thoại) 
    private Person person;
    private static int amount = 0;
    private String choose;
    private static Scanner sc = new Scanner(System.in);
    
    //Add customer
    public Customer(){

        System.out.println("Enter the name of customer " + amount +": ");
        String name = sc.nextLine();
        setName(name);
        System.out.println("Enter the gender of customer " +amount + ": ");
        String gender = sc.nextLine();
        setGender(gender);
        System.out.println("Enter the age of customer " + amount + ": ");
        String age = sc.nextLine();
        setAge(age);
        System.out.println("Enter the address of customer " + amount + ": ");
        String address = sc.nextLine();
        setAddress(address);;
        System.out.println("Enter the email of customer " + amount + ": ");
        String email = sc.nextLine();
        setEmail(email);;
        System.out.println("Enter the phone of customer " + amount + ": ");
        String phone = sc.nextLine();
        setPhone(phone);;
        amount++;

    }
    

    // public int getId() {
    //     return ID;
    // }


    // public void setId() {
    //     this.ID = id;
    // }
    //Update


    public Customer(String name, String gender, String age, String address, String email, String phone) {
        name = "Khanh Linh";
        gender = "Female";
        age = "18";
        address = "101B Le Huuu Trac";
        email = "linh.nguyenthikhanh@gmail";
        phone = "0838410058";
        amount++;
    }
    public Customer(String name) {
        super(name);
    }

    
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public static int getAmount() {
        return amount;
    }
    public static void setAmount(int amount) {
        Customer.amount = amount;
    }
    
    public String getChoose() {
        return choose;
    }


    public void setChoose(String choose) {
        this.choose = choose;
    }
    


    @Override
    public String toString() {
        return String.format(" |%-20s| |%-10s| |%-10s| |%-20s| |%-30s| |%-20s|",getName(),getGender(),getAge(),getAddress(),getEmail(),getPhone());
    }




    
    
    
}
    
