import java.util.*;
//

public class Manager_Coffee_Shop {

    int id;
    String choose,user,password;
    int Choose;


    Scanner sc = new Scanner(System.in);
     

    public void login() {
        System.out.println("Please Login!");
        System.out.println("Enter user: ");
        user = sc.nextLine();
        System.out.println("Password: ");
        password = sc.nextLine();
    }

    public void showAccount(ArrayList<Account> account) {
        if (account.size() == 0){
            System.out.println("null");
        }else{
            System.out.println(" ___________________________________________");
            System.out.printf("| %-5s| |%-20s| |%-10s|\n","ID","Name","Password");
            for (int i = 0; i < account.size(); i++) {
                System.out.printf("| %-5s| |%-20s| |%-10s|\n","-----","------------------","----------");      

                System.out.printf("| %-5d| %s\n", i, account.get(i).toString());
            }
            System.out.println(" ___________________________________________");
        }
    }

    public void removeAccount(ArrayList<Account> account){
        do {
            System.out.print("Enter the id Account delete: ");
            id = sc.nextInt();
            if (id < 0 || id > account.size()) {
                System.err.println("Please choose: 0-" + account.size() +"!");
    
            }
        }while(id < 0 || id > account.size());
    }

//Customer
    public void showCustomer(ArrayList<Customer> customer){
        //id, name, gender, age, address, email, phone
        if (customer.size() == 0){
            System.out.println("null");
        }else{
        
            System.out.println(" _________________________________________________________________________________________________________________________________");
            System.out.printf("| %-5s| |%-20s| |%-10s| |%-10s| |%-20s| |%-30s| |%-20s|\n","ID","Name","Gender","Age","Address","Email","Phone");
            for (int i = 0; i < customer.size(); i++) {
                System.out.printf("| %-5s| |%-20s| |%-10s| |%-10s| |%-20s| |%-30s| |%-20s|\n","-----","------------------","----------","----------","------------------","------------------------------","------------------");      

                System.out.printf("| %-5d|%s\n",i, customer.get(i).toString());
            }
            System.out.println(" _________________________________________________________________________________________________________________________________");
        }
    }
    public void removeCustomer(ArrayList<Customer> customer){
        if (customer.size() == 0){
            System.out.println("null");
        }else{
            do {
                System.out.println("Enter the id Customer delete: ");
                id = sc.nextInt();
                if (id < 0 || id >= customer.size()) {
                    System.out.println("Please choose: 0-" + customer.size() + "!");
                }

            } while (id < 0 || id >= customer.size());
        }
    }
    public void searchCustomerID(ArrayList<Customer> customer){
        if (customer.size() == 0){
            System.out.println("null");
        }else{
            do{
                System.out.println("Enter the id customer to search: ");
                id = sc.nextInt();
                if (id < 0 || id >= customer.size()) {
                    System.out.println("Please choose: 0-" + customer.size() + "!");
                }else{
                    System.out.printf("| %-5s| |%-20s| |%-10s| |%-10s| |%-20s| |%-30s| |%-20s|\n","ID","Name","Gender","Age","Address","Email","Phone");
                    System.out.printf("| %-5d|%s\n",id, customer.get(id).toString());
                }

            }while (id < 0 || id >= customer.size());
        }
    }
    public void sortCustomer(ArrayList<Customer> customer){
        if (customer.size() == 0){
            System.out.println("null");
        }else{
            do{
                System.out.println("Ascending by name: ");
                for (int i = 0, j = customer.size();i>j;i--,j++){
                    Customer temp = customer.get(j);
                    customer.set(j, customer.get(j));
                    customer.set(i, temp);
                }
                System.out.printf("| %-5s| |%-20s| |%-10s| |%-10s| |%-20s| |%-30s| |%-20s|\n","ID","Name","Gender","Age","Address","Email","Phone");

                for (int i = customer.size() - 1; i >= 0; i--)
                {
                    System.out.printf("| %-5d|%s\n",i, customer.get(i).toString());
                }
        
            }while (id < 0 || id >= customer.size());
        }
    }
//Update
public void updateCustomer(ArrayList<Customer> customer){
    if (customer.size() == 0){
        System.out.println("null");
    }else{
        do {
            System.out.println("Enter the id Customer delete: ");
            id = sc.nextInt();
            if (id < 0 || id >= customer.size()) {
                System.out.println("Please choose: 0-" + customer.size() + "!");
            }
            customer.remove(id);
            Customer cus = new Customer();
            customer.add(cus);
        } while (id < 0 || id >= customer.size());
}
    
}


//Employee
    public void showEmployee(ArrayList<Employee> employee){
        if (employee.size() == 0){
            System.out.println("null");
        }else{

            System.out.println(" _________________________________________________________________________________________________________________________________________");
            System.out.printf("| %-5s| |%-20s| |%-10s| |%-10s| |%-20s| |%-20s| |%-20s| |%-20s|\n","ID","Name","Gender","Age","Address","Email","Phone","Salary");
            for (int i = 0; i < employee.size(); i++) {
                System.out.printf("| %-5s| |%-20s| |%-10s| |%-10s| |%-20s| |%-20s| |%-20s| |%-20s|\n","-----","------------------","----------","----------","------------------","------------------","------------------","------------------");      

                System.out.printf("| %-5d|%s\n",i, employee.get(i).toString());
            }
            System.out.println(" _________________________________________________________________________________________________________________________________________");
    }
    }
    public void removeEmployee(ArrayList<Employee> employee){
        if (employee.size() == 0){
            System.out.println("null");
        }else{

            do {
                System.out.println("Enter the id Employee delete: ");
                id = sc.nextInt();
                if (id < 0 || id >= employee.size()) {
                    System.out.println("Please choose: 0-" + employee.size() + "!");
                }

            } while (id < 0 || id >= employee.size());
        }
}
//Table
    public void showTable(ArrayList<Table> tables){
        if (tables.size() == 0){
            System.out.println("null");
        }else{

            System.out.println(" _________________________________________________________________");
            System.out.printf("| %-5s| | %-5s| | %-15s| | %-20s|\n","ID","Number","Chair amount","Note");
            for (int i = 0; i < tables.size(); i++) {
                System.out.printf("| %-5s| | %-5s| | %-15s| | %-20s|\n","-----","-----","---------------","------------------");      

                System.out.printf("| %-5d|%s\n",i, tables.get(i).toString());
            }
            System.out.println(" __________________________________________________________________");
        }
    }
    public void removeTable(ArrayList<Table> tables){
        if (tables.size() == 0){
            System.out.println("null");
        }else{

            do {
                System.out.println("Enter the id table delete: ");
                id = sc.nextInt();
                if (id < 0 || id >= tables.size()) {
                    System.out.println("Please choose: 0-" + tables.size() + "!");
                }

            } while (id < 0 || id >= tables.size());
        }
   
    }
//Drink
//| %-10s| | %-20s| | %-5s| | %-15s| |%-20s|
    public void showDrink(ArrayList<Menu> menu){
        if (menu.size() == 0){
            System.out.println("null");
        }else{
        
            System.out.println(" ___________________________________________________________________________________________________");
            System.out.printf("| %-5s| | %-10s| | %-20s| | %-5s| | %-15s| |%-20s|\n","ID","DrinkType","Name","Size","Price","Note");
            for (int i = 0; i < menu.size(); i++) {
                System.out.printf("| %-5s| | %-10s| | %-20s| | %-5s| | %-15s| |%-20s|\n","-----","----------","------------------","-----","---------------","------------------");      

                System.out.printf("| %-5d|%s\n",i, menu.get(i).toString());
            }
            System.out.println(" ____________________________________________________________________________________________________");
        }

    }
    public void removeDrink(ArrayList<Menu> menu){
        if (menu.size() == 0){
            System.out.println("null");
        }else{


            do {
                System.out.println("Enter the id drink delete: ");
                id = sc.nextInt();
                if (id < 0 || id >= menu.size()) {
                    System.out.println("Please choose: 0-" + menu.size() + "!");
                }

            } while (id < 0 || id >= menu.size());
        }

    } 
//Order
    public void showOrder(ArrayList<Order> order){
        if (order.size() == 0){
            System.out.println("null");
        }else{


            System.out.println(" ______________________________________________________________________________________________________________________________________________");
            System.out.printf("| %-5s| | %-20s| | %-20s| | %-5s| | %-10s| |%-20s| |%-20s|\n","ID","Customer","Drink","Size","Amount","Price","Employee");
            for (int i = 0; i < order.size(); i++) {
                System.out.printf("| %-5s| | %-20s| | %-20s| | %-5s| | %-10s| |%-20s| |%-20s|\n","-----","------------------","------------------","-----","----------","------------------","------------------");      

                System.out.printf("| %-5d|%s\n",i, order.get(i).toString());
            }
            System.out.println(" ______________________________________________________________________________________________________________________________________________");

        }
    }
    public void removeOrder(ArrayList<Order> order){
        if (order.size() == 0){
            System.out.println("null");
        }else{


            do {
                System.out.println("Enter the id order deleted: ");
                id = sc.nextInt();
                if (id < 0 || id >= order.size()) {
                    System.out.println("Please choose: 0-" + order.size() + "!");
                }

            } while (id < 0 || id >= order.size());
        }
    }
//Bill
    public void showBill(ArrayList<Bill> bill){
        if (bill.size() == 0){
            System.out.println("null");
        }else{


            System.out.println(" ______________________________________________________________________________________________________________________________________________");
            System.out.printf("| %-5s| | %-20s| | %-20s| | %-5s| | %-15s| | %-15s| |%-20s| |%-20s|\n","ID","Customer","Drink","Amount","Price","Total price","Employee","Date");
            for (int i = 0; i < bill.size(); i++) {
                System.out.printf("| %-5s| | %-20s| | %-20s| | %-5s| | %-15s| | %-15s| |%-20s| |%-20s|\n","-----","------------------","------------------","-----","---------------","---------------","------------------","------------------");      

                System.out.printf("| %-5d|%s\n",i, bill.get(i).toString());
            }
            System.out.println(" ______________________________________________________________________________________________________________________________________________");
        }
    }
    public void removeBill(ArrayList<Bill> bill){
        if (bill.size() == 0){
            System.out.println("null");
        }else{


            do {
                System.out.println("Enter the id bill deleted: ");
                id = sc.nextInt();
                if (id < 0 || id >= bill.size()) {
                    System.out.println("Please choose: 0-" + bill.size() + "!");
                }

            } while (id < 0 || id >= bill.size());
        }

    }


    

    }

    
    
