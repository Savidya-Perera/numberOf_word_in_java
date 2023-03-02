import java.util.Scanner;

public class numberOfWords {
    static int whitecount = 1;
    static int wordcount = 0;

    public static void checkSpaces(char a) {

        if (a != ' ' && whitecount != 0) {
            wordcount++;
            whitecount = 0;
        } else if (a == ' ') {
            whitecount++;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scan.nextLine();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            checkSpaces(str.charAt(i));
        }
        System.out.println(wordcount);
    }
}