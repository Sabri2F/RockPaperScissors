import java.util.Random;
import java.util.Scanner;
public class rps {
    public static void main(String[] args){
        int r=1, p=2, s=3;
        System.out.println("Select 0 for Rock, 1 for Paper, 2 for Sccissor");
        Random random = new Random();
        int comInput= random.nextInt(3);
        Scanner sc= new Scanner(System.in);
        int UserInput= sc.nextInt();
        if((comInput==0 && UserInput==2) || (comInput==1 && UserInput==0) || (comInput==2 && UserInput==1)){
            System.out.println("You lose");
        }
        else if((comInput==2 && UserInput==0) || (comInput==0 && UserInput==1) || (comInput==1 && UserInput==2)){
            System.out.println("You win");
        }
        else if(comInput==UserInput){
            System.out.println("Tie");
        }


    }
}
