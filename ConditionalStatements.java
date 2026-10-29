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
             
        }

        //Grade 
        
        if(marks>=90)
        System.out.println("Grade A");
        else if(75<=marks && marks<=89)
        System.out.println("Grade B");
        else if(60<=marks && marks<=74)
        System.out.println("Grade C");
        else if(40<=marks && marks<=59)
        System.out.println("Grade D");
        else if(marks<40)
        System.out.println("Fail");
        
        
           

    //Pass eligibility check


    if(40<=marks && 75<=attendancePercentage)
        System.out.println("Eligible");
    
    else
        System.out.println("Not eligible");
     
    if(!assignment)
      System.out.println("Submit assignment as soon as possible.");

    if(90<=marks && 95<=attendancePercentage)
        System.out.println("You are eligible \n"+"Special Reward!! ");
    
    else
        System.out.println("Not eligible");

    if(!assignment)
      System.out.println("Submit assignment as soon as possible.");


    }
}
