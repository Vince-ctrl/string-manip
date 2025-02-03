import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //making the input and the variables
        Scanner input = new Scanner(System.in);
        String preSplit = "1";
        int c = 1;
        int i = 0;
        //input
        System.out.println("please enter any text");
        preSplit = input.nextLine();
        //counting the amount of words
        while (i < preSplit.length()) {
            if (preSplit.charAt(i) == ' ' && preSplit.charAt(i + 1) != ' ') {
                c++;
            }
            i++;
        }
        //making the varibles for the splitting logic
        int a = 0;
        String[] split = new String[c];
        while (a < c) {
            split[a] = preSplit.split(" ")[a];
            System.out.println(split[a]);
            a++;
        }
    }
}
