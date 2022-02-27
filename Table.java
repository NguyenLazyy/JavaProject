import java.util.*;
public class Table {
    private int number;
    private int chair_amount;
    private String note;
    private static int amount=0;
    private static Scanner sc = new Scanner(System.in);
    public Table(int number, int chair_amount, String note) {
        this.number = 10;
        this.chair_amount = 5;
        this.note = "Doing";
    }
    public Table(){
        System.out.println("Enter the number of table "+ amount +": ");
        number = sc.nextInt();
        setNumber(number);
        System.out.println("Enter the chair amount of table " + amount + ": ");
        chair_amount = sc.nextInt();
        setChair_Amount(chair_amount);
        System.out.println("Enter the note " + amount + ": ");
        sc.nextLine();
        note = sc.nextLine();
        setNote(note);
        amount++;



        
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getChair_Amount() {
        return chair_amount;
    }
    public void setChair_Amount(int chair_amount) {
        this.chair_amount = chair_amount;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    @Override
    public String toString() {
        return String.format(" | %-5d| | %-15d| | %-20s|",getNumber(),getChair_Amount(),getNote());
    }
    
    

    
}
