import java.util.ArrayList;
import java.util.Scanner;
//import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customer = new ArrayList<>();
        ArrayList<Employee> employee = new ArrayList<>();
        ArrayList<Menu> menu = new ArrayList<>();
        ArrayList<Order> order = new ArrayList<>();
        ArrayList<Bill> bill = new ArrayList<>();
        ArrayList<Table> tables = new ArrayList<>();
        ArrayList<Account> account = new ArrayList<>();

        char choose;
        int line;// id;
        
        Scanner sc = new Scanner(System.in);
        Manager_Coffee_Shop manager_coffee_shop = new Manager_Coffee_Shop();
        manager_coffee_shop.login();
        while(true) {
            System.out.println("----------MENU----------");
            System.out.println("1 : Choose the Account");
            System.out.println("2 : Choose the Customer");
            System.out.println("3 : Choose the Employee");
            System.out.println("4 : Choose the Table");
            System.out.println("5 : Choose the Menu");
            System.out.println("6 : Choose the Order");
            System.out.println("7 : Choose the Bill");
            System.out.println("0 : To exit");
        
            do {
                System.out.print("Your choice is: ");
                line = sc.nextInt();
                if (line < 0 || line> 8) {
                    System.err.println("Please choose: 0-8!");
                }
            } while (line < 0 || line > 8);
            sc.nextLine();
            switch(line){
                case 0: break;
                case 1: {
                    System.out.println("------Menu-Account-----");
                    System.out.println("1 : Enter the Account");
                    System.out.println("2 : Delete the Account");
                    System.out.println("3 : Show the Account");
                    do {
                        System.out.print("Your choice is: ");
                        line = sc.nextInt();
                        if (line < 1 || line > 3) {
                            System.err.println("Please choose: 1-3!");
                        }
                    } while (line < 1 || line > 3);
                    sc.nextLine();

                    switch (line) {
                        case 1:
                            do{
                            Account ac = new Account();
                            account.add(ac);
                            do {
                                System.out.print("Continue enter other Account[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Please choose: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                            }while(choose == 'Y'|| choose == 'y');
                

                            break;
                        case 2:
                            manager_coffee_shop.showAccount(account);;
                            manager_coffee_shop.removeAccount(account);
                            account.remove(manager_coffee_shop.id);
                            break;

                        case 3:
                            manager_coffee_shop.showAccount(account);
                            break;
                    }
                    break;
                }
            
                case 2: {
                    System.out.println("------Menu-Customer-----");
                    System.out.println("1 : Enter the Customer");
                    System.out.println("2 : Delete the Customer");
                    System.out.println("3 : Show the Customer");
                    System.out.println("4 : Search the Customer");
                    System.out.println("5 : Sort the Customer");
                    System.out.println("6 : Update the Customer");



                    do {
                        System.out.print("Your choice is: ");
                        line = sc.nextInt();
                        if (line < 1 || line > 6) {
                            System.err.println("Please choose: 1-6!");
                        }
                    } while (line < 1 || line > 6);
                    sc.nextLine();

                    switch (line) {
                        case 1:
                            do{
                                Customer cus = new Customer();
                                customer.add(cus);
                                do {
                                    System.out.print("Continue enter other Customer[Y/N] :");
                                    choose = sc.next().charAt(0);
                                    
                                    if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                        System.err.println("Please choose: [Y/N]");
                                        }
                                    }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                        
                            }while(choose == 'Y'|| choose == 'y');
                    
                            break;

                        case 2:
                            manager_coffee_shop.showCustomer(customer);
                            manager_coffee_shop.removeCustomer(customer);
                            customer.remove(manager_coffee_shop.id);

                            break;
                        case 3:
                            manager_coffee_shop.showCustomer(customer);

                            break;
                        case 4: 
                            manager_coffee_shop.searchCustomerID(customer);
                            break;
                        case 5:
                            manager_coffee_shop.sortCustomer(customer);
                            break;
                        case 6:
                            manager_coffee_shop.updateCustomer(customer);

                        }break;
                    }
                case 3:
                System.out.println("------Menu-Employee-----");
                System.out.println("1 : Enter the Employee");
                System.out.println("2 : Delete the Employee");
                System.out.println("3 : Show the Employee");
                do {
                    System.out.print("Your choice is: ");
                    line = sc.nextInt();
                    if (line < 1 || line > 3) {
                        System.err.println("Please choose: 1-3!");
                    }
                } while (line < 1 || line > 3);
                sc.nextLine();

                switch (line) {
                    case 1:
                        do{
                            Employee emp = new Employee();
                            employee.add(emp);
                            do {
                                System.out.print("Continue enter other Customer[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Please choose: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;

                    case 2:
                        manager_coffee_shop.showEmployee(employee);
                        employee.remove(manager_coffee_shop.id);

                        break;
                    case 3:
                        manager_coffee_shop.showEmployee(employee);

                        break;
                    }break;
            
                case 4: 
                System.out.println("------Menu-Table-----");
                System.out.println("1 : Enter the Table");
                System.out.println("2 : Delete the Table");
                System.out.println("3 : Show the Table");
                do {
                    System.out.print("Your choice is: ");
                    line = sc.nextInt();
                    if (line < 1 || line > 3) {
                        System.err.println("Please choose: 1-3!");
                    }
                } while (line < 1 || line > 3);
                sc.nextLine();

                switch (line) {
                    case 1:
                        do{
                            Table tab = new Table();
                            tables.add(tab);
                            do {
                                System.out.print("Continue enter other Table[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Please choose: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;
                    case 2: 
                        manager_coffee_shop.showTable(tables);
                        manager_coffee_shop.removeTable(tables);
                        tables.remove(manager_coffee_shop.id);

                        break;
                    case 3:
                        manager_coffee_shop.showTable(tables);
    
                        break;
                    }break;
                case 5:
                    System.out.println("------Menu-Drink-----");
                    System.out.println("1 : Enter the Drink");
                    System.out.println("2 : Delete the Drink");
                    System.out.println("3 : Show the Drink");
                    do {
                        System.out.print("Your choice is: ");
                        line = sc.nextInt();
                        if (line < 1 || line > 3) {
                            System.err.println("Please choose: 1-3!");
                        }
                    } while (line < 1 || line > 3);
                    sc.nextLine();

                    switch (line) {
                    case 1:
                        do{
                            Menu meu = new Menu();
                            menu.add(meu);
                            do {
                                System.out.print("Continue enter other Drink[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Please choose: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;
                    case 2: 
                        manager_coffee_shop.showDrink(menu);;
                        manager_coffee_shop.removeDrink(menu);
                        menu.remove(manager_coffee_shop.id);

                        break;
                    case 3:
                        manager_coffee_shop.showDrink(menu);;
    
                        break;
                    }break;
                case 6:
                    System.out.println("------Menu-Order-----");
                    System.out.println("1 : Enter the Order");
                    System.out.println("2 : Delete the Order");
                    System.out.println("3 : Show the Order");
                do {
                        System.out.print("Your choice is: ");
                        line = sc.nextInt();
                        if (line < 1 || line > 3) {
                            System.err.println("Please choose: 1-3!");
                        }
                    } while (line < 1 || line > 3);
                    sc.nextLine();

                    switch (line) {
                    case 1:
                        do{
                            Order ord = new Order();
                            order.add(ord);
                            do {
                                System.out.print("Continue enter other Order[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Please choose: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;
                    case 2: 
                        manager_coffee_shop.showOrder(order);
                        manager_coffee_shop.removeOrder(order);;
                        order.remove(manager_coffee_shop.id);

                        break;
                    case 3:
                        manager_coffee_shop.showOrder(order);
    
                        break;
                    }break;
                case 7: 
                    System.out.println("------Menu-Bill-----");
                    System.out.println("1 : Enter the bill");
                    System.out.println("2 : Delete the bill");
                    System.out.println("3 : Show the bill");
                    do {
                        System.out.print("Your choice is: ");
                        line = sc.nextInt();
                        if (line < 1 || line > 3) {
                            System.err.println("Please choose: 1-3!");
                        }
                    } while (line < 1 || line > 3);
                    sc.nextLine();

                    switch (line) {
                    case 1:
                        do{
                            Bill bil = new Bill();
                            bill.add(bil);
                            do {
                                System.out.print("Continue enter other bill[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Please choose: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;
                    case 2: 
                        manager_coffee_shop.showBill(bill);
                        manager_coffee_shop.removeBill(bill);
                        bill.remove(manager_coffee_shop.id);

                        break;
                    case 3:
                        manager_coffee_shop.showBill(bill);

                        break;
                    }break;
                }
            }
        }
    }          
            
        
    



                

