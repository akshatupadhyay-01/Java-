import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[]args){
        int marks;
        float attendancePercentage;
        boolean assignment;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks : ");
        marks = input.nextInt();
        System.out.println("Enter your attendence : ");
        attendancePercentage = input.nextFloat();
        System.out.println("Enter your assignment state(True or false ) : ");
        assignment = input.nextBoolean();

        input.close();

        //Invalid condition 
        if (marks<0 || 100<marks || attendancePercentage<0 || 100<attendancePercentage ){
             System.out.println("Invalid input");
             return;
             
        }

        //Grade 
        
        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 60)
            System.out.println("Grade C");
        else if (marks >= 40)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
        
    //Pass eligibility check
    
    if(40<=marks && 75<=attendancePercentage)
        System.out.println("Eligible");
    
    else
        System.out.println("Not eligible");
     
    // Assignment reminder
    if (!assignment) {
        System.out.println("Submit assignment as soon as possible.");
    }

    // Special eligibility check
    if (marks >= 90 && attendancePercentage >= 95) {
        System.out.println("Eligible for special reward");

        if (assignment) {
        System.out.println("Special Reward!!");
        }
    }   
    else {
        System.out.println("Not eligible for special reward");
        }
    }
}
