import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner usersInput = new Scanner(System.in);
        String usersResponseWord = "";
        int usersResponseNumber = 0;
        int a = 0;
        int r = 0;
        boolean Loop = true;
        while(Loop) {
            if(a>0){
                a--;
            }
            System.out.println("How many items did it take to produce the lemonade?(Only enter a number!)");
            usersResponseNumber = Integer.parseInt(usersInput.nextLine());
            a = usersResponseNumber;
            r = usersResponseNumber;
            if(a>0) {
                System.out.println("What's the name of Item 1?");
                usersResponseWord = usersInput.nextLine();
                createStrings(usersResponseWord,r);
            }
        }
    }
    /*public static String suppliesBought(String usersResponseWord){

    }*/
    public static String createStrings(String usersResponseWord, int r){
        if(r>0){
            r--;
        }
        String idk = "";
        String item1 = usersResponseWord;
        String item2 = usersResponseWord;
        String item3 = usersResponseWord;
        String item4 = usersResponseWord;
        String item5 = usersResponseWord;
        String item6 = usersResponseWord;
        String item7 = usersResponseWord;
        return idk;
    }
}
