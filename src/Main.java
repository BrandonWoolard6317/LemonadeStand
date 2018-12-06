import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usersInput = new Scanner(System.in);
        String usersResponseWord = "";
        String item1 = "";
        String item2 = "";
        String item3 = "";
        String item4 = "";
        String item5 = "";
        String item6 = "";
        int usersResponseNumber = 0;
        double usersResponseDecimal = 0;
        int item1Q = 0;
        int item2Q = 0;
        int item3Q = 0;
        int item4Q = 0;
        int item5Q = 0;
        int item6Q = 0;
        double suppliesCost = 0;
        double item1P = 0;
        double item2P = 0;
        double item3P = 0;
        double item4P = 0;
        double item5P = 0;
        double item6P = 0;
        int r = 0;
        int u = 0;
        int t = 0;
        int p = 0;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println("How many items did you purchase? If you only want to type the total cost of supplies\n type" +
                " 0!");
        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
        r = usersResponseNumber;
        if(usersResponseNumber == 0){
            System.out.println("What was the total cost of the supplies?");
            usersResponseDecimal = usersInput.nextDouble();
            suppliesCost = usersResponseDecimal;
            p = 9;
        }

        boolean itemNames = true;
        if(p == 9){
            itemNames = false;
        }
        while (itemNames) {
            u++;
            if (u > 0) {
                r--;
            }
            if (u == 1) {
                System.out.println("What's the name of Item 1?");
                usersResponseWord = usersInput.nextLine();
                item1 = usersResponseWord;
            }
            if (u == 2) {
                System.out.println("What's the name of Item 2?");
                usersResponseWord = usersInput.nextLine();
                item2 = usersResponseWord;
            }
            if (u == 3) {
                System.out.println("What's the name of Item 3?");
                usersResponseWord = usersInput.nextLine();
                item3 = usersResponseWord;
            }
            if (u == 4) {
                System.out.println("What's the name of Item 4?");
                usersResponseWord = usersInput.nextLine();
                item4 = usersResponseWord;
            }
            if (u == 5) {
                System.out.println("What's the name of Item 5?");
                usersResponseWord = usersInput.nextLine();
                item5 = usersResponseWord;
            }
            if (u == 6) {
                System.out.println("What's the name of Item 6?");
                usersResponseWord = usersInput.nextLine();
                item6 = usersResponseWord;
            }
            if (r == 0) {
                itemNames = false;
                r = usersResponseNumber;
                t = r;
                u = 0;
            }
        }

        boolean itemQuantity = true;
        if(p == 9){
            itemQuantity = false;
        }
        while (itemQuantity) {
            u++;
            if (u > 0) {
                r--;
            }
            if (u == 1) {
                System.out.println("What's the quantity of the " + item1 + "?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item1Q = usersResponseNumber;
            }
            if (u == 2) {
                System.out.println("What's the quantity of the " + item2 + "?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item2Q = usersResponseNumber;
            }
            if (u == 3) {
                System.out.println("What's the quantity of the " + item3 + "?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item3Q = usersResponseNumber;
            }
            if (u == 4) {
                System.out.println("What's the quantity of the " + item4 + "?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item4Q = usersResponseNumber;
            }
            if (u == 5) {
                System.out.println("What's the quantity of the " + item5 + "?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item5Q = usersResponseNumber;
            }
            if (u == 6) {
                System.out.println("What's the quantity of the " + item6 + "?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item6Q = usersResponseNumber;
            }
            if (r == 0) {
                itemQuantity = false;
                r = t;
                u = 0;
            }
        }

        boolean itemCosts = true;
        if(p == 9){
            itemCosts = false;
        }
        while (itemCosts) {
            u++;
            if (u > 0) {
                r--;
            }
            if (u == 1) {
                System.out.println("What's the cost of each " + item1 + "?");
                usersResponseDecimal = usersInput.nextDouble();
                item1P = usersResponseDecimal * (double) item1Q;
            }
            if (u == 2) {
                System.out.println("What's the cost of each " + item2 + "?");
                usersResponseDecimal = usersInput.nextDouble();
                item2P = usersResponseDecimal * item2Q;
            }
            if (u == 3) {
                System.out.println("What's the cost of each " + item3 + "?");
                usersResponseDecimal = usersInput.nextDouble();
                item3P = usersResponseDecimal * item3Q;
            }
            if (u == 4) {
                System.out.println("What's the cost of each " + item4 + "?");
                usersResponseDecimal = usersInput.nextDouble();
                item4P = usersResponseDecimal * item4Q;
            }
            if (u == 5) {
                System.out.println("What's the cost of each " + item5 + "?");
                usersResponseDecimal = usersInput.nextDouble();
                item5P = usersResponseDecimal * item5Q;
            }
            if (u == 6) {
                System.out.println("What's the cost of each " + item6 + "?");
                usersResponseDecimal = usersInput.nextDouble();
                item6P = usersResponseDecimal * item6Q;
            }
            if (r == 0) {
                itemCosts = false;
                r = t;
                u = 0;
            }
        }
        boolean retypeInfo = true;
        while (retypeInfo) {
            System.out.println("-----------------Supplies--------------------");
            System.out.println("Item #      Name      Quantity     Price");
            System.out.println("---------------------------------------------");
            if (item1Q > 0) {
                System.out.println("Item 1:     " + item1 + "       " + item1Q + "        $" + item1P);
                System.out.println("---------------------------------------------");
            }
            if (item2Q > 0) {
                System.out.println("Item 2:     " + item2 + "       " + item2Q + "       $" + item2P);
                System.out.println("---------------------------------------------");
            }
            if (item3Q > 0) {
                System.out.println("Item 3:     " + item3 + "       " + item3Q + "       $" + item3P);
                System.out.println("---------------------------------------------");
            }
            if (item4Q > 0) {
                System.out.println("Item 4:     " + item4 + "       " + item4Q + "       $" + item4P);
                System.out.println("---------------------------------------------");
            }
            if (item5Q > 0) {
                System.out.println("Item 5:     " + item5 + "       " + item5Q + "       $" + item5P);
                System.out.println("---------------------------------------------");
            }
            if (item6Q > 0) {
                System.out.println("Item 6:     " + item6 + "       " + item6Q + "       $" + item6P);
                System.out.println("---------------------------------------------");
            }
            if(p == 9){
                System.out.println("");
            }
            else {
                suppliesCost = suppliesCostMethod(item1P, item2P, item3P, item4P, item5P, item6P);
            }
            System.out.println("              Supplies Total Cost: $"+suppliesCost);
            System.out.println("Do you want to retype any of the information presented?\nIf not type 0. If so type" +
                    " the Item Number to redo it or \nadd a new item!!");
            usersResponseNumber = usersInput.nextInt();
            if (usersResponseNumber == 0) {
                retypeInfo = false;
            }
            else if (usersResponseNumber == 1) {
                System.out.println("What's the name of Item 1?");
                usersResponseWord = usersInput.nextLine();
                item1 = usersResponseWord;
                System.out.println("What's the quantity of the " + item1 + "?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item1Q = usersResponseNumber;
                System.out.println("What's the cost of each " + item1 + "?");
                usersResponseDecimal = usersInput.nextDouble();
                item1P = usersResponseDecimal * item1Q;
            }
            else if (usersResponseNumber == 2) {
                System.out.println("What's the name of Item 2?");
                usersResponseWord = usersInput.nextLine();
                item2 = usersResponseWord;
                System.out.println("What's the quantity of the " + item2 + "?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item2Q = usersResponseNumber;
                System.out.println("What's the cost of each " + item2 + "?");
                usersResponseDecimal = usersInput.nextDouble();
                item2P = usersResponseDecimal * item2Q;
            }
            else if (usersResponseNumber == 3) {
                if(item2Q == 0){
                    System.out.println("There isn't an Item 2!");
                }
                else {
                    System.out.println("What's the name of Item 3?");
                    usersResponseWord = usersInput.nextLine();
                    item3 = usersResponseWord;
                    System.out.println("What's the quantity of the " + item3 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item3Q = usersResponseNumber;
                    System.out.println("What's the cost of each " + item3 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    item3P = usersResponseDecimal * item3Q;
                }
            }
            else if (usersResponseNumber == 4) {
                if(item3Q == 0){
                    System.out.println("There isn't an Item 3!");
                }
                else {
                    System.out.println("What's the name of Item 4?");
                    usersResponseWord = usersInput.nextLine();
                    item4 = usersResponseWord;
                    System.out.println("What's the quantity of the " + item4 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item4Q = usersResponseNumber;
                    System.out.println("What's the cost of each " + item4 + "?(Type in pennies!)");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item4P = usersResponseDecimal * item4Q;
                }
            }
            else if (usersResponseNumber == 5) {
                if(item4Q == 0){
                    System.out.println("There isn't an Item 4!");
                }
                else {
                    System.out.println("What's the name of Item 5?");
                    usersResponseWord = usersInput.nextLine();
                    item5 = usersResponseWord;
                    System.out.println("What's the quantity of the " + item5 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item5Q = usersResponseNumber;
                    System.out.println("What's the cost of each " + item5 + "?(Type in pennies!)");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item5P = usersResponseDecimal * item5Q;
                }
            }
            else if (usersResponseNumber == 6) {
                if(item5Q == 0){
                    System.out.println("There isn't an Item 5!");
                }
                else {
                    System.out.println("What's the name of Item 6?");
                    usersResponseWord = usersInput.nextLine();
                    item6 = usersResponseWord;
                    System.out.println("What's the quantity of the " + item6 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item6Q = usersResponseNumber;
                    System.out.println("What's the cost of each " + item6 + "?(Type in pennies!)");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item6P = usersResponseDecimal * item6Q;
                }
            }
        }
        String saleName1 = "";
        String saleName2 = "";
        String saleName3 = "";
        int saleQ1 = 0;
        int saleQ2 = 0;
        int saleQ3 = 0;
        double saleP1 = 0;
        double saleP2 = 0;
        double saleP3 = 0;
        double totalSales = 0;
        r = 0;
        u = 0;
        p = 0;
        t= 0;

        System.out.println("Now that we've collected the Supply Cost, lets find out whether or not you made a profit." +
                "\nTo add individual items to isolate sales tpye the number of items. If you simply want\nto type the " +
                "total amount of sales type 0");
        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
        r = usersResponseNumber;
        if(usersResponseNumber == 0){
            System.out.println("What was the total amount of sales made?");
            usersResponseNumber = Integer.parseInt(usersInput.nextLine());
            totalSales = usersResponseNumber;
            p = 9;
        }

        boolean salesItems = true;
        while(salesItems) {
                if(){

                }
        }
        System.out.println("Thanks for using my code!");
        System.exit(6317);
    }

    public static double suppliesCostMethod(double item1P,double item2P,double item3P,double item4P,double item5P,double item6p){
        return (item1P+item2P+item3P+item4P+item5P+item6p);
    }
}