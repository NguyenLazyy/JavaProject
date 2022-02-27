import java.util.*;
public class Menu{
    private String drinktype;
    private String name;
    private char size;
    private double price;
    private String note;
    private static int amount = 0;
    private static Scanner sc = new Scanner(System.in);

    public Menu(){
        System.out.println("Enter the type of drink "+ amount+ ": ");
        drinktype = sc.nextLine();
        setDrinktype(drinktype);
        System.out.println("Enter the name of drink "+ amount+ ": ");
        name = sc.nextLine();
        setName(name);
        System.out.println("Enter the size of drink "+ amount+ ": ");
        size = sc.next().charAt(0);
        setSize(size);
        System.out.println("Enter the price of drink "+ amount+ ": ");
        price = sc.nextDouble();
        setPrice(price);
        System.out.println("Enter the note "+ amount+ ": ");
        sc.nextLine();
        note = sc.nextLine();
        setNote(note);

        amount++;



    }
    
    public Menu(String drinktype, String name, char size, double price, String note) {
        this.drinktype = "Coffee";
        this.name = "Black Pin";
        this.size = 'M';
        this.price = 15.000;
        this.note = "Doing";
    }

    public String getDrinktype() {
        return drinktype;
    }

    public void setDrinktype(String drinktype) {
        this.drinktype = drinktype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format(" | %-10s| | %-20s| | %-5s| | %-15f| |%-20s|",getDrinktype(), getName(), getSize(),getPrice(), getNote() );
    }

    

}

