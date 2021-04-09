import java.util.Random;
import java.util.Scanner;

public class stone_paper_scissor {
    public static void main(String[] args) {
        // 0 for stone,1 for paper,2 for scissor
        System.out.print("Enter:\n 0 for STONE\n 1 for PAPER\n 2 for SCISSOR\n ");
        Scanner sc = new Scanner(System.in);
        int user_input = sc.nextInt();
        Random random = new Random();
        int comp_input = random.nextInt(3);
        if (user_input == comp_input) {
            System.out.println("match draw");
        } else if (user_input == 0 && comp_input == 2 || user_input == 1
                && comp_input == 0 || user_input == 2 && comp_input == 1) {
            System.out.println("you win,keep it up!");
        } else {
            System.out.println("computer wins the match\n");

        }
        if (comp_input == 0) {
            System.out.println("Computer chooses stone");
        } else if (comp_input == 1) {
            System.out.println("Computer chooses Paper");
        } else {
            System.out.println("Computer chooses scissor");

        }
    }
}


