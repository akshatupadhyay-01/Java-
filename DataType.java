public class DataType {

public static void main(String[] args){

    //Integer 4 type : byte , short , int ,long .

    // Int : 4 byte or 32-bit range (-2^31) to (2^31 - 1)
    int a=0b101; // Binary : 5 {literals}
    

    System.out.println("Integer value : " +a);

    //Integer sum
    int num1=0101; // Octal :65
    int num2=0011; //Octal  :9
    int result=(num1+num2);

    System.out.println("The sum of integer variable is : " +result);

    //byte : 1 byte (-2^7) to (2^7-1) in simple words [-128 to 127]
    byte age=0x1A; //Hexadecimal 26
    
    System.out.println("Age: " +age);


    //short : 2 bytes（-2^15） to （2^15-1）in simple [-32,768 to 32,767]
    short sub = 25;
    short marks = 30000;

    System.out.println("Sub: " + sub);
    System.out.println("Marks: " + marks);

    //long : 8 bytes → (-2^63) to (2^63 - 1) in simple [-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long population = 8000000000L;
    long distance = 90000000000L;

    System.out.println("Population: " + population);
    System.out.println("Distance: " + distance);

    //Floating-point types : float and Double

    //float. : 4 bytes; approximately 6-7 significant digits
    // we are using f at the last of value because in java a decimal value ia always consider as a double .
    //in simple words for float literal we use suffix f.
    float b=30.333f;

    System.out.println("Float value : "+b);

    //double : 8 bytes; approximately 15-16 significant digits
    double c=20_00_000.2222222222222222222;
    double d=12e10;

    System.out.println("Double value : "+c);
    System.out.println("Exponential value :" +d);

    //char : 2 bytes
    char e='a';
    e++;
    System.out.println("Char type : " +e); //b

    //Boolean : Store true and false 
    boolean f=true;
    System.out.println("Boolean type : " +f);
    
    }
}