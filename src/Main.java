import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usersInput = new Scanner(System.in);
        String organizationName = "";
        int v = 0;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("What's the name of your business?");
        organizationName = usersInput.nextLine();

        boolean entireCode = true;
        while (entireCode) {
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

            if(v>0){
                System.out.println("Times Completed Running Code: "+v);
            }
            System.out.println("How many items did you purchase? If you only want to type the total cost of supplies\n type" +
                    " 0!");
            usersResponseNumber = usersInput.nextInt();
            r = usersResponseNumber;
            if (usersResponseNumber == 0) {
                System.out.println("What was the total cost of the supplies?");
                usersResponseDecimal = usersInput.nextDouble();
                suppliesCost = usersResponseDecimal;
                p = 9;
            }

            boolean itemNames = true;
            if (p == 9) {
                itemNames = false;
            }
            while (itemNames) {
                u++;
                if (u > 0) {
                    r--;
                }
                if (u == 1) {
                    System.out.println("What's the name of Item 1?");
                    usersInput.nextLine();
                    usersResponseWord = usersInput.nextLine();
                    item1 = usersResponseWord;
                }
                else if (u == 2) {
                    System.out.println("What's the name of Item 2?");
                    usersResponseWord = usersInput.nextLine();
                    item2 = usersResponseWord;
                }
                else if (u == 3) {
                    System.out.println("What's the name of Item 3?");
                    usersResponseWord = usersInput.nextLine();
                    item3 = usersResponseWord;
                }
                else if (u == 4) {
                    System.out.println("What's the name of Item 4?");
                    usersResponseWord = usersInput.nextLine();
                    item4 = usersResponseWord;
                }
                else if (u == 5) {
                    System.out.println("What's the name of Item 5?");
                    usersResponseWord = usersInput.nextLine();
                    item5 = usersResponseWord;
                }
                else if (u == 6) {
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
            if (p == 9) {
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
                else if (u == 2) {
                    System.out.println("What's the quantity of the " + item2 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item2Q = usersResponseNumber;
                }
                else if (u == 3) {
                    System.out.println("What's the quantity of the " + item3 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item3Q = usersResponseNumber;
                }
                else if (u == 4) {
                    System.out.println("What's the quantity of the " + item4 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item4Q = usersResponseNumber;
                }
                else if (u == 5) {
                    System.out.println("What's the quantity of the " + item5 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item5Q = usersResponseNumber;
                }
                else if (u == 6) {
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
            if (p == 9) {
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
                System.out.println("Business Name: "+organizationName);
                System.out.println("---------------------------------------------");
                System.out.println("Item #      Name      Quantity     Price");
                System.out.println("---------------------------------------------");
                if (item1Q > 0) {
                    System.out.println("Item 1:     " + item1 + "       " + item1Q + "        $" + numberFormat.format(item1P));
                    System.out.println("---------------------------------------------");
                }
                if (item2Q > 0) {
                    System.out.println("Item 2:     " + item2 + "       " + item2Q + "       $" + numberFormat.format(item2P));
                    System.out.println("---------------------------------------------");
                }
                if (item3Q > 0) {
                    System.out.println("Item 3:     " + item3 + "       " + item3Q + "       $" + numberFormat.format(item3P));
                    System.out.println("---------------------------------------------");
                }
                if (item4Q > 0) {
                    System.out.println("Item 4:     " + item4 + "       " + item4Q + "       $" + numberFormat.format(item4P));
                    System.out.println("---------------------------------------------");
                }
                if (item5Q > 0) {
                    System.out.println("Item 5:     " + item5 + "       " + item5Q + "       $" + numberFormat.format(item5P));
                    System.out.println("---------------------------------------------");
                }
                if (item6Q > 0) {
                    System.out.println("Item 6:     " + item6 + "       " + item6Q + "       $" + numberFormat.format(item6P));
                    System.out.println("---------------------------------------------");
                }
                if (p == 9) {
                    System.out.println("");
                } else {
                    suppliesCost = suppliesCostMethod(item1P, item2P, item3P, item4P, item5P, item6P);
                }
                System.out.println("              Supplies Total Cost: $" + numberFormat.format(suppliesCost));
                System.out.println("---------------------------------------------");
                System.out.println("Do you want to retype any of the information presented?\nIf not type 0. If so type" +
                        " the Item Number to redo it or \nadd a new item!!");
                usersResponseNumber = usersInput.nextInt();
                if (usersResponseNumber == 0) {
                    retypeInfo = false;
                } else if (usersResponseNumber == 1) {
                    System.out.println("What's the name of Item 1?");
                    usersInput.nextLine();
                    usersResponseWord = usersInput.nextLine();
                    item1 = usersResponseWord;
                    System.out.println("What's the quantity of the " + item1 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item1Q = usersResponseNumber;
                    System.out.println("What's the cost of each " + item1 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    item1P = usersResponseDecimal * item1Q;
                } else if (usersResponseNumber == 2) {
                    System.out.println("What's the name of Item 2?");
                    usersInput.nextLine();
                    usersResponseWord = usersInput.nextLine();
                    item2 = usersResponseWord;
                    System.out.println("What's the quantity of the " + item2 + "?");
                    usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                    item2Q = usersResponseNumber;
                    System.out.println("What's the cost of each " + item2 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    item2P = usersResponseDecimal * item2Q;
                } else if (usersResponseNumber == 3) {
                    if (item2Q == 0) {
                        System.out.println("There isn't an Item 2!");
                    } else {
                        System.out.println("What's the name of Item 3?");
                        usersInput.nextLine();
                        usersResponseWord = usersInput.nextLine();
                        item3 = usersResponseWord;
                        System.out.println("What's the quantity of the " + item3 + "?");
                        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                        item3Q = usersResponseNumber;
                        System.out.println("What's the cost of each " + item3 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        item3P = usersResponseDecimal * item3Q;
                    }
                } else if (usersResponseNumber == 4) {
                    if (item3Q == 0) {
                        System.out.println("There isn't an Item 3!");
                    } else {
                        System.out.println("What's the name of Item 4?");
                        usersInput.nextLine();
                        usersResponseWord = usersInput.nextLine();
                        item4 = usersResponseWord;
                        System.out.println("What's the quantity of the " + item4 + "?");
                        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                        item4Q = usersResponseNumber;
                        System.out.println("What's the cost of each " + item4 + "?");
                        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                        item4P = usersResponseDecimal * item4Q;
                    }
                } else if (usersResponseNumber == 5) {
                    if (item4Q == 0) {
                        System.out.println("There isn't an Item 4!");
                    } else {
                        System.out.println("What's the name of Item 5?");
                        usersInput.nextLine();
                        usersResponseWord = usersInput.nextLine();
                        item5 = usersResponseWord;
                        System.out.println("What's the quantity of the " + item5 + "?");
                        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                        item5Q = usersResponseNumber;
                        System.out.println("What's the cost of each " + item5 + "?");
                        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                        item5P = usersResponseDecimal * item5Q;
                    }
                } else if (usersResponseNumber == 6) {
                    if (item5Q == 0) {
                        System.out.println("There isn't an Item 5!");
                    } else {
                        System.out.println("What's the name of Item 6?");
                        usersInput.nextLine();
                        usersResponseWord = usersInput.nextLine();
                        item6 = usersResponseWord;
                        System.out.println("What's the quantity of the " + item6 + "?");
                        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                        item6Q = usersResponseNumber;
                        System.out.println("What's the cost of each " + item6 + "?");
                        usersResponseNumber = Integer.parseInt(usersInput.nextLine());
                        item6P = usersResponseDecimal * item6Q;
                    }
                }
            }

            String saleName1 = "";
            String saleName2 = "";
            String saleName3 = "";
            String saleName4 = "";
            String saleName5 = "";
            String saleName6 = "";
            String saleName7 = "";
            String saleName8 = "";
            String saleName9 = "";
            String saleName10 = "";
            String saleName11 = "";
            String saleName12 = "";
            String saleName13 = "";
            String saleName14 = "";
            String saleName15 = "";
            String saleName16 = "";
            String saleName17 = "";
            String saleName18 = "";
            int saleQ1 = 0;
            int saleQ2 = 0;
            int saleQ3 = 0;
            int saleQ4 = 0;
            int saleQ5 = 0;
            int saleQ6 = 0;
            int saleQ7 = 0;
            int saleQ8 = 0;
            int saleQ9 = 0;
            int saleQ10 = 0;
            int saleQ11 = 0;
            int saleQ12 = 0;
            int saleQ13 = 0;
            int saleQ14 = 0;
            int saleQ15 = 0;
            int saleQ16 = 0;
            int saleQ17 = 0;
            int saleQ18 = 0;
            int d = 0;
            double saleP1 = 0;
            double saleP2 = 0;
            double saleP3 = 0;
            double saleP4 = 0;
            double saleP5 = 0;
            double saleP6 = 0;
            double saleP7 = 0;
            double saleP8 = 0;
            double saleP9 = 0;
            double saleP10 = 0;
            double saleP11 = 0;
            double saleP12 = 0;
            double saleP13 = 0;
            double saleP14 = 0;
            double saleP15 = 0;
            double saleP16 = 0;
            double saleP17 = 0;
            double saleP18 = 0;
            double totalSales = 0;
            double totalSales1 = 0;
            double totalSales2 = 0;
            double totalSales3 = 0;
            double revenue = 0;
            r = 0;
            u = 0;
            p = 0;

            System.out.println("How many days did sell your items? If you don't want to do days just enter 1.");
            usersResponseNumber = usersInput.nextInt();
            d = usersResponseNumber;
            System.out.println("How many items did you sell on day 1? Type 0 if you just want to enter a price for day 1.");
            usersResponseNumber = usersInput.nextInt();
            r = usersResponseNumber;
            if (usersResponseNumber == 0) {
                System.out.println("What was the total amount of sales made?");
                usersResponseDecimal = usersInput.nextDouble();
                totalSales1 = usersResponseDecimal;
                p = 9;
            }

            boolean salesItems = true;
            if (p == 9) {
                salesItems = false;
            }
            while (salesItems) {
                u++;
                if (u > 0) {
                    r--;
                }
                if (u == 1) {
                    System.out.println("What's the name of Item 1?");
                    usersInput.nextLine();
                    usersResponseWord = usersInput.nextLine();
                    saleName1 = usersResponseWord;
                }
                if (u == 2) {
                    System.out.println("What's the name of Item 2?");
                    usersResponseWord = usersInput.nextLine();
                    saleName2 = usersResponseWord;
                }
                if (u == 3) {
                    System.out.println("What's the name of Item 3?");
                    usersResponseWord = usersInput.nextLine();
                    saleName3 = usersResponseWord;
                }
                if (u == 4) {
                    System.out.println("What's the name of Item 4?");
                    usersResponseWord = usersInput.nextLine();
                    saleName4 = usersResponseWord;
                }
                if (u == 5) {
                    System.out.println("What's the name of Item 5?");
                    usersResponseWord = usersInput.nextLine();
                    saleName5 = usersResponseWord;
                }
                if (u == 6) {
                    System.out.println("What's the name of Item 6?");
                    usersResponseWord = usersInput.nextLine();
                    saleName6 = usersResponseWord;
                }
                if (r == 0) {
                    salesItems = false;
                    r = usersResponseNumber;
                    u = 0;
                }
            }

            boolean saleQuantity = true;
            if (p == 9) {
                saleQuantity = false;
            }
            while (saleQuantity) {
                u++;
                if (u > 0) {
                    r--;
                }
                if (u == 1) {
                    System.out.println("What's the quantity of the " + saleName1 + "?");
                    usersResponseNumber = usersInput.nextInt();
                    saleQ1 = usersResponseNumber;
                }
                if (u == 2) {
                    System.out.println("What's the quantity of the " + saleName2 + "?");
                    usersResponseNumber = usersInput.nextInt();
                    saleQ2 = usersResponseNumber;
                }
                if (u == 3) {
                    System.out.println("What's the quantity of the " + saleName3 + "?");
                    usersResponseNumber = usersInput.nextInt();
                    saleQ3 = usersResponseNumber;
                }
                if (u == 4) {
                    System.out.println("What's the quantity of the " + saleName4 + "?");
                    usersResponseNumber = usersInput.nextInt();
                    saleQ4 = usersResponseNumber;
                }
                if (u == 5) {
                    System.out.println("What's the quantity of the " + saleName5 + "?");
                    usersResponseNumber = usersInput.nextInt();
                    saleQ5 = usersResponseNumber;
                }
                if (u == 6) {
                    System.out.println("What's the quantity of the " + saleName6 + "?");
                    usersResponseNumber = usersInput.nextInt();
                    saleQ6 = usersResponseNumber;
                }
                if (r == 0) {
                    saleQuantity = false;
                    u = 0;
                }
            }

            boolean saleCosts = true;
            if (p == 9) {
                saleCosts = false;
            }
            while (saleCosts) {
                u++;
                if (u > 0) {
                    r--;
                }
                if (u == 1) {
                    System.out.println("What's the cost of each " + saleName1 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    saleP1 = usersResponseDecimal * (double) saleQ1;
                }
                if (u == 2) {
                    System.out.println("What's the cost of each " + saleName2 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    saleP2 = usersResponseDecimal * saleQ2;
                }
                if (u == 3) {
                    System.out.println("What's the cost of each " + saleName3 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    saleP3 = usersResponseDecimal * saleQ3;
                }
                if (u == 4) {
                    System.out.println("What's the cost of each " + saleName4 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    saleP4 = usersResponseDecimal * saleQ4;
                }
                if (u == 5) {
                    System.out.println("What's the cost of each " + saleName5 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    saleP5 = usersResponseDecimal * saleQ5;
                }
                if (u == 6) {
                    System.out.println("What's the cost of each " + saleName6 + "?");
                    usersResponseDecimal = usersInput.nextDouble();
                    saleP6 = usersResponseDecimal * saleQ6;
                }
                if (r == 0) {
                    saleCosts = false;
                    u = 0;
                }
            }
            if(d>1){
                System.out.println("How many items did you sell on day 2? Type 0 if you just want to enter a price for day 2.");
                usersResponseNumber = usersInput.nextInt();
                r = usersResponseNumber;
                p = 0;
                if (usersResponseNumber == 0) {
                    System.out.println("What was the total amount of sales made?");
                    usersResponseDecimal = usersInput.nextDouble();
                    totalSales2 = usersResponseDecimal;
                    p = 9;
                }
                boolean salesItems2 = true;
                if (p == 9) {
                    salesItems2 = false;
                }
                while (salesItems2) {
                    u++;
                    if (u > 0) {
                        r--;
                    }
                    if (u == 1) {
                        System.out.println("What's the name of Item 1?");
                        usersInput.nextLine();
                        usersResponseWord = usersInput.nextLine();
                        saleName7 = usersResponseWord;
                    }
                    if (u == 2) {
                        System.out.println("What's the name of Item 2?");
                        usersResponseWord = usersInput.nextLine();
                        saleName8 = usersResponseWord;
                    }
                    if (u == 3) {
                        System.out.println("What's the name of Item 3?");
                        usersResponseWord = usersInput.nextLine();
                        saleName9 = usersResponseWord;
                    }
                    if (u == 4) {
                        System.out.println("What's the name of Item 4?");
                        usersResponseWord = usersInput.nextLine();
                        saleName10 = usersResponseWord;
                    }
                    if (u == 5) {
                        System.out.println("What's the name of Item 5?");
                        usersResponseWord = usersInput.nextLine();
                        saleName11 = usersResponseWord;
                    }
                    if (u == 6) {
                        System.out.println("What's the name of Item 6?");
                        usersResponseWord = usersInput.nextLine();
                        saleName12 = usersResponseWord;
                    }
                    if (r == 0) {
                        salesItems2 = false;
                        r = usersResponseNumber;
                        u = 0;
                    }
                }

                boolean saleQuantity2 = true;
                if (p == 9) {
                    saleQuantity2 = false;
                }
                while (saleQuantity2) {
                    u++;
                    if (u > 0) {
                        r--;
                    }
                    if (u == 1) {
                        System.out.println("What's the quantity of the " + saleName7 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ7 = usersResponseNumber;
                    }
                    if (u == 2) {
                        System.out.println("What's the quantity of the " + saleName8 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ8 = usersResponseNumber;
                    }
                    if (u == 3) {
                        System.out.println("What's the quantity of the " + saleName9 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ9 = usersResponseNumber;
                    }
                    if (u == 4) {
                        System.out.println("What's the quantity of the " + saleName10 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ10 = usersResponseNumber;
                    }
                    if (u == 5) {
                        System.out.println("What's the quantity of the " + saleName11 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ11 = usersResponseNumber;
                    }
                    if (u == 6) {
                        System.out.println("What's the quantity of the " + saleName12 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ12 = usersResponseNumber;
                    }
                    if (r == 0) {
                        saleQuantity2 = false;
                        u = 0;
                    }
                }

                boolean saleCosts2 = true;
                if (p == 9) {
                    saleCosts2 = false;
                }
                while (saleCosts2) {
                    u++;
                    if (u > 0) {
                        r--;
                    }
                    if (u == 1) {
                        System.out.println("What's the cost of each " + saleName7 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP7 = usersResponseDecimal * (double) saleQ7;
                    }
                    if (u == 2) {
                        System.out.println("What's the cost of each " + saleName8 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP8 = usersResponseDecimal * saleQ8;
                    }
                    if (u == 3) {
                        System.out.println("What's the cost of each " + saleName9 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP9 = usersResponseDecimal * saleQ9;
                    }
                    if (u == 4) {
                        System.out.println("What's the cost of each " + saleName10 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP10 = usersResponseDecimal * saleQ10;
                    }
                    if (u == 5) {
                        System.out.println("What's the cost of each " + saleName11 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP11 = usersResponseDecimal * saleQ11;
                    }
                    if (u == 6) {
                        System.out.println("What's the cost of each " + saleName12 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP12 = usersResponseDecimal * saleQ12;
                    }
                    if (r == 0) {
                        saleCosts2 = false;
                        u = 0;
                    }
                }
            }
            if(d>2){
                System.out.println("How many items did you sell on day 3? Type 0 if you just want to enter a price for day 3.");
                usersResponseNumber = usersInput.nextInt();
                r = usersResponseNumber;
                p = 0;
                if (usersResponseNumber == 0) {
                    System.out.println("What was the total amount of sales made on day 3?");
                    usersResponseDecimal = usersInput.nextDouble();
                    totalSales3 = usersResponseDecimal;
                    p = 9;
                }
                boolean salesItems3 = true;
                if (p == 9) {
                    salesItems3 = false;
                }
                while (salesItems3) {
                    u++;
                    if (u > 0) {
                        r--;
                    }
                    if (u == 1) {
                        System.out.println("What's the name of Item 1?");
                        usersInput.nextLine();
                        usersResponseWord = usersInput.nextLine();
                        saleName13 = usersResponseWord;
                    }
                    if (u == 2) {
                        System.out.println("What's the name of Item 2?");
                        usersResponseWord = usersInput.nextLine();
                        saleName14 = usersResponseWord;
                    }
                    if (u == 3) {
                        System.out.println("What's the name of Item 3?");
                        usersResponseWord = usersInput.nextLine();
                        saleName15 = usersResponseWord;
                    }
                    if (u == 4) {
                        System.out.println("What's the name of Item 4?");
                        usersResponseWord = usersInput.nextLine();
                        saleName16 = usersResponseWord;
                    }
                    if (u == 5) {
                        System.out.println("What's the name of Item 5?");
                        usersResponseWord = usersInput.nextLine();
                        saleName17 = usersResponseWord;
                    }
                    if (u == 6) {
                        System.out.println("What's the name of Item 6?");
                        usersResponseWord = usersInput.nextLine();
                        saleName18 = usersResponseWord;
                    }
                    if (r == 0) {
                        salesItems3 = false;
                        r = usersResponseNumber;
                        u = 0;
                    }
                }

                boolean saleQuantity3 = true;
                if (p == 9) {
                    saleQuantity3 = false;
                }
                while (saleQuantity3) {
                    u++;
                    if (u > 0) {
                        r--;
                    }
                    if (u == 1) {
                        System.out.println("What's the quantity of the " + saleName13 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ13 = usersResponseNumber;
                    }
                    if (u == 2) {
                        System.out.println("What's the quantity of the " + saleName14 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ14 = usersResponseNumber;
                    }
                    if (u == 3) {
                        System.out.println("What's the quantity of the " + saleName15 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ15 = usersResponseNumber;
                    }
                    if (u == 4) {
                        System.out.println("What's the quantity of the " + saleName16 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ16 = usersResponseNumber;
                    }
                    if (u == 5) {
                        System.out.println("What's the quantity of the " + saleName17 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ17 = usersResponseNumber;
                    }
                    if (u == 6) {
                        System.out.println("What's the quantity of the " + saleName18 + "?");
                        usersResponseNumber = usersInput.nextInt();
                        saleQ18 = usersResponseNumber;
                    }
                    if (r == 0) {
                        saleQuantity3 = false;
                        u = 0;
                    }
                }

                boolean saleCosts3 = true;
                if (p == 9) {
                    saleCosts3 = false;
                }
                while (saleCosts3) {
                    u++;
                    if (u > 0) {
                        r--;
                    }
                    if (u == 1) {
                        System.out.println("What's the cost of each " + saleName13 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP13 = usersResponseDecimal * (double) saleQ13;
                    }
                    if (u == 2) {
                        System.out.println("What's the cost of each " + saleName14 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP14 = usersResponseDecimal * saleQ14;
                    }
                    if (u == 3) {
                        System.out.println("What's the cost of each " + saleName15 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP15 = usersResponseDecimal * saleQ15;
                    }
                    if (u == 4) {
                        System.out.println("What's the cost of each " + saleName16 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP16 = usersResponseDecimal * saleQ16;
                    }
                    if (u == 5) {
                        System.out.println("What's the cost of each " + saleName17 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP17 = usersResponseDecimal * saleQ17;
                    }
                    if (u == 6) {
                        System.out.println("What's the cost of each " + saleName18 + "?");
                        usersResponseDecimal = usersInput.nextDouble();
                        saleP18 = usersResponseDecimal * saleQ18;
                    }
                    if (r == 0) {
                        saleCosts3 = false;
                        u = 0;
                    }
                }
            }
            if (p == 9) {
                System.out.println("");
            } else {
                totalSales1 = salesCostMethod(saleP1, saleP2, saleP3, saleP4, saleP5, saleP6);
            }
            if (p == 9) {
                System.out.println("");
            } else {
                totalSales2 = salesCostMethod2(saleP7, saleP8, saleP9, saleP10, saleP11, saleP12);
            }
            if (p == 9) {
                System.out.println("");
            } else {
                totalSales3 = salesCostMethod3(saleP13, saleP14, saleP15, saleP16, saleP17, saleP18);
            }
            System.out.println("-------------------Sales---------------------");
            System.out.println("Business Name: "+organizationName);
            System.out.println("-------------------Day 1---------------------");
            System.out.println("Item #      Name      Quantity     Price");
            System.out.println("---------------------------------------------");
            if (saleQ1 > 0) {
                System.out.println("Item 1:     " + saleName1 + "       " + saleQ1 + "        $" + numberFormat.format(saleP1));
                System.out.println("---------------------------------------------");
            }
            if (saleQ2 > 0) {
                System.out.println("Item 2:     " + saleName2 + "       " + saleQ2 + "       $" + numberFormat.format(saleP2));
                System.out.println("---------------------------------------------");
            }
            if (saleQ3 > 0) {
                System.out.println("Item 3:     " + saleName3 + "       " + saleQ3 + "       $" + numberFormat.format(saleP3));
                System.out.println("---------------------------------------------");
            }
            if (saleQ4 > 0) {
                System.out.println("Item 4:     " + saleName4 + "       " + saleQ4 + "       $" + numberFormat.format(saleP4));
                System.out.println("---------------------------------------------");
            }
            if (saleQ5 > 0) {
                System.out.println("Item 5:     " + saleName5 + "       " + saleQ5 + "       $" + numberFormat.format(saleP5));
                System.out.println("---------------------------------------------");
            }
            if (saleQ6 > 0) {
                System.out.println("Item 6:     " + saleName6 + "       " + saleQ6 + "       $" + numberFormat.format(saleP6));
                System.out.println("---------------------------------------------");
            }
            System.out.println("                 Sales Cost Day 1: $" + numberFormat.format(totalSales1));
            if(d>1) {
                System.out.println("-------------------Day 2---------------------");
                System.out.println("Item #      Name      Quantity     Price");
                System.out.println("---------------------------------------------");
                if (saleQ7 > 0) {
                    System.out.println("Item 1:     " + saleName7 + "       " + saleQ7 + "        $" + numberFormat.format(saleP7));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ8 > 0) {
                    System.out.println("Item 2:     " + saleName8 + "       " + saleQ8 + "       $" + numberFormat.format(saleP8));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ9 > 0) {
                    System.out.println("Item 3:     " + saleName9 + "       " + saleQ9 + "       $" + numberFormat.format(saleP9));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ10 > 0) {
                    System.out.println("Item 4:     " + saleName10 + "       " + saleQ10 + "       $" + numberFormat.format(saleP10));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ11 > 0) {
                    System.out.println("Item 5:     " + saleName11 + "       " + saleQ11 + "       $" + numberFormat.format(saleP11));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ12 > 0) {
                    System.out.println("Item 6:     " + saleName12 + "       " + saleQ12 + "       $" + numberFormat.format(saleP12));
                    System.out.println("---------------------------------------------");
                }
                System.out.println("                 Sales Cost Day 2: $" + numberFormat.format(totalSales2));
            }
            if(d>2) {
                System.out.println("-------------------Day 3---------------------");
                System.out.println("Item #      Name      Quantity     Price");
                System.out.println("---------------------------------------------");
                if (saleQ13 > 0) {
                    System.out.println("Item 1:     " + saleName13 + "       " + saleQ13 + "        $" + numberFormat.format(saleP13));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ14 > 0) {
                    System.out.println("Item 2:     " + saleName14 + "       " + saleQ14 + "       $" + numberFormat.format(saleP14));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ15 > 0) {
                    System.out.println("Item 3:     " + saleName15 + "       " + saleQ15 + "       $" + numberFormat.format(saleP15));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ16 > 0) {
                    System.out.println("Item 4:     " + saleName16 + "       " + saleQ16 + "       $" + numberFormat.format(saleP16));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ17 > 0) {
                    System.out.println("Item 5:     " + saleName17 + "       " + saleQ17 + "       $" + numberFormat.format(saleP17));
                    System.out.println("---------------------------------------------");
                }
                if (saleQ18 > 0) {
                    System.out.println("Item 6:     " + saleName18 + "       " + saleQ18 + "       $" + numberFormat.format(saleP18));
                    System.out.println("---------------------------------------------");
                }
                System.out.println("                 Sales Cost Day 3: $" + numberFormat.format(totalSales3));
                System.out.println("---------------------------------------------");
            }
            totalSales = totalSalesMethod(totalSales1,totalSales2,totalSales3);
            System.out.println("\n----------------Total Sales----------------");
            System.out.println("                 Sales Total Cost: $" + numberFormat.format(totalSales));
            System.out.println("---------------------------------------------");
            revenue = revenueMethod(suppliesCost, totalSales);
            if (totalSales>suppliesCost) {
                System.out.println("You profited $" + numberFormat.format(revenue) + " after spending $" + numberFormat.format(suppliesCost) + " on supplies!");
            } else if (totalSales<suppliesCost) {
                System.out.println("You lost $" + numberFormat.format(revenue) + " after spending $" + numberFormat.format(suppliesCost) + " on supplies.");
            } else if (revenue == 0) {
                System.out.println("You didn't make a profit nor did you lose any money!");
            }
            boolean smallLoop = true;
            while(smallLoop) {
                System.out.println("Do you want to use this program again?\n0 No\n1 Yes");
                usersInput.nextLine();
                usersResponseNumber = usersInput.nextInt();
                if (usersResponseNumber == 0) {
                    smallLoop = false;
                    entireCode = false;
                } else if (usersResponseNumber == 1) {
                    v++;
                    smallLoop = false;
                } else {
                    System.out.println("Invalid Response!");
                }
            }
        }
        System.out.println("Thanks for using my code!");
        System.exit(6317);
    }

    public static double suppliesCostMethod(double item1P,double item2P,double item3P,double item4P,double item5P,double item6p){
        return (item1P+item2P+item3P+item4P+item5P+item6p);
    }

    public static double salesCostMethod(double saleP1,double saleP2,double saleP3,double saleP4,double saleP5,double saleP6){
        return (saleP1+saleP2+saleP3+saleP4+saleP5+saleP6);
    }

    public static double salesCostMethod2(double saleP7,double saleP8,double saleP9,double saleP10,double saleP11,double saleP12){
        return (saleP7+saleP8+saleP9+saleP10+saleP11+saleP12);
    }

    public static double salesCostMethod3(double saleP13,double saleP14,double saleP15,double saleP16,double saleP17,double saleP18){
        return (saleP13+saleP14+saleP15+saleP16+saleP17+saleP18);
    }

    public static double totalSalesMethod(double totalSales1,double totalSales2,double totalSales3){
        return (totalSales1+totalSales2+totalSales3);
    }

    public  static double revenueMethod(double suppliesCost,double totalSales){
        if(totalSales>suppliesCost){
            return (totalSales-suppliesCost);
        }
        else if(totalSales<suppliesCost){
            return (suppliesCost-totalSales);
        }
        else{
            return (totalSales-suppliesCost);
        }
    }
}