import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usersInput = new Scanner(System.in);
        String usersResponseWord = "";
        String item1 = "";
        String item2 = "";
        String item3 = "";
        String item4 = "";
        int usersResponseNumber = 0;
        int item1Q = 0;
        int item2Q = 0;
        int item3Q = 0;
        int item4Q = 0;
        double item1P = 0;
        double item2P = 0;
        double item3P = 0;
        double item4P = 0;
        int r = 0;
        int u = 0;
        int t = 0;

            System.out.println("How many items did you purchase?");
            usersResponseNumber = Integer.parseInt(usersInput.nextLine());
            r = usersResponseNumber;

        boolean itemNames = true;
        while(itemNames){
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
            if (r == 0) {
                itemNames = false;
                r = usersResponseNumber;
                t = r;
                u = 0;
            }
        }

        boolean itemQuantity = true;
        while(itemQuantity){
            u++;
            if(u > 0){
                r--;
            }
            if(u == 1){
                System.out.println("What's the quantity of the "+item1+"?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item1Q = usersResponseNumber;
            }
            if(u == 2){
                System.out.println("What's the quantity of the "+item2+"?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item2Q = usersResponseNumber;
            }
            if(u == 3){
                System.out.println("What's the quantity of the "+item3+"?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item3Q = usersResponseNumber;
            }
            if(u == 4){
                System.out.println("What's the quantity of the "+item4+"?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item4Q = usersResponseNumber;
            }
            if (r == 0) {
                itemQuantity = false;
                r = t;
                u = 0;
            }
        }

        boolean itemCosts = true;
        while(itemCosts){
            u++;
            if(u > 0){
                r--;
            }
            if(u == 1){
                System.out.println("What's the cost of each "+item1+"?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item1P = (usersResponseNumber/100.0)*item1Q;
            }
            /*if(item2Q == 0){
                itemCosts = false;
                r = t;
                u = 0;
            }*/
            if(u == 2){
                System.out.println("What's the cost of each "+item2+"?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item2P = (usersResponseNumber/100.0)*item2Q;
            }
            /*if(item3Q == 0){
                itemCosts = false;
                r = t;
                u = 0;
            }*/
            if(u == 3){
                System.out.println("What's the cost of each "+item3+"?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item3P = (usersResponseNumber/100.0)*item3Q;
            }
            /*if(item4Q == 0){
                itemCosts = false;
                r = t;
                u = 0;
            }*/
            if(u == 4){
                System.out.println("What's the cost of each "+item4+"?");
                usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                item4P = (usersResponseNumber/100.0)*item4Q;
            }
            if (r == 0) {
                itemCosts = false;
                r = t;
                u = 0;
            }
        }

        System.out.println("Item 1: "+item1Q+" "+item1+" for $"+item1P);
        if(item2Q > 0) {
            System.out.println("Item 2: " + item2Q + " " + item2 + " for $" + item2P);
        }
        if(item3Q > 0) {
            System.out.println("Item 3: " + item3Q + " " + item3 + " for $" + item3P);
        }
        if(item4Q > 0) {
            System.out.println("Item 4: " + item4Q + " " + item4 + " for $" + item4P);
        }
    }
}
