import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int noofguesses=0;
    public int input_number;

    public int getnoOfGuesses(){
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses){
        this.noofguesses=noofguesses;
    }
    
    game() {
        Random rand=new Random();
        this.number = rand.nextInt(100);
    }

    void user_input(){
        System.out.println("guess the number\n");
        Scanner sc=new Scanner(System.in);
        input_number=sc.nextInt();
    }

    boolean isCorrect() {
        noofguesses++;
        if (input_number == number) {
            System.out.printf("yes you have guessed the right number, it was %d\n and you guessed the number in %d " +
                    "attempts\n", number, noofguesses);
            return true;
        }
        else if (input_number < number) {
            System.out.println("Your number is too low....\n");
        }
        else {
            System.out.println("Your number is too high....\n");
        }

        return false;
    }
}

public class guess_the_number {
    public static void main(String[] args) {
        game g = new game();
        boolean b=false;
        while (!b) {
            g.user_input();
            b = g.isCorrect();
            System.out.println(b);
        }
    }
}
