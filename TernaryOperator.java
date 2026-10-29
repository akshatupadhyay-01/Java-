import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = input.nextInt();
        int result=0;

        input.close();
        // if(n%2==0)
        //     result = 10;
        // else
        //     result = 20;

        //converting the upper code in Ternary operation
        // ternary operation : condition ? execute if true : execute if false

        result = n%2==0 ? 10 : 20 ;
        System.out.println("Result : " +result);
    }
    
}