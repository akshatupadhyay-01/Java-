package MinorProject;
import java.util.Scanner;
import java.io.IOException;

public class typingTest {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the typing test!");
        System.out.println("Type the following sentence as fast as you can:");
        System.out.println("The quick brown fox jumps over the lazy dog.");
        System.out.println("Press Enter to start...");

        scanner.nextLine();
        System.out.println("Start typing now! ");
        //Timer start
        long startTime = System.currentTimeMillis();
        
        int ch;
        StringBuilder userInput = new StringBuilder();
        
        while ((ch = System.in.read()) != '\n') {
           System.out.print((char) ch); // Echo the character back to the console
           userInput.append((char) ch);
           
        }
        
        String typedText=userInput.toString();
        scanner.close();


        //TImer stoped
        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000.0;

        //Count Words
        int words=typedText.trim().isEmpty() ? 0 : typedText.trim().split("\\s+").length;
        System.out.println("Time taken: " + timeTaken + " s");

        //Calculate Words Per Minute (WPM)
        double minutes = timeTaken / 60.0;
        double wpm = minutes > 0 ? words / minutes : 0 ;

        //result

        System.out.println("=== Results ===");
        System.out.println("Words typed: " + words);
        System.out.println("Time taken: " + timeTaken + " seconds");
        System.out.println("Words per minute (WPM): " + wpm);

        
    }
}