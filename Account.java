import java.util.*;
public class Account {
    private String userName;
    private String password;
    private static Scanner sc = new Scanner(System.in);

    public Account() {
        System.out.println("Add account!");
        System.out.println("Enter new User Name: ");
        String userName = sc.nextLine();
        setUserName(userName);
        System.out.print("Enter new Password: ");
        String password = sc.nextLine();
        setPassword(password);
    }

    public Account(String userName, String password) {
        this.userName = "lazyy nguyen";
        this.password = "112002";
    }
    void add(ArrayList<String> userName,ArrayList<String> password){

    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("|%-20s| |%-10s|",userName,password);
    }

}
