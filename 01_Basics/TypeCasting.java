public class TypeCasting {
    public static void main(String[]args){
        // 1. Widening Casting: small type to large type
        // Automatic conversion
        int num1=100;
        double num2=num1;
        
        System.out.println("Int value: " +num1);
        System.out.println("Double value: " +num2);

        // 2. Narrowing Casting: large type to small type
        // Manual conversion
        double num3=99.99;
        int num4=(int)num3;

        System.out.println("Original double: " +num3);
        System.out.println("After casting to int: " +num4);

        // 3. Data loss during narrowing
        int num5=130;
        byte num6=(byte)num5;

        System.out.println("Original int : " +num5);
        System.out.println("After casting to byte: " +num6);

        // 4. char to int
        char letter='a';
        int asciiValue=(int)letter;

        System.out.println("Character : " +letter);
        System.out.println("Ascii Value " +asciiValue);

        // 5. int to char
        int characterCode=66;
        char character=(char)characterCode;

        System.out.println("Character Code "+characterCode);
        System.out.println("Character "+character);

        // 6. Integer division vs floating-point division
        int div1=5;
        int div2=2;

        System.out.println("Integer Division : "+div1/div2);
        System.out.println("FLoat Division : "+((float)div1/div2));


        


    }
}
