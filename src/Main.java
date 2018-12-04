import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner usersInput = new Scanner(System.in);
        String usersResponseWord = "";
        String item1 = "";
        String item2 = "";
        String item3 = "";
        String item4 = "";
        String idk = "";
        int usersResponseNumber = 0;
        int a = 0;
        int r = 0;
        int u = 0;
        int y = 0;
        int t = 0;
        boolean Loop = true;
        while(Loop) {
            if(a>0){
                a--;
            }
            System.out.println("How many items did it take to produce the lemonade?(Only enter a number!)");
            usersResponseNumber = Integer.parseInt(usersInput.nextLine());
            a = usersResponseNumber;
            r = usersResponseNumber;
            /*if(a>0) {
                System.out.println("What's the name of Item 1?");
                usersResponseWord = usersInput.nextLine();
                System.out.println(createStrings(usersResponseWord,r,u));
                System.out.println("What's the name of Item 2?");
                usersResponseWord = usersInput.nextLine();
                System.out.println("What's the name of Item 3?");
                usersResponseWord = usersInput.nextLine();
                System.out.println("What's the name of Item 4?");
                usersResponseWord = usersInput.nextLine();
                System.out.println(createStrings(usersResponseWord,r,u));
                System.out.println("R: "+r);
                System.out.println("U: "+u);
                System.out.println(printItems(usersResponseWord,item1,item2,r,u));
            }*/
            boolean createItems = true;
            while(createItems){
                y++;
                if(y>1){
                    r--;
                }
                System.out.println("What's the name of Item "+y+"?");
                usersResponseWord = usersInput.nextLine();
                System.out.println(createStrings(usersResponseWord,usersResponseNumber,r));
                System.out.println("What's the quantity of "+createStrings(usersResponseWord,usersResponseNumber,r)+" did you purchase?");
                usersResponseNumber = usersInput.nextLine();
                System.out.println("What was the cost per quantity?")
                usersResponseNumber = usersInput.nextLine();
                System.out.println("R:"+r);
                System.out.println("Y:"+y);
                if(r==0){
                    createItems = false;
                }
            }
            System.out.println("Out of Loop!");
        }
    }
    /*public static String suppliesBought(String usersResponseWord){

    }*/
    public static String createStrings(String usersResponseWord, int usersResponseNumber, int r){
        String idk = "";
        if(r==4) {
            String item4 = usersResponseWord;
            idk = item4;
            int item4Cost = usersResponseNumber;
        }
        else if(r==3) {
            String item3 = usersResponseWord;
            idk = item3;
        }
        else if(r==2) {
            String item2 = usersResponseWord;
            idk = item2;
        }
        else if(r==1) {
            String item1 = usersResponseWord;
            idk = item1;
        }
        /*String item5 = usersResponseWord;
        String item6 = usersResponseWord;
        String item7 = usersResponseWord;*/
        return idk;
    }
}
