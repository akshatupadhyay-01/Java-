public class TypePromotion {
    public static void main(String[]args){
        byte a=10;
        byte b=30;
        int result =a*b; // byte operands promote to int
        //Automatic conversion of smaller types to larger types during arithmetic operations.
        
        System.out.println("Result : " + result);

    }
}
