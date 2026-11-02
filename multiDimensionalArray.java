public class multiDimensionalArray {
    public static void main(String[]args){
        int num[][]=new int[3][3];
        for(int i=0 ;i<num.length ;i++){
            for(int j=0;j<num.length;j++){
                num[i][j]= (int) (Math.random() *100);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
