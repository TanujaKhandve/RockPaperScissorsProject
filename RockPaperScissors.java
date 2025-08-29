import java.util.*;

class RockPaperScissors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        int comp = r.nextInt(3) + 1;
        System.out.println("Computer choice: " + comp);

        if(user == comp) {
            System.out.println("Draw");
        }
        else if((user == 1 && comp == 3) || (user == 2 && comp == 1) || (user == 3 && comp == 2)) {
            System.out.println("You Win");
        }
        else {
            System.out.println("Computer Wins");
        }
    }
}
