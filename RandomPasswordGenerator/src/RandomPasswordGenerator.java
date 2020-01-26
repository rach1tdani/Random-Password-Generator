import java.util.Scanner;
import java.util.Random;

class RandomPasswordGenerator {

    static Scanner obj = new Scanner(System.in);

    public static char getRandom(char[] random) {
        int rnd = new Random().nextInt(random.length);
        return random[rnd];
    }

    public static void main(String args[]) {
        char[] letters = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '!', '@', '#', '$', '%', '&', '*', '(', ')'};
        System.out.print("How many passwords would you like to generate? : ");
        int n = obj.nextInt();
        while(n>0) {
            System.out.print("What should be the password length? : ");
            int l = obj.nextInt();
            String password = "";
            while(l>0) {
                password += getRandom(letters);
                l -= 1;
            }
            System.out.println("Your password is : " + password);
            n -= 1;
        }
        System.out.print("Thank you for using the random password generator.");
    }
}