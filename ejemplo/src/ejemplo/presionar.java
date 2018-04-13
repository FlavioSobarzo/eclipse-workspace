package ejemplo;
import java.util.Scanner;

public class presionar {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        keyPressed();
    }

    public static void keyPressed() {
        //If player presses the key 1 then print the line:
        int x;
        try {
            x = input.nextInt();
            if (x==1)
                System.out.println("You pressed the key 1");
        } catch (Exception e) {
            System.out.println("You haven't entered a number!!!");
        }

    }
}
