import java.util.Scanner;
public class Question4{
    public static void main(String[] args) {
        int correct=27;

        boolean guessed=false;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++) {
            int guess=sc.nextInt();

            if(guess==correct) {
                System.out.println("Congratulations! You guessed it.");
                guessed=true;
                break;
            }else if(guess<correct) {
                System.out.println("Too low");
            }else{
                System.out.println("Too high");
            }
        }
        if(!guessed) {
            System.out.println("Better Luck Next Time");
        }

    }
}
