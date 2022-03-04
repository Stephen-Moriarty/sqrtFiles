import java.util.Scanner;
public class TestSqrt {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        boolean goAgain = false;
        String input = "";
        char choice = ' ';
        do{
        System.out.print("Give me a number to find the square root of.\n>");
        int userNum = k.nextInt();
        System.out.println("My square root of " + userNum + " is: " + SquareRootFinder.main(userNum));
        
        System.out.println("The actual square root of " + userNum + " is: " + Math.sqrt(userNum));
        System.out.print("Would you like to try again? (y,n)\n>");
        input = k.next();
        choice = input.toLowerCase().charAt(0);
        if(choice == 'y'){
            goAgain=true;
        }else{
            goAgain = false;
        }
        }while(goAgain);
        k.close();
    }
}
